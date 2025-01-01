package chapter02;

/*
    26-变量与运算符-字符类型的使用
*/

/*
    測試字符類型和布林類型的使用
 */

public class VariableTest2 {
    public static void main(String[] args) {
        // 1. 字符類型：char(2 bytes)

        // 表示形式 1. 使用一對''，內部有且僅能有一個字符
        char c1 = 'a';
        char c2 = '中';
        char c3 = '1';
        char c4 = '%';
        char c5 = 'β';

        // 編譯不通過
//        char c6 = '';
//        char c7 = 'ab';

        // 表示形式 2. 直接使用 Unicode 值來表示字符型常量

        char c8 = '\u0043';
        System.out.println(c8);

        // 表示形式 3. 使用轉義字符
        char c9 = '\n';
        char c10 = '\t';
        System.out.println("hello" + c9 + "World");
        System.out.println("hello" + c10 + "World");

        // 表示形式 4. 使用具體字符對應的數值(例如 ASCII 碼)
        char c11 = 97;
        System.out.println(c11); // a

        char c12 = '1';
        char c13 = 1;



    }

}
