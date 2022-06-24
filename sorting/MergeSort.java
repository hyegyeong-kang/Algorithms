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
 */

public class MergeSort {
    public static void mergesort(int arr[]) {
        int length = arr.length;
        

    }
    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        mergesort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
