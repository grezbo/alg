package com.item.sort;

/**
 * Created by mork on 16-8-14.
 */
public class QuickSort extends Sort {
    @Override
    public void sort(Comparable[] elems) {
        sort(elems, 0, elems.length-1);
    }

    public void sort(Comparable[] elems, int lo, int hi) {
        if (hi <= lo)
            return;
        int j = partition(elems, lo, hi);
        sort(elems, lo, j-1);
        sort(elems, j+1, hi);
    }


    /**
     * 使数组切分后的两部分分别小于和大于判断的值
     * @param elems
     * @param lo
     * @param hi
     * @return
     */
    private int partition(Comparable[] elems, int lo, int hi) {
        int i = lo;
        int j = hi+1; //后面--j 所以需要先加一
        Comparable t = elems[lo];
        while (true) {
            while (less(elems[++i], t)) {
                if (i == hi)
                    break;
            }
            while (less(t, elems[--j])) {
                if (j == lo)
                    break;
            }
            if (i >= j)
                break;
            exch(elems, i, j);
        }
        exch(elems, lo, j);
        return j;
    }


}
