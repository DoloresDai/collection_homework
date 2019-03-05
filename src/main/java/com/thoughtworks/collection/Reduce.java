package com.thoughtworks.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return Collections.max(arrayList);
    }

    public double getMinimum() {
        return Collections.min(arrayList);
    }

    public double getAverage() {
        double sum = 0;
        for (Integer i : arrayList) {
            sum += i;
        }
        return sum / arrayList.size();
    }

    public double getOrderedMedian() {
        if (arrayList.size() % 2 == 0) {
            return (arrayList.get(arrayList.size() / 2 - 1) + arrayList.get(arrayList.size() / 2)) / 2.0;
        } else return arrayList.get((arrayList.size() - 1) / 2);
    }

    public int getFirstEven() {
        Iterator<Integer> i = arrayList.iterator();
        int temp = 0;
        while (i.hasNext()) {
            temp = i.next();
            if (temp % 2 == 0)
                break;
        }
        return temp;
    }

    public int getIndexOfFirstEven() {
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
        Collections.reverse(arrayList);
        Iterator<Integer> i = arrayList.iterator();
        int temp = 0;
        while (i.hasNext()) {
            temp = i.next();
            if (temp % 2 == 1)
                break;
        }
        return temp;
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
