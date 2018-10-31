
public class Cat
{
    private Double originWeight;
    private Double weight;

    private Double minWeight;
    private Double maxWeight;

    private static Integer count = 0;


    public Cat()
    {
        count++;
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

//    Создать в классе Cat ещё один конструктор так, чтобы массу кошки можно было задавать при создании кошки, и создать в главном классе метод генерации кошки, как описано в видеоуроке.
    public Cat(Double weight) {
        this.weight = weight;
        originWeight = weight;
        minWeight = 100.0;
        maxWeight = 9000.0;
    }



    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

//- Создать в классе Cat метод, который будет возвращать массу съеденной еды.

    public Double getFoodWheigh() {
        Double result = weight - originWeight;
        return (result < 0) ? 0 : result;
    }

//- Создать в классе Cat метод “сходить в туалет”, который будет уменьшать вес кошки и что-­нибудь печатать.
    public void goTouliet() {
        // если вес кота меньше первоначального или равен, скорее всего коту ходить нечем, может он уже умер.
        if (weight <= originWeight) {
            System.out.println("I do not want\n");
        } else {
            weight = weight - 1;
            System.out.println("Upss!!!");
        }
    }

    public void setWeight(Double weight) {
        this.weight = weight;
        originWeight = weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            count --;
            return "Dead";
        }
        else if(weight > maxWeight) {
            count--;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public static Integer getCount() {
        return count;
    }


    public Cat makeTwin(){
        Cat catTwin = new Cat(this.weight);
        catTwin.originWeight = this.originWeight;
        catTwin.minWeight = this.minWeight;
        catTwin.maxWeight = this.maxWeight;
        return catTwin;
    }

    public static Cat makeTwin(Cat ownerCat) {
        return ownerCat.makeTwin();
    }

}