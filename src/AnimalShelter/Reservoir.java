package AnimalShelter;

import java.time.LocalDateTime;

public class Reservoir {
    private String Name;
    public String GetName(){return Name;}
    private LocalDateTime ReservedAt;
    public LocalDateTime GetReservedAt() {return ReservedAt;}
    public Reservoir(String name, LocalDateTime reservedAt)
    {
        this.Name = name;
        this.ReservedAt = reservedAt;
    }

}
