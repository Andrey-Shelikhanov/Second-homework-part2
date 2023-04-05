public class Main {
    public static void main(String[] args) {

        int currentBalance = 100;      // Текущий баланс
        int paymentAmount = 1200;      // Размер платежа


        int bonusCondition = 1000;     // Порог начисления бонуса от размера платежа
        int bonusAmount;               // Итоговый размер бонуса
        int bonusCountReward = 1;     // Размер бонуса за ед.
        int bonusCountRule = 100;     // Порог начисления 1 ед. бонуса
        int totalBalance;              // Итоговый баланс

        if (paymentAmount < bonusCondition) {
            totalBalance = currentBalance + paymentAmount;
            bonusAmount = 0;
        } else {
            bonusAmount = (paymentAmount / bonusCountRule) * bonusCountReward;
            totalBalance = currentBalance + paymentAmount + bonusAmount;

        }
        System.out.println("Ваш баланс составляет");
        System.out.println(totalBalance + " Рубль(ей/ля)");
        System.out.println("Количество начисленных бонусов");
        System.out.println(bonusAmount + " бонус(а/ов)");


    }
}