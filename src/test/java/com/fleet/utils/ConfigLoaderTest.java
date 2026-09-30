package com.fleet.utils;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ConfigLoaderTest {

    @Test
    void shouldFindValueInt() {
        String key = "combustionCar";

        int returnedValue = ConfigLoader.getPropertyInt(key,2022);

        assertThat(returnedValue).isEqualTo(2019);
    }

    @Test
    void shouldSetDefaultInt() {
        String inexistentKey = "inexistentKey";

        int returnedValue = ConfigLoader.getPropertyInt(inexistentKey, 2022);

        assertThat(2022).isEqualTo(returnedValue);
    }
}