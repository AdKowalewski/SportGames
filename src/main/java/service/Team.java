package service;

import lombok.Data;
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
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTeam;

    @Column(name = "Nazwa", nullable = false, length = 30)
    private String teamName;
}
