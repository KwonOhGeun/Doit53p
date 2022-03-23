public class Ex04_04 {
    public static void main(String[] args) {
        int a = 10, b;

        b = a++; // a+1 하기 전에 b에 먼저 a값을 저장하고, a+1을 실행
        System.out.printf("%d \n", b);
        // b = 10 // a = 11

        b = ++a; // a+1 먼저하고, b에 값을 저장
        System.out.printf("%d \n", b);
    }
}
