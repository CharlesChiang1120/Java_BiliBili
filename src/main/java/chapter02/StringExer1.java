package chapter02;

/*
    31-變量與運算符-String類的課後練習
 */
public class StringExer1 {
    public static void main(String[] args) {
        // Practice 1:
     // String str1 = 4;                        // no
        String str2 =3.5f + "";                 // yes
        System.out.println(str2);               // 3.5
        System.out.println(3 + 4 + "Hello!");   // 7Hello!
        System.out.println("Hello!" + 3 + 4);   // Hello!34
        System.out.println('a' + 1 + "Hello!"); // 98Hello!
        System.out.println("Hello!" + 'a' + 1); // Hello!a1


        // Practice 2:
        System.out.println("*     *");           // *     *
        System.out.println("*\t*");              // *	*
        System.out.println("*" + "\t" + "*");    // *	*
        System.out.println('*' + "\t" + "*");    // *	*
        System.out.println('*' + '\t' + "*");    // 51*
        System.out.println('*' + "\t" + '*');    // *	*
        System.out.println("*" + '\t' + '*');    // *	*
        System.out.println('*' + '\t' + '*');    // 93


    }

}
