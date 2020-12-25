package student.alexandr_kozhekin.lesson_14.level_3_junior.Task_21.servis;

import org.junit.Test;
import student.alexandr_kozhekin.lesson_14.level_3_junior.Task_21.bean.Trader;
import student.alexandr_kozhekin.lesson_14.level_3_junior.Task_21.bean.Transaction;
import student.alexandr_kozhekin.lesson_14.level_3_junior.Task_21.test.TransactionAnalysisServiceTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TransactionAnalysisService {

    @Test
    public void fiendTransactionIn2011UnitTest() {

        TransactionAnalysisServiceTest transactionAnalysisServiceTest = new TransactionAnalysisServiceTest();
        TransactionTestData transactionTestData = new TransactionTestData();

        List<Integer> expected = new ArrayList<>();

        expected.add(transactionTestData.getTransactions().get(0).getYear());
        expected.add(transactionTestData.getTransactions().get(2).getYear());

        List<Transaction> transactionList = transactionAnalysisServiceTest.
                fiendTransactionForYear(transactionTestData.getTransactions(), 2011);

        List<Integer> actual = new ArrayList<>();

        for (int i = 0; i < expected.size(); i++){

            actual.add(transactionList.get(i).getYear());

        }

        assertEquals(expected, actual);

    }

    @Test
    public void fiendTransactionIn2012UnitTest() {

        TransactionAnalysisServiceTest transactionAnalysisServiceTest = new TransactionAnalysisServiceTest();
        TransactionTestData transactionTestData = new TransactionTestData();

        List<Integer> expected = new ArrayList<>();

        expected.add(transactionTestData.getTransactions().get(1).getYear());
        expected.add(transactionTestData.getTransactions().get(3).getYear());
        expected.add(transactionTestData.getTransactions().get(4).getYear());
        expected.add(transactionTestData.getTransactions().get(5).getYear());

        List<Transaction> transactionList = transactionAnalysisServiceTest.
                fiendTransactionForYear(transactionTestData.getTransactions(), 2012);

        List<Integer> actual = new ArrayList<>();

        for (int i = 0; i < expected.size(); i++){

            actual.add(transactionList.get(i).getYear());

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
