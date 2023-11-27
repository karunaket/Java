import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageDisplay extends JFrame {

    private JLabel imageLabel;

    public ImageDisplay() {
      setTitle("Image Display");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(600, 400);
      setLocationRelativeTo(null);

      imageLabel = new JLabel();
      add(imageLabel);

      displayImage("F:\\Java\\LearningJava\\New\\Image\\image.jpg");
    }

    private void displayImage(String imagePath) {
        try {
            BufferedImage img = ImageIO.read(new File(imagePath));
            ImageIcon imageIcon = new ImageIcon(img);
            imageLabel.setIcon(imageIcon);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ImageDisplay imageDisplay = new ImageDisplay();
            imageDisplay.setVisible(true);
        });
    }
}