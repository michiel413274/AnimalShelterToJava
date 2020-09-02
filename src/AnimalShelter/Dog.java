package AnimalShelter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Dog extends Animal{
    private Date LastWalk;

    public Date GetLastWalk() {
        return LastWalk;
    }

    public Dog(String name, Gender gender)
    {
        super(name, gender);
        this.LastWalk = new Date();
    }

    public boolean NeedsWalk()
    {
        LocalDate date = LocalDate.now();
        LocalDate walk = LastWalk.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();;
        long subtractdate = ChronoUnit.DAYS.between(date, walk);
        return subtractdate > 0;
    }

    @Override
    public String ToString()
    {
        String pattern = "MM/dd/yyyy";
        SimpleDateFormat df = new SimpleDateFormat(pattern);

        return super.ToString() + ", last walk: " + df.format(LastWalk);
    }
}
