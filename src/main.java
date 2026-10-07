
import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        // Create a Trade object
        Trade t = new Trade(LocalDate.now(), "XAUUSD", Trade.Direction.LONG, 100.0, 90.0, 120.0, 120.0, "test", "First Trade");

        // Print the trade details
        System.out.println(t);
        System.out.println("R-Multiple: " + t.getRMultiple());
    }
}
