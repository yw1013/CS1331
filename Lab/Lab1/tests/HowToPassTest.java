import edu.gatech.cs1331.annotations.*;
import static edu.gatech.cs1331.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HowToPassTest {

    private String currentScores =
        "Exams: 90; Timed Labs: 80; Homeworks: 80, 0, 100";

    // From http://stackoverflow.com/questions/1119385/
    private final ByteArrayOutputStream stdOut = new ByteArrayOutputStream();
    private final ByteArrayOutputStream stdErr = new ByteArrayOutputStream();

    @BeforeClass
    public void setUpStreams() {
        System.setOut(new PrintStream(stdOut));
        System.setErr(new PrintStream(stdErr));
    }

    @AfterClass
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void average() {
        assertEquals("-10 average doesn't compute correct average",
            42.0, HowToPass.average(40, 44), 0.02);
    }

    @Test
    public void extractScores() {
        HowToPass htp = new HowToPass(currentScores);
        int[] expected = {80, 0, 100};
        assertArrayEquals("-10 scores not properly extracted",
            expected, htp.extractScores("Homeworks", currentScores));
    }

    @Test
    public void extractClause() {
        HowToPass htp = new HowToPass(currentScores);
        String expected = "Timed Labs: 80";
        assertEquals("-10 clause not properly extracted",
            expected, htp.extractClause("Timed Labs", currentScores));
    }

    @Test
    public void mainMethod() {
        String[] args = {currentScores};
        String expected = "Given your current scores:" + System.lineSeparator()
            + "Exams: [90]" + System.lineSeparator()
            + "TLs:   [80]" + System.lineSeparator()
            + "HWs:   [80, 0, 100]" + System.lineSeparator()
            + "and current average of 80.6" + System.lineSeparator()
            + "On remaining assignments you need:" + System.lineSeparator()
            + "a 98.0 average to finish with a 90." + System.lineSeparator()
            + "a 79.5 average to finish with a 80." + System.lineSeparator()
            + "a 60.9 average to finish with a 70." + System.lineSeparator()
            + "a 42.4 average to finish with a 60." + System.lineSeparator();
        HowToPass.main(args);
        // Note using assertTrue and startsWith to accept printing with
        // println (extra newline) or print
        assertTrue("-5 didn't get expected output from command line usage",
            stdOut.toString().startsWith(expected));
    }
}
