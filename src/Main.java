import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        byte a = 1;
//        short b = 2;
//        int c = 3;
//        long d = 4;
//        float e = 5.1f;
//        double f = 6.1;
//        boolean j = true;
//        char k = '8';
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);
//        System.out.println(j);
//        System.out.println(k);

//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое число: ");
//        int a = scanner.nextInt();
//        System.out.println("Введите второе число: ");
//        int b = scanner.nextInt();
//        System.out.println("Сумма:  "  + (a + b));
//        System.out.println("Разность: " + (a - b));
//        System.out.println("Произведение: " + a * b);
//        System.out.println("Частное: " + a / b);



//        Scanner scan = new Scanner(System.in);
//        System.out.println("Берилген кундор: ");
//        int a = scan.nextInt();
//        System.out.println("Жылдар:  " + a);
//        System.out.println("Айлар: " + a);
//        System.out.println("Кундор: " + a);


//        System.out.println("Введите число: ");
//        Random ran = new Random();
//        int a = scanner.nextInt();
//
//        int b = ran.nextInt(1,5);
//        System.out.println(b);
//
//        if (a == b){
//            System.out.println(a + " = "+ b);
//        }else {
//            System.out.println(a + " != " + b);
//        }
//        System.out.println("Write number: ");
//        int a = scanner.nextInt();
//        int number = a / 100;
//        int num2 = a / 10;
//        int num = a % 100;
////        System.out.println(num + ""+ number);
//        System.out.println(num2);

//        double num = Math.sqrt(8);
//        double num2 = Math.ceil(5.4);
//        double num3 = Math.floor(4.8);
//        System.out.println(num2 + "\n" + num3);
//        System.out.println(num);
//        System.out.println(Math.pow(3, 4));

//        /** среднее значение */
//
//          Random random = new Random();
//          int san = random.nextInt(1,5);
//          int san2 = random.nextInt(1,5);
//          int san3 = random.nextInt(1,5);
//          int san4 = random.nextInt(1,5);
//          int san5 = random.nextInt(1,5);
//          int mean = (san + san2 + san4 + san3 + san5) / 5;
//        System.out.printf("Mean: ( %d + %d + %d + %d + %d) / 5 = %d ", san, san2, san3, san4, san5, mean);

//       /** type casting */
//        int num = 6;
//        double num2 = 7.5;
//        System.out.println((double) num + num2 );

//        System.out.println( "Длина массива: ");
//   String [] wold = new String[]  {"one","two","back", "bad", "and", "tall", "big","onlya" };
//   int san = wold.length;
//        System.out.println(san);
//
//        System.out.println("Ввод значение на консоль: ");
//        int [] array = new int[5];
//        array[0] = 2;
//        array[1] = 6;
//        array[2] = 25;
//        array[3] = 9;
//        array[4] = 8;
//        System.out.println(array[2]);

//        System.out.println("Кундун санын жаз: ");
//        int day = new Scanner(System.in).nextInt();
//        int jyl = day / 365;
//        int jyl2 = day - (jyl * 365);
//        int ai = jyl2 / 30;
//        int kun = jyl2 -(30 * ai);
//
//        System.out.println("Жыл: " + jyl + "\nАй: " + ai +"\nКун: " + kun);
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Биринчи санды жаз: ");
//        double sun = sc.nextDouble();
//        System.out.println("Экинчи санды жаз: ");
//        double sun2 = sc.nextDouble();
//        System.out.println("Учунчу санды жаз: ");
//        double sun3 = sc.nextDouble();
//        System.out.println("Жыйынтыгы: ");
//        double result = sun + sun2 + sun3;
//        System.out.println(sun + " + " + sun2 + " + " + sun3 + " = " + result);
//        double result2 = sun * sun2 * sun3;
//        System.out.println(sun + " * " + sun2 + " * " + sun3 + " = " + result2 );
//        double result4 = ((sun + sun2 + sun3)/3);
//        System.out.println( "(" + (sun + " + " + sun2 + " + " + sun3) + " )/3" + " = " + result4);


        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int number  = ran.nextInt(1,5);
        int number2 = ran.nextInt(1, 5);
        int number3 = ran.nextInt(1, 5);
        int summa = (number+number2+number3) / 3;

        System.out.println("( " + number + " + " + number2 + " + "+number3 +" )" + " / 3" + " = " + summa);



//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите трехзначные числа: ");
//        int a = sc.nextInt();
//        int b = a /100;
//         int c1 = a/10;
//        int c = c1 % 10;
//        int d = a %10;
//        System.out.println(b + "," + c + "," + d);

//        System.out.println("enter number : ");
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//
//        if (number >= 0 && number !=0) System.out.println("Pasitive number");
//        else System.out.println("Negative");




    }
}