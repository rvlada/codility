// https://codility.com/programmers/task/binary_gap/
// https://codility.com/demo/results/trainingUF5TXD-DN5/

class BinaryGap {
    public int solution(int N) {
        int longestGap = 0;
        int currentGap = 0;
        
        int bit = N % 2;
        while (N > 0 && bit == 0) {
            N /= 2;
            bit = N % 2;
        }

        while (N > 0) {
            bit = N % 2;
            if (bit == 0) {
                currentGap++;
            } else {
                longestGap = longestGap > currentGap ? longestGap : currentGap;
                currentGap = 0;
            }
            N /= 2;
        }
        return longestGap;
    }
}
