package exercise;
/*
Задание

1) Вычислить n-ое треугольного число (сумма чисел от 1 до n),
n! (произведение чисел от 1 до n)
2) Вывести все простые числа от 1 до 1000
3) Реализовать простой калькулятор
4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
Требуется восстановить выражение до верного равенства. Предложить хотя бы одно
решение или сообщить, что его нет.
 */

import java.util.Scanner;


public class Exercive {
    public static void main(String[] args) {
        exercive1();
        System.out.println("\nОкончание работы первой задачи\n");
        exercive2();
        System.out.println("\nОкончание работы второй задачи\n");
        exercive3();
        System.out.println("\nОкончание работы третьей задачи\n");
//        exercive4();

    }

    public static void exercive1(){
        System.out.println("Введите число n: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int summa = 0;
        int multiplication = 1;
        for (int i = 1; i <= n; i++) {
            summa += i;
            multiplication *= i;
        }
        System.out.printf("Сумма чисел от 1 до %d: %d%n", n, summa);
        System.out.printf("Произведение чисел от 1 до %d: %d%n", n, multiplication);
        num.close();
    }

    public static void exercive2() {
        int input = 1000;

        for (int i = 2; i <= input; i++) {
            boolean isPrimeNumb = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumb = false;
                    break;
                }
            }

            if (isPrimeNumb) {
                System.out.printf(i + "/");
            }
        }
    }

    public static void exercive3() {
        int numb_a, numb_b, res;
        char operation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        numb_a = scanner.nextInt();
        System.out.println("Введите операцию( + - / * ): ");
        operation = scanner.next().charAt(0);
        System.out.println("Введите второе число: ");
        numb_b = scanner.nextInt();
        scanner.close();
        switch (operation) {
            case '+' -> {
                res = numb_a + numb_b;
                System.out.printf("Результат: %d", res);
            }
            case '-' -> {
                res = numb_a - numb_b;
                System.out.printf("Результат: %d", res);
            }
            case '/' -> {
                res = numb_a / numb_b;
                System.out.printf("Результат: %d", res);
            }
            case '*' -> {
                res = numb_a * numb_b;
                System.out.printf("Результат: %d", res);
            }
            default -> System.out.println("Ошибка ввода действия! Повторите снова.");
        }

    }
    public static void exercive4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уравнение вида:(А? + ?В = C): ");
        String equation = scanner.nextLine();
        String[] parts = equation.split("[+=]+");
        int a = -1, b = -1, w = -1;
        for (int i = 0; i < 10; i++){
            if (a == -1 && !parts[0].contains("?")){
                a = Integer.parseInt(parts[0]);
            }
            if (b == -1 && !parts[1].contains("?")){
                b = Integer.parseInt(parts[1]);
            }
            if (w == -1 && !parts[2].contains("?")){
                w = Integer.parseInt(parts[2]);
            }
            if (parts[0].charAt(i) == '?') {
                a = i;
            }
            if (parts[1].charAt(i) == '?') {
                b = i;
            }
            if (parts[2].charAt(i) == '?') {
                w = i;
            }
        }
        if (a + b == w && a != -1 && b != -1 && w != -1){
            System.out.println("%d + %d = %d, a, b, w");
        } else System.out.println("Решений нет!");
        System.out.println("Конец работы четвёртой задачи");
    }

}





