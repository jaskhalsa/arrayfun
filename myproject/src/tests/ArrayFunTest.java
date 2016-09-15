package tests;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections.*;

import static org.junit.Assert.*;

/**
 * Created by jkhalsa on 06/09/2016.
 */
public class ArrayFunTest {
    @Test
    public void itSortsAnEmptyArray(){
        int[] actual = new int[0];
        ArrayFun arrayFun = new ArrayFun();
        int[] expected = new int[0];

        assertArrayEquals(expected, arrayFun.sortify(actual));
    }

    @Test
    public void itRetainsNumericalOrderWhenFrequencyIsTheSame(){
        int[] actual = new int[] {2,1};
        ArrayFun arrayFun = new ArrayFun();
        int[] expected = new int[] {2,1};

        assertArrayEquals(expected, arrayFun.sortify(actual));
    }

    @Test
    public void theMostFrequentItemShouldAppearFirst()
    {
        int[] actual = new int[] {2,1,2};
        ArrayFun arrayFun = new ArrayFun();
        int[] expected = new int[] {2,2,1};

        assertArrayEquals(expected, arrayFun.sortify(actual));
    }



}