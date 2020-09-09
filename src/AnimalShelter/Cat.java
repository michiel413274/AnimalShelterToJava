package AnimalShelter;

public class Cat extends Animal{
    private String BadHabits;
    private Double Price;

    public Cat(String name, Gender gender, String badhabits)
    {
        super(name, gender);
        BadHabits = badhabits;
        SetPrice();
    }

    @Override
    public String toString()
    {
        return "Cat, " + super.toString() + ", bad habits: " + BadHabits.toLowerCase() + " The price is: " + Price;
    }

    @Override
    public void SetPrice() {
        Price = 350 - (double)BadHabits.length() * 20;
        if(Price < 35)
        {
            Price = (double)35;
        }
    }

    @Override
    public Double GetPrice() {
        return Price;
    }
}
