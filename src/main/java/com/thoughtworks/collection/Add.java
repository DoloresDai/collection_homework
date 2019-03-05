package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Add {

    public int getSumOfEvens(int leftBorder, int rightBorder) {
        return IntStream.range(leftBorder, rightBorder + 1).filter(x -> x % 2 == 0).reduce(0, (x, y) -> x + y);
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        return IntStream.range(leftBorder, rightBorder + 1).filter(x -> x % 2 == 1).reduce(0, (x, y) -> x + y);
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(x -> x * 3 + 2).reduce(0, (x, y) -> x + y);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(this::map).collect(Collectors.toCollection(ArrayList::new));
    }

    public int map(int x) {
        if (x % 2 == 0) return x;
        else return x * 3 + 2;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().filter(x -> x % 2 == 1).map(x -> x * 3 + 5).reduce(0, (x, y) -> x + y);

    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(x -> x % 2 == 1).map(x -> x * 3 + 5).reduce(0, (x, y) -> x + y);
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
//        如果是处理下标的问题，stream不太适合
        double sum = 0;
        int num = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (i % 2 == 0) {
                sum += arrayList.get(i);
                num++;
            }
        }
        return sum / num;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        return arrayList.stream().filter(x -> x % 2 == 0).anyMatch(x -> x.equals(specialElment));
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(x -> x % 2 == 0).distinct().collect(Collectors.toCollection(ArrayList::new));
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        arrayList.sort(Integer::compareTo);
        ArrayList<Integer> even = arrayList.stream().filter(x -> x % 2 == 0).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Integer> odd = arrayList.stream().distinct().filter(x -> x % 2 == 1).collect(Collectors.toCollection(ArrayList::new));
        return Stream.of(even, odd).flatMap(Collection::stream).collect(Collectors.toCollection(ArrayList::new));
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        没有找到能解决此函数的方法
        List<Integer> newArrayList = new ArrayList<>();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            newArrayList.add((arrayList.get(i) + arrayList.get(i + 1)) * 3);
        }
        return newArrayList;
    }
}
