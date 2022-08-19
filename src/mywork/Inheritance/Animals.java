package mywork.Inheritance;

public class Animals {
    private String nickName;
    private String color;

    public Animals() {
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.say();
        cat.setColor("brown");
        System.out.println(cat.getColor());
        cat.setNickName("Кот");
        System.out.println(cat.getNickName());

        dog.character();
        dog.setNickName("Псина");
        dog.setColor("Orange");

        tiger.voice();
        tiger.setColor("Y+W");
        tiger.setNickName("Тигр");

    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
