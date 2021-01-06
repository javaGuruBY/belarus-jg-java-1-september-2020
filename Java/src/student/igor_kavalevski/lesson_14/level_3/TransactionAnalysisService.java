package student.igor_kavalevski.lesson_14.level_3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionAnalysisService {

    List<Transaction> findTransaction2011Year(List<Transaction> transaction) {

        return transaction.stream()
                .filter(s -> s.getYear() == 2011)
                .collect(Collectors.toList());
    }

    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {

        return transactions.stream()
                .filter(y -> y.getYear() == year)
                .collect(Collectors.toList());
    }

    public List<Transaction> sortedTransactionByValueMin(List<Transaction> transactions) {

        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Transaction> sortedTransactionByValueMax(List<Transaction> transactions) {

        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    public List<Transaction> findTransaction2011SortedByValue(List<Transaction> transactions) {

        return transactions.stream()
                .filter(s -> s.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }
}
