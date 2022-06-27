/**
 * 퀵정렬
 * 시간 복잡도: 최악 - O(n2), 최선 - O(nlogn), 평균 - O(nlogn)
 * 
 * 기준이 되는 pivot 을 리스트에서 임의로 하나를 선택한다.
 * 'pivot 보다 작은 수' < pivot < 'pivot 보다 큰 수'
 * 나누고 나누어진 부분을 다시 퀵정렬을 사용해 정렬한다.
 */
public class QuickSort {
    public static void quicksort(int arr[], int left, int right) {
        int pivot = arr[(left + right) / 2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < pivot) {

            }
        }

    }
    public static void main(String args[]) {
        int[] arr = {3, 7, 8, 2, 9};
        int n = arr.length;
        quicksort(arr, 0, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
}
