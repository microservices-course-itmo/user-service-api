package com.wine.to.up.user.service.api.configuration;

import com.wine.to.up.user.service.api.UserServiceApiProperties;
import com.wine.to.up.user.service.api.error.UserServiceErrorDecoder;
import com.wine.to.up.user.service.api.feign.AuthenticationServiceClient;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Feign client for accessing demo service
 */
@SuppressWarnings("SpringFacetCodeInspection")
@Configuration
@RequiredArgsConstructor
public class UserServiceFeignConfiguration {
    private final UserServiceApiProperties userServiceApiProperties;

    /**
     * Configured feign client
     */
    @Bean
    public AuthenticationServiceClient authenticationServiceClient() {
        return Feign.builder()
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .errorDecoder(new UserServiceErrorDecoder())
                .client(new OkHttpClient())
                .target(AuthenticationServiceClient.class, "http://" + userServiceApiProperties.getHost());
    }
}
