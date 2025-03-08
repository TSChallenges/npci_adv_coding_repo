package com.npci.secureapp.security;

import com.npci.secureapp.config.JwtAuthenticationFilter;
import com.npci.secureapp.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

//@EnableWebSecurity
@Configuration
public class NPCISecurityConfig /*extends WebSecurityConfigurerAdapter*/{

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    MyUserDetailsService userDetailsService;

    @Autowired
    JwtAuthenticationFilter jwtAuthenticationFilter;

    //Older version of Spring Security
/*    public void configure(HttpSecurity httpSecurity){
        httpSecurity.authorizeRequests().antMatchers("/index.html", "/greet/hi", "/users").permitAll()
    }*/

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests( auth-> {
                    auth.requestMatchers("/index.html", "/greet/hi", "/users", "/auth/login").permitAll()
                    .anyRequest().authenticated();
        }).sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);

        return httpSecurity.build();
    }

//    @Bean
//    public UserDetailsService userDetailsService(){
//
//        String password = "pass123";
//        String encryptedPassword = passwordEncoder.encode(password);
//
//        UserDetails userDetails = User.builder()
//                .username("npciuser1")
//                .password(encryptedPassword)
//                .build();
//        return new InMemoryUserDetailsManager(userDetails);
//    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(userDetailsService);
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder);

        return daoAuthenticationProvider;
    }

}
