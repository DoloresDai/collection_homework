package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionOperator {

    public List<Integer> getListByInterval(int left, int right) {
        if (left > right) {
            int temp = right;
            right = left;
            left = temp;
        }
        List<Integer> newArrayList = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            newArrayList.add(i);
        }
        return newArrayList;

    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> al = getListByInterval(left, right);
        List<Integer> newArrayList = new ArrayList<>();
        for (Integer i : al) {
            if (i % 2 == 0) {
                newArrayList.add(i);
            }
        }
        return newArrayList;
    }

    public List<Integer> popEvenElments(int[] array) {
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
