package chapter02;

/*
    25-变量与运算符-浮点类型的使用及练习
 */

/*
 Case2: 小明到美國旅遊，可是那裡的溫度是以華氏度為單位紀錄
        他需要一個程序將華氏溫度(80度)轉換為攝氏度，並以華氏度和攝氏度為單位分別顯示該溫度

 C = (F - 32) /1.8
*/

public class FloatDoubleExer1 {
    public static void main(String[] args) {
        double hua = 80.0;
        double she = (hua - 32) / 1.8;

        System.out.println(she);
    }
}
