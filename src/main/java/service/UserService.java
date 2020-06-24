package service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserService {
    private EntityManagerFactory managerFactory;
    private EntityManager manager;

    public UserService() {
        openConnection();
    }

    private void openConnection() {
        managerFactory =
                Persistence.createEntityManagerFactory("mysqlPU");
        manager = managerFactory.createEntityManager();
        System.out.println("Is open: " + manager.isOpen());
    }

    private void closeConnection() {
        manager.close();
        managerFactory.close();
    }

    public void stop() {
        closeConnection();
    }

    public Team addTeam(Team team) {
        return null;
    }

    public void removeTeam(Team team) {

    }

    public Team modifyTeam(Team team) {
        return null;
    }

    public Team addReferee(Referee referee) {
        return null;
    }

    public void removeReferee(Referee referee) {

    }

    public Team modifyReferee(Referee referee) {
        return null;
    }

    public Tournament modifyTournament(Tournament tournament) {
        return null;
    }

    public ScoreTable[] generateTournament(Tournament tournament) {
        return null;
    }

    public Tournament[] generateFinals() {
        return null;
    }
}
