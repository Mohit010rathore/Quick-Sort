package com;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr={5,3,2,1,7};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int[] arr,int low,int high)
    {
        if(low >= high)
        {
            return ;
        }
        int s= low;
        int e= high;
        int m= s+(e-s)/2 ;

        int pivot = arr[m];

        while(s <= e){//condition for swapping
           while(arr[s] < pivot){
               s++;
           }
           while(arr[e] > pivot)
           {
               e--;
           }

           if(s <= e){ //only swap at this condition
               int temp =arr[s];
               arr[s] = arr[e];
               arr[e] = temp;
               s++;
               e--;
           }
        }
        //now my pivot is at correct index,please sort the two halves now
        sort(arr,low,e);
        sort(arr, s,high);
    }
}
