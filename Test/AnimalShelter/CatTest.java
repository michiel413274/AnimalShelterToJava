package AnimalShelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    private Animal animal;

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

}