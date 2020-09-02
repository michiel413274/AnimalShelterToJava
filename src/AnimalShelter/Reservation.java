package AnimalShelter;

import java.util.ArrayList;
import java.util.List;

public class Reservation {
   private List<Animal> Animals = new ArrayList<Animal>();
   public List<Animal> GetAnimalList()
   {
      return Animals;
   }
   public void NewCat(String name, Gender gender, String badhabits)
   {
      Animals.add(new Cat(name, gender, badhabits));
   }

   public void NewDog(String name, Gender gender)
   {
      Animals.add(new Dog(name, gender));
   }
}

