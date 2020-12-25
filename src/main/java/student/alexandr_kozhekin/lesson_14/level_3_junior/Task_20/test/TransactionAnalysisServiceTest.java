package student.alexandr_kozhekin.lesson_14.level_3_junior.Task_20.test;

import student.alexandr_kozhekin.lesson_14.level_3_junior.Task_20.bean.Transaction;

import java.util.List;
import java.util.stream.Collectors;

public class TransactionAnalysisServiceTest {

    public List<Transaction> fiendTransactionIn2011(List<Transaction> transaction) {

        return transaction.stream().
                filter(s -> s.getYear() == 2011).
                collect(Collectors.toList());

    }
}

