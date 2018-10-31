
public class Loader
{


    public static void main(String[] args)
    {
        // Урок 3 котов еще не создали, проверяем количество котов их должно быть 0
        System.out.println("Cats count: " + Cat.getCount());
        System.out.println("Creating Cats..");

        Cat murzik = new Cat();
        Cat vaska = new Cat();
        Cat maruska = new Cat();
        Cat dyumka = new Cat();
        Cat chernush = new Cat();

        // Урок 3. создали 5 котов, проверяем их количество количество
        System.out.println("Cats created: " + Cat.getCount());

        // Урок 1 выводим разные методы с котами,
        System.out.println("Murzic status: " + murzik.getStatus());
        System.out.println("Vaska status: " + vaska.getStatus());
        System.out.println("Maruska status: " + maruska.getStatus());
        System.out.println("Dyumka status: " + dyumka.getStatus());
        System.out.println("Chernush status: " + chernush.getStatus());

        System.out.println("Murzik weight: " + murzik.getWeight());
        System.out.println("Vaska weight: " + vaska.getWeight());
        System.out.println("Maruska weight: " + maruska.getWeight());
        System.out.println("Dyumka weight: " + dyumka.getWeight());
        System.out.println("Chernush weight: " + chernush.getWeight());

        System.out.println("feeding cats...");
        murzik.feed(1000.0);
        vaska.drink(1.0);
        maruska.feed(3500.0);
        dyumka.feed(10000.0);
        chernush.drink(15000.0);
        System.out.println("Cats ate");

        System.out.println("Murzik weight: " + murzik.getWeight());
        murzik.meow();
        murzik.meow();
        System.out.println("Murzik weight: " + murzik.getWeight());

        // Урок 1. Замяукиваем кота до смерти.
        while (!murzik.getStatus().equals("Dead")) {
            murzik.meow();
        }
        System.out.println("Murzic meowed to death.");
        System.out.println("Murzic status: " + murzik.getStatus());

        // Урок 2. сколько васька съел?
        System.out.println("Vaskas food weight: " + vaska.getFoodWheigh());
        // Урок 2. Ваську отправили в туалет.
        System.out.println("Vaska weight: " + vaska.getWeight());
        vaska.goTouliet();
        System.out.println("Vaska weight: " + vaska.getWeight());
        System.out.println("Vaska status: " + vaska.getStatus());

        // Урок 3. Т.к. у нас коты могут умереть или взорваться, проверим количество котов.
        System.out.println("Cats count: " + Cat.getCount());

        // Урок 4
        Cat kitten = getKitten();

        // Урок 5
        Cat vasya = kitten.makeTwin();
        // вариант другой
        Cat vasya_vasya = Cat.makeTwin(kitten);

        System.out.println("vasya status: " + vasya.getStatus());
        System.out.println("vasya_vasya status: " + vasya_vasya.getStatus());


    }

    // Урок 4 Получаем котенка в методе
    public static Cat getKitten() {
        return new Cat(100.0 + 100.0 * Math.random());
    }

 }