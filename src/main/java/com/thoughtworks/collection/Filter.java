package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Filter {

    List<Integer> array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> newArrayList = new ArrayList<>();
        for (Integer i : array) {
            if (i % 2 == 0) {
                newArrayList.add(i);
            }
        }
        return newArrayList;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> newArrayList = new ArrayList<>();
        for (Integer i : array) {
            if (i % 3 == 0) {
                newArrayList.add(i);
            }
        }
        return newArrayList;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        firstList.retainAll(secondList);
        return firstList;
    }

    public List<Integer> getDifferentElements() {
        Set<Integer> set = new HashSet<>(array);
        List<Integer> newArrayList = new ArrayList<>(set);
        return newArrayList;
    }
}