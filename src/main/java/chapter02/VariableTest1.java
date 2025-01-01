package chapter02;
/*
    24-变量与运算符-整型数据类型的使用
    25-变量与运算符-浮点类型的使用及练习
 */

/*
    測試整型和浮點型變量的使用
 */

public class VariableTest1 {
    public static void main(String[] args) {

        // 1. 測試整型變量的使用
        // byte(8 bits)/ short(16 bits)/ int(24 bits)/ long(32 bits)

        byte b1 = 12;
        byte b2 = 127;
        // 編譯不通過，超出 Byte 存儲
        // byte b3 = 128;

        short s1 = 1234;

        int i1 = 1232341234;

        // 聲明 long 變量時，要提供後綴，後綴為 l 或 L
        long l1 = 123123123L;

        // 開發中，大家定義整型變量時，沒有特殊情況，通常都聲明為 int 類型

        // 2. 測試浮點類型變量的使用
        // float/ double
        double d1 = 12.3;

        // 聲明 long 變量時，要提供後綴，後綴為 f 或 F
        float f1 = 12.3f;
        System.out.println(f1);

        // 開發中，大家定義浮點型變量時，沒有特殊情況，通常都聲明為 double 類型，因為精度更高
        // float 表述範圍大於 long 表述範圍，但是精度不高

        // 測試浮點型變量的精度
        // 結論：通過測試發現浮點型變量的精度不高。如果在開發中，需要極高的精度，需要使用 BigDecimal class 替換浮點型變量
        // 測試 1
        System.out.println(0.1+0.2); // 0.30000000000000004

        // 測試 2
        float ff1 = 123123123f;
        float ff2 = ff1 + 1;
        System.out.println(ff1);
        System.out.println(ff2);
        System.out.println(ff1 == ff2); // true

    }
}
