package playground.springconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties
public class SpringConfigNoProxyConfiguration {

    @Bean("NoProxyBean")
    @ConfigurationProperties("noproxybean")
    public MyBean noProxyBean() {
        return new MyBean();
    }

    @Bean("AnotherBean")
    @ConfigurationProperties("anotherbean")
    public AnotherBean anotherBean() {
        return new AnotherBean();
    }
}
