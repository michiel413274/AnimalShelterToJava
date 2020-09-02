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

    }

    @Test
    void ToString() {
    }
}