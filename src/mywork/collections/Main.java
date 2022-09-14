package mywork.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        String venus = "Венера";
        String earth = "Земля";
        String mercury = "Меркурий";
        String saturn = "Сатурн";
        String jupiter = "Юпитер";
        String mars = "Марс";
        String uranus = "Уран";
        String neptune = "Нептун";
        String plutonium = "Плутон";

        ArrayList<String> solarSystem = new ArrayList<>
                (Arrays.asList(mercury, venus, earth, mars, jupiter, saturn, uranus, neptune, plutonium));

        Collections.sort(solarSystem);
//        System.out.println(Collections.min(solarSystem));
//        System.out.println(solarSystem);

        ArrayList<Integer> lottery = new ArrayList<>(100);

        for (int i = 0; i < 100; i++) {
            lottery.add(i);
        }

        Collections.shuffle(lottery);
        for (int i = 0; i < 10; i++) {
            System.out.println(lottery.get(i));
        }
    }



}
