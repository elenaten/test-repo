package utilities;

public class EnvironmentManager {
    public static String baseUrl;
    public static String username;
    public static String password;

    public static void setUpEnvironment() throws Exception {
        switch (ConfigReader.getProperty("environment").toLowerCase()) {
            case "dev":
                DEV();
                break;
            case "qa":
                QA();
                break;
            case "prod":
                PROD();
                break;
            default:
                throw new Exception("Invalid environment in configuration.properties.\n" +
                        "Please select from DEV, QA, PROD");
        }
    }

    private static void DEV() {
        //to set up dev variables
        baseUrl = "https://www.brainpop.com/";
        username = "qatest2021";
        password = "brainp0p";
    }
    private static void QA() {
        //to set up qa variables
        baseUrl = "https://www.brainpop.com/";
        username = "qatest2021";
        password = "brainp0p";
    }
    private static void PROD() {
        //to set up prod variables
        baseUrl = "https://www.brainpop.com/";
        username = "qatest2021";
        password = "brainp0p";
    }
}
