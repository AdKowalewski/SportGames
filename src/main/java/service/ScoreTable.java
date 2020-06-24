package service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ScoreTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idScoreTable;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "Drużyna", nullable = false, length = 30)
    private String idTeam;

    @Column(name = "Wynik", nullable = false, length = 10)
    private int score;

    public ScoreTable(String idTeam, int score) {
        this.idTeam = idTeam;
        this.score = score;
    }

    @Override
    public String toString() {
        return "ScoreTable{" +
                "idScoreTable=" + idScoreTable +
                ", idTeam='" + idTeam + '\'' +
                ", score=" + score +
                '}';
    }
}
