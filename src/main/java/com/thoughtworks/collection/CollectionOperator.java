package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class CollectionOperator {

    public List<Integer> getListByInterval(int left, int right) {
        int[] arr = IntStream.range(left, right + 1).toArray();
        ArrayList<Integer> al = new ArrayList<>();
        for (Integer i : arr) {
            al.add(i);
        }
        return al;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> al = getListByInterval(left, right);
        return al.stream().filter(x->x%2==0).collect(toList());
    }

    public List<Integer> popEvenElments(int[] array) {
//        用Lambda处理没简单方法简单
        List<Integer> newArrayList = new ArrayList<>();
        for (Integer i : array) {
            if (i % 2 == 0) {
                newArrayList.add(i);
            }
        }
        return newArrayList;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
         List<Integer> first = new ArrayList<>();
        for (Integer i : firstArray) {
            first.add(i);
        }
        List<Integer> second = new ArrayList<>();
        for (Integer i : secondArray) {
            second.add(i);
        }
        first.retainAll(second);
        return first;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {

        List<Integer> first = Arrays.asList(firstArray);
        List<Integer> second = new ArrayList<>();
        for (Integer i : secondArray) {
            second.add(i);
        }
        second.removeAll(first);
        List<Integer> last = new ArrayList<>();
        for (Integer i : first) {
            last.add(i);
        }
        for (Integer i : second) {
            last.add(i);
        }
        return last;
    }
}
