import java.io.ObjectInputFilter.Status;

/**
 * 피보나치 수열
 * 첫째 및 둘째 항이 1이며 그 뒤의 모든 항은 바로 앞 두 항의 합인 수열
 */
public class Fibonacci {
    public static int fibo(int N) {
        System.out.println("fibo(" + N + ") 호출");
        if (N == 0) {
            return 0;
        } else if (N ==1) {
            return 1;
        }
        int result = fibo(N - 1) + fibo(N - 2);
        System.out.println(N + "번째 = " + result);
        return N;
    }
    public static void main(Stirng args[]) {
        fibo(6);
    }
}
