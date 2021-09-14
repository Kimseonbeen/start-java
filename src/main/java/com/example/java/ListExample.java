package com.example.java;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        // asList를 통해 add 코드 줄일 수 있음.
        // List<String> list2 = new Arrays.asList("");
        list.add("치킨");
        list.add("피자");

        /**
         * 밸류를 넣어도 되고, 인덱스를 넣어도 삭제가 됌
         */
        // list.remove("치킨");
        // list.remove(1);

        /**
         * 변경 시 첫번째 인자 인덱스 번호, 두 번째 인자 변경 값
         */
        list.set(1, "사이다");

        // 범위를 벗어나면 IndexOutOfBoundsExceptiton !

        /**
         * List는 중복 값을 허용
         */
        list.add("치킨");


        /**
         * 중복 값 있는 지 확일 시 반복문 말고 contains 사용
         */

        boolean containsChicken = list.contains("치킨");
        // true
        System.out.println("containsChicken = " + containsChicken);

        list.add("고구마");
        System.out.println("list = " + list);
        // 오름차순
        Collections.sort(list);
        System.out.println("list = " + list);
        // 내림차순
        Collections.reverse(list);
        System.out.println("list = " + list);



        /**
         *  get 으로 하나의 값만 꺼내올 수 있다.
         */
        System.out.println("list = " + list.get(0));

    }
}
