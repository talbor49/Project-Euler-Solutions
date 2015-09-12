package com.solutions;

import com.utils.EulerUtils;


public class solution59 {
    public static void main(String[] args) {
        String data = EulerUtils.readFile("problem59.txt");
        data = data.replace("\"", "");
        data = data.replace("\n", "");
        String[] nums = data.split(",");
        byte[] buffer = new byte[nums.length];
        int index = 0;
        for (String num : nums) {
            buffer[index++] = Byte.valueOf(num);
        }
        String text;
        int sum = 0;
        for (int a = 'a'; a <= 'z'; a++) {
            for (int b = 'a'; b <= 'z'; b++) {
                for (int c = 'a'; c <= 'z'; c++) {
                    text = "";
                    for (int i = 0; i < buffer.length - 2; i += 3) {
                        text += (char) (buffer[i] ^ a) + "" + (char) (buffer[i + 1] ^ b) + "" + (char) (buffer[i + 2] ^ c);
                    }
                    int remainder = buffer.length % 3;
                    text += (remainder == 1)
                            ? (char) (a ^ buffer[buffer.length - 1])
                            : (remainder == 2)
                            ? (char) ((b ^ buffer[buffer.length - 1]) + (a ^ buffer[buffer.length - 2]))
                            : 0;

                    // Most common words in english that contain 3 or more characters
                    // (so they have less change of giving false positives like 2 characters long words do).
                    if (text.toLowerCase().contains(" and ") || text.toLowerCase().contains(" the ") || text.toLowerCase().contains(" have ")) {
                        System.out.println(text);
                        System.out.println((char) a + "" + (char) b + "" + (char) c);
                        for (char i : text.toCharArray()) {
                            sum += (int) i;
                        }
                        System.out.println(sum);
                        // Exit main
                        return;
                    }
                }
            }
        }
    }
}
