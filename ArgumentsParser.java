package school.lemon.changerequest.java.dependency.management.examples.executableJarWithDependencies;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArgumentsParser {
    private static final String WORDS_REGEXP = "\\w+";
    private static final Pattern WORDS_PATTERN = Pattern.compile(WORDS_REGEXP);
    private final String[] args;
    private final List<String> tokens;
    private boolean isProcessed = false;

    public ArgumentsParser(final String[] args) {
        this.args = args;
        tokens = new ArrayList<>(args.length);
    }

    public boolean isEmpty() {
        return isEmpty(args);
    }

    public List<String> getTokens() {
        if (isProcessed) {
            return tokens;
        }
        if (!isEmpty()) {
            for (final String arg : args) {
                Matcher matcher = WORDS_PATTERN.matcher(arg);
                while (matcher.find()) {
                    tokens.add(matcher.group());
                }
            }
        }
        isProcessed = true;
        return tokens;
    }

    private static boolean isEmpty(final Object[] array) {
        return array == null || array.length == 0;
    }
}
