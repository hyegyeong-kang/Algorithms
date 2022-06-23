/**
 * 이진 탐색
 * <이진탐색을 위한 조건>
 * 1. 원소가 정렬되어있어야 함 (오름차든 내림차든)
 * 2. 원소의 Random Access 가 가능해야 한다.
 * 
 * 검색 범위를 줄여나가면서 원하는 데이터 검색
 * 리스트를 두 부분 리스트로 나누고 필요한 부분에서만 탐색하도록 제한하여 원소를 찾는 알고리즘
 */

public class BinarySearch {
    int binarySearch(int arr[], int left, int right, int x) {
        if (r >= 1) {
            int mid = left + (right - 1) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, left, mid - 1, x);
            }
            return binarySearch(arr, mid + 1, right, x);
        }
        return -1;
    }
    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
