package com.example.example_configuration_prop.command;

import com.example.example_configuration_prop.properties.ExampleProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class PrintPropertiesCommand implements CommandLineRunner {

    private final ExampleProperties properties;

    @Override
    public void run(String... args) throws Exception {
        log.info("Properties class values {}", properties);
    }
}
