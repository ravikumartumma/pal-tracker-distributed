package io.pivotal.pal.tracker.registration;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@ComponentScan({
    "io.pivotal.pal.tracker.accounts",
    "io.pivotal.pal.tracker.restsupport",
    "io.pivotal.pal.tracker.projects",
    "io.pivotal.pal.tracker.users",
    "io.pivotal.pal.tracker.registration"
})
public class App {
    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        SpringApplication.run(App.class, args);
    }
}
