package com.item.sort;

/**
 * 选择排序：每一位依次选择余下部分的最小元素与之交换
 * Created by mork on 16-8-14.
 */
public class SelectionSort extends Sort {
    @Override
    public void sort(Comparable[] elems) {
        int len = elems.length;
        if (len <= 0)
            return;
        int minIndex;
        for (int i = 0; i < len; i++) {
            minIndex = i;
            //选择余下元素的最小元素
            for (int j = i+1; j < len; j++) {
                if (less(elems[j], elems[minIndex]))
                    minIndex = j;
            }
            exch(elems, i, minIndex);
        }
    }
}
