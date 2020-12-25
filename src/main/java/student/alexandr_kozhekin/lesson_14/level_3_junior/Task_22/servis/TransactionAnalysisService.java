package student.alexandr_kozhekin.lesson_14.level_3_junior.Task_22.servis;

import student.alexandr_kozhekin.lesson_14.level_3_junior.Task_22.bean.Transaction;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionAnalysisService {

    public List<Transaction> fiendTransactionForYear(List<Transaction> transaction, int year) {

        return transaction.stream().
                filter(s -> s.getYear() == year).
                collect(Collectors.toList());

    }

    public List<Transaction> sortedTransactionForValue(List<Transaction> transactions){

        return transactions.stream().
                sorted(Comparator.comparing(Transaction::getValue)).
                collect(Collectors.toList());

    }
}

