import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GrepTest {

    @Test
    public void grepTest() throws IOException {
        List<String> correctLines = new ArrayList<>();
        correctLines.add("It's Friday I'm in love");
        correctLines.add("It's Friday I'm in love");
        correctLines.add("It's Friday I'm in love");
        assertEquals(correctLines, GrepFunctional.grepFun(false, false,
                false, "D:\\IdeaProjects\\Greph\\Files\\text.txt", "It's Friday I'm in love"));
    }

    @Test
    public void grepParameter() throws IOException {
        List<String> correctLines = new ArrayList<>();
        correctLines.add("It's Friday I'm in love");
        correctLines.add("It's Friday I'm in love");
        correctLines.add("But friday never hesitate...");
        correctLines.add("It's Friday I'm in love");
        correctLines.add("It's friday I'm in love");
        assertEquals(correctLines, GrepFunctional.grepFun(true, false, false,
                "D:\\IdeaProjects\\Greph\\Files\\text.txt", "friday"));
    }

    @Test
    void grepTwoParameters() throws IOException {
        List<String> correctLines = new ArrayList<>();
        correctLines.add("It's Friday I'm in love");
        correctLines.add("It's Friday I'm in love");
        correctLines.add("But friday never hesitate...");
        correctLines.add("It's Friday I'm in love");
        correctLines.add("It's friday I'm in love");
        assertEquals(correctLines, GrepFunctional.grepFun(true, true, false,
                "D:\\IdeaProjects\\Greph\\Files\\text.txt", "fri"));
    }

    @Test
    void grepThreeParameters() throws IOException {
        List<String> correctLines = new ArrayList<>();
        correctLines.add("I don't care if Monday's blue");
        correctLines.add("Tuesday's grey and Wednesday too");
        correctLines.add("Thursday I don't care about you");
        correctLines.add("");
        correctLines.add("Monday you can fall apart");
        correctLines.add("Tuesday, Wednesday break my heart");
        correctLines.add("Thursday doesn't even start");
        correctLines.add("");
        correctLines.add("Saturday wait");
        correctLines.add("And Sunday always comes too late");
        correctLines.add("");
        correctLines.add("I don't care if Monday's black");
        correctLines.add("Tuesday, Wednesday heart attack");
        correctLines.add("Thursday never looking back");
        correctLines.add("");
        correctLines.add("Monday you can hold your head");
        correctLines.add("Tuesday, Wednesday stay in bed");
        correctLines.add("Or Thursday watch the walls instead");
        correctLines.add("");
        correctLines.add("");
        assertEquals(correctLines, GrepFunctional.grepFun(true, true, true,
                "D:\\IdeaProjects\\Greph\\Files\\text.txt", "friday"));
    }


}