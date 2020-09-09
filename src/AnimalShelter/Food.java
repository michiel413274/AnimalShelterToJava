package AnimalShelter;

public class Food implements ISellable{
    private String Name;
    private Double Price;

    public Food(String name, Double price)
    {
        Name = name;
        Price = price;
    }

    @Override
    public String GetName() {
        return Name;
    }

    @Override
    public void SetPrice() {

    }

    @Override
    public Double GetPrice() {
        return Price;
    }

    public String toString()
    {
        return "The product name is: " + Name + " The price is: " + Price;
    }
}
