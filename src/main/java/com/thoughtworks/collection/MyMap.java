package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 13, 27, 30, 52, 53};
        List<Integer> list = Arrays.asList(array);
        MyMap myMap = new MyMap(list);
        System.out.println(myMap.mapLetters());
    }
}

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> newArrayList = new ArrayList<>();
        for (Integer i : array) {
            newArrayList.add(i * 3);
        }
        return newArrayList;
    }

    public List<String> mapLetter() {
        List<String> newArrayList = new ArrayList<>();
        for (Integer i : array) {
            newArrayList.add(letters[i]);
        }
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
        TreeSet<Integer> treeSet = new TreeSet<>(array);
        ArrayList<Integer> newArrayList = new ArrayList<>();
        newArrayList.addAll(treeSet.descendingSet());
        return newArrayList;
    }

    public List<Integer> sortFromSmall() {
        TreeSet<Integer> treeSet = new TreeSet<>(array);
        ArrayList<Integer> newArrayList = new ArrayList<>();
        newArrayList.addAll(treeSet);
        return newArrayList;
    }
}
