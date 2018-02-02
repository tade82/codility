package codility.lessons.binarygap;

import java.util.function.IntConsumer;

public class Solution {

    public int solution(int N) {
        String s = Integer.toBinaryString(N);
        int maxLength = 0;
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                if (counter > maxLength) maxLength = counter;
                counter = 0;
            } else {
                counter++;
            }
        }
        return maxLength;
    }
}
