package task.one.one;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barselona", 7);
        System.out.println("у нас новый кот, по кличке " + cat.getName() + "! Ей " + cat.getAge() + " Лет ");
    }
}
