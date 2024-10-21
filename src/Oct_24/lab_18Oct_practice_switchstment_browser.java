package Oct_24;

import java.text.BreakIterator;
import java.util.Scanner;

public class lab_18Oct_practice_switchstment_browser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browser = in.next();
        browser = browser.toLowerCase();//convert upper case to lower cse
        switch (browser){
            case "chrome":
                System.out.println("Chrome browser is starting");
                break;
            case "firefox":
                System.out.println("firefox browser is starting");
                break;
            case "edge":
                System.out.println("edge browser is starting");
                break;
            default:
                System.out.println("NO browser installed on system");

        }
    }
}
