package school.lemon.changerequest.java.dependency.management.examples.jar;

public class SecondClass {
    private final String string;

    public SecondClass(String string) {
        this.string = string;
    }

    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass(1);
        SecondClass secondClass = new SecondClass("2");
    }
}
