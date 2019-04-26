
import java.util.ArrayList;
import java.util.regex.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class GrepFunctional {

    static List<String> grepFun(boolean ignoreCase, boolean regexCondition,
                                boolean filterInvert, String fileName, String word) throws IOException {

        Pattern pattern;
        Matcher matcher;
        String regExp;

        if (regexCondition) {
            regExp = word;
        } else {
            regExp = Pattern.quote(word);
        }

        if (ignoreCase) {
            pattern = Pattern.compile(regExp, Pattern.CASE_INSENSITIVE);
        } else {
            pattern = Pattern.compile(regExp);
        }

        List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        List<String> correctLines = new ArrayList<>();

        for (String line : lines) {
            matcher = pattern.matcher(line);
            if (filterInvert == !matcher.find()) {
                correctLines.add(line);
            } else {
                if (matcher.find()) {
                    correctLines.add(line);
                }
            }
        }
        return correctLines;
    }
}
