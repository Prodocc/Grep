
import java.util.Objects;
import java.util.regex.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class GrephFunctional {

    public static void grephFun(String fileName, String word, boolean ignoreCase, boolean regexCondition, boolean filterInvert) throws IOException {

        if (fileName == null) {
            throw new IllegalArgumentException("Write file name");
        }

        Pattern pattern;
        Matcher matcher;
        int caseCondition;

        if (ignoreCase) {
            caseCondition = Pattern.CASE_INSENSITIVE;
        } else {
            caseCondition = Pattern.LITERAL;
        }

        List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        if (filterInvert) {
            if (regexCondition ) {

            }
        } else {

        }
        for (String line : lines) {

        }
    }

    public static void regexConditionLoop(List<String> lines, Matcher mathcer, Pattern pattern, String word, int caseCondition) {
        pattern = Pattern.compile(word, caseCondition);
        for (String line : lines) {
            mathcer = pattern.matcher(line);
            if (mathcer.find()) {
                System.out.println(line);
            }
        }
    }
}
