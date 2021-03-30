package h202103.h05;

/**
 * @author ： cxyxh
 * @date : 2021/3/31 0:38
 * @describetion :
 */
public class Main {

    public static void main(String[] args) {
        int x;
        x = max(4);
        System.out.println("max number is " + x); //4
        x = max(1, 6, 3);
        System.out.println("max number is " + x); //6
        x = max(5, 1, 5, 7, 9, 20, 15, 13);
        System.out.println("max number is " + x); //20
    }

    public static int max(Integer... number) {
        int maxNumber = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] > maxNumber) {
                maxNumber = number[i];
            }
        }
        return maxNumber;
    }
}
