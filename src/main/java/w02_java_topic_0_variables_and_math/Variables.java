package w02_java_topic_0_variables_and_math;

public class Variables {
    public static void main(String[] args) {

        String myName = "Tanya";
        System.out.println("hi " + myName);

        double todayTemp = 27.5;
        System.out.println("today temp " + todayTemp + "C");

        String upName = myName.toUpperCase();
        System.out.println(upName);
        System.out.println(upName.toLowerCase());
        System.out.println(upName.length());

        String msg = "A \"B\" C";
        String msg2 = "A \tB\t C";
        System.out.println(msg);
        System.out.println(msg2);

        double a = 90;
        int b = -4;
        double c = a / b;
        double d = a * b;
        System.out.println(c);
        System.out.println(d);
    }
}
