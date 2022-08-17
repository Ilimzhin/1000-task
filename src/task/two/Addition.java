package task.two;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Addition {
    public static void main(String[] args)  throws IOException {

        ArrayList<Integer> numeric = new ArrayList<>();

        int s = 0;
        String str;
        FileReader fileReader = new FileReader("input1.txt"); // создает filereader и путь к файлу
        Scanner sc = new Scanner(fileReader); // читает что написано в файле
        str = sc.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(str, " "); // делит написанное в файле на части
        while (tokenizer.hasMoreTokens()) {
            int a = Integer.valueOf(tokenizer.nextToken());
            numeric.add(a);
        }
        for (Integer aNumeric : numeric) {
            s += aNumeric;
        }
        FileWriter fileWriter = new FileWriter("output1.txt", true); // запись чисоа в файл
        fileWriter.write(String.valueOf(s));
        fileWriter.write("  ");
        fileWriter.close();
    }

}
