/**
 * 병합정렬
 * : 하나의 리스트를 두 개의 균등한 크기로 분할하고 분할된 부분 리스트를 정렬한 다음,
 *   두 개의 정렬된 부분 리스트를 합하여 전체가 정렬된 리스트가 되게 하는 방법
 *
 * - 리스트의 길이가 0 또는 1 이면 이미 정렬된 것으로 본다.
 * - 정렬되지 않은 리스트를 절반으로 잘라 비슷한 크기의 두 부분 리스트로 나눈다.
 * - 각 부분 리스트를 재귀적으로 합병정렬을 이용해 정렬한다.
 * - 두 부분의 리스트를 다시 하나의 정렬된 리스트로 합병한다.
 * 
 * !! 추가적인 리스트가 필요함
 * !! 사실상 리스트를 나누는 일은 시간복잡도가 없다. 원래 나눠져있는 것이라고 생각해도 된다.
 */

public class MergeSort {
    public static void partition(int left, int right) {
        if (left == right) return;
        if (left < right) {
            int mid = (left + right) / 2;
            partition(left, mid);
            partition(mid + 1, right);
            merge(left, right);
        }
    }
    public static void merge(int left, int right) {
        int mid = (left + right) / 2;


    }
    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;
        partition(0, n - 1);
        for (int i = 0; i < n ; i++) {
            System.out.println(arr[i]);
        }
    }
}
