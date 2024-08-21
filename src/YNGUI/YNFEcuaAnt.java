package YNGUI;

import YNBL.YNCarnivoro;
import YNBL.YNGenoAlimento;
import YNBL.YNHerbivoro;
import YNBL.YNIngestaNativa;
import YNBL.YNInsectivoro;
import YNBL.YNNectavivoro;
import YNBL.YNOmnivoro;
import YNBL.YNX;
import YNBL.YNXX;
import YNBL.YNXY;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class YNFEcuaAnt extends JFrame {

    // constructor
    public YNFEcuaAnt() {
        customerControls();
    }

    private void customerControls() {

        setTitle("YNEcuaAnt 2K24A");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new BorderLayout());

        // Cargar la imagen original
        ImageIcon originalIcon = new ImageIcon("src\\YNGUI\\YNRES\\ynicono.jpg");

        // Redimensionar la imagen al tamaño deseado (por ejemplo, 100x100 píxeles)
        Image scaledImage = originalIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

        // Crear un nuevo ImageIcon con la imagen redimensionada
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        // Crear el JLabel con la imagen redimensionada
        JLabel imgLabel = new JLabel(scaledIcon);

        JLabel titleLabel = new JLabel("Hormiguero virtual", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));

        topPanel.add(imgLabel, BorderLayout.NORTH);
        topPanel.add(titleLabel, BorderLayout.SOUTH);

        // Panel para la grilla
        String[] columnNames = { "RegNro", "Tipo Hormiga", "Ubicacion", "Sexo", " Ingesta Nativa", "Geno Alimento",
                " Estado" };
        Object[][] data = new Object[8][7];
        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);

        // Panel para los combos
        JPanel comboPanel = new JPanel();
        // String[] genoOptions = { "X", "XX", "XY" };
        // JComboBox<String> genoCombo = new JComboBox<>( );
        ArrayList<YNGenoAlimento> lstYNGenoAlimento = new ArrayList<>();
        lstYNGenoAlimento.add(new YNX());
        lstYNGenoAlimento.add(new YNXX());
        lstYNGenoAlimento.add(new YNXY());

        JComboBox<YNGenoAlimento> genoCombo = new JComboBox<>(lstYNGenoAlimento.toArray(new YNGenoAlimento[0]));

        // String[] ingestaOptions = { "Carnivoro", "Herbivoro", "Omnivoro",
        // "Insectivoro", "Nectarivoros" };
        // JComboBox<String> ingestaCombo = new JComboBox<>(ingestaOptions);

        ArrayList<YNIngestaNativa> lstYNIngestaNativa = new ArrayList<>();
        lstYNIngestaNativa.add(new YNCarnivoro());
        lstYNIngestaNativa.add(new YNOmnivoro());
        lstYNIngestaNativa.add(new YNHerbivoro());
        lstYNIngestaNativa.add(new YNNectavivoro());
        lstYNIngestaNativa.add(new YNInsectivoro());

        JComboBox<YNIngestaNativa> ingestaCombo = new JComboBox<>(lstYNIngestaNativa.toArray(new YNIngestaNativa[0]));

        comboPanel.add(genoCombo);
        comboPanel.add(ingestaCombo);

        // Panel para los botones

        JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 5, 5));
        JButton createButton = new JButton("Crear Larva");
        JButton feedButton = new JButton("Alimentar");
        JButton deleteButton = new JButton("Eliminar");
        JButton saveButton = new JButton("Guardar");
        buttonPanel.add(createButton);
        buttonPanel.add(feedButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(saveButton);

        // Panel combinado para los combos y botones

        JPanel comboButtonPanel = new JPanel(new BorderLayout());
        comboButtonPanel.add(comboPanel, BorderLayout.NORTH);
        comboButtonPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Panel principal que contiene la tabla y el panel de control ( combos y
        // botones)
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(comboButtonPanel, BorderLayout.SOUTH);

        // Barra de estado en la parte inferios con separaciones
        JPanel statusBar = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel programLabel = new JLabel("Programacion II");
        JLabel cedulaLabel = new JLabel("Cedula: 1727495622");
        JLabel nameLabel = new JLabel("Nombres: Niurka Yupanqui Valente");

        statusBar.add(programLabel);
        statusBar.add(new JLabel("|"));
        statusBar.add(cedulaLabel);
        statusBar.add(new JLabel("|"));
        statusBar.add(nameLabel);

        // Anadir los paneles al frame principal
        add(topPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
        add(statusBar, BorderLayout.PAGE_END);

        // mostrar la ventana
        setVisible(true);

    }

}
