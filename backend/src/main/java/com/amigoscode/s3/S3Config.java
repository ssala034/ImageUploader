package com.amigoscode.s3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

import java.net.URI;

@Configuration // calls a method that uses one or more bean (class managed by Spring IoC)
public class S3Config {

    @Value("${aws.region}") // gets it from application.yml
    private String awsRegion;

    @Bean
    public S3Client S3Client() {
        S3Client client = S3Client.builder()
                .region(Region.of(awsRegion))
                .build();

        return client;
    }

    /*
    * Marks a method in a @Configuration class as a bean producer.

    The return value of the method is automatically registered as a Spring bean.

    These beans are then available for dependency injection throughout the application.*/
}
