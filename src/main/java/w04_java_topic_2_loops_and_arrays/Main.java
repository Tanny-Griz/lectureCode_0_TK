package w04_java_topic_2_loops_and_arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Generate 10 random numbers between 0 and 99, store in an array

        int[] randomNumbers = new int[10];

        Random randomGenerator = new Random();

        for (int x = 0; x < randomNumbers.length; x++) {
            int randomNumber = randomGenerator.nextInt(100);
            randomNumbers[x] = randomNumber;
        }

        System.out.println(Arrays.toString(randomNumbers));

    }

}
