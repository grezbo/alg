package com.item.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mork on 16-8-14.
 */
public class SelectionSortTest {
    @Test
    public void sort() throws Exception {
        Sort s = new SelectionSort();

        Integer[] integers1 = {6,3,1,5,3,0,9,4};
        s.sort(integers1);
        Integer[] integers2 = {1};
        s.sort(integers2);
        Integer[] integers3 = {};
        s.sort(integers3);

        assertTrue(s.sorted(integers1));
        assertTrue(s.sorted(integers2));
        assertTrue(s.sorted(integers3));
    }

}