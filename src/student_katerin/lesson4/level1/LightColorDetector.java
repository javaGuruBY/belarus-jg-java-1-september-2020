package student_katerin.lesson4.level1;

public class LightColorDetector {

    public String detect(double length) {
        if (length < 0) {
            return "Length is negative";
        } else if (length <= 380) {
            return "Faint";
        } else if (length >= 380 && length <= 449) {
            return "Violet";
        } else if (length >= 450 && length <= 494) {
            return "Blue";
        } else if (length >= 495 && length <= 569) {
            return "Green";
        } else if (length >= 570 && length <= 589) {
            return "Yellow";
        } else if (length >= 590 && length <= 619) {
            return "Orange";
        } else if (length >= 620 && length <= 750) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }

}
