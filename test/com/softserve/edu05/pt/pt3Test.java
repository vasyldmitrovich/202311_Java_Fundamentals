package com.softserve.edu05.pt;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.softserve.edu05.pt.pt3.genereteRandomsNumbers;
import static org.junit.jupiter.api.Assertions.assertEquals;

class pt3Test {

    @Test
    void max() {

        int[] arr = genereteRandomsNumbers(10);
        int[] arrRes = arr.clone();

        Arrays.sort(arrRes);
        int max = arrRes[arrRes.length-1];

        assertEquals(max, pt3.max(arr));
    }
}