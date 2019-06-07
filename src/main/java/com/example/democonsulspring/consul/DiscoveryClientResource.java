package com.example.democonsulspring.consul;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.naming.ServiceUnavailableException;
import java.net.URI;
import java.util.Optional;

@RestController
public class DiscoveryClientResource {

    private final DiscoveryClient discoveryClient;

    public DiscoveryClientResource(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/custom-discovery")
    public String discoveryPing() throws ServiceUnavailableException {

        RestTemplate restTemplate = new RestTemplate();

        URI serviceUri = serviceUrl()
                .map(s -> s.resolve("/ping"))
                .orElseThrow(ServiceUnavailableException::new);

        return restTemplate
                .getForEntity(serviceUri, String.class)
                .getBody();
    }

    private Optional<URI> serviceUrl() {
        return discoveryClient.getInstances("demo-consul")
                .stream()
                .map(ServiceInstance::getUri)
                .findFirst();
    }
}
