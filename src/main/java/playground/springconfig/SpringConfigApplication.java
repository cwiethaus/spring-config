package playground.springconfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringConfigApplication implements CommandLineRunner {

    private final ApplicationContext applicationContext;
    private final SpringConfigNoProxyConfiguration springConfigNoProxyConfiguration;
    private final Data data;
    private final Data anotherData;
    private final MyBean myBean;
    private final AnotherBean anotherBean;

    public SpringConfigApplication(ApplicationContext applicationContext,
                                   SpringConfigNoProxyConfiguration springConfigNoProxyConfiguration,
                                   @Qualifier("Data") Data data,
                                   @Qualifier("AnotherData") Data anotherData,
                                   @Qualifier("MyBean") MyBean myBean,
                                   @Qualifier("AnotherBean") AnotherBean anotherBean) {
        this.applicationContext = applicationContext;
        this.springConfigNoProxyConfiguration = springConfigNoProxyConfiguration;
        this.data = data;
        this.anotherData = anotherData;
        this.myBean = myBean;
        this.anotherBean = anotherBean;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigApplication.class, args);
    }

    @Override
    public void run(String... args) {
        printAvailableBeans(applicationContext);
        System.out.println("------");
        printContent(this.data);
        printContent(this.data);
        printContent(this.anotherData);
        printContent(this.anotherData);
        printContent(this.myBean);
        printContent(this.myBean);
        System.out.println("------");
        System.out.println(this.springConfigNoProxyConfiguration.noProxyBean());
        System.out.println(this.springConfigNoProxyConfiguration.noProxyBean());
        System.out.println(this.springConfigNoProxyConfiguration.anotherBean());
        System.out.println(this.springConfigNoProxyConfiguration.anotherBean());
    }

    private void printAvailableBeans(ApplicationContext ctx) {
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        Arrays.stream(beanNames)
                .filter(bn -> bn.endsWith("Bean") || bn.endsWith("Data"))
                .forEach(System.out::println);
    }

    private void printContent(Object object) {
        System.out.println(object);
    }
}
