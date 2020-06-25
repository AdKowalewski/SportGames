package service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

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

    @Column(name = "Wynik", nullable = false, length = 10)
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

    public Tournament(String idTeam1, String idTeam2, String idWinner, String score, String idReferee, String idRefereeAssistat1, String idRefereeAssistat2) {
        this.idTeam1 = idTeam1;
        this.idTeam2 = idTeam2;
        this.idWinner = idWinner;
        this.score = score;
        this.idReferee = idReferee;
        this.idRefereeAssistat1 = idRefereeAssistat1;
        this.idRefereeAssistat2 = idRefereeAssistat2;
    }

    @Override
    public String toString() {
        return "Tournament{" +
                "idTournament=" + idTournament +
                ", idTeam1='" + idTeam1 + '\'' +
                ", idTeam2='" + idTeam2 + '\'' +
                ", idWinner='" + idWinner + '\'' +
                ", score='" + score + '\'' +
                ", idReferee='" + idReferee + '\'' +
                ", idRefereeAssistat1='" + idRefereeAssistat1 + '\'' +
                ", idRefereeAssistat2='" + idRefereeAssistat2 + '\'' +
                '}';
    }
}
