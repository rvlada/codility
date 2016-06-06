// https://codility.com/programmers/task/cyclic_rotation/
// https://codility.com/demo/results/trainingZEJ5P5-CYW/

class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int index = (i + K) % A.length;
            result[index] = A[i];
        }
        return result;
    }
}
