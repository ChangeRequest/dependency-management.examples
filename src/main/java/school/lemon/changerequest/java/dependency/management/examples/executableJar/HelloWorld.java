package school.lemon.changerequest.java.dependency.management.examples.executableJar;

public class HelloWorld {
    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder sb = new StringBuilder("Hello, ");
            for (String name : args) {
                sb.append(name).append(", ");
            }
            sb.delete(sb.length() - 2, sb.length() - 1).append('!');
            System.out.println(sb.toString());
        }
    }
}
