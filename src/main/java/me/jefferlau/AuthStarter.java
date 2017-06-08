package me.jefferlau;

import me.jefferlau.domian.User;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringCloudApplication
@EnableHystrix
public class AuthStarter {

    public static void main(String[] args) {
        SpringApplication.run(AuthStarter.class, args);
    }
}
