package FlowEx;

// 중첩 for문 : 별찍기 기초
public class FlowEx16 {
    public static void main(String[] args) {
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println();

        // 이것을 for문을 이용해서 처리하면?
        for(int i = 1; i <= 5; i++) {
            System.out.println("**********");       // 10개의 별을 출력한다.
        }
        System.out.println();

        // ********** 역시 *이 10번 반복되는 것임을 생각
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    } // main
} // class
