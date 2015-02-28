package com.demo.stratergy01;

/**
 * Created by damith on 2/26/15.
 */
public class BubbleSort implements Sort {
    public  int[] run_sort(int[] array){
            int len = array.length-1;

        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
               if(array[j]>array[j+1]){
                int temp =array[j+1];
                   array[j+1] = array[j];
                   array[j] = temp;

                }
            }
        }
        return array;
    }

}
