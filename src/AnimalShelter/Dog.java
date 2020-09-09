package AnimalShelter;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Dog extends Animal{
    private Date LastWalk;
    private double Price;

    public Date GetLastWalk() {
        return LastWalk;
    }

    public Dog(String name, Gender gender)
    {
        super(name, gender);
        this.LastWalk = new Date();
    }

    public boolean NeedsWalk()
    {
        LocalDate date = LocalDate.now();
        LocalDate walk = LastWalk.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();;
        long subtractdate = ChronoUnit.DAYS.between(date, walk);
        return subtractdate > 0;
    }

    @Override
    public String toString()
    {
        String pattern = "MM/dd/yyyy";
        SimpleDateFormat df = new SimpleDateFormat(pattern);

        return "Dog, " + super.toString() + ", last walk: " + df.format(LastWalk) + ", The price is: " + Price;
    }

    @Override
    public void SetPrice() {
        Price = 500 - DogCount() * 50;
        if(Price < 50)
        {
            Price = 50;
        }
    }

    @Override
    public Double GetPrice() {
        return Price;
    }

    public int DogCount()
    {
        Webshop _webshop = new Webshop();
        return _webshop.CountTheDogs();
    }
}
