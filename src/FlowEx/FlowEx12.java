package FlowEx;

// for문의 활용 : 1부터 5까지 세로로 한번, 가로로 한번 출력하는 예제
public class FlowEx12 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        for(int i = 1; i <= 5; i++) {
            System.out.print(i);
        }
        System.out.println("\n멍멍");
    }
}
