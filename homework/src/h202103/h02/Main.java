package h202103.h02;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ： cxyxh
 * @date : 2021/3/31 0:26
 * @describetion :
 */
public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        //读取文件
        File file = new File("homework/src/h202103/h02/SalesData.txt");
        Scanner inputFile;
        try {
            inputFile = new Scanner(file);
            while (inputFile.hasNext()) {
                list.add(inputFile.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return;
        }

        //开始计算
        DecimalFormat df = new DecimalFormat(".##");
        for (int i = 0; i < list.size(); i++) {
            Double totalSales = totalSales(list.get(i));
            System.out.println("No." + (i + 1) + "totalSales: " + df.format(totalSales));
            Double averageSales = averageSales(list.get(i));
            System.out.println("No." + (i + 1) + "averageSales: " + df.format(averageSales));
        }

        Double allTotalSales = allTotalSales(list);
        System.out.println("allTotalSales: " + df.format(allTotalSales));

        Double averageWeeklySales = averageWeeklySales(list);
        System.out.println("averageWeeklySales: " + df.format(averageWeeklySales));

        Double highest = highestSalesWeek(list);
        System.out.println("highest: " + df.format(highest));

        Double lowest = lowestSalesWeek(list);
        System.out.println("lowest: " + df.format(lowest));
    }

    /**
     * 以周为单位计算总的销售数
     *
     * @param str
     * @return
     */
    public static Double totalSales(String str) {
        String[] split = str.split(",");
        Double totalSales = 0.0;
        for (int i = 0; i < split.length; i++) {
            totalSales = totalSales + Double.valueOf(split[i]);
        }
        return totalSales;
    }

    /**
     * 以周为单位计算平均销售数
     *
     * @param str
     * @return
     */
    public static Double averageSales(String str) {
        String[] split = str.split(",");
        Double totalSales = 0.0;
        for (int i = 0; i < split.length; i++) {
            totalSales = totalSales + Double.valueOf(split[i]);
        }
        return totalSales / split.length;
    }

    /**
     * 计算所有周总的销售数
     *
     * @param list
     * @return
     */
    public static Double allTotalSales(List<String> list) {
        Double allTotalSales = 0.0;
        for (int i = 0; i < list.size(); i++) {
            Double result = totalSales(list.get(i));
            allTotalSales = allTotalSales + result;
        }
        return allTotalSales;
    }

    /**
     * 计算所有周平均销售数
     *
     * @param list
     * @return
     */
    public static Double averageWeeklySales(List<String> list) {
        Double allTotalSales = allTotalSales(list);
        return allTotalSales / list.size();
    }

    /**
     * 计算销售量最高的周
     *
     * @param list
     * @return
     */
    public static Double highestSalesWeek(List<String> list) {
        Double highest = 0.0;
        for (int i = 0; i < list.size(); i++) {
            Double totalSales = totalSales(list.get(i));
            if (totalSales > highest) {
                highest = totalSales;
            }
        }
        return highest;
    }

    /**
     * 计算销售量最低的周
     *
     * @param list
     * @return
     */
    public static Double lowestSalesWeek(List<String> list) {
        Double lowest = 0.0;
        for (int i = 0; i < list.size(); i++) {
            Double totalSales = totalSales(list.get(i));
            if (lowest == 0 || totalSales < lowest) {
                lowest = totalSales;
            }
        }
        return lowest;
    }


}
