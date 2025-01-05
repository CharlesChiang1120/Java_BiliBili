package chapter02;

/*
    29-變量與運算符-基本數據類型變量間的強制類型轉換規則
 */

/*
    此 VariableTest4.java 用來測試強制類型轉換

    規則:
    1. 如果需要將容量大的變量的類型轉換為容量小的變量的類型，需要使用強制類型轉換
    2. 強制類型轉換需要使用強轉符: ()。在 () 內指名要轉換為的數據類型
    3.
 */
public class VariableTest4 {
    public static void main(String[] args) {
        double d1 = 12; // 自動類型轉換

        // 編譯不通過
        // int i1 = d1;
        int i2 = (int)d1;
        System.out.println(i2);


        long l1 =123;
        // 編譯不通過
        // short s1 = l1;
        short s2 = (short) l1;
        System.out.println(s2);

        // 練習
        int i3 =12;
        float f1= i3; // 自動類型提升
        System.out.println(f1); // 12.0

        float f2 = (float)i3; // 編譯可以通過，只不過可以省略 () 而已

        // 精度損失的例子1:
        double d2 = 12.9;
        int i4 = (int)d2;
        System.out.println(i4);

        // 精度損失的例子2:
        int i5 =128;
        byte b1 = (byte)i5;
        System.out.println(b1); // -128

        // 實際開發舉例
        byte b2 = 12;
        method(b2);

        long l2 = 12L;
        // 編譯不通過
//        method(l2);
        method((int) l2);

    }

    public  static void method(int num){ // int num = b2 自動類型轉換
        System.out.println("num = " + num);
    }
}
