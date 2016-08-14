package com.item.sort;

/**
 * top down 归并排序（分治法）：将数组不断分为两组，使两组数组都有序，直至数组个数为1使认为有序。
 * Created by mork on 16-8-14.
 */

public class TDMergeSort extends Sort {
    @Override
    public void sort(Comparable[] elems) {
        int len = elems.length;
        Comparable[] tmp = new Comparable[len];
        sort(elems, tmp, 0, len-1);
    }

    private void sort(Comparable[] elems, Comparable[] tmp, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi-lo)/2;
        sort(elems, tmp, lo, mid);
        sort(elems, tmp, mid+1, hi);
        merge(elems, tmp, lo, mid, hi);
    }

    private void merge(Comparable[] elems, Comparable[] tmp, int lo, int mid, int hi) {
        int i = lo;
        int j = mid+1;
        for (int t = lo; t <= hi; t++) {
            tmp[t] = elems[t];
        }
        for (int t = lo; t <= hi; t++) {
            if (i > mid) elems[t] = tmp[j++];
            else if (j > hi) elems[t] = tmp[i++];
            else if (less(tmp[i], tmp[j])) elems[t] = tmp[i++];
            else elems[t] = tmp[j++];
        }
    }

}
