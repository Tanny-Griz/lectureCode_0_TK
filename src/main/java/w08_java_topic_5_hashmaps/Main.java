package w08_java_topic_5_hashmaps;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        // A TreeMap is just like a HashMap but it keeps the keys in order,
        // regardless of the order the key-value pairs are added.
        // IF the keys are strings, they will be sorted alphabetically.
        Map<String, String> collegesAndCities = new TreeMap<>();

        collegesAndCities.put("Minneapolis College", "Minneapolis");
        collegesAndCities.put("Hennepin Technical College", "Brooklyn Park");
        collegesAndCities.put("Dakota County College", "Rosemount");
        collegesAndCities.put("Normandale Community College", "Bloomington");
        collegesAndCities.put("Inver Hills Community College", "Inver Grove Heights");
        collegesAndCities.put("Century College", "White Bear Lake");

        for (String college: collegesAndCities.keySet()) {
            String city = collegesAndCities.get(college);
            System.out.println(college + " is in " + city);
        }

    }
}
