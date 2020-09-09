package AnimalShelter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    private Animal animal;

    @BeforeEach
    void tearDown() {
        this.animal = new Dog("Ugly Duckling", Gender.Male);
    }

    @Test
    void getName() {
        assertEquals("Ugly Duckling", this.animal.GetName());
    }

    @Test
    void getGender() {
        assertEquals(Gender.Male, this.animal.getGender());
    }

    @Test
    void getReservedBy() {
        assertNull(this.animal.GetReservedBy());
    }

    @Test
    void setReservedBy() {

    }

    @Test
    void reserve() {
        boolean animalReserved = animal.Reserve("Bob");
        assertEquals(true, animalReserved);
    }
    @Test
    void AlreadyReserved()
    {
        boolean animalReserved = animal.Reserve("Bob");
        boolean animalReserved1 = animal.Reserve("Bob");
        assertEquals(false, animalReserved1);
    }

    @Test
    void ToString() {
        String tostring = "Dog, Ugly Duckling, Male, not reserved, last walk: 09/09/2020, The price is: 0.0";
        assertEquals(tostring, animal.toString());
    }
}