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
        int pivot_index = (left + right) / 2;
        int pivot = arr[pivot_index];

        while(left < right) {
            if (arr[pivot] >= arr[left]) {
                left++;
            }
            if (arr[pivot] < arr[right]) {
                right--;
            }
            if (left < right) {
                swap(arr, left, right);
                quicksort(arr, left, pivot);
                quicksort(arr, pivot, right);
            }
        }


    }
    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String args[]) {
        int[] arr = {3, 7, 8, 2, 9};
        int n = arr.length;
        quicksort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
}
