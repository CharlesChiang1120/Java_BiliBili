package chapter02;

/*
    28-变量与运算符-基本数据类型变量间的自动类型提升规则
 */
/*
    測試基本數據類型變量間的運算規則

    1. 這裡提到可以做運算的基本數據類型有 7 種，不包含 Boolean 類型
    2. 運算規則包括：
        1. 自動類型提升
        2. 強制類轉換
    3. 此 VariableTest3.java 用來測試自動類型提升

    規則: 當容量小的變量與容量大的變量做運算時，結果自動轉換為容量大的數據類型
           byte、short、char ---> int ---> long ---> float ---> double
           特別的: byte、short、char 類型的變量之間做運算，結果為 int 類型
    說明: 此時的容量小或大，並非指佔用的內存空間的大小，而是表示數據的範圍的大小
           long(8 字節), float(4 字節)
 */

public class VariableTest3 {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = i1;

        long l1 =i1;
        float f1 = l1;

        byte b1 = 12;
        int i3 = b1 + i1;
        // 編譯不通過
        // byte b2 = b1 + i1;

        // ******************************
        // 特殊的:
        byte b3 = 12;
        short s1 = 10;
        // 編譯不通過
        // short s2 = b3 + s1;
        int s2 = b3 + s1;

        byte b4 = 10;
        // 編譯不通過
        // byte b5 = b3 + b4;

        // 特殊情況2: char
        char c1 = 'a';
        // 編譯不通過
        // char c2 = c1 + b3;

        int i4 = c1 + b3;

        // ******************************
        // 練習1:
        long l2 = 123L;
        long l3 = 123; // 理解為: 自動類型提升

        // long l4 = 123123123123; // 123123123123 理解為 int 類型，因為超出了 int 範圍，所以報錯
        long l5 = 123123123123L; // 此時的 123123123123 就是使用 8 個字節儲存的 long 類型的值

        // 練習2:
        float f2 = 12.3F;
        // 編譯不通過
        // float f3 = 12.3; // 不滿足自動類型提升的規則( double -> float) 所以報錯

        // 練習3:
        // 規定1: 整型常量，規定為 int 類型
        byte b5 = 10;
        // byte b6 = b5 + 1;
        int ii1 = b5 + 1;

        // 規定2: 浮點型常量，規定為 double 類型
        double dd1 = b5 + 12.3;

        // 練習4:
        // 變數命名不可以數字開頭
        // 原因: 如果可以以數字開頭命名，會出現以下的情況
        // int 123L = 12;
        // long l6 =123L;
    }
}
