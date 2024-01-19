package com.eazybytes.cards.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "cards")
@Setter
@Getter
public class ContactDetailsDTO {

    private String name;

    private String email;
}
