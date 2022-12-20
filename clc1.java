import java.util.Scanner;

public class clc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // задаем значения

        double summa, rate, result;
        double r = scanner.nextDouble();
        int payMonthly;

        // задали

        System.out.println("Выберите тип клиента: ");
        String s = scanner.nextLine();
        // выбрали тип клиента


        switch (s) {
            case "human":
                System.out.println("Введите сумму: "); // пишем сумму денег которые хотим взять в долг
                summa = scanner.nextDouble();
                System.out.println("Под какой процент хотите взять кредит? "); // указываем процент под который хотим взять деньги
                r = scanner.nextDouble();
                System.out.println("Ежемесячный платеж: " + (summa / 100.0) * r);
                rate = (summa / 100) * r;
                result = (summa + rate);
                System.out.println("Общая сумма к оплате: " + result); // получаем: сумма плюс процент по переплате

                while (true) { //тут я пыталась добавтить цикл чтобы процент начислялся на каждый месяц, количество месяцев не указано, значит цикл выполняется вечно
                    System.out.println("Ежемесячный платеж" + rate++);
                    payMonthly = 1;
                    if (payMonthly >= 1)
                        System.out.println();
                    break;

                    case "business": // коменты те же но для бизнеса
                        System.out.println("Введите сумму: ");
                        summa = scanner.nextDouble();
                        System.out.println("Под какой процент хотите взять кредит? ");
                        r = scanner.nextDouble();
                        System.out.println("Ежемесячный платеж: " + (summa / 100) * rate);
                        System.out.println("Процентная ставка: " + r);
                        rate = (summa / 100) * r;

                        System.out.println("процентная ставка 10%");
                        result = (summa + rate);
                        System.out.println("Общая сумма к оплате: " + result);
                        while (true) { //опять хочу внедрить цикл, чтобы начислялись проценты начиная через год (с 12 месяца)
                            System.out.println("Ежемесячный платеж" + rate++);
                            payMonthly = 0;
                            if (payMonthly > 12)
                                System.out.println();
                        }
                        break;
                    default:
                        System.out.println("Штош, вы нам не подходите, идите домой");


                }

        }
    }

}