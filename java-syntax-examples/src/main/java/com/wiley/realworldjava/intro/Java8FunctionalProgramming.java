package com.wiley.realworldjava.intro;

import java.util.Arrays;
import java.util.List;

public class Java8FunctionalProgramming {

    public static void main(String[] args) {

        List<String> computerCompanies = Arrays.asList("Dell", "Acer", "Microsoft", "IBM", "Lenovo");
        computerCompanies.stream()
                .filter(n -> n.length() > 5)
                .map(n -> "*" + n)
                .sorted()
                .forEach(System.out::println);
    }
}
