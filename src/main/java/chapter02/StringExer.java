package chapter02;

/*
    31-變量與運算符-String類的課後練習
 */
/*
    要求填寫自己的姓名、年齡、性別、體重、婚姻狀況(已婚用 true 表示，單身用 false 表示)、聯繫方式等等
 */
public class StringExer {
    public static void main(String[] args) {
        String name = "ligin";
        int age = 24;
        char gender = 'm';
        double weight = 130.5;
        boolean isMarried = false;
        String phoneNumber = "13012341234";

        String info = "name = " + name + ",age = " + age + ",gender" + gender + ",weight =" + weight + ",isMarried = " + isMarried + ",phoneNumber" + phoneNumber;

        System.out.println(info);
    }
}
