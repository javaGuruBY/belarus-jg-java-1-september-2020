package student.igor_kavalevski.lesson_14.level_3;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    TransactionAnalysisService trans = new TransactionAnalysisService();

    TransactionTestData transData = new TransactionTestData();

    @Test
    public void findTransaction2011YearTest() {

        List<Transaction> expected = new ArrayList<>();

        expected.add(transData.getTransactions().get(0));
        expected.add(transData.getTransactions().get(2));

        List<Transaction> actual = trans.findTransaction2011Year(transData.getTransactions());

        assertEquals(expected, actual);
    }

    @Test
    public void findTransactionByYearTest() {

        List<Transaction> expected = new ArrayList<>();

        expected.add(transData.getTransactions().get(0));
        expected.add(transData.getTransactions().get(2));

        List<Transaction> transaction = transData.getTransactions();

        List<Transaction> actual = trans.findTransactionsByYear(transaction, 2011);

        assertEquals(expected, actual);
    }

    @Test
    public void sortedTransactionByValueMinTest() {

        List<Transaction> expected = new ArrayList<>();

        expected.add(transData.getTransactions().get(0));
        expected.add(transData.getTransactions().get(2));
        expected.add(transData.getTransactions().get(4));
        expected.add(transData.getTransactions().get(3));
        expected.add(transData.getTransactions().get(5));
        expected.add(transData.getTransactions().get(1));

        List<Transaction> transaction = transData.getTransactions();

        List<Transaction> actual = trans.sortedTransactionByValueMin(transaction);

        assertEquals(expected, actual);
    }

    @Test
    public void sortedTransactionByValueMaxTest() {

        List<Transaction> expected = new ArrayList<>();

        expected.add(transData.getTransactions().get(1));
        expected.add(transData.getTransactions().get(5));
        expected.add(transData.getTransactions().get(3));
        expected.add(transData.getTransactions().get(4));
        expected.add(transData.getTransactions().get(2));
        expected.add(transData.getTransactions().get(0));

        List<Transaction> transaction = transData.getTransactions();

        List<Transaction> actual = trans.sortedTransactionByValueMax(transaction);

        assertEquals(expected, actual);
    }

    @Test
    public void findTransaction2011SortedByValueTest() {

        List<Transaction> expected = new ArrayList<>();

        expected.add(transData.getTransactions().get(0));
        expected.add(transData.getTransactions().get(2));

        List<Transaction> actual = trans.findTransaction2011SortedByValue(transData.getTransactions());

        assertEquals(expected, actual);
    }

    @Test
    public void findAllTransactionOfYearTest() {

        List<Integer> expected = new ArrayList<>();

        expected.add(transData.getTransactions().get(0).getYear());
        expected.add(transData.getTransactions().get(1).getYear());
        expected.add(transData.getTransactions().get(2).getYear());
        expected.add(transData.getTransactions().get(3).getYear());
        expected.add(transData.getTransactions().get(4).getYear());
        expected.add(transData.getTransactions().get(5).getYear());

        List<Transaction> transaction = transData.getTransactions();

        List<Integer> actual = trans.findAllTransactionOfYear(transaction);

        assertEquals(expected, actual);
    }

    @Test
    public void findAllUniqueYearTransactionTest() {

        Set<Integer> expected = new LinkedHashSet<>();

        expected.add(transData.getTransactions().get(0).getYear());
        expected.add(transData.getTransactions().get(1).getYear());

        List<Transaction> transaction = transData.getTransactions();

        Set<Integer> actual = trans.findAllUniqueYearTransaction(transaction);

        assertEquals(expected, actual);
    }

    @Test
    public void findNameUniqueTradersTest() {

        Set<String> expected = new HashSet<>();

        expected.add(transData.getTransactions().get(1).getTrader().getName());
        expected.add(transData.getTransactions().get(0).getTrader().getName());
        expected.add(transData.getTransactions().get(5).getTrader().getName());
        expected.add(transData.getTransactions().get(3).getTrader().getName());

        List<Transaction> transaction = transData.getTransactions();

        Set<String> actual = trans.findNameUniqueTraders(transaction);

        assertEquals(expected, actual);
    }

    @Test
    public void findCityUniqueTradersTest() {

        Set<String> expected = new HashSet<>();

        expected.add(transData.getTransactions().get(0).getTrader().getCity());
        expected.add(transData.getTransactions().get(3).getTrader().getCity());

        List<Transaction> transaction = transData.getTransactions();

        Set<String> actual = trans.findCityUniqueTraders(transaction);

        assertEquals(expected, actual);
    }

    @Test
    public void findNameTradersCambridgeTest() {

        Set<String> expected = new HashSet<>();

        expected.add(transData.getTransactions().get(0).getTrader().getName());
        expected.add(transData.getTransactions().get(1).getTrader().getName());
        expected.add(transData.getTransactions().get(5).getTrader().getName());

        List<Transaction> transaction = transData.getTransactions();

        Set<String> actual = trans.findNamesTraderForCambridge(transaction);

        assertEquals(expected, actual);
    }

    @Test
    public void findNamesTraderFromCityTest() {

        Set<String> expected = new HashSet<>();

        expected.add(transData.getTransactions().get(3).getTrader().getName());

        List<Transaction> transaction = transData.getTransactions();

        Set<String> actual = trans.findNamesTraderFromCity(transaction, "Milan");

        assertEquals(expected, actual);
    }

    @Test
    public void isAnyTraderBasedOnMilanTest() {

        List<Transaction> transaction = transData.getTransactions();

        boolean actual = trans.isAnyTraderBasedOnMilan(transaction);

        assertTrue(actual);
    }

    @Test
    public void isAnyTraderBasedOnCityTest() {

        List<Transaction> transaction = transData.getTransactions();

        boolean actual = trans.isAnyTraderBasedOnCity(transaction, "Cambridge");

        assertTrue(actual);
    }

    @Test
    public void theGreatestValueFromTransactionTest() {

        Optional<Integer> expected = Optional.of((transData.getTransactions().get(1).getValue()));

        List<Transaction> transaction = transData.getTransactions();

        Optional<Integer> actual = trans.theGreatestValueFromTransaction(transaction);

        assertEquals(expected, actual);
    }

    @Test
    public void theMinValueFromTransactionTest() {

        Optional<Integer> expected = Optional.of((transData.getTransactions().get(0).getValue()));

        List<Transaction> transaction = transData.getTransactions();

        Optional<Integer> actual = trans.theMinValueFromTransaction(transaction);

        assertEquals(expected, actual);
    }

    @Test
    public void namesTraderTest() {

        List<Transaction> transaction = transData.getTransactions();

        String expected = "Alan,Brian,Mario,Raoul";

        String actual = trans.namesTrader(transaction);

        assertEquals(expected, actual);
    }

    @Test
    public void uniqueCityTradersTest() {

        List<Transaction> transaction = transData.getTransactions();

        String expected = "Cambridge,Milan";

        String actual = trans.uniqueCityTraders(transaction);

        assertEquals(expected, actual);
    }
}


