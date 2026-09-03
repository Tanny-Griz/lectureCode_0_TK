package w10_java_topic_7_object_oriented_programming.example_package;

public class Main {

    public static void main(String[] args) {

        Cat hamish = new Cat("Hamish");
        System.out.println(hamish.getName());

        // What does this do?
        hamish.setName("Hamish McHamish");
        System.out.println(hamish.getName());

        // If you uncomment this line, what happens? Why?
        //hamish.setName("");

    }
}
