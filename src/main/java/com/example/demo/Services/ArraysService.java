package com.example.demo.Services;

import com.example.demo.Helpers.ArrayOperations;
import com.example.demo.Models.InputArrayModel;
import com.example.demo.repositories.ArraysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ArraysService {

    private int P[] = new int[]{ 2, 3, 5, 7, 11, 13, 17 };

    @Autowired
    ArraysRepository arraysRepository;

    ArrayOperations arrayOperations = new ArrayOperations();

    public ArrayList<InputArrayModel> getArrays() {
        return (ArrayList<InputArrayModel>)arraysRepository.findAll();
    }

    public Optional<InputArrayModel> getByID(Long id) {
        return arraysRepository.findById(id);
    }

    public ArrayList<Integer> order(String[] orders, int iterations) {
        int[] ordersInt = this.arrayOperations.parseArrayToInteger(orders);
        this.arrayOperations.reverseArray(ordersInt);
        ArrayList<Integer> result = new ArrayList<Integer>();

        // Validate if
        if(iterations > orders.length) {
            iterations = orders.length;
        }

        for (int i = 0; i < iterations ; i++) {
            for (int j = 0; j < ordersInt.length; j++) {
                if(ordersInt[j] % this.P[i] == 0) {
                    if(!result.contains(ordersInt[j])) {
                        result.add(ordersInt[j]);
                    }
                }
            }
        }
        return result;
    }
}
