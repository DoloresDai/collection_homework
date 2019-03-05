package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {
    }

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
//        lambda没有简单方法简单
        List<Integer> newArrayList = new ArrayList<>();
        newArrayList.add(number);
        while (number > 0) {
            number -= random.nextInt();
            if (number > 0)
                newArrayList.add(number);
        }
        return newArrayList;
    }
}
