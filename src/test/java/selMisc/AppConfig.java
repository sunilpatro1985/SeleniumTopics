package selMisc;

public class AppConfig {
    public static String browser = System.getProperty("browser", "chrome");
    public static String env = System.getProperty("env", "qa");
    public static String url = System.getProperty("url", "facebook.com");
}
