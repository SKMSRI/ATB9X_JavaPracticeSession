package Oct_24.ex_23Oct_Funcations;
import java.text.*;
import java.util.Calendar;
public class lab_23Oct_dateformat {
    public static void main(String[] args) {
        // Initializing the first formatter
        DateFormat DFormat = DateFormat.getDateInstance();

        // Initializing the calendar Object
        Calendar cal = Calendar.getInstance();

        // Displaying the actual date
        System.out.println("The original Date: "
                + cal.getTime());

        // Converting date using format() method
        String curr_date = DFormat.format(cal.getTime());

        // Printing the formatted date
        System.out.println("Formatted Date: " + curr_date);
    }
}
