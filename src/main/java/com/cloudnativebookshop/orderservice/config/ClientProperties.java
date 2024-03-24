package com.cloudnativebookshop.orderservice.config;

import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.net.URI;

@ConfigurationProperties(prefix = "cloudnative")
public record ClientProperties(
	@NotNull
	URI catalogServiceUri
) {
}
