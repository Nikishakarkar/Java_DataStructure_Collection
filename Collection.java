package com.collection;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class Collection {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>(); {
            list.add(22);
            list.add(55);
            list.add(55);
            list.add(1);
            list.add(5);
            list.add(14);
            list.add(0);
            System.out.println("min element" + Collections.min(list));
            System.out.println("min element" + Collections.max(list));
            System.out.println("min element" + Collections.frequency(list,55));
        Collections.sort(list);
        Collections.sort(list, Comparator.reverseOrder());
        }


        List<student> std = new ArrayList<>();
        {
            std.add(new student("Nikisha", 1));
            std.add(new student("Beena", 2));
            std.add(new student("Bhumi", 3));
            std.add(new student("Bhumi", 1));

            student s1 = new student("priya",2);
            student s2 = new student("riya",3);
            student s3 = new student("niya",4);

            System.out.println(std);
            Collections.sort(std);
            System.out.println(std);
//using comparator
          /*  Collections.sort(std, new Comparator<student>() {
                @Override
                public int compare(student o1, student o2) {
                    return o1.name.compareTo(o2.name);
                }
            });
            System.out.println(std);*/
//using lambda
                Collections.sort(std, (o1, o2) -> o1.name.compareTo(o2.name));
                System.out.println(std);
            //System.out.println((s1.compareTo(s2)));
        }
    }
}
