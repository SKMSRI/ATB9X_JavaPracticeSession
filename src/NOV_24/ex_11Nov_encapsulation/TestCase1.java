package NOV_24.ex_11Nov_encapsulation;

public class TestCase1 extends Baseclass {

    public TestCase1() {
        super();
        System.out.println("DC -TC1");
    }

    public void startTestcase() {
        openBrowser("Chrome");
        closeBrowser();
    }
    @Override
    public void setBrowser(String browser, boolean isAuth) {

        System.out.println("Own Logic");
        super.setBrowser(browser, isAuth);
    }

    @Override
    public String toString() {
        return "TestCase1{}";
    }

}

