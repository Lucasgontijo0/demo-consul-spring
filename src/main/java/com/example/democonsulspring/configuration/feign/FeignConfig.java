package com.example.democonsulspring.configuration.feign;

import com.example.democonsulspring.configuration.feign.decoder.CustomerErrorDecoder;
import feign.Feign;
import feign.Logger;
import feign.Retryer;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Value("${customer.api.url}")
    private String customerApiUrl;

    @Bean
    public CustomerApi customerApi() {
        return Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .logLevel(Logger.Level.FULL)
                .retryer(Retryer.NEVER_RETRY)
                .errorDecoder(new CustomerErrorDecoder())
                .target(CustomerApi.class, customerApiUrl);
    }
}
