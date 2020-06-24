package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Layout extends JFrame implements ActionListener {
    private JFrame frame;
    private JButton newTeam;
    private JButton deleteTeam;
    private JButton modifyTeam;
    private JList teamList;
    private JButton newReferee;
    private JButton deleteReferee;
    private JButton modifyReferee;
    private JList refereeList;
    private JRadioButton volleyballButton;
    private JButton modifyTournament;
    private JButton generateTournament;
    private JButton generateFinals;
    private JTable table1;
    private JTable table2;
    private JTable tableScore;

    public void showGuiWindow() {
        frame = new JFrame("GamesApp");
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        frame.setJMenuBar(addMenuBar());

        frame.add(addTabbedPane());
        //addActionToConverterBtn();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.pack();
        //frame.setSize(600, 200);
    }

    private JMenuBar addMenuBar() {
        JMenu fileMenu = new JMenu("File");
        JMenu optMenu = new JMenu("Options");
        JMenuItem exit = new JMenuItem("Exit");
        JMenuItem export = new JMenuItem("Export");
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.ALT_MASK));
        exit.addActionListener(this);
        fileMenu.add(exit);
        optMenu.add(export);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        menuBar.add(optMenu);
        return menuBar;
    }

    private JTabbedPane addTabbedPane() {
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Drużyny", setPanel1());
        tabbedPane.addTab("Sędziowie", setPanel2());
        tabbedPane.addTab("Turnieje", setPanel3());
        tabbedPane.addTab("Tabela wyników", setPanel4());

        return tabbedPane;
    }

    private JPanel setPanel1() {
        JPanel panel1 = new JPanel();
        GridBagLayout layout1 = new GridBagLayout();
        panel1.setLayout(layout1);
        GridBagConstraints c1 = new GridBagConstraints();
        c1.fill = GridBagConstraints.HORIZONTAL;

        newTeam = new JButton("Nowa drużyna");
        deleteTeam = new JButton("Usuń drużynę");
        modifyTeam = new JButton("Modyfikuj drużynę");
        JTextField fieldName = new JTextField();
        JLabel label = new JLabel("Pula drużyn");
        DefaultListModel listModel = new DefaultListModel();
        teamList = new JList(listModel);
        JScrollPane scroll = new JScrollPane(teamList);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        c1.gridx = 0;
        c1.gridy = 0;
        panel1.add(fieldName, c1);
        c1.gridy = 1;
        panel1.add(newTeam, c1);
        c1.gridy = 2;
        panel1.add(deleteTeam, c1);
        c1.gridy = 3;
        panel1.add(modifyTeam, c1);
        c1.gridx = 1;
        c1.gridy = 0;
        panel1.add(label, c1);
        c1.gridy = 1;
        panel1.add(scroll, c1);

        return panel1;
    }

    private JPanel setPanel2() {
        JPanel panel2 = new JPanel();
        GridBagLayout layout2 = new GridBagLayout();
        panel2.setLayout(layout2);
        GridBagConstraints c2 = new GridBagConstraints();
        c2.fill = GridBagConstraints.HORIZONTAL;

        newReferee = new JButton("Nowy sędzia");
        deleteReferee = new JButton("Usuń sędziego");
        modifyReferee = new JButton("Modyfikuj sędziego");
        JTextField fieldFirstName = new JTextField();
        JTextField fieldLastName = new JTextField();
        JLabel label = new JLabel("Lista sędziów");
        DefaultListModel listModel = new DefaultListModel();
        refereeList = new JList(listModel);
        JScrollPane scroll = new JScrollPane(refereeList);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        c2.gridx = 0;
        c2.gridy = 0;
        panel2.add(fieldFirstName, c2);
        c2.gridy = 1;
        panel2.add(fieldLastName, c2);
        c2.gridx = 1;
        c2.gridy = 0;
        panel2.add(newTeam, c2);
        c2.gridy = 1;
        panel2.add(deleteReferee, c2);
        c2.gridy = 2;
        panel2.add(modifyReferee, c2);

        return panel2;
    }

    private JPanel setPanel3() {
        JPanel panel3 = new JPanel();
        GridBagLayout layout3 = new GridBagLayout();
        panel3.setLayout(layout3);
        GridBagConstraints c3 = new GridBagConstraints();
        c3.fill = GridBagConstraints.HORIZONTAL;

        volleyballButton = new JRadioButton("Turniej siatkówki");
        modifyTournament = new JButton("Modyfikuj turniej");
        generateTournament = new JButton("Generuj turniej");
        generateFinals = new JButton("Generuj finały");
        JTextField fieldTeam1 = new JTextField();
        JTextField fieldTeam2 = new JTextField();
        JTextField fieldWinner = new JTextField();
        JTextField fieldScore = new JTextField();
        JTextField fieldReferee = new JTextField();
        JTextField fieldRefereeAssistant1 = new JTextField();
        JTextField fieldRefereeAssistant2 = new JTextField();
        JLabel label = new JLabel("Tabela rozgrywek");
        String[] columnNames1 = {"Drużyna 1", "Drużyna 2", "Zwycięzca", "Wynik", "Sędzia", "Sędzia pomocniczy 1", "Sędzia pomocniczy 2"};
        DefaultTableModel model1 = new DefaultTableModel();
        model1.setColumnIdentifiers(columnNames1);
        table1 = new JTable(model1);
        JScrollPane scroll1 = new JScrollPane(table1);
        scroll1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        String[] columnNames2 = {"Drużyna 1", "Drużyna 2", "Zwycięzca", "Wynik", "Sędzia"};
        DefaultTableModel model2 = new DefaultTableModel();
        model2.setColumnIdentifiers(columnNames2);
        table2 = new JTable(model2);
        JScrollPane scroll2 = new JScrollPane(table2);
        scroll2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        c3.gridx = 0;
        c3.gridy = 0;
        panel3.add(fieldTeam1, c3);
        c3.gridy = 1;
        panel3.add(fieldTeam2, c3);
        c3.gridy = 2;
        panel3.add(fieldWinner, c3);
        c3.gridy = 3;
        panel3.add(fieldScore, c3);
        c3.gridy = 4;
        panel3.add(fieldReferee, c3);
        c3.gridy = 5;
        panel3.add(fieldRefereeAssistant1, c3);
        c3.gridy = 6;
        panel3.add(fieldRefereeAssistant2, c3);
        c3.gridx = 1;
        c3.gridy = 0;
        panel3.add(volleyballButton, c3);
        c3.gridy = 1;
        panel3.add(modifyTournament, c3);
        c3.gridy = 2;
        panel3.add(generateTournament, c3);
        c3.gridy = 3;
        panel3.add(generateFinals, c3);
        c3.gridx = 2;
        c3.gridy = 0;
        panel3.add(label, c3);
        volleyballButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c3.gridx = 2;
                c3.gridy = 1;
                panel3.add(scroll1, c3);
                if(!volleyballButton.isSelected()) {
                    panel3.add(scroll2, c3);
                }
            }
        });

        return panel3;
    }

    private JPanel setPanel4() {
        JPanel panel4 = new JPanel();
        GridBagLayout layout4 = new GridBagLayout();
        panel4.setLayout(layout4);
        GridBagConstraints c4 = new GridBagConstraints();
        c4.fill = GridBagConstraints.CENTER;

        JLabel label = new JLabel("Tabela wyników");
        String[] columnNames = {"Drużyna", "Wynik"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        tableScore = new JTable(model);
        JScrollPane scroll = new JScrollPane(tableScore);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        c4.gridx = 0;
        c4.gridy = 0;
        panel4.add(label, c4);
        c4.gridy = 1;
        panel4.add(scroll, c4);

        return panel4;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("exit".equalsIgnoreCase(e.getActionCommand())) {
            System.exit(0);
        }
    }
}
