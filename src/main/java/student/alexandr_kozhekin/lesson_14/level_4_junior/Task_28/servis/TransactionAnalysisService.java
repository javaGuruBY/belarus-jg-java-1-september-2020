package student.alexandr_kozhekin.lesson_14.level_4_junior.Task_28.servis;

import student.alexandr_kozhekin.lesson_14.level_4_junior.Task_28.bean.Trader;
import student.alexandr_kozhekin.lesson_14.level_4_junior.Task_28.bean.Transaction;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
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

    public List<Transaction> reversSortedTransactionForValue(List<Transaction> transactions){

       return transactions.stream().
                sorted(Comparator.comparing(Transaction::getValue).reversed()).
                collect(Collectors.toList());

    }

    public List<Transaction> fiendTransactionIn2011AndSort(List<Transaction> transactions){

        return transactions.stream().
                filter(transaction -> transaction.getYear() == 2011).
                sorted(Comparator.comparing(Transaction::getValue)).
                collect(Collectors.toList());

    }

    public List<Integer> fiendAllYearsTransaction(List<Transaction> transactions) {

        return transactions.stream().
                map(Transaction::getYear).
                collect(Collectors.toList());

    }

    public Set<Integer> fiendAllUniqueYearsTransaction(List<Transaction> transactions) {

        return transactions.stream().
                map(Transaction::getYear).
                collect(Collectors.toSet());

    }

    public Set<String> fiendAllUniqueTrader(List<Transaction> transactions){

        return transactions.stream().
                map(Transaction::getTrader).
                map(Trader::getName).
                collect(Collectors.toSet());

    }

    public Set<String> fiendAllUniqueCityTrader(List<Transaction> transactions){

        return transactions.stream().
                map(Transaction::getTrader).
                map(Trader::getCity).
                collect(Collectors.toSet());

    }

}

