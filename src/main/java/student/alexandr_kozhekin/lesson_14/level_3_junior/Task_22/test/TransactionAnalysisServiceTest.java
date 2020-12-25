package student.alexandr_kozhekin.lesson_14.level_3_junior.Task_22.test;

import org.junit.Test;
import student.alexandr_kozhekin.lesson_14.level_3_junior.Task_22.bean.Trader;
import student.alexandr_kozhekin.lesson_14.level_3_junior.Task_22.bean.Transaction;
import student.alexandr_kozhekin.lesson_14.level_3_junior.Task_22.servis.TransactionAnalysisService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
