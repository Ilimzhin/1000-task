package mywork.overload;

public class MyOverload {
    public static void main(String[] args) {
        Sum s = new Sum();

        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.1, 10.2));

    }
}
