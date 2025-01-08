package chapter02;
/*
    32-變量與運算符-常見進制的理解與二進制轉十進制操作
 */

/*
    -  十進制 (decimal)
        - 數字組成: 0-9
        - 進位規則: 滿十進一

    -  二進制 (binary)
        - 數字組成: 0-1
        - 進位規則: 滿二進一，以 `0b` 或 `0B` 開頭

    -  八進制 (octal) : 很少使用
        - 數字組成: 0-7
        - 進位規則: 滿八進一，以數字 `0` 開頭

    -  十六進制 (hexadecimal)
        - 數字組成: 0-9, a-f
        - 進位規則: 滿十六進一，以數字 `0x` 或 `0X` 開頭表示，此處的 a-f 不區分大小寫
 */
public class BinaryTest {
    public static void main(String[] args) {
        int num1 = 103;   // decimal
        int num2 = 0b10;  // binary
        int num3 = 023;   // octal
        int num4 = 0x23a; // hexadecimal

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
}
