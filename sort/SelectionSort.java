/**
 * 선택 정렬
 * - 첫 번째 자료를 두 번째 자료부터 마지막 자료까지 차례대로 비교하여 가장 작은 값을 찾아 첫 번째에 놓고,
 * - 두 번째 자료를 세 번째 자료부터 마지막 자료까지 차례대로 비교하여 그 중 가장 작은 값을 찾아 두번째 위치에 놓는 과정을 반복하여 정렬 수행한다.
 * - 1회전을 수행하고 나면 가장 작은 값의 자료가 맨 앞에 오게 되므로 그 다음 회전에서는 두 번째 자료를 가지고 비교한다.
 */

public class SelectionSort {
    public static void selectionsort(int arr[]) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
    public static void main(String args[]) {
        int arr[] = {9, 6, 7, 3, 5};
        selectionsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
