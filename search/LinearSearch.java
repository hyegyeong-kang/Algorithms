/**
 * 선형탐색
 * 가장 기초가 되는 알고리즘으로 그냥 앞에서부터 찾는다.
 * 구현하기 쉽지만 배열의 크기가 커질수록 찾는 시간 오래 걸림
 */

public class LinearSearch {
    public static int search(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;

        int result = search(arr, x);
        if(result == -1) {
            System.out.println("element is not present array");
        } else {
            System.out.println("element is present at index" + result);
        }
    }
}
