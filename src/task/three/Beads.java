package task.three;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Beads { //бусы

    public static void main(String[] args) throws Exception{
        int num;
        String str;
        FileReader fileReader = new FileReader("input.txt");
        Scanner sc = new Scanner(fileReader);
        str = sc.nextLine();
        num = Integer.valueOf(str) + 1; // из Стринг в Интежер
        FileWriter fileWriter = new FileWriter("output.txt");
        fileWriter.write(String.valueOf(num)); // Из инт в Стринг
        fileWriter.close();
    }

}
