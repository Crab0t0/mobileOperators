//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int initialAccount = 100; //начальный счёт
        int replenishment = 1100; // сумма пополнения
        int bonusСalculation;// расчёт бонусов
        if (replenishment > 1000) {
            bonusСalculation = replenishment / 100;
        } else {
            bonusСalculation = 0;
        }
        int bonus = bonusСalculation;
        ;
        int totalScore = initialAccount + replenishment + bonusСalculation;//итоговый счёт
        System.out.println("Итоговый счёт: " + totalScore + ". Количество бонусных рублей: " + bonus + ".");


    }
}