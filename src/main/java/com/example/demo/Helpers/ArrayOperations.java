package com.example.demo.Helpers;

import org.apache.commons.lang3.ArrayUtils;
import java.util.stream.Stream;


public class ArrayOperations {

    /**
     * Convierte los elementos del array a tipo int
     * @param array Array de tipo String
     * @return Retorna un Array de tipo
     * */
    public int[] parseArrayToInteger(String[] array) {
        return Stream.of(array).mapToInt(Integer::parseInt).toArray();
    }

    /**
     * Invierte el orden de los elementos de un array
     * @param array Array de tipo int
     * @return Retorna un Array de tipo int
     * */
    public void reverseArray(int[] array) {
        ArrayUtils.reverse(array);
    }
}
