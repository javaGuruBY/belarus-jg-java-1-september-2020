package level2;

import java.util.List;
import java.util.Optional;

public class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public List<BankClient> getClients() {
        return clients;
    }

    public void setClients(List<BankClient> clients) {
        this.clients = clients;
    }

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {
        if (credentials.hasRole(Role.CAN_SEARCH_CLIENTS)) {
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
