package h202103.h08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ： cxyxh
 * @date : 2021/3/31 0:46
 * @describetion :
 */
public class Main {


    public final static Integer BEGIN_YEAR = 1950;

    public static void main(String[] args) {
        List<Integer> population = new ArrayList<Integer>();
        try {
            FileReader fileReader = new FileReader("homwwork/src/h202103/h08/USPopulation.txt");
            BufferedReader in = new BufferedReader(fileReader);
            String str;
            while ((str = in.readLine()) != null) {
                population.add(Integer.valueOf(str));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        getAverageAnnualChange(population);
        getGreatestIncrease(population);
        getSmallestIncrease(population);
    }

    public static void getAverageAnnualChange(List<Integer> population) {
        int allIncrease = 0;
        Double averageIncrease = 0.0;
        for (int i = 0; i < population.size(); i++) {
            allIncrease += population.get(i);
        }
        averageIncrease = (double) (allIncrease / population.size());
        System.out.println("The average annual change in population during the time period was:" + averageIncrease);
    }

    public static void getGreatestIncrease(List<Integer> population) {
        int year = BEGIN_YEAR;
        int greatestIncrease = 0;
        for (int i = 0; i < population.size(); i++) {
            int increase = population.get(i);
            if (increase > greatestIncrease) {
                greatestIncrease = increase;
                year = BEGIN_YEAR + i + 1;
            }
        }
        System.out.println("The years with the largest population increase was:" + year + ",increase population number:" + greatestIncrease);
    }

    public static void getSmallestIncrease(List<Integer> population) {
        int year = BEGIN_YEAR;
        int smallestIncrease = 0;
        for (int i = 0; i < population.size(); i++) {
            int increase = population.get(i);
            if (smallestIncrease == 0 || increase < smallestIncrease) {
                smallestIncrease = increase;
                year = BEGIN_YEAR + i + 1;
            }
        }
        System.out.println("The years with the smallest population increase was:" + year + ",increase population number:" + smallestIncrease);
    }

}
