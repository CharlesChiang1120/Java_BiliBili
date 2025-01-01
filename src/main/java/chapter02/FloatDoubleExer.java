package chapter02;

/*
    25-变量与运算符-浮点类型的使用及练习
 */

/*
    case1: 定義圓周率並賦值 3.14，現有三個圓半徑分別為 1.2、2.5、6，求面積
 */
public class FloatDoubleExer {
    public static void main(String[] args) {

        // 定義圓周率變量
        double pi = 3.14;
        double radius1 = 1.2;
        double radius2 = 2.5;
        int radius3 = 6;

        double area1 = pi * radius1 * radius1;
        double area2 = pi * radius2 * radius2;
        double area3 = pi * radius3 * radius3;

        System.out.println(area1);
        System.out.println(area2);
        System.out.println(area3);

    }
}
