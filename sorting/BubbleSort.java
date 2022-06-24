/**
 * 버블정렬 
 * - 서로 인접한 두 원소를 검사하여 정렬하는 알고리즘
 * - 인접한 두 개의 레코드를 비교하여 크기가 순서대로 되어있지 않으면 서로 교환한다.
 * - 첫번째 자료와 두번째 자료를, 두번째 자료와 세번째 자료를,,,(마지막 - 1) 번째 자료와 마지막 자료를 비교하여 교환하면서 자료를 정렬한다.
 * - 1회전을 수행하고 나면 가장 큰 자료가 맨 뒤로 이동하므로 2회전에서는 맨 끝에 있는 자료는 정렬에서 제외된다. 
 * - 이렇게 제외되는 데이터가 하나씩 늘어남.
 */
public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String args[]) {
        int arr[] = {7, 4, 5, 1, 3}; // 오름차순으로 정렬하자
        bubbleSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
