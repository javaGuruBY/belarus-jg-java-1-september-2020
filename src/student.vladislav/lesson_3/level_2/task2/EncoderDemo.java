package task2;

public class EncoderDemo {

    public static void main(String[] args) {

        byte num = 65;
        char symbol = 'X';
        Encoder encoder = new Encoder();
        encoder.encodeNumber(num);
        encoder.decodeSymbol(symbol);
    }
}
