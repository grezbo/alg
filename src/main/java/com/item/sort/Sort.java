package com.item.sort;

/**
 * 排序模板
 * Created by mork on 16-8-14.
 */
public abstract class Sort {

    /**
     * 排序方法
     * @param elems 带排序的数组
     */
    public abstract void sort(Comparable[] elems);

    protected void exch (Comparable[] elems, int index1, int index2) {
        Comparable t = elems[index1];
        elems[index1] = elems[index2];
        elems[index2] = t;
    }

    /**
     * 比较e1是否小于e2
     * @param e1 元素1
     * @param e2 元素2
     * @return 如果e1 < e2则返回true 否则返回false
     */
    protected boolean less (Comparable e1, Comparable e2) {
        return e1.compareTo(e2) < 0;
    }

    /**
     * 检验数组是否有序
     * @param elems 带检验数组
     * @return 数组有序则为true
     */
    protected boolean sorted(Comparable[] elems){
        for (int i = 1; i < elems.length; i++)
            if(less(elems[i], elems[i-1])) return false;
        return true;
    }

}
