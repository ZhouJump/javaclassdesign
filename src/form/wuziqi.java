/*
 * Created by JFormDesigner on Mon Feb 20 08:59:12 CST 2023
 */

package form;

import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class wuziqi extends JFrame {
    public wuziqi() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        qipan1 = new JTextField();
        qipan2 = new JTextField();
        qipan3 = new JTextField();
        qipan4 = new JTextField();
        qipan5 = new JTextField();
        qipan6 = new JTextField();
        qipan7 = new JTextField();
        qipan8 = new JTextField();
        qipan9 = new JTextField();
        qipan10 = new JTextField();
        qipan11 = new JTextField();
        qipan12 = new JTextField();
        qipan13 = new JTextField();
        qipan14 = new JTextField();
        qipan15 = new JTextField();
        qipan16 = new JTextField();
        qipan17 = new JTextField();
        qipan18 = new JTextField();
        qipan19 = new JTextField();
        qipan20 = new JTextField();
        qipan = new JButton();
        restart = new JButton();
        undo = new JButton();
        player = new JLabel();
        panetext = new JLabel();
        pane = new JButton();

        //======== this ========
        setTitle("\u4e94\u5b50\u68cb");
        setResizable(false);
        setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- qipan1 ----
        qipan1.setEditable(false);
        qipan1.setEnabled(false);
        contentPane.add(qipan1);
        qipan1.setBounds(15, 15, 30, 30);

        //---- qipan2 ----
        qipan2.setEditable(false);
        qipan2.setEnabled(false);
        contentPane.add(qipan2);
        qipan2.setBounds(40, 15, 30, 30);

        //---- qipan3 ----
        qipan3.setEditable(false);
        qipan3.setEnabled(false);
        contentPane.add(qipan3);
        qipan3.setBounds(65, 15, 30, qipan3.getPreferredSize().height);

        //---- qipan4 ----
        qipan4.setEditable(false);
        qipan4.setEnabled(false);
        contentPane.add(qipan4);
        qipan4.setBounds(90, 15, 30, 30);

        //---- qipan5 ----
        qipan5.setEditable(false);
        qipan5.setEnabled(false);
        contentPane.add(qipan5);
        qipan5.setBounds(115, 15, 30, 30);

        //---- qipan6 ----
        qipan6.setEditable(false);
        qipan6.setEnabled(false);
        contentPane.add(qipan6);
        qipan6.setBounds(140, 15, 30, 30);

        //---- qipan7 ----
        qipan7.setEditable(false);
        qipan7.setEnabled(false);
        contentPane.add(qipan7);
        qipan7.setBounds(165, 15, 30, 30);

        //---- qipan8 ----
        qipan8.setEditable(false);
        qipan8.setEnabled(false);
        contentPane.add(qipan8);
        qipan8.setBounds(190, 15, 30, 30);

        //---- qipan9 ----
        qipan9.setEditable(false);
        qipan9.setEnabled(false);
        contentPane.add(qipan9);
        qipan9.setBounds(215, 15, 30, 30);

        //---- qipan10 ----
        qipan10.setEditable(false);
        qipan10.setEnabled(false);
        contentPane.add(qipan10);
        qipan10.setBounds(240, 15, 30, 30);

        //---- qipan11 ----
        qipan11.setEditable(false);
        qipan11.setEnabled(false);
        contentPane.add(qipan11);
        qipan11.setBounds(265, 15, 30, 30);

        //---- qipan12 ----
        qipan12.setEditable(false);
        qipan12.setEnabled(false);
        contentPane.add(qipan12);
        qipan12.setBounds(290, 15, 30, 30);

        //---- qipan13 ----
        qipan13.setEditable(false);
        qipan13.setEnabled(false);
        contentPane.add(qipan13);
        qipan13.setBounds(315, 15, 30, 30);

        //---- qipan14 ----
        qipan14.setEditable(false);
        qipan14.setEnabled(false);
        contentPane.add(qipan14);
        qipan14.setBounds(340, 15, 30, 30);

        //---- qipan15 ----
        qipan15.setEditable(false);
        qipan15.setEnabled(false);
        contentPane.add(qipan15);
        qipan15.setBounds(365, 15, 30, 30);

        //---- qipan16 ----
        qipan16.setEditable(false);
        qipan16.setEnabled(false);
        contentPane.add(qipan16);
        qipan16.setBounds(390, 15, 30, 30);

        //---- qipan17 ----
        qipan17.setEditable(false);
        qipan17.setEnabled(false);
        contentPane.add(qipan17);
        qipan17.setBounds(415, 15, 30, 30);

        //---- qipan18 ----
        qipan18.setEditable(false);
        qipan18.setEnabled(false);
        contentPane.add(qipan18);
        qipan18.setBounds(440, 15, 30, 30);

        //---- qipan19 ----
        qipan19.setEditable(false);
        qipan19.setEnabled(false);
        contentPane.add(qipan19);
        qipan19.setBounds(465, 15, 30, 30);

        //---- qipan20 ----
        qipan20.setEditable(false);
        qipan20.setEnabled(false);
        contentPane.add(qipan20);
        qipan20.setBounds(490, 15, 30, 30);

        //---- qipan ----
        qipan.setEnabled(false);
        contentPane.add(qipan);
        qipan.setBounds(5, 5, 525, 525);

        //---- restart ----
        restart.setText("\u91cd\u65b0\u5f00\u59cb");
        contentPane.add(restart);
        restart.setBounds(530, 5, 120, 40);

        //---- undo ----
        undo.setText("\u6094\u68cb");
        contentPane.add(undo);
        undo.setBounds(530, 50, 120, 40);

        //---- player ----
        player.setText("\u25cf");
        player.setFont(player.getFont().deriveFont(player.getFont().getSize() + 50f));
        player.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(player);
        player.setBounds(555, 95, 70, 65);

        //---- panetext ----
        panetext.setText("\u8bf7\u843d\u5b50");
        panetext.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(panetext);
        panetext.setBounds(555, 160, 70, 30);

        //---- pane ----
        pane.setEnabled(false);
        contentPane.add(pane);
        pane.setBounds(530, 95, 120, 100);

        contentPane.setPreferredSize(new Dimension(660, 570));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JTextField qipan1;
    private JTextField qipan2;
    private JTextField qipan3;
    private JTextField qipan4;
    private JTextField qipan5;
    private JTextField qipan6;
    private JTextField qipan7;
    private JTextField qipan8;
    private JTextField qipan9;
    private JTextField qipan10;
    private JTextField qipan11;
    private JTextField qipan12;
    private JTextField qipan13;
    private JTextField qipan14;
    private JTextField qipan15;
    private JTextField qipan16;
    private JTextField qipan17;
    private JTextField qipan18;
    private JTextField qipan19;
    private JTextField qipan20;
    private JButton qipan;
    private JButton restart;
    private JButton undo;
    private JLabel player;
    private JLabel panetext;
    private JButton pane;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
