package com.demo.stratergy01;

/**
 * Created by damith on 2/26/15.
 */
public class TestDriver {
    public static void main(String[] args) {
        int[] array = {2,3,1,45,23,6,7,8,8,90,6,8,58,67,9,4,76,8};

    ExecuteSort    exs = new ExecuteSort(new BubbleSort());
                            exs.exe_sort(array);
                            for(int i=0;i<array.length;i++){

                                System.out.println(array[i]);
                            }

    }
}
