package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Flaten {

    Integer[][] array;

    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
//        lambda在这个方法中没有简单方法简单，且局限性较高
        return Stream.of(Arrays.asList(array[0]), Arrays.asList(array[1]), Arrays.asList(array[2])).flatMap(Collection::stream).collect(toList());
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        return Stream.of(Arrays.asList(array[0]), Arrays.asList(array[1]), Arrays.asList(array[2])).flatMap(Collection::stream).distinct().collect(toList());
    }
}
