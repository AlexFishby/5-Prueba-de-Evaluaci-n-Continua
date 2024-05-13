import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Vista extends JFrame {
    private MediaControlador controlador;
    private JButton displayButton;
    private int currentIndex = 0;

    public Vista(MediaControlador controlador) {
        this.controlador = controlador;
        this.displayButton = new JButton("Display Media");
        this.displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.displayMedia(currentIndex);
                currentIndex = (currentIndex + 1) % controlador.getMediaItemCount();
            }
        });
        this.add(displayButton);
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void display() {
        this.setVisible(true);
    }
}