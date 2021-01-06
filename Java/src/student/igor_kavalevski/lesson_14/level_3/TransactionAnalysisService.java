package student.igor_kavalevski.lesson_14.level_3;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
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

    public List<Integer> findAllTransactionOfYear(List<Transaction> transactions) {

        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

    public Set<Integer> findAllUniqueYearTransaction(List<Transaction> transactions) {

        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toSet());
    }

    public Set<String> findNameUniqueTraders(List<Transaction> transactions) {

        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    public Set<String> findCityUniqueTraders(List<Transaction> transactions) {

        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .collect(Collectors.toSet());
    }

    public Set<String> findNamesTraderForCambridge(List<Transaction> transactions) {

        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(s -> s.getCity().equals("Cambridge"))
                .map(Trader::getName)
                .collect(Collectors.toSet());

    }

    public Set<String> findNamesTraderFromCity(List<Transaction> transactions, String cityFind) {

        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(s -> s.getCity().equals(cityFind))
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }
}
