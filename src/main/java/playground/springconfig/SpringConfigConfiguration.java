package playground.springconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
public class SpringConfigConfiguration {

    @Bean("MyBean")
    @ConfigurationProperties("mybean")
    public MyBean myBean() {
        return new MyBean();
    }

    @Bean("AnotherData")
    @ConfigurationProperties("anotherdata")
    public Data data() {
        return new Data();
    }
}
