public class Main {

    /**
     * Given two arrays of integers, write a method called combine that combines the two arrays into one larger array.
     * The method combine will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10,12,14,16};
     * zip(myArray1, myArray2) → {1,3,5,7,9,2,4,6,8,10,12,14,16}
     */
    public static int[] combine(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int[] combinedArray = new int[length1 + length2];

        System.arraycopy(array1, 0, combinedArray, 0, length1);
        System.arraycopy(array2, 0, combinedArray, length1, length2);

        return combinedArray;
    }

    /**
     * Given two arrays of integers of equal length, write a method called zip that zips together all elements in each array into one larger array.
     * The method zip will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10};
     * zip(myArray1, myArray2) → {1,2,3,4,5,6,7,8,9,10}
     */
    public static int[] zip(int[] array1, int[] array2) {
        int[] zippedArray = new int[array1.length + array2.length];

        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            zippedArray[index++] = array1[i];
            zippedArray[index++] = array2[i];
        }
        return zippedArray;
    }


    /**
     * Given two arrays of integers of equal length, write a method called product that multiplies each element in the first array by the element at the corresponding index in the second array.
     * The method product will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10};=
     * product(myArray1, myArray2) → {2,12,30,56,90}
     */
    public static int[] product(int[] array1, int[] array2) {

        int[] productArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            productArray[i] = array1[i] * array2[i];
        }
        return productArray;
    }

    /**
     * Given an array of Strings, write a method called capitalCount that calculates the number of capital letters in each String and stores them into an array.
     * The method capitalCount will return a new one dimensional array of integers.
     * There is a catch - you are required to implement *two* methods in order to solve this problem.
     * One of these methods (countCapitalLetters) will be a helper method and will perform the task of counting and returning how many capital letters are in a single word.
     * In other words, the method capitalCount will call (or use) the method countCapitalLetters in order to achieve the desired output.
     * Hint: You can use the statement Character.isAlphabetic( … ) to determine whether a character is an alphabetic character.
     * <p>
     * Method: capitalCount
     * Helper method: countCapitalLetters
     * <p>
     * Hint: 'A' = 65 and 'Z' = 90
     * <p>
     * String[] words = {“Christmas”, “IS”, “comInG”, “!”};
     * capitalCount(words) → {1, 2, 2, 0}
     */
    public static int[] capitalCount(String[] words) {
        int[] capitalCountArray = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            capitalCountArray[i] = countCapitalLetters(words[i]);
        }

        return capitalCountArray;
    }

    public static int countCapitalLetters(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isAlphabetic(c) && Character.isUpperCase(c)) {
                count++;
            }
        }

        return count;
    }
}

