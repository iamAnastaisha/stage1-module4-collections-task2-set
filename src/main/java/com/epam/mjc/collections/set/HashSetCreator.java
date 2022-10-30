package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> resultSet = new HashSet<>();
        for (Integer num : sourceList) {
            if (num % 2 == 0) {
                resultSet.add(num);
                int helper = num;
                 do {
                    helper /= 2;
                    resultSet.add(helper);
                } while (helper % 2 == 0);
            } else {
                resultSet.add(num);
                resultSet.add(2*num);
            }
        }
        return resultSet;
    }
}
