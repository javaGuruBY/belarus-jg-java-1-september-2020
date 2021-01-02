package student.alexandr_kozhekin.lesson_12.level_2_intern.Task_10;

import java.util.Optional;

public interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid);

}
