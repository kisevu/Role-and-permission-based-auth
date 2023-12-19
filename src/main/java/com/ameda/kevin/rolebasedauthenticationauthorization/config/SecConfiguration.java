package com.ameda.kevin.rolebasedauthenticationauthorization.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static com.ameda.kevin.rolebasedauthenticationauthorization.config.UserRole.*;

@Configuration
@EnableWebSecurity
public class SecConfiguration {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()
                .authorizeHttpRequests()
                .requestMatchers("/api/auth/**")
                .permitAll()
                .requestMatchers("/api/management/**").hasAnyRole(ADMIN.name(), ADMIN_TRAINEE.name())
                .requestMatchers("/api/resource/**").hasAnyRole(ADMIN.name(), CONTRACTOR.name())
                .and()
                .httpBasic();
        return http.build();
    }

    @Bean
    protected UserDetailsService userDetailsService(){
        UserDetails kevinUser = User.builder()
                .username("kevin")
                .password(passwordEncoder.encode("ameda"))
                .roles(ADMIN.name())
                .build();
        UserDetails judithUser = User.builder()
                .username("judith")
                .password(passwordEncoder.encode("mongare"))
                .roles(CONTRACTOR.name())
                .build();
        UserDetails oscarUser = User.builder()
                .username("oscar")
                .password(passwordEncoder.encode("ombeva"))
                .roles(ADMIN_TRAINEE.name())
                .build();
        return new InMemoryUserDetailsManager(
                kevinUser,
                judithUser,
                oscarUser
        );
    }
}
