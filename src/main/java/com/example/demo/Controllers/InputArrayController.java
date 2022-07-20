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
     * Retorna el numero de elementos de InputArray desde de una ruta GET
     * @return Elementos de InputArray
     * */
    @GetMapping("")
    public ArrayList<InputArrayModel> getArrayInputs() {
        return this.arraysService.getArrays();
    }

    /**
     * Retorna el elemento de InputArray desde una ruta GET
     * @param id ID de el modelo InputArray
     * @return Elemento de InputArray
     * */
    @GetMapping("/{id}")
    public Optional<InputArrayModel> getArrayInput(@PathVariable(value="id") Long id) {
        return this.arraysService.getByID(id);
    }


    /**
     * Retorna los elementos de InputArray ordenados desde una ruta POST
     * @param payload Request body de la peticion
     * @return Elementos de InputArray
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
