package chapter02;

/*
   23-变量与运算符-变量的基本使用
 */

/*

  1. 變量的理解：內存中的一個存儲區域，該區域的數據可以在同一類型範圍內不斷變化
  2. 變量的構成包含三個要素：數據類型、變量名、儲存的值
  3. Java 中聲明變量的格式：數據類型 變量名 = 變量值
  4. Java 中的變量按照數據類型來分類：
     - 基本數據類型(8種)：
        整型：byte/ short/ int/ long
        浮點型：float/ double
        字符型：char
        布林型：boolean

     - 引用數據類型：
        類(class)
        數組(array)
        接口(interface)

        枚舉(enum)
        註解(annotation)
        紀錄(record)

   5. 定義變量時，變量名要遵循標識符的規則與規範
   6. 說明：
      - 變量都有其作用域。變量只有在作用域內是有效的，出了作用域就無效了
      - 在同一個作用域內，不能聲明兩個同名的變量
      - 定義好變量名之後，就可以通過變量名的方式對變量進行調用和運算
      - 變量值在賦值時，必須滿足變量的數據類型，並且在數據類型有效的範圍內變化

*/
public class VariableTest {
    public static void main(String[] args) {

        // 定義變量的方式1:
        char gender; // 變量的聲明
        gender = 'm'; // 變量的賦值(或初始化)
        gender = 'f';

        // 定義變量的方式2: 聲明與初始化合併
        int age = 10;

        System.out.println(age);
        System.out.println("age = " + age);

        gender = 'm';

        // 由於 number 前沒有聲明類型，即當前 number 變量沒有提前定義，所以編譯不通過
        // number = 10;

        byte b1 = 127;
        // b1 超出 Byte 的範圍
        // b1 = 128;

    }

    public static void main123(String[] args) {
        char gender = 'f';
    }
}
