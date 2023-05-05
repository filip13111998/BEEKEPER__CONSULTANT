package com.example.service.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan("com.example.model.facts")
public class ModelScanner {

}
