package com.wiley.realworldjava.intro;

import java.util.ArrayList;
import java.util.List;

public class Java5Generics {

    private static List<String> createList() {
        List<String> buildingNames = new ArrayList<String>();
        buildingNames.add("Firehouse");
        return buildingNames;
    }

    public static void main(String[] args) {
        List<String> buildingNames = createList();

        System.out.println(buildingNames);
    }
}
