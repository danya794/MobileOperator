public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int added = 1100;

        int bonus = added > 1000 ? added / 100 : 0;
        int finalAccount = initialAccount + added + bonus;

        System.out.println("Итоговый счёт: " + finalAccount);
        System.out.println("Бонус: " + bonus);
    }
}