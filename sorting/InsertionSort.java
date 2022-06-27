/**
 * 삽입정렬
 * - 두 번째 요소부터 시작하여 그 앞의 요소들과 대소 비교하여 삽입할 위치를 지정한 후 삽입할 위치 이후의 요소들을
 * 한 칸씩 뒤로 미루면서 삽입하는 정렬 알고리즘
 */
public class InsertionSort {
    static int[] arr = {8, 1, 6, 2, 4, 5, 5, 3, 0, 34};

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void main(String args[]) {
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}