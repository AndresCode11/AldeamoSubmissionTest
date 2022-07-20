package com.example.demo.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class InputArrayRequestSort {
    @JsonProperty("id")
    @NotNull
    @Min(value = 1)
    @Max(value = 6)
    private Long id;

    @JsonProperty("iterations")
    @NotNull
    @Min(value = 1)
    @Max(value = 10)
    private int iterations;

    // Getters
    public Long getId() {
        return id;
    }

    public int getIterations() {
        return iterations;
    }
}
