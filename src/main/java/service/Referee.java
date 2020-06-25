package service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Referee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReferee;

    @Column(name = "Imię", nullable = false, length = 30)
    private String firstName;

    @Column(name = "Nazwisko", nullable = false, length = 30)
    private String lastName;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "idTournament")
//    private List<Tournament> tournaments = new LinkedList<>();

    public Referee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Referee{" +
                "idReferee=" + idReferee +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
