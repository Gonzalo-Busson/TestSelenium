package BaseUtils;

public class ApplicationContext {

    private static String urlOlxIn = "https://www.olx.in";
    private static String urlOlxPk = "https://www.olx.com.pk";
    private static String urlOlxZa = "https://www.olx.co.za";
    private static String urlOlxInTitle = "OLX - Buy and Sell for free anywhere in India with OLX online classifieds";

    private static String BrowserTypeFireFox = "firefox";
    private static String BrowserTypeChrome = "chrome";

    private static String sellButtonCssSelector = ".rui-1KW_n";
    private static String loginWhithEmailButtonCssSelector = "button.rui-3sH3b:nth-child(5)";
    private static String nextButton = "button[class='button.rui-3sH3b:nth-child(5)'][type='submit']";
    private static String emailFieldCssSelector = ".rui-1nEgt > input:nth-child(1)";
    private static String email = "gonbu3144@gmail.com";
    private static String loginButtonFieldID = "password";
    private static String emailPassword = "andalaosa12";



    public static String getUrlOlxIn() { return urlOlxIn; }
    public static String getUrlOlxPk() { return urlOlxPk; }
    public static String getUrlOlxZa() { return urlOlxZa; }
    public static String getUrlOlxInTitle() { return urlOlxInTitle; }
    public static String getBrowserTypeFireFox() { return BrowserTypeFireFox; }
    public static String getBrowserTypeChrome() { return BrowserTypeChrome; }
    public static String getSellButtonCssSelector() { return sellButtonCssSelector; }
}
