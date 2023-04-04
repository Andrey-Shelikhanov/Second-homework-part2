public class Main {
    public static void main(String[] args) {

        int current_balance = 100;      // Текущий баланс
        int payment_amount = 1200;      // Размер платежа


        int bonus_condition = 1000;     // Порог начисления бонуса от размера платежа
        int bonus_amount;               // Итоговый размер бонуса
        int bonus_count_reward = 1;     // Размер бонуса за ед.
        int bonus_count_rule = 100;     // Порог начисления 1 ед. бонуса
        int total_balance;              // Итоговый баланс

        if (payment_amount < bonus_condition) {
            total_balance = current_balance + payment_amount;
            bonus_amount = 0;
        } else {
            bonus_amount = (payment_amount / bonus_count_rule) * bonus_count_reward;
            total_balance = current_balance + payment_amount + bonus_amount;

        }
        System.out.println("Ваш баланс составляет");
        System.out.println(total_balance + " Рубль(ей/ля)");
        System.out.println("Количество начисленных бонусов");
        System.out.println(bonus_amount + " бонус(а/ов)");


    }
}