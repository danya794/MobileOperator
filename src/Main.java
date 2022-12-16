public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int clientOrder1=100;
        int clientOrder2=1100;
        int countBonus=0;


        if (clientOrder1 == 100) {
            balance = balance + clientOrder1;
        }
        System.out.println(balance);
        System.out.println(""clientOrder1);

        if (clientOrder2 == 1100) {
           countBonus=clientOrder2 / 100;
        }

        balance=+clientOrder2+clientOrder1+countBonus;
        System.out.println(balance);





      /*  int amount = 10000;
        boolean isBought = true;
        int miles;
        if (isBought) {
            miles = 500;
        } else {
            miles = 1;
        }
        int bonus = amount / 20;

        System.out.println("Количество начисленных миль за купленный билет:" + bonus);

        */
    }
}