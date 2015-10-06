package com.solutions;

public class solution31 {
    public static void main(String[] args) {
        //What do you want from me -_-
        int count = 1;
        for (int one = 0; one <= 200; one++)
            for (int two = 0; two + one <= 200; two += 2)
                for (int five = 0; five + two + one <= 200; five += 5)
                    for (int ten = 0; ten + five + two + one <= 200; ten += 10)
                        for (int twenty = 0; twenty + ten + five + two + one <= 200; twenty += 20)
                            for (int fifty = 0; fifty + twenty + ten + five + two + one <= 200; fifty += 50)
                                for (int hundred = 0; hundred + fifty + twenty + ten + five + two + one <= 200; hundred += 100)
                                    if (hundred + fifty + twenty + ten + five + two + one == 200)
                                        count++;
        System.out.println(count);
    }
}
