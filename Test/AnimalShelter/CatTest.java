package AnimalShelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    private Cat animal;

    @BeforeEach
    void tearDown() {
        this.animal = new Cat("Bob", Gender.Male, "Scratching");
    }

    @Test
    void TestPrice()
    {
        animal.SetPrice();
        assertEquals(150, animal.GetPrice());
    }

    @Test
    void TestPriceWithALotOfBadHabits()
    {
        Animal animal1 = new Cat("Bob", Gender.Male, "Scratching and biting and grumpy");
        animal1.SetPrice();
        assertEquals(35, animal1.GetPrice());
    }

    @Test
    void TestToString()
    {
        String tostring = "Cat, Bob, Male, not reserved, bad habits: scratching The price is: 150.0";
        assertEquals(tostring, animal.toString());
    }
}