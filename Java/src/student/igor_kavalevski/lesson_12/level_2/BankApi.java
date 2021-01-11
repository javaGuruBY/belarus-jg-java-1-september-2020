package student.igor_kavalevski.lesson_12.level_2;

import java.nio.file.AccessDeniedException;
import java.util.Optional;

public interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException, student.igor_kavalevski.lesson_12.level_2.AccessDeniedException;
}
