
public class Loader
{
    public static void main(String[] args)
    {
        Cat murzik = new Cat();
        Cat vaska = new Cat();
        Cat maruska = new Cat();
        Cat dumka = new Cat();
        Cat chernush = new Cat();

        System.out.println(murzik.getWeight());
        System.out.println(vaska.getWeight());
        System.out.println(maruska.getWeight());
        System.out.println(dumka.getWeight());
        System.out.println(chernush.getWeight());

        System.out.println(murzik.getStatus());
        System.out.println(vaska.getStatus());
        System.out.println(maruska.getStatus());
        System.out.println(dumka.getStatus());
        System.out.println(chernush.getStatus());

        murzik.feed(1000.0);
        vaska.drink(5000.0);
        maruska.feed(3500.0);
        dumka.feed(10000.0);
        chernush.drink(15000.0);
        murzik.meow();
        System.out.println(murzik.getWeight());
        System.out.println(vaska.getWeight());
        System.out.println(maruska.getWeight());
        System.out.println(dumka.getWeight());
        System.out.println(chernush.getWeight());
        murzik.meow();

        System.out.println(murzik.getStatus());
        System.out.println(vaska.getStatus());
        System.out.println(maruska.getStatus());
        System.out.println(dumka.getStatus());
        System.out.println(chernush.getStatus());

        while (!murzik.getStatus().equals("Dead")) {
            murzik.meow();
        }

        System.out.println(murzik.getStatus());
        System.out.println(vaska.getFoodWheigh());
        vaska.goTouliet();


    }
}