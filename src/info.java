import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Tue Feb 21 09:51:15 CST 2023
 */



/**
 * @author SXL601020
 */
public class info extends JFrame {
    public info() {
        initComponents();
    }

    public void settext(String str){label1.setText(str);}

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();

        //======== this ========
        setTitle("\u6d88\u606f");
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("text");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(label1);
        label1.setBounds(15, 5, 220, 50);

        contentPane.setPreferredSize(new Dimension(250, 105));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
