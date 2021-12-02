package com.company;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class method {
    public static void main(String[] args) {

//
    //filter-true false e->e>10
    //map(function)-value
        //using filter print name which is starting with "a"
     List<String> names = List.of("Niki","Aana","sima","Aeya","mita");
     List<String> newlist = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
     System.out.println(newlist);
        //Using lambda print all name and store
        names.stream().forEach(e ->{System.out.println("all name:-"+e);});

        //find and print starting with a names.
        System.out.println("---------------");
        newlist.stream().forEach(System.out::println);
        System.out.println("---------------");

     //Using map interface
     List<Integer> num = List.of(1,2,3,4,56);
     List<Integer> num1= num.stream().map(i->i*i).collect(Collectors.toList());
     System.out.println("Square of number using map::"+num1);




        //sort element
        // List<Integer> num = List.of(1,2,3,4,56);
        num.stream().sorted().forEach(System.out::println);

        Integer int1 = num.stream().min((x,y)-> x.compareTo(y)).get();
        System.out.println("num1:- "+int1);

        //num.stream().sorted().forEach(System.out::println);
        Integer int2 = num.stream().max((x,y)-> x.compareTo(y)).get();
        System.out.println("num2:- "+int2);







    }}
