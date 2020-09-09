package AnimalShelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    private Dog animal;

    @BeforeEach
    void tearDown() {
        this.animal = new Dog("Bob", Gender.Female);
    }

    @Test
    void TestgetLastWalk() {
        Date date = new Date();
        assertEquals(date, animal.GetLastWalk());
    }

    @Test
    void TestneedsWalk() {
        boolean needsAWalk = animal.NeedsWalk();
        assertEquals(false, needsAWalk);
    }

    @Test
    void TestToString() {
        String tostring = "Dog, Bob, Female, not reserved, last walk: 09/09/2020, The price is: 0.0";
        assertEquals(tostring, animal.toString());
    }

    @Test
    void TestPrice()
    {
        animal.SetPrice();
        assertEquals(500, animal.GetPrice());
    }

    @Test
    void TestPriceWithMoreDogs()
    {
        Webshop webshop = new Webshop();
        webshop.AddProduct(new Dog("", Gender.Female));
        webshop.AddProduct(new Dog("", Gender.Female));
        webshop.AddProduct(new Dog("", Gender.Female));
        webshop.AddProduct(animal);
        assertEquals(350, animal.GetPrice());
    }


}