package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] array1 = {1, 7, 6, 5, 9};
        int [] array2 = {2, 7, 6, 3, 4};
        for (int i = 0; i < array1.length; i++){
            if (array1[i] == array2[i]){
                System.out.print("(" + array1[i] + ", " + array2[i] + ") \n");
            }
        }
        //Nested Loop stuff

    }
}
