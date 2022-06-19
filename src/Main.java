public class Main {
    public static void main(String[] args) {
        int startingBalance = 100;
        int totalBalance;
        int refill = 1100;
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
            totalBalance = startingBalance + refill + bonus;
        } else {
            bonus = 0;
            totalBalance = startingBalance + refill;
        }
        System.out.println("Бонус составил " + bonus + " рублей");
        System.out.println("Итоговый счет составил " + totalBalance + " рублей");
    }
}
