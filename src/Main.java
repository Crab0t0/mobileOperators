//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int initialAccount = 100; //начальный счёт
        int replenishment = 1100; // сумма пополнения
        int i;// условие
        if (replenishment > 1000) {
            i= replenishment / 100;
        } else {
            i = 0;
        }
        int bonus = i;;//бонусы
        int totalScore = initialAccount + replenishment + i;//итоговый счёт
        System.out.println("Итоговый счёт: " + totalScore + ". Количество бонусных рублей: " + bonus + ".");


    }
}