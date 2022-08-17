package task.one;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NormsFileReaderAndWriter {

    public static void main(String[] args) throws IOException {
//          FileReader reader = new FileReader("C:\\\\Users\\\\ilimz\\\\IdeaProjects\\\\file.txt");
//          FileReader reader = new FileReader("fileforread.txt");
//          int c;
//          while ((c=reader.read()) != -1) {
//              System.out.print((char)c);
//          }

//        FileWriter writer = new FileWriter("C:\\Users\\ilimz\\IdeaProjects\\file.txt", true); //true - при запуске команды повторно, будет наслаиваться инфа в файле
        FileWriter writer = new FileWriter("fileforread.txt", true); // текстовый файл автоматические создается в проекте
        writer.write("My name is Ilimzhin"); // текст, который я запишу в файл
        writer.append("\n"); // перенести строку на next
        writer.close(); // завершить поток
    }
}
