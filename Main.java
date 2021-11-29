package com.collection;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {

        Main e = new Main();

        ArrayList<Integer> result = Example(10);

        System.out.println("result:" + result);
    }

    public static ArrayList<Integer> Example(int N) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        if (N % 2 == 1) {
            return result;

        } else {
            if (N == 2 || N == 4) {
                result.add(N);
                System.out.println(N);
                return result;

            } else {
                int sum = 0;
                for (int i = 2; i < N; i++) {
                    sum += i;//sum=sum+i;
                    if (sum > N) {
                        int index = -1;
                        for (int j = 0; j < result.size(); j++) {
                            if (result.get(j) == (sum - N)) {
                                index = j;
                                break;

                            }
                        }
                        if (index != -1) {
                            result.remove(index);
                            result.add(i);
                        }
                        break;
                    }
                    result.add(i);
                    i++;
                }
            }
        }
        return result;

    }
}
