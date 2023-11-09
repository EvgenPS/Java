public class Main {
    public static void main(String[] args) {

        int bonus = 20;
        int amount = 15000;

        if (amount >= 20){
            bonus = amount / bonus;
        } else {
            bonus = 0;
        }
        int result = amount + bonus;
        System.out.println("Сумма билета " + amount + " руб.");
        System.out.println("Количество бонусов " + bonus + " руб.");

    }
}