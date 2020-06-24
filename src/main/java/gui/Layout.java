package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Layout extends JFrame implements ActionListener {
    private JFrame frame;

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
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.ALT_MASK));
        exit.addActionListener(this);
        fileMenu.add(exit);

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

        JButton newTeam = new JButton("Nowa drużyna");
        JButton deleteTeam = new JButton("Usuń drużynę");
        JButton reportTeam = new JButton("Zgłoś drużynę");
        JButton retreatTeam = new JButton("Wycofaj drużynę");
        JLabel pool = new JLabel("Pula drużyn");
        JLabel reported = new JLabel("Grające drużyny");

        DefaultListModel listModel1 = new DefaultListModel();
        JList list1 = new JList(listModel1);
        JScrollPane scroll1 = new JScrollPane(list1);
        scroll1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        DefaultListModel listModel2 = new DefaultListModel();
        JList list2 = new JList(listModel2);
        JScrollPane scroll2 = new JScrollPane(list2);
        scroll2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        c1.gridx = 0;
        c1.gridy = 0;
        panel1.add(newTeam, c1);

        c1.gridy = 1;
        panel1.add(deleteTeam, c1);

        c1.gridy = 2;
        panel1.add(reportTeam, c1);

        c1.gridy = 3;
        panel1.add(retreatTeam, c1);

        c1.gridx = 1;
        c1.gridy = 0;
        panel1.add(pool, c1);
        c1.gridy = 1;
        panel1.add(scroll1, c1);

        c1.gridx = 2;
        c1.gridy = 0;
        panel1.add(reported, c1);
        c1.gridy = 1;
        panel1.add(scroll2, c1);

        return panel1;
    }

    private JPanel setPanel2() {
        JPanel panel2 = new JPanel();
        GridBagLayout layout2 = new GridBagLayout();
        panel2.setLayout(layout2);
        GridBagConstraints c2 = new GridBagConstraints();
        c2.fill = GridBagConstraints.HORIZONTAL;

        JButton newReferee = new JButton("Nowy sędzia");
        JButton deleteReferee = new JButton("Usuń sędziego");
        JButton modifyReferee = new JButton("Modyfikuj sędziego");
        JLabel refereeList = new JLabel("Lista sędziów");

        DefaultListModel listModel = new DefaultListModel();
        JList list = new JList(listModel);
        JScrollPane scroll = new JScrollPane(list);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        c2.gridx = 0;
        c2.gridy = 0;
        panel2.add(newReferee, c2);

        c2.gridy = 1;
        panel2.add(deleteReferee, c2);

        c2.gridy = 2;
        panel2.add(modifyReferee, c2);

        c2.gridx = 1;
        c2.gridy = 0;
        panel2.add(list, c2);
        c2.gridy = 1;
        panel2.add(scroll, c2);

        return panel2;
    }

    private JPanel setPanel3() {
        JPanel panel3 = new JPanel();
        GridBagLayout layout3 = new GridBagLayout();
        panel3.setLayout(layout3);
        GridBagConstraints c3 = new GridBagConstraints();
        c3.fill = GridBagConstraints.HORIZONTAL;

        JRadioButton volleyballButton = new JRadioButton("Turniej siatkówki");
        JButton modifyTournament = new JButton("Modyfikuj turniej");
        JButton generateTournament = new JButton("Generuj turniej");
        JButton generateFinals = new JButton("Generuj finały");
        JLabel label = new JLabel("Tabela rozgrywek");
        String[] columnNames1 = {"Drużyna 1", "Drużyna 2", "Zwycięzca", "Wynik", "Sędzia", "Sędzia pomocniczy 1", "Sędzia pomocniczy 2"};
        JTable table1 = new JTable(new DefaultTableModel(null, columnNames1));
        JScrollPane scroll1 = new JScrollPane(table1);
        scroll1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        String[] columnNames2 = {"Drużyna 1", "Drużyna 2", "Zwycięzca", "Wynik", "Sędzia"};
        JTable table2 = new JTable(new DefaultTableModel(null, columnNames2));
        JScrollPane scroll2 = new JScrollPane(table2);
        scroll2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        c3.gridx = 0;
        c3.gridy = 0;
        panel3.add(volleyballButton, c3);

        c3.gridy = 1;
        panel3.add(modifyTournament, c3);

        c3.gridy = 2;
        panel3.add(generateTournament, c3);

        c3.gridy = 3;
        panel3.add(generateFinals, c3);

        c3.gridx = 1;
        c3.gridy = 0;
        panel3.add(label, c3);
        c3.gridy = 1;
        if(volleyballButton.isSelected()) {
            panel3.add(scroll1, c3);
        } else {
            panel3.add(scroll2, c3);
        }

        return panel3;
    }

    private JPanel setPanel4() {
        JPanel panel4 = new JPanel();
        GridBagLayout layout4 = new GridBagLayout();
        panel4.setLayout(layout4);
        GridBagConstraints c4 = new GridBagConstraints();
        c4.fill = GridBagConstraints.CENTER;

        JLabel label = new JLabel("Tabela wyników");
        String[] columns = {"Drużyna", "Wynik"};
        JTable table = new JTable(new DefaultTableModel(null, columns));
        JScrollPane scroll = new JScrollPane(table);
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
