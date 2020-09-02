package AnimalShelter;

public class Cat extends Animal{
    private String BadHabits;
    public String GetBadhabits()
    {
        return this.BadHabits;
    }
    public Cat(String name, Gender gender, String badhabits)
    {
        super(name, gender);
        BadHabits = badhabits;
    }
    @Override
    public String ToString()
    {
        return super.ToString() + ", bad habits: " + BadHabits.toLowerCase();
    }
}
