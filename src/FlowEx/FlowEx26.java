package FlowEx;

// while문을 이용해서 1부터 몇까지 더하면 누적합계가 100이 넘지 않는 제일 큰 수가 되는지 알아내는 예제
public class FlowEx26 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        // i를 1씩 증가시켜서 sum에 계속 더해나간다.
        while((sum += ++i) <= 100) { // sum += ++i : i의 값을 1 증가시켜서 sum에 누적, sum <= 100 : sum의 값이 100보다 작거나 같은지 확인
            System.out.printf("%d - %d\n", i, sum);
        }
    } // main
} // class
