package chapter02;

/*
     30-變量與運算符-String類的基本使用
 */
/*
    一、關於 String 的理解
    1. String 類，屬於引用數據類型，俗稱字符串
    2. String 類型的變量，可以使用一對 "" 來賦值
    3. String 聲明的字符串內部，可以包含0個，1個或多個字符

    二、String 與基本數據類型的運算
    1. 這邊的基本數據類型包括 boolean 在內的 8 種
    2. String 與基本數據類型變量間只能做連接運算，使用 "+" 表示
 */
public class StringTest {
    public static void main(String[] args) {
        String str1 = "Hello World";
        System.out.println("str1");
        System.out.println(str1);

        String str2 = "";
        String str3 = "a"; // char a = 'a';

        // 測試連接運算
        int num1 = 10;
        boolean b1 = true;
        String str4 = "hello";

        System.out.println(str4 + b1);

        String str5 = str4 + b1;
        String str6 = str4 + b1 + num1; // hellotrue10
        System.out.println(str6);

        // 思考：如下的聲明編譯能通過嗎？
        // String str7 = b1 + num1 + str4;

        // 如何將 String 類型的變量轉換為基本數據類型？
        int num2 = 10;
        String str7 = num2 + ""; // "10"
        String str8 = "abc"; // 不能考慮轉換為基本數據類型

        String str9 = num2 + "";// "10"
        // 編譯不通過
        // int num3 = (int)str9;

        // 如何實現呢？ 使用 Integer
        int num3 = Integer.parseInt(str9);
        System.out.println(num3 + 1);


    }
}
