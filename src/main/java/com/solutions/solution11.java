package com.solutions;

public class solution11 {
    public static void main(String[] args) {
        String all = "08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08 49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00 81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65 52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91 22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80 24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50 32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70 67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21 24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72 21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95 78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92 16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57 86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58 19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40 04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66 88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69 04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36 20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16 20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54 01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48";
        int[][] matritza = new int[20][20];
        String[] strings = all.split("\\ ");
        int[] nums = new int[400];
        for (int i = 0; i < 400; i++)
            nums[i] = Integer.valueOf(strings[i]);
        int index = 0;
        for (int i = 0; i < 20; i++)
            for (int j = 0; j < 20; j++) {
                matritza[i][j] = nums[index];
                index++;
            }
        int max = Math.max(up(matritza), down(matritza));
        max = Math.max(max, right(matritza));
        max = Math.max(max, left(matritza));
        max = Math.max(max, leftDiagnolly(matritza));
        max = Math.max(max, rightDiagnolly(matritza));
        System.out.println(max);

    }

    public static int up(int[][] matritz) {
        int maxNum = 0;
        int maxRow = 0, maxLine = 0, startingNum = 0;
        int maxFirst = 0, maxSecond = 0, maxThird = 0, maxFourth = 0;
        for (int row = 3; row < 20; row++)
            for (int line = 0; line < 20; line++) {
                int firstNum = matritz[row][line];
                int secondNum = matritz[row - 1][line];
                int thirdNum = matritz[row - 2][line];
                int fourthNum = matritz[row - 3][line];
                int number = firstNum * secondNum * thirdNum * fourthNum;
                if (number > maxNum) {
                    maxNum = number;
                    maxRow = row;
                    maxLine = line;
                    startingNum = matritz[row][line];
                    maxFirst = firstNum;
                    maxSecond = secondNum;
                    maxThird = thirdNum;
                    maxFourth = fourthNum;
                }
            }
        System.out.println("\"up\" reporting. max number in upper multiplying is; " + maxNum + ", his row is: " + maxRow + " his line is: " + maxLine + " Starting num is: " + startingNum);
        System.out.println("max first num: " + maxFirst + " max second num: " + maxSecond + " max third num:" + maxThird + " max fourth num: " + maxFourth);
        return maxNum;
    }

    public static int down(int[][] matritz) {
        int maxNum = 0;
        int maxRow = 0, maxLine = 0, startingNum = 0;
        for (int row = 0; row < 17; row++)
            for (int line = 0; line < 20; line++) {
                int number = matritz[row][line] * matritz[row + 1][line] * matritz[row + 2][line] * matritz[row + 3][line];
                if (number > maxNum)
                    maxNum = number;
                maxRow = row;
                maxLine = line;
                startingNum = matritz[row][line];
            }
        System.out.println("\"down\" reporting. max number in down multiplying is; " + maxNum + ", his row is: " + maxRow + " his line is: " + maxLine + " Starting num is: " + startingNum);

        return maxNum;
    }

    public static int right(int[][] matritz) {
        int maxNum = 0;
        int maxRow = 0, maxLine = 0, startingNum = 0;
        for (int row = 0; row < 20; row++)
            for (int line = 0; line < 17; line++) {
                int number = matritz[row][line] * matritz[row][line + 1] * matritz[row][line + 2] * matritz[row][line + 3];
                if (number > maxNum)
                    maxNum = number;
                maxRow = row;
                maxLine = line;
                startingNum = matritz[row][line];
            }
        System.out.println("\"right\" reporting. max number in right multiplying is; " + maxNum + ", his row is: " + maxRow + " his line is: " + maxLine + " Starting num is: " + startingNum);

        return maxNum;
    }

    public static int left(int[][] matritz) {
        int maxNum = 0;
        int maxRow = 0, maxLine = 0, startingNum = 0;
        for (int row = 0; row < 20; row++)
            for (int line = 3; line < 20; line++) {
                int number = matritz[row][line] * matritz[row][line - 1] * matritz[row][line - 2] * matritz[row][line - 3];
                if (number > maxNum)
                    maxNum = number;
                maxRow = row;
                maxLine = line;
                startingNum = matritz[row][line];
            }
        System.out.println("\"left\" reporting. max number in left multiplying is; " + maxNum + ", his row is: " + maxRow + " his line is: " + maxLine + " Starting num is: " + startingNum);

        return maxNum;
    }

    public static int rightDiagnolly(int[][] matritz) {
        int maxNum = 0;
        int maxRow = 0, maxLine = 0, startingNum = 0;
        int maxFirst = 0, maxSecond = 0, maxThird = 0, maxFourth = 0;
        for (int row = 0; row < 17; row++)
            for (int line = 0; line < 17; line++) {
                int number = matritz[row][line] * matritz[row + 1][line + 1] * matritz[row + 2][line + 2] * matritz[row + 3][line + 3];
                if (number > maxNum) {
                    maxNum = number;
                    maxRow = row;
                    maxLine = line;
                    startingNum = matritz[row][line];
                }
            }
        System.out.println("\"rightDiagnolly\" reporting. max number in right diagnoll multiplying is; " + maxNum + ", his row is: " + maxRow + " his line is: " + maxLine + " Starting num is: " + startingNum);

        return maxNum;
    }

    public static int leftDiagnolly(int[][] matritz) {
        int maxNum = 0;
        int maxRow = 0, maxLine = 0, startingNum = 0;

        for (int row = 0; row < 17; row++)
            for (int line = 3; line < 20; line++) {
                int number = matritz[row][line] * matritz[row + 1][line - 1] * matritz[row + 2][line - 2] * matritz[row + 3][line - 3];
                if (number > maxNum)
                    maxNum = number;
                maxRow = row;
                maxLine = line;
                startingNum = matritz[row][line];
            }
        System.out.println("\"leftDiagnolly\" reporting. max number in left diagnoll multiplying is; " + maxNum + ", his row is: " + maxRow + " his line is: " + maxLine + " Starting num is: " + startingNum);

        return maxNum;
    }


}
