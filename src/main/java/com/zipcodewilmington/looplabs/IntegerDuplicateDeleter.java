package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

       Integer[] values = new Integer[0];
       Integer[] myArray;
       int numOfOccurance = 0;
       for(int i=0; i<array.length;i++) {
           for (int j=0; j<array.length;j++) {
               if(array[i] == array[j]){
                   numOfOccurance++;

               }

           }

           if(numOfOccurance < maxNumberOfDuplications) {
               myArray = Arrays.copyOf(values,values.length+1);
               myArray[myArray.length-1]=array[i];
               values = myArray;
           }
           numOfOccurance = 0;
       }



      return values;

    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        Integer[] values = new Integer[0];
        Integer[] myArray;
        int numOfOccurance =0;

        for(int i=0; i<array.length; i++) {
        for(int j=0; j<array.length; j++) {
            if(array[i] == array[j]) {
                numOfOccurance ++;
            }
        }

        if (numOfOccurance != exactNumberOfDuplications) {
            myArray = Arrays.copyOf(values,values.length+1);
            myArray[myArray.length-1]=array[i];
            values = myArray;
        }
            numOfOccurance =0;
        }




        return values;
    }
}
