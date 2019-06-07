package com.example.democonsulspring.configuration.feign.decoder;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomerErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        throw new RuntimeException("Error on customer integration");
    }
}
