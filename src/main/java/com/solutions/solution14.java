package com.solutions;

public class solution14 {
    static long loops = 0;

    public static void main(String[] args) {
        long maxLoops = 0;
        long maxNum = 0;
        for (long i = 1; i < 1000000; i++) {
            if (Collatz(i) > maxLoops) {
                maxNum = i;
                maxLoops = Collatz(i);
            }
        }
        System.out.println(maxNum);
    }

    public static long Collatz(long num) {
        loops++;
        long oldLoops;
        if (num == 1) {
            oldLoops = loops;
            loops = 0;
            return oldLoops;
        } else if (num % 2 == 0) {
            return Collatz(num / 2);
        } else if (num % 2 == 1) {
            return Collatz(3 * num + 1);
        }
        return -1;
    }
}
