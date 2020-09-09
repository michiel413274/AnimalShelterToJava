package AnimalShelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;

import static org.junit.jupiter.api.Assertions.*;

class ReservoirTest {
    private Reservoir reservoir;

    @BeforeEach
    void tearDown() {
        reservoir = new Reservoir("hd", LocalDateTime.now());
    }

    @Test
    void getName() {
        assertEquals("hd", reservoir.GetName());
    }

    @Test
    void getReservedAt() {
        LocalDateTime localDateTime = LocalDateTime.now();
        assertNotEquals(localDateTime, reservoir.GetReservedAt());
    }
}