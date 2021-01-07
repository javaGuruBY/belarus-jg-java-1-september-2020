package student.igor_kavalevski.lesson_14.level_3;

import java.util.ArrayList;
import java.util.List;

public class TransactionTestData {

    public List<Transaction> getTransactions() {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = new ArrayList<>();

                transactions.add(new Transaction(brian, 2011, 300));
                transactions.add(new Transaction(raoul, 2012, 1000));
                transactions.add(new Transaction(raoul, 2011, 400));
                transactions.add(new Transaction(mario, 2012, 710));
                transactions.add(new Transaction(mario, 2012, 700));
                transactions.add(new Transaction(alan, 2012, 950));

        return transactions;
    }
}
