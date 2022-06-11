import javax.swing.*;
import javax.swing.border.Border;
import javax.tools.Tool;
import java.awt.*;

public class Display extends JFrame {

    int minSize = 400;

    MainPanel mainPanel = new MainPanel();
    ToolsPanel toolsPanel = new ToolsPanel();
    public Display(int width, int height) {
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setMinimumSize(new Dimension(minSize,minSize));

        toolsPanel.setBackground(Color.BLACK);
        mainPanel.setBackground(Color.RED);

        this.add(toolsPanel, BorderLayout.WEST);
        this.add(mainPanel, BorderLayout.CENTER);

        this.setVisible(true);
    }



    private class MainPanel extends JPanel{
        public MainPanel() {
        }
    }

    private class ToolsPanel extends JPanel{
        public ToolsPanel() {
            this.setPreferredSize(new Dimension(100,minSize));
        }
    }
}

