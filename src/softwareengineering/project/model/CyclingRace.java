package softwareengineering.project.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class CyclingRace {

    // TANKEN HER VAR Å BEGYNNE MED EN TYPE AV RACE FOR Å DERETTER SE HVORDAN MAN BEST ABSTRAHERER DET.
    // en tanke er at alt arver fra en klasse "Event", og deretter implemeterer intrefaces Team, Single eller noe slikt
    // mye drøfting her, så bare kom med innspill

    int eventNumber;

    double distance;

    String location;

    LocalDate timeOfEvent;

    ArrayList<User> contenders = new ArrayList<>();


}
