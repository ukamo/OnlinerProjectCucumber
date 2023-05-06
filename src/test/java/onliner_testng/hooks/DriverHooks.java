package onliner_testng.hooks;

import io.cucumber.java.BeforeAll;

import java.sql.DriverManager;

public class DriverHooks {
    @BeforeAll
    public static void setupDriver() {
       // DriverManager.initDriver();
    }
}


