package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {

        List<Integer> l1 = List.of(1,2,3,44,5,6,7,8,9,11,12,15);

      /*   Stream<Integer> stream1 = l1.stream();
           List<Integer> newlist = stream.filter(i -> i % 2==0).collect(Collector.tolist);
           System.out.println(newlist);
      */
      /*
        List<Integer> newlist = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newlist);
        List<Integer> newlist1 = l1.stream().filter(i -> i <10).collect(Collectors.toList());
        System.out.println(newlist1);
       */
        //create empty stream
    Stream<Object> empt = Stream.empty();
    empt.forEach(e -> {System.out.println(e);});

    Stream<Object> empt1 = Stream.empty();

        //2-array ,object,collection
        String name[] = {"niki", "piya","giya","mita"};

        Stream<String> st1 = Stream.of(name);
        st1.forEach(e -> {
            System.out.println(e);
        });
        System.out.println("----------");
        //3
          Stream<Object> st2 = Stream.builder().build();
            System.out.println("----------");

       //4
       IntStream stream = Arrays.stream(new int[] {2,4,5,8,9,44,55,66,});
       stream.forEach(e -> System.out.println(e));

       //5 list,set
            List<Integer> list = new ArrayList<>();
            list.add(12);
            list.add(3);
            list.add(122);
            list.add(53);
            list.add(53);
            list.add(39);
            Stream<Integer> strem = list.stream();
            strem.forEach(e-> {

            System.out.println(e);
        });
    }}
//stream api-collection
//collection/group of object arrays
