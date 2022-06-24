/**
 * 힙정렬
 * 힙: 완전 이진트리의 일종으로 우선순위 큐를 위해서 만들어진 자료구조
 *    최대값, 최소값을 쉽게 추출할 수 있는 자료구조다.
 * - 최소 힙 트리나 최소 힙 트리를 구성해 정렬하는 방법
 * - 힙은 1차원 배열로 쉽게 구현될 수 있다.
 * - 정렬해야 할 n개의 요소들을 1차원 배열에 기억한 후 최대 힙 삽입을 통해 차례대로 삽입한다.
 * - 최대 힙으로 구성된 배열에서 최대값부터 삭제한다.
 */
public class HeapSort {
    public static void heapsort(int arr[]) {
        int length = arr.length;

    }
    
    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        heapsort(arr);
    
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
