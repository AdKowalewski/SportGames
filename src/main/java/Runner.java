import gui.Layout;
import service.UserService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Runner {
    public static void main(String[] args) {

        UserService service = new UserService();

        new Layout().showGuiWindow();

        service.stop();
    }
}
