package com.example.demo.Models;
import javax.persistence.*;

@Entity
@Table(name = "arrays")
public class InputArrayModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String inputArray;

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setArray_inputs(String array_inputs) {
        this.inputArray = array_inputs;
    }

    // Getters
    public Long getId() {
        return this.id;
    }

    public String getArrayInputs() {
        return this.inputArray;
    }
}
