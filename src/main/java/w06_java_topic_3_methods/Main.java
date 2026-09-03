package w06_java_topic_3_methods;

public class Main {

    public static void main(String[] args) {

        // Print the name and version of the the operating system for the computer that runs this code
        String yourOs = getOperatingSystem();
        System.out.println("This program is running on " +  yourOs);
    }

    public static String getOperatingSystem() {
        // System can access properties, or information, about the computer
        // that is running this code, for example, the operating system name and version.
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        return osName + " " + osVersion;
    }

}
