package com.jaga.solveproblem.array;

public class MinSwapping {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {

        int count = 0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i]==i+1)
                continue;

            int temp = arr[i];
            arr[i] = arr[arr[i]-1];
            arr[temp-1] = temp;

            i--;
            count++;
        }

        return count;


    }

    public static void main(String[] args) {
        int arr[] = {4,3,1,2};
        System.out.println(minimumSwaps(arr));
    }
}

