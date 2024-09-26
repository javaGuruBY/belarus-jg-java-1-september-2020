package student.alexandr_kozhekin.lesson_3.level_2_encoder;
/*
Разработать класс - кодировщик, у которого должны быть следующие характеристики:
Методы:
    Преобразование кода в символ и вывод на экран (void encode(short code))1P
    Преобразование символ в код и вывод на экран (void decode(char symbol))2P
 */

public class Encoder {

    public void encodeNumber(short code){
        char encode = (char) code;
        System.out.println(encode);
    }

    public void decodeSymbol(char symbol){
        byte decode = (byte) symbol;
        System.out.println(decode);
    }
}
