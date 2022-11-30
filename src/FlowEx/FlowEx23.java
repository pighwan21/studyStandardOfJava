package FlowEx;

// for문과 while문의 비교, while문의 사용
public class FlowEx23 {
    public static void main(String[] args) {
        // [for문]초기화, 조건식, 증감식
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();
        // [while문]
        int i = 1;           // 초기화
        while (i <= 10) {    // 조건식
            System.out.println(i);
            i++;             // 증감식
        }
        System.out.println();

        int k = 5;
        while(k--!=0) {
            System.out.println(k+" - I Can Do It!");
        }
        System.out.println();
        int h = 5;
        while(h!=0) {
            h--;
            System.out.println(h+" - I Can Do It!");
        }
        System.out.println();
        int a = 5;
        while(--a!=0) {
            System.out.println(a+" - I Can Do It!");
        }
        System.out.println();
        int b = 5;
        while(b!=0) {
            --b;
            System.out.println(b+" - I Can Do It!");
        }
        System.out.println();
//        int b = 5;
//        --b;  // while문을 벗어남
//        while(b!=0) {
//            System.out.println(b+" - I Can Do It!");
//        }
    } // main
} // class
