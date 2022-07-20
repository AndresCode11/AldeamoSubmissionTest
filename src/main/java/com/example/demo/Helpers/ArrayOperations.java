package com.example.demo.Helpers;

import org.apache.commons.lang3.ArrayUtils;
import java.util.stream.Stream;


public class ArrayOperations {

    public int[] parseArrayToInteger(String[] array) {
        return Stream.of(array).mapToInt(Integer::parseInt).toArray();
    }

    public void reverseArray(int[] array) {
        ArrayUtils.reverse(array);
    }
}
