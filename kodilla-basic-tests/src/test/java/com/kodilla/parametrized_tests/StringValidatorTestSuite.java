package com.kodilla.parametrized_tests;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringValidatorTestSuite {
    private StringValidator validator = new StringValidator();

    @ParameterizedTest
    @ValueSource(strings = {"", " "})

    public void test(String tae) {
        assertTrue(validator.isBlank(tae));

    }
}