package w07_java_topic_4_lists;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Create an example list
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("C#");
        languages.add("Kotlin");
        languages.add("Rust");
        languages.add("Python");

        // Concatenate the items in the list, joining with a comma
        String listOfLanguages = String.join(", ", languages);
        System.out.println(listOfLanguages);

    }

}
