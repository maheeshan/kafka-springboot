package com.san.example.kafka_springboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return String.format("id: %s, first name: %s, last name: %s", id, firstName, lastName);
    }
}
