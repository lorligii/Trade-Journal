
import java.time.LocalDate;

public class Trade {
    //makes spelling error inpossible 
    public enum Direction { LONG, SHORT}
    
    //data members
    private LocalDate date;
    private String instrument;
    private Direction direction;
    private double entry;
    private double stop;
    private double takeProfit;
    private double exit;
    private String setup;
    private String notes;


//constructor builds a trade object, same name as class with no return type. Takes one paramteter
public Trade(LocalDate date, String instrument, Direction direction, double entry, double stop, double takeProfit, double exit, String setup, String notes) {
    this.date = date;
    this.instrument = instrument;
    this.direction = direction;
    this.entry = entry;
    this.stop = stop;
    this.takeProfit = takeProfit;
    this.exit = exit;
    this.setup = setup;
    this.notes = notes;
}

public LocalDate getDate() {
    return date;
}

public String getInstrument() {
    return instrument;
}

public Direction getDirection() {
    return direction;
}

public double getEntry() {
    return entry;
}

public double getStop() {
    return stop;
}

public double getTakeProfit() {
    return takeProfit;
}

public double getExit() {
    return exit;
}

public String getSetup() {
    return setup;
}

public String getNotes() {
    return notes;
}

//risk = distance from entry to stop (Long exit-entry)(Short entry-exit)

public double getRMultiple () {
    double risk  = Math.abs(entry-stop);
    double result;
    if(direction == Direction.LONG) {
        result = (exit-entry)/risk;
    } else {
        result = (entry-exit)/risk;
    }
    return result;
}

@Override
public String toString() {
    return date + " | " + instrument + " | " + direction
         + " | entry " + entry + " | " + String.format("%.2fR", getRMultiple());
}

}