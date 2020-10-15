package level2;

public class Encoder {

    public void encode(short code) {
        System.out.println("Encode: " + (char) code);
    }

    public void decode(char symbol) {
        System.out.println("Decode: " + (short) symbol);
    }
}

class EncoderDemo {
    public static void main(String[] args) {

        short code = 4;
        char symbol = '*';

        Encoder encoder = new Encoder();

        encoder.encode(code);
        encoder.decode(symbol);
    }
}
