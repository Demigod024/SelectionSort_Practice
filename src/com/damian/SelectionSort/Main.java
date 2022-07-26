package com.damian.SelectionSort;

public class Main {

    public static void main(String[] args) {
        // INIT OUR ARRAY
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
// this looop moves from LHS to RHS
        for (int lastUnsortedindex = intArray.length - 1; lastUnsortedindex > 0; lastUnsortedindex--){
// created a variable to hold and start the largest index
            int largest = 0;
//CHCEK FOR LARGEST AND COMPARE
            for (int i = 1; i <= lastUnsortedindex; i++){
                if (intArray[i] > intArray[largest]){
                    largest = i;
                }
            }
            // COMPARE
            swap(intArray, largest, lastUnsortedindex);
        }
        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

// FIRST WE WRITE OUR SWAP METHOD.
    public static void swap(int[] array, int i, int j ){
        if (i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
