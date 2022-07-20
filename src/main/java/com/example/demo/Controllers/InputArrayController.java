package com.example.demo.Controllers;

import com.example.demo.Models.InputArrayModel;
import com.example.demo.Models.InputArrayRequestSort;
import com.example.demo.Services.ArraysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/input_array")
public class InputArrayController {

    @Autowired
    ArraysService arraysService;

    /**
     * Lista los items de inputs_array
     * */
    @GetMapping("")
    public ArrayList<InputArrayModel> getArrayInputs() {
        return this.arraysService.getArrays();
    }


    @GetMapping("/{id}")
    public Optional<InputArrayModel> getArrayInput(@PathVariable(value="id") Long id) {
        return this.arraysService.getByID(id);
    }


    /**
     *
     * @param payload
     * @return testt
     * */
    @RequestMapping(value = "/sort", method =  RequestMethod.POST)
    public ArrayList<Integer> getArrays(@Valid @RequestBody InputArrayRequestSort payload) {

        Long inputID = payload.getId();
        int iterations = payload.getIterations();
        InputArrayModel inputArray = this.arraysService.getByID(inputID).get();

        String[] test = ((String)inputArray.getArrayInputs()).split(",");

        return this.arraysService.order(test, iterations);
    }

}
