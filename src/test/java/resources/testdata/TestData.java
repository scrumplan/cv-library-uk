package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {


    @DataProvider(name = "JobSearch")
    public static Object[][] objectTestData() {
        return new Object[][]{
                {"Tester", "Harrow", "up to 5 miles", "30000", "500000", "Per annum","Permanent","Tester jobs in Harrow on the Hill"},
                {"Software Automation Tester", "Harrow", "up to 15 miles", "30000", "50000", "Per annum","Contract", "Contract Software Automation Tester jobs in Harrow on the Hill"},
                {"Manual Software Tester", "West Sussex", "up to 7 miles", "30000", "60000", "Per annum","Any", "Manual Software Tester jobs in West Sussex"},
                {"Retail Manager", "Horley", "up to 25 miles", "30000", "50000", "Per annum","Permanent", "Permanent Retail Manager jobs in Horley"},
                {"Automation Tester", "HA1 1AB", "up to 10 miles", "300", "400", "Per day","Contract", "Contract Automation Tester jobs in HA1 1AB"},
                {"Research Scientist", "SS12 0NY", "up to 10 miles", "400", "500", "Per day","Contract", "Contract Research Scientist jobs in SS12 0NY"},
                {"Tester", "Watford, Hertfordshire", "up to 5 miles", "40000", "60000", "Per annum","Contract", "Contract Tester jobs in Watford"},
        };

    }
}
