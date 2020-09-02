package AnimalShelter;

import java.time.LocalDateTime;

public abstract class Animal {
    private String Name;
    public String GetName(){
        return this.Name;}
    private Gender Gender;
    public Gender getGender() {
        return Gender;
    }
    private Reservoir ReservedBy;
    public Reservoir GetReservedBy()
    {
        return ReservedBy;
    }
    public void SetReservedBy(Reservoir Reserver)
    {
        ReservedBy = Reserver;
    }

    public Animal(String name, Gender gender)
    {
        this.Name = name;
        this.Gender = gender;
        //
    }

    public Boolean Reserve(String reservedby)
    {
        if(ReservedBy == null) {
            ReservedBy = new Reservoir(reservedby, LocalDateTime.now());
            return true;
        }
        return false;
    }

    public String ToString()
    {
        String Reserved = "not reserved";
        if(this.ReservedBy != null)
        {
            Reserved = "reserved by " + ReservedBy.GetName();
        }
        return Name + "," + Gender + "," + Reserved;
    }
}
