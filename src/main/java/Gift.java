import Sweets.Candy;
import Sweets.Chocolate;
import Sweets.Cookies;
import Sweets.Sweets;

public class Gift {
   public static void main (String[] args) {

       Chocolate choco = new Chocolate("KitTat", 45.00, 19.90, "America");
       Cookies cooke = new Cookies("Orion", 200.00, 110.00, "10 шт");
       Candy candy = new Candy("Skittles", 30.00, 34.90, "драже");

       double sumWeight = 0;
       double sumPrice = 0;

       Sweets[] gift = {choco, cooke, candy};

       System.out.println("Подарок содержит следующие сладости: ");

       for (Sweets someSweets : gift) {
           System.out.println(someSweets.toString());
           sumWeight = sumWeight + someSweets.getWeight();
           sumPrice = sumPrice + someSweets.getPrice();
       }

       System.out.println("Общий вес подарка: " + sumWeight + " грамм");
       System.out.println("Общая стоимость подарка: " + sumPrice + " руб.");
   }
}
