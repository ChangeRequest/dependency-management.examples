package school.lemon.changerequest.java.dependency.management.examples.executableJarWithDependencies;

public class HelloWorld {
    public static void main(String[] args) {
        ArgumentsParser argumentsParser = new ArgumentsParser(args);
        if (argumentsParser.isEmpty()) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder sb = new StringBuilder("Hello, ");
            for (String name : argumentsParser.getTokens()) {
                sb.append(name).append(", ");
            }
            sb.delete(sb.length() - 2, sb.length()).append('!');
            System.out.println(sb.toString());
        }
    }
}
