package FlowEx;

// 2중 반복문을 이용하여 쌍으로 출력. 여기에 if문으로 조건을 주어 조건에 맞는 친구들만 출력
public class FlowEx21 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1 ; j <= 5; j++) {
                if(i==j) {
                    System.out.printf("[%d,%d]",i,j);
                } else {
                    System.out.printf("%5c",' ');
                }
            }
            System.out.println();
        }
    } // main
} // class
