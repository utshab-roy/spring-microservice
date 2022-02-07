package com.utshab.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
