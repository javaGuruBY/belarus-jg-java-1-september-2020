package level4;

public class ConverterTest {
    public static void main(String[] args) {
        ConverterTest convert = new ConverterTest();
        convert.test1();
        convert.test2();
        convert.test3();
    }

    void massage(double expected, double actual, String name) {
        if (expected == actual) System.out.println(name + " is OK");
        else System.out.println(name + " is NOT OK");
    }

    void test1() {
        FahrenheitConverter converter = new FahrenheitConverter();
        double expected = 50;
        double actual = converter.convert(10);
        massage(expected, actual, "test 1");
    }

    void test2() {
        CelsiusConverter converter = new CelsiusConverter();
        double expected = 50;
        double actual = converter.convert(50);
        massage(expected, actual, "test 2");
    }

    void test3() {
        KelvinConverter converter = new KelvinConverter();
        double expected = 273.15;
        double actual = converter.convert(0);
        massage(expected, actual, "test 3");
    }
}
