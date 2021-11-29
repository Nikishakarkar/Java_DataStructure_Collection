package com.collection;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {

        int[] number ={1,2,3,4,5,6,7,8,9,10};
        for(int i:number){

            System.out.println(i);
        }

        System.out.println(number);
        int index = Arrays.binarySearch(number, 4);
        System.out.println("find the element using binary search____"+index);


        Integer[] num={11,12,55,4,53,12,45,15,12,13,7};
        Arrays.sort(num);


            //Arrays.fill(num, 12);

            for(int i:num){

                System.out.println(i);
            }




    }
}
