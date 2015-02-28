package com.demo.stratergy01;

/**
 * Created by damith on 2/26/15.
 */
public class ExecuteSort {
    private Sort sort;

    public ExecuteSort(Sort sort1){
        this.sort = sort1;

    }
    public int[] exe_sort(int[] array){
        return  this.sort.run_sort(array);
    }


}
