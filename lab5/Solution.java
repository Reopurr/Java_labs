package lab5;

public class Solution {
        public static int recursion(int A[], int n) {
            if (n==1)
                return A[0];
            return Math.max(A[n-1],recursion(A,n-1));
        }

        public static void rec2(int n){
            if (n>=1){
                rec2(n-1);
                for (int i = 0; i < n; i++) {
                    System.out.print(n+" ");
                }
            }
        }

    public static void rec3(int n){
        if (n>=1){
            rec3(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        int A[] = {1, 4, 2 ,5 ,20, 123, 124, 2};
        int n = 8;
        System.out.println("1 задание на рекурсию");
        System.out.println(recursion(A,n));
        System.out.println("2 задание на рекурсию");
        rec2(n);
        System.out.println("\n3 задание на рекурсию");
        rec3(n);
    }
}


