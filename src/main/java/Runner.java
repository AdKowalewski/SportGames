import gui.Layout;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Runner {
    public static void main(String[] args) {
        EntityManagerFactory managerFactory =
                Persistence.createEntityManagerFactory("mysqlPU"); //persistence unit
        EntityManager entityManager = managerFactory.createEntityManager();
        System.out.println("Is open: " + entityManager.isOpen());

        new Layout().showGuiWindow();

        managerFactory.close();
        entityManager.close();
    }
}
