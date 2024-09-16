package level2;

import java.io.IOException;
import java.util.Scanner;

class EncoderDemo {
    public static void main(String[] args) throws IOException{

        Scanner in = new Scanner(System.in);
        System.out.print("Input a code: ");
        short code = in.nextShort();

        char symbol;
        System.out.print("Input a symbol: ");
        symbol = (char) System.in.read();

        Encoder encoder = new Encoder();

        encoder.encode(code);
        encoder.decode(symbol);
    }
}