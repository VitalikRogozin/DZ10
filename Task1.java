package com.Geekbrains;
//import java.util.*;



public class Task1 {
    public static void main(String[] args) {
        String[] words = {"Phone", "Flower", "Glass", "Window", "House", "Bilding", "Tree", "Phone", "Car", "Mouse", "Phone", "Ocean", "Summer", "Tree"};
        PrintWords(words);
        int[] quantity = new int[words.length];
        for (int i = 0; i < quantity.length; i++) quantity[i] = 0;
        quantity = Сheck_double(quantity, words);
        Unique_words(quantity, words);
        WordAgain (quantity, words);
    }

    private static void WordAgain(int[] quantity, String[] words) {
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + "  встречается  " + quantity[i] + " раза");
        }
    }

    private static void PrintWords(String[] words) {
        for (int i = 0; i < words.length; i++) System.out.print(words[i] + " ");
        System.out.println();
        System.out.println();
    }

    private static void Unique_words(int[] quantity, String[] words) {
        System.out.println("Уникальные слова:");
        for (int i = 0; i < words.length; i++) if (quantity[i] <= 1) System.out.print(words[i] + " ");
        System.out.println();
    }

    private static int[] Сheck_double(int[] quantity, String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = i; j < words.length; j++) if (words[i] == words[j]) quantity[i]++;
        }
        return quantity;
    }

}
