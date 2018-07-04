package fr.forum.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ImportResource("classpath:application-context.xml")
@ComponentScan(basePackages = { "fr.forum.dao", "fr.forum.services" })
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = { "fr.forum.dao" })
public class AppConfig {
    //
}
