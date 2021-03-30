package h202103.h06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ： cxyxh
 * @date : 2021/3/31 0:42
 * @describetion :
 */
public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        final int SIZE = 400;
        String[] array = new String[SIZE];
        int i = 0;
        File file = new File("homework/src/h202103/h06/PopularNames.txt");
        Scanner inputFile = new Scanner(file);
        while (inputFile.hasNext() && i < array.length) {
            array[i] = inputFile.nextLine();
            i++;
        }
        System.out.println(i);
        inputFile.close();
        System.out.println(Arrays.toString(array));

        // sort
        selectionSort(array);
        System.out.println(Arrays.toString(array));

        // search
        binarySearch(array, "John");
        binarySearch(array, "Ashraf");

    }

    public static void selectionSort(String[] array) {
        int startScan, index, minIndex;
        String minValue;
        for (startScan = 0; startScan < array.length; startScan++) {
            minIndex = startScan;
            minValue = array[startScan];
            for (index = startScan + 1; index < array.length; index++) {
                if (array[index].compareTo(minValue) < 0) {
                    minValue = array[index];
                    minIndex = index;
                }
            }
            array[minIndex] = array[startScan];
            array[startScan] = minValue;
        }
    }

    public static void binarySearch(String[] array, String name) {
        int first = 0;
        int last = array.length - 1;
        int middle;
        int position = -1;
        boolean found = false;
        while (!found && first <= last) {
            middle = (first + last) / 2;
            if (array[middle].compareTo(name) == 0) {
                found = true;
                position = middle;
            } else if (array[middle].compareTo(name) > 0) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }

        if (position == -1) {
            System.out.println("the name is not in the array");
        } else {
            System.out.println("the index of " + name + " is " + position);
        }

    }

}
