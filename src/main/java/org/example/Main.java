package org.example;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        IntStream randomIntStream = random.ints(1000, 10, 10000);

        List<Integer> collectedList = randomIntStream.boxed().toList();
        System.out.println("Собранная коллекция: " + collectedList);

        long countOfPrimes = IntStream.range(2, 100)
                .filter(n -> IntStream.range(2, (int) Math.sqrt(n) + 1).noneMatch(i -> n % i == 0))
                .count();
        System.out.println("Количество простых чисел до 100: " + countOfPrimes);

        int sum = IntStream.range(1, 11).reduce(0, Integer::sum);
        System.out.println("Сумма чисел от 1 до 10: " + sum);

        randomIntStream = random.ints(10, 10, 10000);
        randomIntStream.forEach(System.out::println);

        Stream<String> stringStream = Stream.of("Toyota", "Mazda", "Nissan", "Subaru", "BMV");
        Map<Character, String> result = stringStream.collect(Collectors.toMap(s -> s.charAt(0), s -> s));
        System.out.println("Результат в карте: " + result);
    }
}