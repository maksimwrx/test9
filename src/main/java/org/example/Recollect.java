package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Recollect {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Toyota", "Mazda", "Nissan", "Subaru", "BMV");

        words.stream()
                .filter(word -> word.length() > 5)
                .forEach(System.out::println);

        words.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);

        words.stream()
                .limit(3)
                .forEach(System.out::println);

        boolean containsApple = words.stream()
                .anyMatch(word -> word.equals("BMV"));
        System.out.println("Содержит слово 'BMV': " + containsApple);
    }
}