package AnimalShelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {
    private Reservation reservation = new Reservation();

    @Test
    void TestnewCat() {
        reservation.NewCat("g", Gender.Female, "");
        boolean ContainsNewDog = false;
        for(Animal animal : reservation.GetAnimalList())
        {
            if(animal.GetName().equals("g"))
            {
                ContainsNewDog = true;
            }
        }
        assertEquals(true, ContainsNewDog);
    }

    @Test
    void TestNonewCat() {
        reservation.NewCat("g", Gender.Female, "");
        boolean ContainsNewDog = false;
        for(Animal animal : reservation.GetAnimalList())
        {
            if(animal.GetName().equals("d"))
            {
                ContainsNewDog = true;
            }
        }
        assertEquals(false, ContainsNewDog);
    }

    @Test
    void newDog() {
        reservation.NewDog("d", Gender.Male);
        boolean ContainsNewDog = false;
        for(Animal animal : reservation.GetAnimalList())
        {
            if(animal.GetName().equals("d"))
            {
                ContainsNewDog = true;
            }
        }
        assertEquals(true, ContainsNewDog);
    }

    @Test
    void TestNoNewDog()
    {
        reservation.NewDog("d", Gender.Male);
        boolean ContainsNewDog = false;
        for(Animal animal : reservation.GetAnimalList())
        {
            if(animal.GetName().equals("h"))
            {
                ContainsNewDog = true;
            }
        }
        assertEquals(false, ContainsNewDog);
    }

}