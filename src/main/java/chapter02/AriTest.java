package chapter02;

/*
    34-變量與運算符-算術運算符的使用
 */

/*
    1. + - + - * / % (前)++  (後)++  (前)--  (後)--
 */
public class AriTest {
    public static void main(String[] args) {
        // 除法: /
        int m1 = 12;
        int n1 = 5;
        int k1 = m1/n1;
        System.out.println(k1); // 2
        System.out.println(m1 / n1 * n1); // 10

        // 取模(或取餘): %
        int i1 = 12;
        int j1 = 5;
        System.out.println(i1 % j1); // 2

        // 開發中，經常用來判斷某個數 num1 能否整除另外一個數 num2   num1 % num2 == 0
        // 比如: 判斷 num1 是否為偶數: num1 % 2 == 0

        // 結論: 取模之後，結果與被模數的符號相同
        int i2 = -12;
        int j2 = 5;
        System.out.println(i2 % j2); // -2

        int i3 = 12;
        int j3 = -5;
        System.out.println(i3 % j3); // 2

        int i4 = -12;
        int j4 = -5;
        System.out.println(i4 % j4); // -2


    }
}
