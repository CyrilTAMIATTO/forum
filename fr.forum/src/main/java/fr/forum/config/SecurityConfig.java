package fr.forum.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import fr.forum.services.LoginService;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private LoginService loginService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
	// Pour activer l'authentification sur les web services, enlever le
	// matcher "/api/**"
	http.cors().disable().csrf().disable().sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests()
		.antMatchers(HttpMethod.OPTIONS).anonymous();
	http.authorizeRequests().antMatchers("/*/**", "/static/**", "/api/**").permitAll().anyRequest().authenticated()
		.and().formLogin().loginPage("/securitycontroller/login").loginProcessingUrl("/login")
		.defaultSuccessUrl("/utilisateurcontroller/goToMenu", true)
		.failureUrl("/securitycontroller/login?error=true").permitAll().and().logout()
		.invalidateHttpSession(true).logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/securitycontroller/login?logout=true").permitAll();
	http.authorizeRequests().antMatchers("**").permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	auth.inMemoryAuthentication().withUser("user").password("{noop}123").roles("USER");
	auth.inMemoryAuthentication().withUser("admin").password("{noop}123").roles("ADMIN");
	auth.inMemoryAuthentication().withUser("guest").password("{noop}123").roles("GUEST");
	auth.inMemoryAuthentication().withUser("root").password("123").roles("USER", "ADMIN", "GUEST");
    }

    // @Override
    // protected void configure(AuthenticationManagerBuilder auth)
    // throws Exception {
    // auth.userDetailsService(loginService);
    // }
    //
    // @Bean
    // public PasswordEncoder passwordEncoder() {
    // return new BCryptPasswordEncoder();
    // }
}
