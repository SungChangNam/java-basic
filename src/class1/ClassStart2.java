package class1;

import java.lang.reflect.Array;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"힉생1", "힉생2","힉생3", "힉생4"};
        int[] studentAges = {16, 17,13,17};
        int[] studentGrade = {90,80,70,60};

        for (int i =0;  i<studentNames.length; i++){
            System.out.println("name " + studentNames[i] + " age " + studentAges[i] + " graade " + studentGrade[i]);

        }

    }
}
