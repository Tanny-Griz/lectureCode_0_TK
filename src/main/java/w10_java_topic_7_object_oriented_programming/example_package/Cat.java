package w10_java_topic_7_object_oriented_programming.example_package;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        // Adding some validation. Cat names should not be null or empty.
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        // Otherwise, set the name.
        this.name = name;
    }
}
