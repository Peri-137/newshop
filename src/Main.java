import shop.Cash;
import shop.Cloth;
import shop.Shop;

import java.util.Scanner;

public class Main {
    System.out.println("Пери жопа");
    public int numb = 0;

    public static void main(String[] args) {
        Shop shop = new Shop();
        Cash cash = new Cash();

        while (true) {
            System.out.println(" введите номер одежды");
            Scanner sh = new Scanner(System.in);
            int selectCloth = sh.nextInt();
            Cloth cloth = shop.getCloth(selectCloth, cash);
            System.out.println(" Вы выбрали одежду" + cloth.name);
            System.out.println(" Выберите цвет одежды");
            shop.showColorCloth(cloth);
            int selectColorCloth = sh.nextInt();
            System.out.println(" вы выбрали цвет " + cloth.color.get(selectColorCloth));
            shop.numb++;
            System.out.println(Cash.balance);
                System.out.println(" вы купили "+ shop.numb+" предмет");
            if (shop.numb == 3) {
                System.out.println(" вам доступна скидка в 50%");
                shop.numb = 0;
                Cash.balance = Cash.balance/50;
            }
            if (Cash.balance<=0) {
                System.out.println("Недостаточно средств");
                break;
            }

        }
    }
}
