package com.soumen;

public class BinarySearch{
        public static int searchElement(int[] arr,int n){
            int start=0, end = arr.length - 1;

            while(start <= end){
                 int mid = (start + end) /2;
                if(n > arr[mid]){
                    start = mid +1;
                }
                else if(n < arr[mid]){
                    end = mid-1;
                }
                else{
                    return mid;
                }      
            }
            return -1;

        }

        //Reverse
        public static void reverseArray(int[] arr){
            int start =0; 
            int end = arr.length-1 ;
            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;

            }
        }

        public static void pairsArray(int[] arr){
            for(int i = 0; i< arr.length-1; i++){
                for(int j = i+1; j < arr.length; j++){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }

         public static void subArray(int[] arr){
            for(int i = 0; i< arr.length; i++){
                for(int j = 0; j < arr.length; j++){
                    for(int k = i; k <= j; k++){
                        System.out.print(arr[k]+" ");
                    }    
                    System.out.println();
                }
            }
        }

         public static int pairsArraySum(int[] arr){
            int sumOfPairs;
            int maxSum = Integer.MIN_VALUE;
            for(int i = 0; i< arr.length-1; i++){
                for(int j = i+1; j < arr.length; j++){
                    sumOfPairs = arr[i]+arr[j];
                    if(sumOfPairs > maxSum){
                        maxSum = sumOfPairs;
                    }
                }
            }
            return maxSum;
        }

        public static int subArraySum(int[] arr){
            int maxSum = Integer.MIN_VALUE;
            for(int i = 0; i< arr.length; i++){
                for(int j = i; j < arr.length; j++){
                    int subSum = 0;
                    for(int k= i; k<= j;k++){
                        System.out.print(arr[k]+" ");
                        subSum += arr[k]; 
                    }      
                    // System.out.println("sum:" +subSum);
                    if(maxSum < subSum){
                        maxSum = subSum; 
                    }
                    System.out.println();
                }
            }
            return maxSum;
        }

        public static int prefixSum(int[] arr){
            int maxSum = Integer.MIN_VALUE;
            int sumSub = 0;
            int[] prefixSumArray = new int[arr.length];
            prefixSumArray[0] = arr[0];

            for(int i= 1; i< arr.length;i++){
                prefixSumArray[i] = prefixSumArray[i-1] + arr[i];
            }

            for(int i=0; i < arr.length;i++){
                for(int j=i; j< arr.length;j++){
                    if(i == 0)
                        sumSub = prefixSumArray[j];
                    else{
                        sumSub = prefixSumArray[j] - prefixSumArray[i-1];
                    } 
                    if(sumSub > maxSum){
                        maxSum = sumSub;
                    }  
                }
            }
            return maxSum;
        } 

        public static void KadansAlgo(int[] arr){
            int currentSum = 0;
            int maxSum = Integer.MIN_VALUE;
            for(int i = 0; i<arr.length;i++){
                currentSum = arr[i]+currentSum ;
                if(currentSum < 0){
                    currentSum = 0;
                }
                maxSum = Math.max(maxSum,currentSum);
            }
            System.out.println("max sum:" +maxSum); 
        }
        
        public static int RainTappedWater(int[] arr){
            //left most boudary
            int[] leftMostBoundary = new int[arr.length];
            leftMostBoundary[0] = arr[0];
            for(int i= 1; i< arr.length; i++){
                leftMostBoundary[i] = Math.max(arr[i], leftMostBoundary[i-1]);
            }
            //right most boundary
            int[] rightMostBoundary = new int[arr.length];
            rightMostBoundary[(arr.length)-1] = arr[(arr.length)-1];
            for(int i = (arr.length)-2; i>=0 ; i--){
                rightMostBoundary[i] = Math.max(arr[i], rightMostBoundary[i+1]);
            }

            int trappedWater = 0;
            //loop
            for(int i = 0; i < arr.length; i++){
            //calculate water level = min(left most boundary,right most boundary)
            int waterlevel = Math.min(leftMostBoundary[i],rightMostBoundary[i]);

            //trapped water = waterlevel - current boundary hight
            trappedWater += waterlevel - arr[i];
            }

            return trappedWater;
        }

        public static int StockProfit(int[] arr){
            int maxProfit = 0;
            int buyPrice = Integer.MAX_VALUE;

            for(int i=0; i< arr.length; i++){
                if(buyPrice < arr[i]){
                    int profit = arr[i] - buyPrice;
                    maxProfit = Math.max(maxProfit,profit);
                }
                else{
                    buyPrice = arr[i];
                }
            } 
            return maxProfit;
        }

    }
