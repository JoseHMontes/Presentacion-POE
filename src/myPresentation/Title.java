package myPresentation;

import javax.swing.*;
import java.awt.*;

public class Title extends JLabel {
    public Title (String title, Color backgroundColor){
        this.setText(title);
        this.setBackground(backgroundColor);
        this.setForeground(Color.orange); //Color
        this.setFont(new Font ("Calibre", Font.BOLD+ Font.ITALIC,24));
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setOpaque(true);
    }

}
