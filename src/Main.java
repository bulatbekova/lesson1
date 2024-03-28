import java.util.Random;


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

//        System.out.p("enter number : ");
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//
//        if (number >= 0 && number !=0) System.out.println("Pasitive number");
//        else System.out.println("Negative");



//        System.out.println("How many seconds? Enter a number: ");
//        long num = sc.nextInt();
//        long hours = num / 3600;
//        long hours2 = num - (hours * 3600);
//        long minutes = hours2 / 60;
//        long seconds = hours2 - (60 * minutes);
//        System.out.println("Hours: " + hours +
//                "\nMinutes: " + minutes +
//                "\nSeconds: " + seconds);

//        /** Сравнение логин и пароль */
//        String login = "gulbarchynbulat@gmail.com";
//        String password = "luna012186";
//
//        System.out.println("Login: ");
//        String konsolLogin = sc.nextLine();
//        System.out.println("Password: ");
//        String konsolPassword = sc.nextLine();
//
//        if (login.equals(konsolLogin) && password.equals(konsolPassword)) {
//            System.out.println("welcome to Microsort");
//        } else if (login.equals(konsolLogin) && !(password.equals(konsolPassword))){
//            System.out.println("Error Password");
//        } else if (!(login.equals(konsolLogin)) && password.equals(konsolPassword)) {
//            System.out.println("Error Login");
//        } else {
//            System.out.println("Error login and password");
//        }


//        /** Сравнение 3 чисел**/
//
//        System.out.println("write number 1: ");
//        int a = sc.nextInt();
//        System.out.println("Write number 2: ");
//        int b = sc.nextInt();
//        System.out.println("Write number 3: ");
//        int c = sc.nextInt();
//
//        if (a > b && a > c) {
//            System.out.println("Первый больше:  " + a);
//        } else if (a < b && b > c) {
//            System.out.println( "Второй больше: " + b);
//        } else {
//            System.out.println("Третий больше: " + c);
//        }

//        /** сравнение тернанарный оператор*/
//        System.out.println("Write number 1: ");
//        int number = sc.nextInt();
//        System.out.println("Write number 2: ");
//        int number2 = sc.nextInt();

//        System.out.println(number > number2 ? "The first number is larger" : "The second number is larger ");
//          String result = (number > number2 ? "The first number is larger" : "The second number is larger ");
//        System.out.println(result);

//        boolean result = number > number2 ? true : false;
//        System.out.println(result);


//        System.out.println("Вводите число от 1 до 6 : ");
//      int day = sc.nextInt();
//
//      if (day == 1 || day == 3 || day == 5) {
//          System.out.println("Техническое занятие. Начало 18: 00");
//      }
//      else if (day == 2 || day == 4 || day == 6) {
//          System.out.println("Практическое занятие. " +
//                  "Напиши из какой группы утренняя или вечерняя?");
//
//      String group = new Scanner(System.in).nextLine();
//      if (group.equals("утренняя")) {
//          System.out.println("Начало занятие в 16:00");
//      }
//      else if (group.equals("вечерняя")) {
//          System.out.println("Начало занятие в 18:00");
//
//        }
//      }
//      else {
//          System.out.println("Нет в этот день занятий");
//      }

//        for (int i = 1; i <= 3; i++) {
//            System.out.println("Это первый цикл! Я выполняюсь " + i + " раз");
//            for (int a = 1; a <= 10; a++) {
//                System.out.println("    Это второй цикл! Я выполняюсь " + a + " раз");
//                if (a == 2)
//                    break;

//                int x = 5, y = 3;
//                int z = ++x;
//                 y += x--;
//                 z += --x + y++;
//                 System.out.println(x + y +z);
//        int a = 10;
//        int b = 0;
//       while (b < a){
//           if (b %2 == 0){
//               System.out.println(b);
//           }
//           b++;
//        }


//        int[] massiv = { 3, 4 , 6 , 7, 3,1,8,7,9};
//
//
//        System.out.println(" for");
//
//        for (int i = 0; i < massiv.length; i++) {
//            System.out.print(massiv[i] + " ");
//        }
//
//        System.out.println("\n while");
//        int a = 0;
//        while (a < massiv.length){
////            System.out.print(a + " ");
////            a++;
//        System.out.print(massiv[a++] + ", ");
//        }
//        int m = 0;
//        while (m < massiv.length-1){
//            System.out.print(massiv[++m] + " ");
//       }
//
//        System.out.println("\n Arrays.toSting");
//        System.out.println(Arrays.toString(massiv));
        // Random random = new Random();
//        long [] arrays = new long[10];
//        int sum = 0;
//        for (int i = 0; i < arrays.length; i++) {
////            arrays[i] = random.nextLong(10);  // Один из вариантов заполнение
////            System.out.print(arrays[i] + " ");  //
//
////            long numbers = random.nextLong(10);
////            arrays[i] = numbers;
//
//            arrays[i] = random.nextLong(1,10);
//            sum = sum + (int) arrays[i];
//
//        }
//
//
//        System.out.print(Arrays.toString(arrays));
//        System.out.print("\n sum = " + sum);
//        System.out.println("\n " + sum / arrays.length);


//        System.out.println("Write number array: ");
//
//        int sum = 0;
//        int[] arrays = new int[new Scanner(System.in).nextInt()];
//        for (int i = 0; i < arrays.length; i++) {
//            arrays[i] = new Random().nextInt(1, 10);
//            sum += arrays[i];
//        }
//        System.out.println("Массив: " + Arrays.toString(arrays));
//        System.out.println("Общее сумма всех чисел:  " + sum);
//        System.out.println("Среднее значение: " + sum / arrays.length);

        String[] kesip1 = prof("Менин кесибим", method());
        for (String s : kesip1) {
            System.out.println(s);
        }


    }
    public static String[] method(){
        return new String[]{
                "Программист",
                "Пилот",
                "Учитель",
                "Библиотекарь"
        };
    }

    public static String[] prof(String str, String[] jobs) {
        int i = 0;
        for (String s : jobs) {
            jobs[i++] = str.concat(" ".concat(s));
        }
        return jobs;
    }
}