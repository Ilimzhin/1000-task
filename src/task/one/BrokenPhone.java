package task.one;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BrokenPhone{
    public static void main(String[] args) throws IOException {
//        FileWriter wr = new FileWriter("input.txt");
//        wr.write(25);
//        wr.close();
//        FileWriter wr2= new FileWriter("output.txt");
//        wr2.write(26);
//        wr2.close();
        String str;
        FileReader reader = new FileReader("input.txt");
        Scanner sc = new Scanner(reader);
        str = sc.nextLine();
        FileWriter writer = new FileWriter("output.txt");
        writer.write(str);
        writer.close();

    }
}
