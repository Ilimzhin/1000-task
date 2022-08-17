package task.one.one;


public class JustCat {

    public static void main(String[] args) {

        Cats cat1 = new Cats();
        Cats cat2 = new Cats();
        System.out.println("Имя первого кота: " + cat1.name);
        System.out.println("Возраст первого кота: " + cat1.age);
        System.out.println();
        System.out.println("Имя второго кота: " + cat2.name);
        System.out.println("Возраст второго кота: " + cat2.age);
        System.out.println();

        Cats cat3 = new Cats("Барсик", 2);
        Cats cat4 = new Cats("Уголь", 4);

        System.out.println("Имя третьего кота: " + cat3.name);
        System.out.println("Возраст третьего кота: " + cat3.age);
        System.out.println();
        System.out.println("Имя четвертого кота: " + cat4.name);
        System.out.println("Возраст четвертого кота: " + cat4.age);

    }

}

class Cats {
    String name;
    int age;

    public Cats(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cats() {
    }
}