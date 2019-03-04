package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Add {

    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum = 0;
        if (leftBorder > rightBorder) {
            int temp = rightBorder;
            rightBorder = leftBorder;
            leftBorder = temp;
        }
        while (leftBorder < rightBorder) {
            if (leftBorder % 2 == 0) {
                sum += ++leftBorder;
            } else {
                sum += ++leftBorder;
                leftBorder++;
            }
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sum = 0;
        if (leftBorder > rightBorder) {
            int temp = rightBorder;
            rightBorder = leftBorder;
            leftBorder = temp;
        }
        while (leftBorder < rightBorder) {
            if (leftBorder % 2 == 1) {
                sum += leftBorder++;
            } else {
                sum += ++leftBorder;
                leftBorder++;
            }
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        Iterator<Integer> i = arrayList.iterator();
        while (i.hasNext()) {
            sum += i.next() * 3 + 2;
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        Iterator<Integer> i = arrayList.iterator();
        List<Integer> newArrayList = new ArrayList<>();
        while (i.hasNext()) {
            Integer temp = i.next();
            if (temp % 2 == 1) {
                newArrayList.add(temp * 3 + 2);
            } else newArrayList.add(temp);
        }
        return newArrayList;

    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        Iterator<Integer> i = arrayList.iterator();
        int sum = 0;
        while (i.hasNext()) {
            Integer temp = i.next();
            if (temp % 2 == 1) {
                sum += temp * 3 + 5;
            }
        }
        return sum;

    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        List<Integer> newArrayList = new ArrayList<>();
        double median;
        for (Integer i : arrayList) {
            if (i % 2 == 0) {
                newArrayList.add(i);
            }
        }
        if (newArrayList.size() % 2 == 0) {
            median = (newArrayList.get(newArrayList.size() / 2 - 1) + newArrayList.get(newArrayList.size() / 2)) / 2;
        } else median = newArrayList.get((newArrayList.size() - 1) / 2);
        return median;

    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
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
        List<Integer> newArrayList = new ArrayList<>();
        for (Integer i : arrayList) {
            if (i % 2 == 0) {
                newArrayList.add(i);
            }
        }
        return newArrayList.contains(specialElment);

    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> unrepeat = new ArrayList<>();
        List<Integer> unrepeatEven = new ArrayList<>();
        for (Integer i : arrayList) {
            if (!unrepeat.contains(i)) {
                unrepeat.add(i);
            }
        }
        for (Integer i : unrepeat) {
            if (i % 2 == 0) {
                unrepeatEven.add(i);
            }
        }
        return unrepeatEven;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        TreeSet<Integer> treeSetEven = new TreeSet<Integer>();
        TreeSet<Integer> treeSetOdds = new TreeSet<Integer>();
        ArrayList<Integer> newArrayList = new ArrayList<>();
        for (Integer i : arrayList) {
            if (i % 2 == 0) {
                treeSetEven.add(i);
            } else treeSetOdds.add(i);
        }
        newArrayList.addAll(treeSetEven);
        newArrayList.addAll(treeSetOdds.descendingSet());
        return newArrayList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> newArrayList = new ArrayList<>();
        for (int i = 0; i < arrayList.size() - 1; i++) {
            newArrayList.add((arrayList.get(i) + arrayList.get(i + 1)) * 3);
        }
        return newArrayList;
    }

}
