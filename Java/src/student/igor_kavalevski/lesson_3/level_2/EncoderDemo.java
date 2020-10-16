package student.igor_kavalevski.lesson_3.level_2;

public class EncoderDemo {

    public static void main(String[] args) {

        short code = 88;
        char symbol = 'A';

        Encoder encoder = new Encoder();

        encoder.encode(code);
        encoder.decode(symbol);
    }
}
