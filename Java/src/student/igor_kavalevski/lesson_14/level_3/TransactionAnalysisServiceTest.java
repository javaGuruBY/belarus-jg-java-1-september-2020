package student.igor_kavalevski.lesson_14.level_3;

import org.junit.Test;

import java.util.ArrayList;

import java.util.List;

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
}

