package service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Tournament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTournament;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "Drużyna1", nullable = false, length = 30)
    private String idTeam1;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "Drużyna2", nullable = false, length = 30)
    private String idTeam2;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "Zwycięzca", nullable = false, length = 30)
    private String idWinner;

    @Column(name = "Wynik", nullable = false, length = 3)
    private String score;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "Sędzia", nullable = false, length = 30)
    private String idReferee;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "Sędzia pomocniczy 1", nullable = false, length = 30)
    private String idRefereeAssistat1;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "Sędzia pomocniczy 2", nullable = false, length = 30)
    private String idRefereeAssistat2;
}
