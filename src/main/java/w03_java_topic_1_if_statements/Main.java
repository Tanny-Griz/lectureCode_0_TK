package w03_java_topic_1_if_statements;

import static input.InputUtils.stringInput;

public class Main {

    public static void main(String[] args) {

        // Welcome a user
        String name = stringInput("Please enter your name and press enter:");
        System.out.println("Nice to meet you, " + name);
    }

}
