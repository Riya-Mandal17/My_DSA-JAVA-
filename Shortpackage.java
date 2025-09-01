package com.soumen;

public class Shortpackage{
    public static void bubble(int[] arr){
        int lengtharr = arr.length;

        for(int i=0; i < lengtharr -1; i++){
            for(int j = 0; j< lengtharr-1-i;j++)
            if(arr[j] > arr[j+1]){
              int temp = arr[j];
              arr[j] = arr[j+1]; 
              arr[j+1] = temp;
            }
        }
    
    }
    public static void selectionShort(int[] arr){
        int n = arr.length;

        for(int i=0; i< n-1; i++){ //turns count
            int smalest = i; // initialize mininum
            for(int j= i+1; j< n; j++){ //to find min position in unsoted array
                if(arr[smalest] > arr[j])
                    smalest = j;
            }        
                int temp = arr[i]; //place the min in its right position  
                arr[i] = arr[smalest] ;
                arr[smalest] = temp;
               
        }
    }

    public static void insertionShort(int[] arr){
        int n = arr.length;
        for(int i =1; i< n ; i++){
            int current = arr[i];
            int prev = i-1;
            // to find the correct position
            while(prev >= 0 && current < arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }

            //insert the element
            arr[prev+1] = current;
        }
    }
}