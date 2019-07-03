package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] values = new String[0];
        String[] myArray;
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
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] values = new String[0];
        String[] myArray;
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
