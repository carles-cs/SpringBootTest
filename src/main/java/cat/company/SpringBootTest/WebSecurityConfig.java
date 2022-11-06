package cat.company.SpringBootTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
                http.csrf().disable()
                                .antMatcher("/**").authorizeRequests()
                                .antMatchers("/admin/**").authenticated()
                                // .antMatchers("/", "/index.html").authenticated()
                                //.anyRequest().authenticated()
                                .and()
                                .oauth2Login()
                                .permitAll()
                                .and().logout().logoutSuccessUrl("/");

                return http.build();
        }
}