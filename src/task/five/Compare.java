package task.five;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Compare { //сравнивание

    public static void main(String[] args) throws Exception {

        ArrayList<Integer> list = new ArrayList<>(); // создаем коллекцию для хранении данных в файле
        String str;
        String symbol;

        FileReader fileReader = new FileReader("input.txt");
        Scanner scanner = new Scanner(fileReader); // файлридер без сканера ничего нен сможет сделать
        while (scanner.hasNextLine()) { // проверяет есть ли следующая строка
            str = scanner.nextLine();
            list.add(Integer.valueOf(str));
        }
        String plus;
        plus = String.valueOf(list.get(0).compareTo(list.get(1)));
//        plus = (Integer.valueOf(list.get(0)) + Integer.valueOf(list.get(1));
        symbol = (list.get(0) > list.get(1)) ? ">" : (list.get(0) < list.get(1)) ? "<" : "="; //лист 0 и 1 это данные
        fileReader.close();

        FileWriter fileWriter = new FileWriter("output.txt");
        fileWriter.write(symbol);
        fileWriter.write(" ");
        fileWriter.write(plus);
        fileWriter.close();

//        ArrayList<Integer> list = new ArrayList<>();
//        int s = 0;
//        String str;
//
//        FileReader fileReader = new FileReader("input.txt");
//        Scanner sc = new Scanner(fileReader);
//        str = sc.nextLine();
//        StringTokenizer stringTokenizer = new StringTokenizer(str);
//        while (stringTokenizer.hasMoreTokens()) {
//            int a = valueOf(stringTokenizer.nextToken());
//            list.add(a);
//            s = stringTokenizer.nextToken().compareTo(str);
////            System.out.println(i + " : " + sc.nextLine());
////            i++;
//        }
////        for (Integer aList : list) {
////            s = valueOf(stringTokenizer.nextToken()).compareTo(aList);
////        }
//        fileReader.close();
//
//        FileWriter fileWriter = new FileWriter("output.txt");
//        fileWriter.write(String.valueOf(s));
//        fileWriter.close();
    }
}
