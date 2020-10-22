package student.konstantin_adotik.lesson_4.level_2;

public class PhraseAnalyserTest {
    public static void main(String[] args) {
        PhraseAnalyserTest test =  new PhraseAnalyserTest();
        test.testProfile();
        test.testFailed();
        test.testGetBack();

    }


    void testProfile() {
        PhraseAnalyser comparetor = new PhraseAnalyser();

        String analyseResult = comparetor.analyse("It stands no chance");

        if (analyseResult.startsWith("Make") && analyseResult.endsWith("great again")) {
            System.out.println("Test approve");
        } else {
            System.out.println("Test fail");
        }
    }

        void testFailed() {
            PhraseAnalyser comparetor = new PhraseAnalyser();

            String analyseResultNegative = comparetor.analyse("great again");

            if (analyseResultNegative.startsWith("Make") || analyseResultNegative.endsWith("It could be worse")) {
                System.out.println("Test approve");
            } else {
                System.out.println("Test fail");
            }
        }

        void testGetBack() {
            PhraseAnalyser comparetor = new PhraseAnalyser();

            String analyseResultDefult = comparetor.analyse("It is fine, really");

            if (analyseResultDefult.equals("It is fine, really")) {
                System.out.println("Test approve");
            } else {
                System.out.println("Test fail");
            }
        }
    }




