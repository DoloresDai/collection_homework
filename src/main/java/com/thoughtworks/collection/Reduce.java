package com.thoughtworks.collection;

import java.util.*;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return arrayList.stream().max((o1, o2) -> o1 - o2).get();
    }

    public double getMinimum() {
        return arrayList.stream().min((o1, o2) -> o1 - o2).get();
    }

    public double getAverage() {
        return arrayList.stream().mapToDouble(x -> x).average().getAsDouble();
    }

    public double getOrderedMedian() {
        if (arrayList.size() % 2 == 0) {
            return (arrayList.get(arrayList.size() / 2 - 1) + arrayList.get(arrayList.size() / 2)) / 2.0;
        } else return arrayList.get((arrayList.size() - 1) / 2);
    }

    public int getFirstEven() {
        return arrayList.stream().filter(x -> x % 2 == 0).findFirst().get();
    }

    public int getIndexOfFirstEven() {
//        需要下标的lambda不太适合
        int num = getFirstEven();
        int index = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(num)) {
                index = i;
            }
        }
        return index;
    }

    public boolean isEqual(List<Integer> arrayList) {
        if (!(this.arrayList.size() == arrayList.size()))
            return false;
        boolean result = false;
        for (Integer i : arrayList) {
            while (true) {
                result = this.arrayList.contains(i);
                return result;
            }
        }
        return result;
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        this.arrayList.forEach(singleLink::addTailPointer);
        return this.getOrderedMedian();
    }

    public int getLastOdd() {
        return arrayList.stream().distinct().filter(x -> x % 2 == 1).findFirst().get();
    }

    public int getIndexOfLastOdd() {
        int num = getLastOdd();
        int index = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(num)) {
                index = i;
            }
        }
        return arrayList.size() - 1 - index;
    }
}
