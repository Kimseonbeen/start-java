package com.example.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionLoopExample {

    public static void main(String[] args) {
        Set<String> foods = new HashSet<>();

        foods.add("치킨");

        // size 말고 isEmpty로 true / false 조건 걸 수 있음.
        if (foods.isEmpty()) {
            System.out.println("목록이 비어있습니다.");
        } else {
            System.out.println("총 " + foods.size() + " 개의 음식 목록이 있습니다.");
        }
    }
}
