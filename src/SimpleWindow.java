import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleWindow extends JFrame {
    SimpleWindow(){
        super("test");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new JMenuItem("new"));
        fileMenu.add(new JMenuItem("Open", new ImageIcon("C:\\Users\\1\\Desktop\\Pictures\\icons\\1492790860-8check_84164.png")));
        fileMenu.addSeparator();

        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        fileMenu.add(exit);

        JMenu editMenu = new JMenu("Edit");
        editMenu.add(new JMenuItem("Copy"));
        JMenu pastMenu = new JMenu("Put");
        pastMenu.add(new JMenuItem("From file..."));
        pastMenu.add(new JMenuItem("From buffer"));
        editMenu.add(pastMenu);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(new JLabel(new ImageIcon("C:\\Users\\1\\Desktop\\Pictures\\icons\\sign-check-icon_34365.png")));
        setJMenuBar(menuBar);
        setSize(250, 150);
    }
}
