package student.alexandr_kozhekin.lesson_12.level_2_intern.Task_12;

import java.util.List;
import java.util.Optional;

public class BankApiImpl implements BankApi{

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {

        this.clients = clients;

    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {

        if (credentials.getRoles().contains(Role.CAN_SEARCH_CLIENTS)) {

            throw new AccessDeniedException();

        }

        for (BankClient client : clients) {
            if (client.getUid().equals(uid)) {

                return Optional.of(client);

            }
        }

        return Optional.empty();

    }

}
