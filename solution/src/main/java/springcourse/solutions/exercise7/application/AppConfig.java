package springcourse.solutions.exercise7.application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author Amit Tal
 * @since 3/24/14
 */
@Configuration
@ComponentScan({"springcourse.solutions.exercise7.dao", "springcourse.solutions.exercise7.service", "springcourse.solutions.exercise7.util"})
@PropertySource({"classpath:books-analyzer.properties", "classpath:members.properties"})
public class AppConfig {

    @Bean
    public PropertySourcesPlaceholderConfigurer configurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
