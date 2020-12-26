package student.alexandr_kozhekin.lesson_14.level_4_junior.Task_28.test;

import org.junit.Test;
import student.alexandr_kozhekin.lesson_14.level_4_junior.Task_28.bean.Trader;
import student.alexandr_kozhekin.lesson_14.level_4_junior.Task_28.bean.Transaction;
import student.alexandr_kozhekin.lesson_14.level_4_junior.Task_28.servis.TransactionAnalysisService;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class TransactionAnalysisServiceTest {

    @Test
    public void fiendTransactionIn2011UnitTest() {

        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        TransactionTestData transactionTestData = new TransactionTestData();

        List<Integer> expected = new ArrayList<>();

        expected.add(transactionTestData.getTransactions().get(0).getYear());
        expected.add(transactionTestData.getTransactions().get(2).getYear());

        List<Transaction> transactionList = transactionAnalysisService.
                fiendTransactionForYear(transactionTestData.getTransactions(), 2011);

        List<Integer> actual = new ArrayList<>();

        for (int i = 0; i < expected.size(); i++){

            actual.add(transactionList.get(i).getYear());

        }

        assertEquals(expected, actual);

    }

    @Test
    public void fiendTransactionIn2012UnitTest() {

        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        TransactionTestData transactionTestData = new TransactionTestData();

        List<Integer> expected = new ArrayList<>();

        expected.add(transactionTestData.getTransactions().get(1).getYear());
        expected.add(transactionTestData.getTransactions().get(3).getYear());
        expected.add(transactionTestData.getTransactions().get(4).getYear());
        expected.add(transactionTestData.getTransactions().get(5).getYear());

        List<Transaction> transactionList = transactionAnalysisService.
                fiendTransactionForYear(transactionTestData.getTransactions(), 2012);

        List<Integer> actual = new ArrayList<>();

        for (int i = 0; i < expected.size(); i++){

            actual.add(transactionList.get(i).getYear());

        }

        assertEquals(expected, actual);

    }

    @Test
    public void sortTransactionForValueUnitTest() {

        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        TransactionTestData transactionTestData = new TransactionTestData();

        List<Integer> expected = new ArrayList<>();

        expected.add(transactionTestData.getTransactions().get(0).getValue());
        expected.add(transactionTestData.getTransactions().get(2).getValue());
        expected.add(transactionTestData.getTransactions().get(4).getValue());
        expected.add(transactionTestData.getTransactions().get(3).getValue());
        expected.add(transactionTestData.getTransactions().get(5).getValue());
        expected.add(transactionTestData.getTransactions().get(1).getValue());

        List<Transaction> transactionList = transactionAnalysisService.
                sortedTransactionForValue(transactionTestData.getTransactions());

        List<Integer> actual = new ArrayList<>();

        for (int i = 0; i < expected.size(); i++){

            actual.add(transactionList.get(i).getValue());

        }

        assertEquals(expected, actual);

    }

    @Test
    public void reversSortedTransactionForValueTest() {

        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        TransactionTestData transactionTestData = new TransactionTestData();

        List<Integer> expected = new ArrayList<>();

        expected.add(transactionTestData.getTransactions().get(1).getValue());
        expected.add(transactionTestData.getTransactions().get(5).getValue());
        expected.add(transactionTestData.getTransactions().get(3).getValue());
        expected.add(transactionTestData.getTransactions().get(4).getValue());
        expected.add(transactionTestData.getTransactions().get(2).getValue());
        expected.add(transactionTestData.getTransactions().get(0).getValue());

        List<Transaction> transactionList = transactionAnalysisService.
                reversSortedTransactionForValue(transactionTestData.getTransactions());

        List<Integer> actual = new ArrayList<>();

        for (int i = 0; i < expected.size(); i++){

            actual.add(transactionList.get(i).getValue());

        }

        assertEquals(expected, actual);

    }

    @Test
    public void fiendTransactionIn2011AndSortTest() {

        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        TransactionTestData transactionTestData = new TransactionTestData();

        List<Integer> expectedFirst = new ArrayList<>();
        List<Integer> expectedSecond = new ArrayList<>();

        expectedFirst.add(transactionTestData.getTransactions().get(0).getYear());
        expectedFirst.add(transactionTestData.getTransactions().get(2).getYear());
        expectedSecond.add(transactionTestData.getTransactions().get(0).getValue());
        expectedSecond.add(transactionTestData.getTransactions().get(2).getValue());

        List<Transaction> transactionList = transactionAnalysisService.
                fiendTransactionIn2011AndSort(transactionTestData.getTransactions());

        List<Integer> actualFirst = new ArrayList<>();
        List<Integer> actualSecond = new ArrayList<>();

        for (int i = 0; i < expectedFirst.size(); i++){

            actualFirst.add(transactionList.get(i).getYear());
            actualSecond.add(transactionList.get(i).getValue());

        }

        assertEquals(expectedFirst, actualFirst);
        assertEquals(expectedSecond, actualSecond);

    }

    @Test
    public void fiendAllYearsTransactionTest() {

        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        TransactionTestData transactionTestData = new TransactionTestData();

        List<Integer> expected = new ArrayList<>();

        expected.add(transactionTestData.getTransactions().get(0).getYear());
        expected.add(transactionTestData.getTransactions().get(1).getYear());
        expected.add(transactionTestData.getTransactions().get(2).getYear());
        expected.add(transactionTestData.getTransactions().get(3).getYear());
        expected.add(transactionTestData.getTransactions().get(4).getYear());
        expected.add(transactionTestData.getTransactions().get(5).getYear());

        List<Integer> actual = transactionAnalysisService.
                fiendAllYearsTransaction(transactionTestData.getTransactions());

        assertEquals(expected, actual);

    }

    @Test
    public void fiendAllUniqueYearsTransactionTest() {

        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        TransactionTestData transactionTestData = new TransactionTestData();

        Set<Integer> expected = new HashSet<>();

        expected.add(transactionTestData.getTransactions().get(0).getYear());
        expected.add(transactionTestData.getTransactions().get(1).getYear());
        expected.add(transactionTestData.getTransactions().get(2).getYear());
        expected.add(transactionTestData.getTransactions().get(3).getYear());
        expected.add(transactionTestData.getTransactions().get(4).getYear());
        expected.add(transactionTestData.getTransactions().get(5).getYear());

        Set<Integer> actual = transactionAnalysisService.
                fiendAllUniqueYearsTransaction(transactionTestData.getTransactions());

        assertEquals(expected, actual);

    }

    @Test
    public void fiendAllUniqueTraderTest() {

        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        TransactionTestData transactionTestData = new TransactionTestData();

        Set<String> expected = new HashSet<>();

        expected.add(transactionTestData.getTransactions().get(0).getTrader().getName());
        expected.add(transactionTestData.getTransactions().get(1).getTrader().getName());
        expected.add(transactionTestData.getTransactions().get(2).getTrader().getName());
        expected.add(transactionTestData.getTransactions().get(3).getTrader().getName());
        expected.add(transactionTestData.getTransactions().get(4).getTrader().getName());
        expected.add(transactionTestData.getTransactions().get(5).getTrader().getName());

        Set<String> actual = transactionAnalysisService.
                fiendAllUniqueTrader(transactionTestData.getTransactions());

        assertEquals(expected, actual);

    }

    @Test
    public void fiendAllUniqueCityTraderTest() {

        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        TransactionTestData transactionTestData = new TransactionTestData();

        Set<String> expected = new HashSet<>();

        expected.add(transactionTestData.getTransactions().get(0).getTrader().getCity());
        expected.add(transactionTestData.getTransactions().get(1).getTrader().getCity());
        expected.add(transactionTestData.getTransactions().get(2).getTrader().getCity());
        expected.add(transactionTestData.getTransactions().get(3).getTrader().getCity());
        expected.add(transactionTestData.getTransactions().get(4).getTrader().getCity());
        expected.add(transactionTestData.getTransactions().get(5).getTrader().getCity());

        Set<String> actual = transactionAnalysisService.
                fiendAllUniqueCityTrader(transactionTestData.getTransactions());

        assertEquals(expected, actual);

    }
}

class TransactionTestData {

    public List<Transaction> getTransactions() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        return Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

    }
}
