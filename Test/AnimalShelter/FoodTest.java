package AnimalShelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FoodTest {
    private Food food;

    @BeforeEach
    void tearDown() {
        this.food = new Food("Cat food", 50.50);
    }

    @Test
    void TestgetName() {
        String Name = "Cat food";
        assertEquals(Name, food.GetName());
    }

    @Test
    void TestgetPrice() {
        assertEquals(50.50, food.GetPrice());
    }

    @Test
    void testToString() {
        String toString = "The product name is: Cat food The price is: 50.5";
        assertEquals(toString, food.toString());
    }
}