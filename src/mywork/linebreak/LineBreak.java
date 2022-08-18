package mywork.linebreak;

public class LineBreak {
    public static void main(String[] args) {
        String s = "Убираем\n" +
                " все\n" +
                " переносы\n" +
                " строки";
        System.out.println("Неизмененная строка переноса: " + s);

        s = s.replace("\n", "");

        System.out.println("Строка после того, как убрали переносы: " + s);
    }

}
