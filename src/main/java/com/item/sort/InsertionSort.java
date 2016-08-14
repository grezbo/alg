package com.item.sort;

/**
 * 插入排序：从第二个元素起，将每个元素放入前面元素当中的合适位置
 * Created by mork on 16-8-14.
 */
public class InsertionSort extends Sort {
    @Override
    public void sort(Comparable[] elems) {
        int len = elems.length;
        if (len <= 0)
            return;
        for (int i = 1; i < len; i++){
            //将较小的元素逐个往前提替换
            for (int j = i; j > 0 && less(elems[j], elems[j-1]); j--)
                exch(elems, j, j-1);
        }
    }
}
