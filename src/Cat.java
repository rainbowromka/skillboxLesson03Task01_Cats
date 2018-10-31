
public class Cat
{
    private Double originWeight;
    private Double weight;

    private Double minWeight;
    private Double maxWeight;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
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
        if (weight < originWeight) {
            System.out.println("I do not want\n");
        } else {
            weight = weight - 1;
            System.out.println("Upss!!!");
        }
    }


    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}