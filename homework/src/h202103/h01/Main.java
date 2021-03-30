package h202103.h01;

import java.text.DecimalFormat;

/**
 * @author ： cxyxh
 * @date : 2021/3/31 0:24
 * @describetion :
 */
public class Main {

    public static void main(String[] args) {
        calculate(20.0);
        calculate(10.0, 20.0);
        calculate(Math.PI, 10.0, 15.0);
    }

    /**
     * 计算圆的面积
     *
     * @param radius
     */
    public static void calculate(double radius) {
        DecimalFormat df = new DecimalFormat(".##");
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is " + df.format(area));
    }

    /**
     * 计算长方形的面积
     *
     * @param width
     * @param length
     */
    public static void calculate(double width, double length) {
        DecimalFormat df = new DecimalFormat(".##");
        double area = length * length;
        System.out.println("Area of rectangle is " + df.format(area));
    }

    /**
     * 计算圆柱体的体积
     *
     * @param pi
     * @param radius
     * @param height
     */
    public static void calculate(double pi, double radius, double height) {
        DecimalFormat df = new DecimalFormat(".##");
        double area = pi * radius * radius * height;
        System.out.println("Area of cylinder is " + df.format(area));
    }
}
