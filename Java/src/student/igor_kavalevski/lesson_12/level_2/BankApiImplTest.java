package student.igor_kavalevski.lesson_12.level_2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BankApiImplTest {


    @Test
    public void findByUid() {

        List<BankClient> clients = new ArrayList();
        BankApiImpl api = new BankApiImpl(clients);

        List<Role> roles = new ArrayList();
        UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials, "1234");
            System.out.println("TEST FAIL");

        } catch (AccessDeniedException e) {
            System.out.println("TEST OK");
        }
    }
}