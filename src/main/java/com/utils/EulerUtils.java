package com.utils;

import com.google.common.collect.Collections2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.*;

public class EulerUtils {

    // BigInteger Pollard Rho algorithm to find prime factorization
    private final static BigInteger ZERO = new BigInteger("0");
    private final static BigInteger ONE = new BigInteger("1");
    private final static BigInteger TWO = new BigInteger("2");
    private final static SecureRandom random = new SecureRandom();



    public static int sumOfList(List<Integer> list) {
        int sum = 0;
        for(int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static boolean isPrime(long num) {
        if (num == 2 | num == 3) {
            return true;
        }
        if (num == 1 || num % 2 == 0)
            return false;
        long limit = (int) Math.sqrt(num);
        for (long i = 3; i <= limit; i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPalindrome(long num) {
        char[] chars = String.valueOf(num).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String num) {
        char[] chars = (num).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int numOfDividers(int num) {
        int dividers = 0;
        for (int i = 1; i <= (int) (Math.sqrt(num)); i++) {
            if (num % i == 0) {
                dividers++;
            }
        }

        return dividers * 2;
    }

    public static int[] stringToIntArr(String digits) {
        int[] arr = new int[digits.length()];
        for(int i = 0; i < digits.length(); i++) {
            arr[i] = Integer.valueOf(String.valueOf(digits.charAt(i)));
        }
        return arr;
    }

    public static long reverse(long num) {
        // So many conversions
        return Long.valueOf(new StringBuilder(String.valueOf(num)).reverse().toString());
    }

    public static String reverse(String str) {
        // So many conversions
        return new StringBuilder(str).reverse().toString();
    }

    public static BigInteger BigInteger_reverse(BigInteger num) {
        String str = num.toString();
        str = new StringBuilder(str).reverse().toString();
        num = new BigInteger(str);
        return num;
    }

    public static BigInteger BigInteger_factorial(long n) {
        BigInteger sum = new BigInteger("1");
        for (int i = 2; i < n; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        return sum;
    }

    public static BigInteger BigInteger_nCr(long n, long r) {
        BigInteger result = (BigInteger_factorial(n));
        result = result.divide(BigInteger_factorial(r));
        result = result.divide(BigInteger_factorial(n - r));
        return result;
    }

    public static long nCr(long n, long r) {
        long result = factorial(n);
        result = result / (factorial(r));
        result = result / (factorial(n - r));
        return result;
    }

    public static long factorial(long n) {
        long sum = 1;
        for (int i = 2; i < n; i++) {
            sum *= i;
        }
        return sum;
    }

    public static boolean oneToNinePandigital(long num) {
        String numStr = String.valueOf(num);
        if (numStr.length() > 9) {
            return false;
        }
        int[] timesAppeared = new int[10];
        for (int i = 1; i < numStr.length(); i++) {
            timesAppeared[numStr.charAt(i) - '0']++;
        }
        for (int i = 1; i < numStr.length(); i++) {
            if (timesAppeared[i] != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean oneToNinePandigital(String numStr) {
        int[] timesAppeared = new int[10];
        for (int i = 0; i < numStr.length(); i++) {
            timesAppeared[numStr.charAt(i) - '0']++;
        }
        for (int i = 1; i <= numStr.length(); i++) {
            if (timesAppeared[i] != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean zeroToNinePandigital(String numStr) {
        if (numStr.length() != 10) {
            return false;
        }
        int[] timesAppeared = new int[10];
        for (int i = 0; i < numStr.length(); i++) {
            timesAppeared[numStr.charAt(i) - '0']++;
        }
        for (int i = 0; i < numStr.length(); i++) {
            if (timesAppeared[i] != 1) {
                return false;
            }
        }
        return true;
    }

    public static Set<Long> permutatations(String digits) {
        List<Integer> digitsList = new ArrayList<>();
        for (char digit : digits.toCharArray()) {
            digitsList.add((int) digit - '0');
        }
        Collection<List<Integer>> perms = Collections2.permutations(digitsList);
        Set<Long> permutations = new HashSet<>(perms.size());
        for (List<Integer> perm : perms) {
            String num = "";
            for (int i : perm) {
                num += i;
            }
            permutations.add(Long.valueOf(num));
        }
        return permutations;
    }

    public static boolean isTriangle(long num) {
        // Triangle inverse function
        double sol = (-1 + Math.sqrt(1 + 8 * num)) / 2.0;
        return (int) sol == sol;
    }

    public static boolean isPenta(long num) {
        // Penta inverse function
        double sol = (1 + Math.sqrt(1 + 24 * num)) / 6.0;
        return (int) sol == sol;
    }

    public static boolean isHexa(long num) {
        // Hexa inverse function
        double sol = (1 + Math.sqrt(1 + 8 * num)) / 4.0;
        return (int) sol == sol;
    }

    public static String readFile(String name) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/problems/src/main/resources/" + name))) {
            String total = "";
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                total += line + "\n";
            }
            return total;
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static List<String> readLines(String name) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/problems/src/main/resources/" + name))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            return lines;
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return lines;
        }
    }

    public static long sumOfDividers(int num) {
        int maxD = (int) Math.sqrt(num);
        int sum = 1;
        for (int i = 2; i <= maxD; i++) {
            if (num % i == 0) {
                sum += i;
                int d = num / i;
                if (d != i) {
                    sum += d;
                }
            }
        }
        return sum;
    }

    public static boolean sameDigits(int num1, int num2) {
        char[] num1digits = String.valueOf(num1).toCharArray();
        char[] num2digits = String.valueOf(num2).toCharArray();
        Arrays.sort(num1digits);
        Arrays.sort(num2digits);
        return Arrays.equals(num1digits, num2digits);
    }

    public static BigInteger BigInteger_nCr(int n, int k) {
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < k; i++) {
            result = result.multiply(BigInteger.valueOf(n - i))
                    .divide(BigInteger.valueOf(i + 1));
        }
        return result;
    }

    public static long sumOfDigits(String num) {
        int sumOfDigits = 0;
        for (int i = 0; i < num.length(); i++) {
            sumOfDigits += num.charAt(i) - '0';
        }
        return sumOfDigits;
    }

    public static long sumOfDigits(long num) {
        int sumOfDigits = 0;
        while (num != 0) {
            sumOfDigits += num % 10;
            num /= 10;
        }
        return sumOfDigits;
    }

    //Copied from StackOverFlow ;)
    public static boolean[] sieveOfAtkins(int limit) {
        boolean[] sieve = new boolean[limit + 1];
        int limitSqrt = (int) Math.sqrt((double) limit);
        // there may be more efficient data structure
        // arrangements than this (there are!) but
        // this is the algorithm in Wikipedia
        // initialize results array
        Arrays.fill(sieve, false);
        // the sieve works only for integers > 3, so
        // set these trivially to their proper values
        sieve[0] = false;
        sieve[1] = false;
        sieve[2] = true;
        sieve[3] = true;

        // loop through all possible integer values for x and y
        // up to the square root of the max prime for the sieve
        // we don't need any larger values for x or y since the
        // max value for x or y will be the square root of n
        // in the quadratics
        // the theorem showed that the quadratics will produce all
        // primes that also satisfy their wheel factorizations, so
        // we can produce the value of n from the quadratic first
        // and then filter n through the wheel quadratic
        // there may be more efficient ways to do this, but this
        // is the design in the Wikipedia article
        // loop through all integers for x and y for calculating
        // the quadratics
        for (int x = 1; x <= limitSqrt; x++) {
            for (int y = 1; y <= limitSqrt; y++) {
                // first quadratic using m = 12 and r in R1 = {r : 1, 5}
                int n = (4 * x * x) + (y * y);
                if (n <= limit && (n % 12 == 1 || n % 12 == 5)) {
                    sieve[n] = !sieve[n];
                }
                // second quadratic using m = 12 and r in R2 = {r : 7}
                n = (3 * x * x) + (y * y);
                if (n <= limit && (n % 12 == 7)) {
                    sieve[n] = !sieve[n];
                }
                // third quadratic using m = 12 and r in R3 = {r : 11}
                n = (3 * x * x) - (y * y);
                if (x > y && n <= limit && (n % 12 == 11)) {
                    sieve[n] = !sieve[n];
                } // end if
                // note that R1 union R2 union R3 is the set R
                // R = {r : 1, 5, 7, 11}
                // which is all values 0 < r < 12 where r is
                // a relative prime of 12
                // Thus all primes become candidates
            } // end for
        } // end for
        // remove all perfect squares since the quadratic
        // wheel factorization filter removes only some of them
        for (int n = 5; n <= limitSqrt; n++) {
            if (sieve[n]) {
                int x = n * n;
                for (int i = x; i <= limit; i += x) {
                    sieve[i] = false;
                } // end for
            } // end if
        } // end for
        // put the results to the System.out device
        // in 10x10 blocks

        return sieve;
    }

    public static BigInteger BigInteger_rho(BigInteger N) {
        BigInteger divisor;
        BigInteger c = new BigInteger(N.bitLength(), random);
        BigInteger x = new BigInteger(N.bitLength(), random);
        BigInteger xx = x;

        // check divisibility by 2
        if (N.mod(TWO).compareTo(ZERO) == 0) return TWO;

        do {
            x = x.multiply(x).mod(N).add(c).mod(N);
            xx = xx.multiply(xx).mod(N).add(c).mod(N);
            xx = xx.multiply(xx).mod(N).add(c).mod(N);
            divisor = x.subtract(xx).gcd(N);
        } while ((divisor.compareTo(ONE)) == 0);

        return divisor;
    }

    public static List<BigInteger> BigInteger_factor(BigInteger N) {
        List<BigInteger> lst = new ArrayList<>(2);
        if (N.compareTo(ONE) == 0)
            return lst;
        if (N.isProbablePrime(20)) {
            lst.add(N);
            return lst;
        }
        BigInteger divisor = BigInteger_rho(N);
        lst.addAll(BigInteger_factor(divisor));
        lst.addAll(BigInteger_factor(N.divide(divisor)));
        return lst;
    }

    public static List<Integer> primeFactors(int numbers) {
        int n = numbers;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }

    //COPIED FROM INTERNET, TODO: SHOULD MAKE ONE MYSELF :)
    public static List<List<Integer>> uniquePartitions(int n)
    {
        List<List<Integer>> ways = new ArrayList<>();

        int[] p = new int[n]; // An array to store a partition
        int k = 0;  // Index of last element in a partition
        p[k] = n;  // Initialize first partition as number itself

        // This loop first prints current partition, then generates next
        // partition. The loop stops when the current partition has all 1s
        while (true)
        {
            // add current partition
            List<Integer> way = new ArrayList<>();
            for (int i = 0; i < k + 1; i++) {
                way.add(p[i]);
            }
            ways.add(way);

            // Generate next partition

            // Find the rightmost non-one value in p[]. Also, update the
            // rem_val so that we know how much value can be accommodated
            int rem_val = 0;
            while (k >= 0 && p[k] == 1)
            {
                rem_val += p[k];
                k--;
            }

            // if k < 0, all the values are 1 so there are no more partitions
            if (k < 0)
                return ways;

            // Decrease the p[k] found above and adjust the rem_val
            p[k]--;
            rem_val++;


            // If rem_val is more, then the sorted order is violeted.  Divide
            // rem_val in differnt values of size p[k] and copy these values at
            // different positions after p[k]
            while (rem_val > p[k])
            {
                p[k+1] = p[k];
                rem_val = rem_val - p[k];
                k++;
            }

            // Copy rem_val to next position and increment position
            p[k+1] = rem_val;
            k++;
        }
    }

    //COPIED FROM INTERNET, TODO: SHOULD MAKE ONE MYSELF :)
    public static List<List<Integer>> permute(List<Integer> num) {
        List<List<Integer>> result = new ArrayList<>();

        //start from an empty list
        result.add(new ArrayList<Integer>());

        for (int i = 0; i < num.size(); i++) {
            //list of list in current iteration of the array num
            ArrayList<ArrayList<Integer>> current = new ArrayList<ArrayList<Integer>>();

            for (List<Integer> l : result) {
                // # of locations to insert is largest index + 1
                for (int j = 0; j < l.size()+1; j++) {
                    // + add num[i] to different locations
                    l.add(j, num.get(i));

                    ArrayList<Integer> temp = new ArrayList<Integer>(l);
                    current.add(temp);

                    //System.out.println(temp);

                    // - remove num[i] add
                    l.remove(j);
                }
            }

            result = new ArrayList<>(current);
        }

        return result;
    }

    public static int convertListOfDigitsToNumber(List<Integer> list) {
        int length = list.size();
        int num = 0;
        for(int i = 0; i < length; i++) {
            num += Math.pow(10, length - i) * list.get(i);
        }
        return num;
    }
}
