// https://codility.com/programmers/task/max_counters
// https://codility.com/demo/results/training6XAF7W-29Z/

class MaxCounters {
    public int[] solution(int N, int[] A) {
        int counters[] = new int[N];
        int min = 0;
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                if (counters[A[i]-1] < min) {
                    counters[A[i]-1] = min;
                }
                counters[A[i]-1]++;
                if (counters[A[i]-1] > max) {
                    max++;
                }
            } else {
                min = max;
            }
        }
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < min) {
                counters[i] = min;
            }
        }
        return counters;
    }
}
