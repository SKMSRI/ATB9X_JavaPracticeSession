package NOV_24.ex_11Nov_encapsulation;

public class Baseclass {
    private String browser;

    //Default constructor
    Baseclass(){
        System.out.println("BaseClass");
    }
    //Parameterised Cons
    Baseclass(String b){
        System.out.println("BaseClass");
    }

    //getter method using the variable(Encapsulation)
    public String getBrowser() {
        return browser;
    }
    //setter method using the variable(Encapsulation)
    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        }else{
            System.out.println("Not Allowed");
        }
    }

    //Normal methods
    void openBrowser() {
        System.out.println("Opening Browser!!");

    }
    //
    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }

    void closeBrowser() {
        System.out.println("Close Browser!!");


    }
}

