package chapter02;

/*
   22-变量与运算符-标识符的使用
 */

/*
    測試標識符的使用

    1. 什麼是標識符？ Java 中變量、方法、類等要素命名使用的字符序列，稱為標識符
    技巧：凡是自己可以起名的地方都叫標識符。 e.g. 類名、方法名、變量名、包名、常量名

    2. 標識符的命名規則 (必須要遵守，否則編譯不通過)
    -> 由26個英文字母大小寫，0-9，_ 或 $ 組成
    -> 數字不可以開頭
    -> 不可以使用關鍵字和保留字，但能包含關鍵字和保留字
    -> Java 中嚴格區分大小寫，長度無限制
    -> 標識符不能包含空格

    3. 標識符的命名規範
    -> 包名：多單詞組成時所有字母都小寫：xxxyyyzzz
       e.g. java.lang, com.atguigu.bean

    -> 類名、接口名：多單詞組成時，所有單詞的首字母大寫：XxxYyyZzz
       e.g. HelloWorld, String, System

    -> 變量名、方法名：多單詞組成時，第一個單詞首字母小寫，第二個單詞開始每個單詞首字母大寫：xxxYyyZzz
       e.g. age, name, bookName, main, binarySearch, getName

    -> 常量名：所有字母都大寫，多單詞時每個字母用下划線連接：XXX_YYY_ZZZ
       e.g. MAX_VALUE, PI, DEFAULT_CAPACITY

    說明：定義標識符時，要“見名知意”
*/
class IdentifierTest {
    public static void main(String[] args) {

        int abc = 12;
        int age = 12;

        char gender = 'M';
    }

}

class _a$bc{

}

//class 1abc {
//
//        }

class Public {

}

class publicstatic {

}
