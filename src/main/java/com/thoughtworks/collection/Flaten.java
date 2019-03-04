package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Flaten {

    Integer[][] array;

    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> newArrayList = new ArrayList<>();
        for (Integer[] integers : array) {
            for (Integer i : integers) {
                newArrayList.add(i);
            }
        }
        return newArrayList;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> arr = transformToOneDimesional();
        List<Integer> newArrayList = new ArrayList<>();
        for (Integer i : arr) {
            if (!newArrayList.contains(i)) {
                newArrayList.add(i);
            }
        }
        return newArrayList;
    }
}
