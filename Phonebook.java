package com.Geekbrains;

import java.util.*;

public class Phonebook {
    private Map<String, String> phonebook;

    public Phonebook() {
        phonebook = new HashMap<>();
    }


    public void add(String number, String surname) {
        phonebook.put(number, surname);
    }

    public void get(String surname) {
        if (phonebook.containsValue(surname)) {
            Set<Map.Entry<String, String>> pb = phonebook.entrySet();
            for (Map.Entry<String, String> i : pb) {
                if (i.getValue().equals(surname)) {
                    System.out.println(i.getValue() + " : " + i.getKey());
                } else System.out.println("Фамилия не найдена");
            }

        }
    }
}
