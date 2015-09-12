package com.solutions;

public class solution50 {
    public static void main(String[] args) {
        int limit = 1000000;
        int maxCount = 0, maxNum = 0;
        for (int i = 0; i < limit; i = nextPrime(i))
            if (consecutivePrimesSum(i) > maxCount) {
                maxNum = i;
                maxCount = consecutivePrimesSum(i);
            }
        System.out.println(maxNum);

    }

    static int consecutivePrimesSum(int num) {
        int sum = 0, count = 0, maxCount = 0;
        for (int firstPrime = 2; firstPrime < num / 100000; firstPrime = nextPrime(firstPrime)) {
            for (int currPrime = firstPrime; sum < num; currPrime = nextPrime(currPrime)) {
                sum += currPrime;
                count++;
            }
            //System.out.println("sum: " + sum + ", just added: " + i + " count: " + count);
            if (sum == num) {
                maxCount = Math.max(maxCount, count);
            }
            count = 0;
            sum = 0;
        }
        return maxCount;

    }

    static int nextPrime(int prime) {
        for (int i = prime + 1; true; i++)
            if (isPrime(i))
                return i;
    }

    static boolean isPrime(int num) {
        if (num == 2 || num == 3)
            return true;
        if (num == 1 || num % 2 == 0)
            return false;
        for (int i = 3; i < Math.sqrt(num) + 1; i += 2)
            if (num % i == 0)
                return false;
        return true;

    }
}
