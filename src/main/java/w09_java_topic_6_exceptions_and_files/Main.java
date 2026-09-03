package w09_java_topic_6_exceptions_and_files;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ari");
        names.add("Beau");
        names.add(null);
        names.add("Carrie");

        // What happens when this code runs? What options do we have to fix it?
        for (String name : names) {
            System.out.println(name.toUpperCase());
        }

        // We could review the code that adds names to the list and make sure no null values are added
        // We could use an if-statement inside the loop and check if the name is not null before making it uppercase
        // We could add a try-catch to catch the NullPointerException that is thrown

        // The correct answer(s) depends on the context of the problem.

    }
}
