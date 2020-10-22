package student.konstantin_adotik.lesson_4.level_3;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetector detector = new LightColorDetector();
        System.out.println("detector.detect(440) = " + detector.detect(440));
        System.out.println("detector.detect(449) = " + detector.detect(459));;
        System.out.println("detector.detect(459) = " + detector.detect(500));
        System.out.println("detector.detect(469) = " + detector.detect(580));
        System.out.println("detector.detect(479) = " + detector.detect(630));
    }
    public void testViolet(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Violet")) {
            System.out.println("LightColorDetector test - Violet = OK");
        } else {
            System.out.println("LightColorDetector test - Violet = FAIL");
        }
    }
    public void testBlue(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Blue")) {
            System.out.println("LightColorDetector test - Blue = OK");
        } else {
            System.out.println("LightColorDetector test - Blue = FAIL");
        }
    }
    public void testGreen(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Green")) {
            System.out.println("LightColorDetector test - Green = OK");
        } else {
            System.out.println("LightColorDetector test - Green = FAIL");
        }
    }
    public void testYellow(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Yellow")) {
            System.out.println("LightColorDetector test - Yellow = OK");
        } else {
            System.out.println("LightColorDetector test - Yellow = FAIL");
        }
    }
    public void testOrange(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Orange")) {
            System.out.println("LightColorDetector test - Orange = OK");
        } else {
            System.out.println("LightColorDetector test - Orange = FAIL");
        }
    }
    public void testRed(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Red")) {
            System.out.println("LightColorDetector test - Red = OK");
        } else {
            System.out.println("LightColorDetector test - Red = FAIL");
        }
    }
    public void testInvisible(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Invisible Light")) {
            System.out.println("LightColorDetector test - Invisible Light = OK");
        } else {
            System.out.println("LightColorDetector test - Invisible Light = FAIL");
        }
    }
}

