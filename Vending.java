package ru.timokhina.lesson7;
import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
        System.out.println(Drinks.COLA.getNumber() + " : " + Drinks.COLA.getDescription() + " : " + Drinks.COLA.getCost());
        System.out.println(Drinks.FANTA.getNumber() + " : " + Drinks.FANTA.getDescription() + " : " + Drinks.FANTA.getCost());
        System.out.println(Drinks.SPRITE.getNumber() + " : " + Drinks.SPRITE.getDescription() + " : " + Drinks.SPRITE.getCost());


        Scanner in = new Scanner(System.in);
        System.out.print("Выберите напиток:");
        int choice = in.nextInt();
        System.out.print("Внесите наличные:");
        int money = in.nextInt();
        System.out.print("Внесено " + money + " рублей.");


            switch (choice) {

                case 1:
                    if (money >= 50) {
                        System.out.println("Заберите Колу");
                        money = money - 50;
                    }
                    else {
                        System.out.println("Недостаточно денег");
                    }
                    break;
                    
                case 2:
                    if (money >= 60) {
                        System.out.println("Заберите Фанту");
                        money = money - 60;
                    }
                    else {
                        System.out.println("Недостаточно денег");
                    }
                    break;

                case 3:
                    if (money >= 70) {
                        System.out.println("Заберите Спрайт");
                        money = money - 70;
                    }
                    else    {
                        System.out.println("Недостаточно денег");
                    }
                    break;
                default:
                    System.out.println("Неверный выбор напитка");
            }



      //  Drinks arg = Drinks.COLA;

   // switch (arg)    {

       // case COLA:
         //   System.out.println("Внесите 50 рублей"); break;

      //  case FANTA:
       //     System.out.println("Внесите 60 рублей"); break;

      //  case SPRITE:
       //     System.out.println("Внесите 70 рублей"); break;
   // }

    }
}
