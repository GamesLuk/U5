package h1;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class H1_main {

    public static void main(String[] args) {

        int[] myArray = {
                RandomGenerator.getDefault().nextInt(1,10),
                RandomGenerator.getDefault().nextInt(1,10),
                RandomGenerator.getDefault().nextInt(1,10),
                RandomGenerator.getDefault().nextInt(1,10),
                RandomGenerator.getDefault().nextInt(1,10),
                RandomGenerator.getDefault().nextInt(1,10),
                RandomGenerator.getDefault().nextInt(1,10),
                RandomGenerator.getDefault().nextInt(1,10),
                RandomGenerator.getDefault().nextInt(1,10),
                RandomGenerator.getDefault().nextInt(1,10)
        };

        System.out.println("Array before sorting:");
        System.out.println(Arrays.toString(myArray));

        int[] sortedArray = new int[myArray.length];

        for(int i = 0; i < myArray.length; i++){
            sortedArray[i] = myArray[myArray.length - i - 1];
        }

        myArray = sortedArray;

        System.out.println("Array after sorting in descending order:");
        System.out.println(Arrays.toString(myArray));

    }

}
