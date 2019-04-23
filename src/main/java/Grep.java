import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

import java.io.IOException;
import java.util.Arrays;

public class Greph {

    @Option(name = "-i", usage = "Case ignore")
    private boolean ignoreCase;

    @Option(name = "-r", usage = "Regex")
    private boolean regexCondition;

    @Option(name = "-v", usage = "Invert filter condition")
    private boolean filterInvert;

    @Argument(required = true, usage = "File name")
    private String fileName;

    @Option(name = "-w", usage = "Word to find")
    private String word;

    public static void main(String[] args) throws IOException {
        new Greph().doMain(args);
    }

    public void doMain(String[] args) throws IOException {
        CmdLineParser parser = new CmdLineParser(this);
        try {
            parser.parseArgument(args);
        } catch (CmdLineException ex) {
            System.err.println(ex.getMessage());
            System.err.println();
            parser.printUsage(System.err);
        }
        System.out.println(Arrays.toString(args));
        GrephFunctional.grephFun(fileName, word, ignoreCase, regexCondition, filterInvert);
    }
}
