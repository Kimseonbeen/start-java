package com.example.java;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> myFavoriteFoods = new HashSet<>();
        /**
         * 중복 value 저장 안됌
         */
        myFavoriteFoods.add("치킨");
        myFavoriteFoods.add("피자");
        myFavoriteFoods.add("치킨");
        myFavoriteFoods.add("말랭이");

        System.out.println("myFavoriteFoods = " + myFavoriteFoods);
        /**
         * 순서가 없기 때문에 get() 사용 못함
         */
        //System.out.println(myFavoriteFoods);
    }
}
