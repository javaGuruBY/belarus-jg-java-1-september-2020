package student.alexandr_kozhekin.lesson_14.level_3_junior.Task_21.test;

import student.alexandr_kozhekin.lesson_14.level_3_junior.Task_21.bean.Transaction;

import java.util.List;
import java.util.stream.Collectors;

public class TransactionAnalysisServiceTest {

    public List<Transaction> fiendTransactionForYear(List<Transaction> transaction, int year) {

        return transaction.stream().
                filter(s -> s.getYear() == year).
                collect(Collectors.toList());

    }
}

