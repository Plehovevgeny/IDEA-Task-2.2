public class Main {
    public static void main(String[] args) {

        short onAccount = 69;                       //изначально на счете
        int replenishment = 1200;                    //пополнение
        int totalMoney = onAccount + replenishment;  //денег после пополнения
        int bonus = replenishment / 100;             //бонус

        int bonus1;
        if (replenishment > 1000) {
            bonus1 = bonus;
        } else {
            bonus1 = 0;
        }
        System.out.println("Итоговый счет - " + totalMoney);
        System.out.println("Ваш бонус - " + bonus1);
    }
}
