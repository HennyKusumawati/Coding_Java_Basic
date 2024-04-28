package org.example.project3;

import java.util.Objects;

public class CodingTask10 {
    public static void main(String[] args) {

        String[] names = new String[6];
        names[0] = "Ana";
        names[1] = "Sarah";
        names[2] = "Lily";
        names[3] = "Emma";
        names[4] = "Lily";
        names[5] = "Georgia";

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (Objects.equals(names[i], names[j])) {
                    System.out.println(names[i]);
                }
            }
        }

    }
}
