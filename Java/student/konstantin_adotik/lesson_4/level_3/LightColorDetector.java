package student.konstantin_adotik.lesson_4.level_3;

public class LightColorDetector {
    public String detect(int wavelength) {
        if (wavelength <= 449) {
            return "Violet";
        } else if (wavelength >= 450 && wavelength <= 494) {
            return "Blue";
        } else if (wavelength >= 495 && wavelength <= 569) {
            return "Green";
        } else if (wavelength >= 570 && wavelength <= 589) {
            return "Orange";
        } else if (wavelength >= 620 && wavelength <= 750) {
            return "red";
        }else{
                return "Invisible Light";
        }


    }
}

