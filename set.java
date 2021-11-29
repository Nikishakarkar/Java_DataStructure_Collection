package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {

    public static void main(String[] args) {
       // System.out.println("__hashset____");

        //Set<Integer> hs = new HashSet<>();
        Set<student> std = new HashSet<>();
        {
            std.add(new student("Nikisha",1));
            std.add(new student("Beena",2));
            std.add(new student("Bhumi",3));
            std.add(new student("Bhumi",1));

            student s1 = new student("nikisha",2);

            System.out.println(std);

            //not allow duplication
            //Order not define
           /* hs.add(1);
            hs.add(12);
            hs.add(31);
            hs.add(4);
            hs.add(4);
            hs.add(122);
            System.out.println(hs);
            hs.remove(12);

            System.out.println(hs);
            System.out.println(hs.contains(4));
            System.out.println();
          hs.isEmpty();
          System.out.println(hs.size());
           //clear all set //hs.clear();
           System.out.println(hs);*/
        }
        System.out.println("__LINK_hashset____");

       // Set<Integer> lhs = new LinkedHashSet<Integer>();

        Set<Integer> lhs = new TreeSet<Integer>();
        {
            //not allow duplication
            //Order define(maintain)
            lhs.add(1);
            lhs.add(12);
            lhs.add(31);
            lhs.add(4);
            lhs.add(122);
            System.out.println(lhs);

            lhs.remove(12);

            System.out.println(lhs);
            System.out.println(lhs.contains(4));
            System.out.println();
            lhs.isEmpty();
            System.out.println(lhs.size());
            //clear all set //hs.clear();
            //System.out.println(hs);
        }
        }
    }

