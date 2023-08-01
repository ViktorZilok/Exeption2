
/* Разработайте программу, которая выбросит Exception, когда пользователь
 вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        exeptStr();
    }

    public static void exeptStr() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.isEmpty()) {
            System.out.println("Пустые строки вводить нельзя");
        }
        System.out.println(str);
    }
}


