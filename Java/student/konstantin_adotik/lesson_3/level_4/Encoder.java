package student.konstantin_adotik.lesson_3.level_4;

public class Encoder {

    public void encodeFigure(short code) {
        char encode = (char) code;
        System.out.println(encode);
    }

    public void decodeLetter(char symbol) {
        int decode = (byte) symbol;
        System.out.println(decode);
    }
}
