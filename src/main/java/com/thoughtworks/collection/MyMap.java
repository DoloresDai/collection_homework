package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import static java.util.stream.Collectors.toList;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map(x -> x * 3).collect(toList());
    }

    public List<String> mapLetter() {
        List<String> newArrayList = new ArrayList<>();
        array.stream().forEach(i -> newArrayList.add(letters[i]));
        return newArrayList;
    }

    public List<String> mapLetters() {
        List<String> newArrayList = new ArrayList<>();
        for (Integer i : array) {
            int firstIndex = (i - 1) / 26;
            int secondIndex = (i - 1) % 26;
            if (firstIndex == 0) {
                newArrayList.add(letters[secondIndex]);
            } else
                newArrayList.add(letters[firstIndex - 1] + letters[secondIndex]);
        }
        return newArrayList;
    }

    public List<Integer> sortFromBig() {
        return array.stream().sorted(Integer::compareTo).distinct().collect(toList());
    }

    public List<Integer> sortFromSmall() {
        return array.stream().sorted(Integer::compareTo).collect(toList());
    }
}
