package com.example.example_configuration_prop.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "test.example", ignoreUnknownFields = false)
public class ExampleProperties {
    private String first;
    private int second;
    private List<String> names;
    private Map<String, String> customAttributes;
}
