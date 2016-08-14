package com.item.sort;

/**
 * 希尔排序：将相邻h的元素集合分成一组，在每组中进行插入排序。之后缩小h，直至h=1
 * Created by mork on 16-8-14.
 */
public class ShellSort extends Sort {
    @Override
    public void sort(Comparable[] elems) {
        int len = elems.length;
        int h = 1;
        //间隔1, 4, 13, 40, 121, ...
        while (h < len) h=3*h+1;
        while (h >= 1) {
            //从每个分组的第二个元素开始
            for (int i = h; i < len; i++){
                //使每个分组有序
                for (int j = i; j >= h && less(elems[j], elems[j-h]); j-=h)
                    exch(elems, j, j-h);
            }
            h/=3;
        }

    }

}
