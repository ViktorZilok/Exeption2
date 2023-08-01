
/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
   и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
   вместо этого, необходимо повторно запросить у пользователя ввод данных. */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

//        floatInput();
        System.out.println(floatInput());
    }

//    public static void floatInput() {
//        Scanner sc = new Scanner(System.in);
//        if (sc.hasNextFloat()){
//            float num = sc.nextFloat();
//            System.out.println(num);
//        }else {
//            System.out.println("need to float");
//        }
//    }

    public static Object floatInput() {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextFloat()) {
            float num = sc.nextFloat();
            return num;
        } else {
            return "need to float";
        }
    }
}