package h202103.h07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ： cxyxh
 * @date : 2021/3/31 0:44
 * @describetion :
 */
public class Main {

    public static void main(String[] args) {
        String sourceFileName = args[0];
        String targerFileName = args[1];
        List<String> sourceList = new ArrayList<String>();

        //read file
        File file = new File("homework/src/h202103/h07" + sourceFileName);
        Scanner inputFile;
        try {
            inputFile = new Scanner(file);
            while (inputFile.hasNext()) {
                sourceList.add(inputFile.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return;
        }

        System.out.println(sourceList.toString());

        //write file
        PrintWriter outputFile = null;
        try {
            outputFile = new PrintWriter("homework/src/h202103/h07" + targerFileName);
            for (int i = 2; i < args.length; i++) {
                Integer num = Integer.valueOf(args[i]);
                if (sourceList.get(num - 1) != null) {
                    outputFile.println(sourceList.get(num - 1));
                }
            }
            outputFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

    }

}
