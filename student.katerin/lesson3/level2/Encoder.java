package level2;

public class Encoder {

    public void encode(short code) {
        System.out.println("Encode: " + (char) code);
    }

    public void decode(char symbol) {
        System.out.println("Decode: " + (short) symbol);
    }
}


