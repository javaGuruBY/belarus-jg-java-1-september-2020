package student.konstantin_adotik.lesson_3.level_4;

public class EncoderDemo {
    public static void main(String[] args) {

        byte number = 65;
        char symbol = 'X';

        Encoder encoder = new Encoder();

        encoder.encodeFigure(number);
        encoder.decodeLetter(symbol);
    }

}

