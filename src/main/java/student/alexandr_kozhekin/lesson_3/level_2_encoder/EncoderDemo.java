package student.alexandr_kozhekin.lesson_3.level_2_encoder;

public class EncoderDemo {
    public static void main(String[] args) {
        byte num = 65;
        char symbol = 'X';

        Encoder encoder = new Encoder();

        encoder.encodeNumber(num);
        encoder.decodeSymbol(symbol);
    }
}
