package level2;

public class BankClient {

    private String uid;
    private String fullName;
    private static Role CAN_SEARCH_CLIENTS;

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return this.uid;
    }

    public String getFullName() {
        return this.fullName;
    }

    public boolean hasRole(Role role) {
        return CAN_SEARCH_CLIENTS == role;
    }
}
