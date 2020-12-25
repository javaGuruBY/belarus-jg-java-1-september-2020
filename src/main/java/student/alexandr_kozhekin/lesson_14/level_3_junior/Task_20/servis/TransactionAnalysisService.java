package student.alexandr_kozhekin.lesson_14.level_3_junior.Task_20.servis;

import org.junit.Test;
import student.alexandr_kozhekin.lesson_14.level_3_junior.Task_20.bean.Trader;
import student.alexandr_kozhekin.lesson_14.level_3_junior.Task_20.bean.Transaction;
import student.alexandr_kozhekin.lesson_14.level_3_junior.Task_20.test.TransactionAnalysisServiceTest;

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
                fiendTransactionIn2011(transactionTestData.getTransactions());

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
