package com.wiley.realworldjava.intro;

public class Java17TextBlocks {

    public static void main(String[] args) {

        String data = """
                Apple,Fruit
                 Banana,Fruit
                Potato,Vegetable
                """;

        String formatted = String.format("*%s*", data);
        System.out.println(formatted);
    }
}
