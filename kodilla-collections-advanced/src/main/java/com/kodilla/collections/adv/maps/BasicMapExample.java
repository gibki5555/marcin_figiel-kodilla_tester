package com.kodilla.collections.adv.maps;

import java.util.HashMap;
import java.util.Map;

public class BasicMapExample {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();
        grades.put("Anna", 5.0);
        grades.put("Agata", 4.5);
        grades.put("Janusz", 6.0);

        System.out.println(grades.get("Janusz"));
        for (Map.Entry<String, Double> note : grades.entrySet()) {
            System.out.println(note.getKey() + " " + note.getValue());
        }
    }
}
