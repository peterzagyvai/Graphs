import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

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

        Graph graph;

        public MainPanel() {
            graph = new Graph();
        }

        @Override
        public void paint(Graphics g) {
            Graphics2D g2d = (Graphics2D)g;

            graph.drawGraph(g2d);

        }
    }

    private class ToolsPanel extends JPanel{
        public ToolsPanel() {
            this.setPreferredSize(new Dimension(100,minSize));
        }
    }
}

