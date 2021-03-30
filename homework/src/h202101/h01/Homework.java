package h202101.h01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Homework {

    //起始年份
    public final static Integer BEGIN_YEAR = 1950;

    public static List<Integer> population = new ArrayList<Integer>();

    public static void main(String[] args) {
        readFile(population);
        getAverageAnnualChange(population);
        getGreatestIncrease(population);
        getSmallestIncrease(population);
    }

    /**
     * 读取文件数据
     *
     * @param population
     */
    public static void readFile(List<Integer> population) {
        try {
            FileReader fileReader = new FileReader("homework/src/h202101/h01/USPopulation.txt");
            BufferedReader in = new BufferedReader(fileReader);
            String str;
            while ((str = in.readLine()) != null) {
                population.add(Integer.valueOf(str));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取年平均增长数
     *
     * @param population
     */
    public static void getAverageAnnualChange(List<Integer> population) {
        int allIncrease = 0;
        Double averageIncrease = 0.0;
        for (int i = 0; i < population.size(); i++) {
            allIncrease += population.get(i);
        }
        averageIncrease = (double) (allIncrease / population.size());
        System.out.println("The average annual change in population during the time period was:" + averageIncrease);
    }

    /**
     * 获取增删人数最多的一年
     *
     * @param population
     */
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

    /**
     * 获取人数增长最少的一年
     *
     * @param population
     */
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
