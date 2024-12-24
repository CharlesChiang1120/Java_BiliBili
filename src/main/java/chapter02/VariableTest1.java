package chapter02;
/*
    24-变量与运算符-整型数据类型的使用
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

    }
}
