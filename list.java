package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class list {

    public static void main(String[] args) {
         Stack<String> st = new Stack<String>();
         {
            st.push("Lion");
            st.push("Dog");
            st.push("Cat");
             System.out.println(st);
//check first element lifo:

             System.out.println(st.peek());
             System.out.println(st);
             st.pop();
             System.out.println(st);
             System.out.println(st.peek());
             System.out.println(st);

         }

        List<Integer> s1 = new ArrayList<>();
        {
            s1.add(1);
            s1.add(2);
            s1.add(3);

            System.out.println("Simple List"+s1);
            //add new element
            s1.add(1,19);
            System.out.println("Add element index[1] and set value :-"+s1);
            //Create new list
            List<Integer> l1=new ArrayList<>();
            l1.add(11);
            l1.add(12);
            //add l1 into s1
            s1.addAll(l1);
            System.out.println("Set a new[11,12] list in the current list:-"+s1);
            //get element
            s1.get(1);
            System.out.println("get element"+s1);
            //delete element
            s1.remove(5);
            System.out.println("remove element from index no.5:-"+s1);
            //element remove
            s1.remove(Integer.valueOf(3));
            System.out.println("element remove data type+value:-"+s1);
            //set index 0 value with 1 to 2
            s1.set(0,2);
            System.out.println("set index1 value with 2:-"+s1);
            //check element
            System.out.println(s1.contains(2));
            // Use Iterator: Iterate our element one by one
            for (int i=0;i<s1.size(); i++){
                System.out.println("Iterate our element"+s1);
            }
            //Iterate our element using foreach lop
            for(Integer list:s1)
            {
                System.out.println("foreach"+list);
            }
            //using Iterator
            Iterator<Integer> it= s1.iterator();
            while (it.hasNext())
            {
                System.out.println("hasNext value:"+it.next());
            }
            }




        }
    }

