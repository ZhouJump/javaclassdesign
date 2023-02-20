/*
 * Created by JFormDesigner on Mon Feb 20 08:59:12 CST 2023
 */

import sun.applet.Main;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;

/**
 * @author unknown
 */
public class wuziqi extends JFrame {
    qipan qipan = new qipan();
    public wuziqi() {
        initComponents();

    }
    private void padMouseClicked(MouseEvent e) {
        int x = e.getX()/25;int y = e.getY()/25;
        qipan.luozi(x,y);
        if(qipan.getPlayer()==1)
        {
            player.setText("●");
            Graphics g = getGraphics();
            g.setColor(new Color(187,187,187));
            g.fillOval(x*25 + 10,y*25 + 35,20,20);
            g.setColor(new Color(87,88,89));
            g.drawOval(x*25 + 10,y*25 +35,20,20);
        }
        else
        {
            player.setText("○");
            Graphics g = getGraphics();
            g.setColor(new Color(48,50,52));
            g.fillOval(x*25 + 10,y*25 + 35,20,20);
            g.setColor(new Color(87,88,89));
            g.drawOval(x*25 + 10,y*25 +35,20,20);
        }
        if(qipan.panduan() == 1) {
            info baiwin = new info();
            baiwin.settext("恭喜小白子赢了");
            baiwin.setVisible(true);}
        else if(qipan.panduan() == 2) {
            info baiwin = new info();
            baiwin.settext("恭喜小黑子赢了");
            baiwin.setVisible(true);}
        }

        // TODO add your code here


    private void restartMouseClicked(MouseEvent e) {

        new wuziqi().setVisible(true);
        this.dispose();
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        pad = new JButton();
        panel1 = new JPanel();
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
        qipan21 = new JTextField();
        qipan22 = new JTextField();
        qipan23 = new JTextField();
        qipan24 = new JTextField();
        qipan25 = new JTextField();
        qipan26 = new JTextField();
        qipan27 = new JTextField();
        qipan28 = new JTextField();
        qipan29 = new JTextField();
        qipan30 = new JTextField();
        qipan31 = new JTextField();
        qipan32 = new JTextField();
        qipan33 = new JTextField();
        qipan34 = new JTextField();
        qipan35 = new JTextField();
        qipan36 = new JTextField();
        qipan37 = new JTextField();
        qipan38 = new JTextField();
        qipan39 = new JTextField();
        qipan40 = new JTextField();
        qipan41 = new JTextField();
        qipan42 = new JTextField();
        qipan43 = new JTextField();
        qipan44 = new JTextField();
        qipan45 = new JTextField();
        qipan46 = new JTextField();
        qipan47 = new JTextField();
        qipan48 = new JTextField();
        qipan49 = new JTextField();
        qipan50 = new JTextField();
        qipan51 = new JTextField();
        qipan52 = new JTextField();
        qipan53 = new JTextField();
        qipan54 = new JTextField();
        qipan55 = new JTextField();
        qipan56 = new JTextField();
        qipan57 = new JTextField();
        qipan58 = new JTextField();
        qipan59 = new JTextField();
        qipan60 = new JTextField();
        qipan61 = new JTextField();
        qipan62 = new JTextField();
        qipan63 = new JTextField();
        qipan64 = new JTextField();
        qipan65 = new JTextField();
        qipan66 = new JTextField();
        qipan67 = new JTextField();
        qipan68 = new JTextField();
        qipan69 = new JTextField();
        qipan70 = new JTextField();
        qipan71 = new JTextField();
        qipan72 = new JTextField();
        qipan73 = new JTextField();
        qipan74 = new JTextField();
        qipan75 = new JTextField();
        qipan76 = new JTextField();
        qipan77 = new JTextField();
        qipan78 = new JTextField();
        qipan79 = new JTextField();
        qipan80 = new JTextField();
        qipan81 = new JTextField();
        qipan82 = new JTextField();
        qipan83 = new JTextField();
        qipan84 = new JTextField();
        qipan85 = new JTextField();
        qipan86 = new JTextField();
        qipan87 = new JTextField();
        qipan88 = new JTextField();
        qipan89 = new JTextField();
        qipan90 = new JTextField();
        qipan91 = new JTextField();
        qipan92 = new JTextField();
        qipan93 = new JTextField();
        qipan94 = new JTextField();
        qipan95 = new JTextField();
        qipan96 = new JTextField();
        qipan97 = new JTextField();
        qipan98 = new JTextField();
        qipan99 = new JTextField();
        qipan100 = new JTextField();
        qipan101 = new JTextField();
        qipan102 = new JTextField();
        qipan103 = new JTextField();
        qipan104 = new JTextField();
        qipan105 = new JTextField();
        qipan106 = new JTextField();
        qipan107 = new JTextField();
        qipan108 = new JTextField();
        qipan109 = new JTextField();
        qipan110 = new JTextField();
        qipan111 = new JTextField();
        qipan112 = new JTextField();
        qipan113 = new JTextField();
        qipan114 = new JTextField();
        qipan115 = new JTextField();
        qipan116 = new JTextField();
        qipan117 = new JTextField();
        qipan118 = new JTextField();
        qipan119 = new JTextField();
        qipan120 = new JTextField();
        qipan121 = new JTextField();
        qipan122 = new JTextField();
        qipan123 = new JTextField();
        qipan124 = new JTextField();
        qipan125 = new JTextField();
        qipan126 = new JTextField();
        qipan127 = new JTextField();
        qipan128 = new JTextField();
        qipan129 = new JTextField();
        qipan130 = new JTextField();
        qipan131 = new JTextField();
        qipan132 = new JTextField();
        qipan133 = new JTextField();
        qipan134 = new JTextField();
        qipan135 = new JTextField();
        qipan136 = new JTextField();
        qipan137 = new JTextField();
        qipan138 = new JTextField();
        qipan139 = new JTextField();
        qipan140 = new JTextField();
        qipan141 = new JTextField();
        qipan142 = new JTextField();
        qipan143 = new JTextField();
        qipan144 = new JTextField();
        qipan145 = new JTextField();
        qipan146 = new JTextField();
        qipan147 = new JTextField();
        qipan148 = new JTextField();
        qipan149 = new JTextField();
        qipan150 = new JTextField();
        qipan151 = new JTextField();
        qipan152 = new JTextField();
        qipan153 = new JTextField();
        qipan154 = new JTextField();
        qipan155 = new JTextField();
        qipan156 = new JTextField();
        qipan157 = new JTextField();
        qipan158 = new JTextField();
        qipan159 = new JTextField();
        qipan160 = new JTextField();
        qipan161 = new JTextField();
        qipan162 = new JTextField();
        qipan163 = new JTextField();
        qipan164 = new JTextField();
        qipan165 = new JTextField();
        qipan166 = new JTextField();
        qipan167 = new JTextField();
        qipan168 = new JTextField();
        qipan169 = new JTextField();
        qipan170 = new JTextField();
        qipan171 = new JTextField();
        qipan172 = new JTextField();
        qipan173 = new JTextField();
        qipan174 = new JTextField();
        qipan175 = new JTextField();
        qipan176 = new JTextField();
        qipan177 = new JTextField();
        qipan178 = new JTextField();
        qipan179 = new JTextField();
        qipan180 = new JTextField();
        qipan181 = new JTextField();
        qipan182 = new JTextField();
        qipan183 = new JTextField();
        qipan184 = new JTextField();
        qipan185 = new JTextField();
        qipan186 = new JTextField();
        qipan187 = new JTextField();
        qipan188 = new JTextField();
        qipan189 = new JTextField();
        qipan190 = new JTextField();
        qipan191 = new JTextField();
        qipan192 = new JTextField();
        qipan193 = new JTextField();
        qipan194 = new JTextField();
        qipan195 = new JTextField();
        qipan196 = new JTextField();
        qipan197 = new JTextField();
        qipan198 = new JTextField();
        qipan199 = new JTextField();
        qipan200 = new JTextField();
        qipan201 = new JTextField();
        qipan202 = new JTextField();
        qipan203 = new JTextField();
        qipan204 = new JTextField();
        qipan205 = new JTextField();
        qipan206 = new JTextField();
        qipan207 = new JTextField();
        qipan208 = new JTextField();
        qipan209 = new JTextField();
        qipan210 = new JTextField();
        qipan211 = new JTextField();
        qipan212 = new JTextField();
        qipan213 = new JTextField();
        qipan214 = new JTextField();
        qipan215 = new JTextField();
        qipan216 = new JTextField();
        qipan217 = new JTextField();
        qipan218 = new JTextField();
        qipan219 = new JTextField();
        qipan220 = new JTextField();
        qipan221 = new JTextField();
        qipan222 = new JTextField();
        qipan223 = new JTextField();
        qipan224 = new JTextField();
        qipan225 = new JTextField();
        qipan226 = new JTextField();
        qipan227 = new JTextField();
        qipan228 = new JTextField();
        qipan229 = new JTextField();
        qipan230 = new JTextField();
        qipan231 = new JTextField();
        qipan232 = new JTextField();
        qipan233 = new JTextField();
        qipan234 = new JTextField();
        qipan235 = new JTextField();
        qipan236 = new JTextField();
        qipan237 = new JTextField();
        qipan238 = new JTextField();
        qipan239 = new JTextField();
        qipan240 = new JTextField();
        qipan241 = new JTextField();
        qipan242 = new JTextField();
        qipan243 = new JTextField();
        qipan244 = new JTextField();
        qipan245 = new JTextField();
        qipan246 = new JTextField();
        qipan247 = new JTextField();
        qipan248 = new JTextField();
        qipan249 = new JTextField();
        qipan250 = new JTextField();
        qipan251 = new JTextField();
        qipan252 = new JTextField();
        qipan253 = new JTextField();
        qipan254 = new JTextField();
        qipan255 = new JTextField();
        qipan256 = new JTextField();
        qipan257 = new JTextField();
        qipan258 = new JTextField();
        qipan259 = new JTextField();
        qipan260 = new JTextField();
        qipan261 = new JTextField();
        qipan262 = new JTextField();
        qipan263 = new JTextField();
        qipan264 = new JTextField();
        qipan265 = new JTextField();
        qipan266 = new JTextField();
        qipan267 = new JTextField();
        qipan268 = new JTextField();
        qipan269 = new JTextField();
        qipan270 = new JTextField();
        qipan271 = new JTextField();
        qipan272 = new JTextField();
        qipan273 = new JTextField();
        qipan274 = new JTextField();
        qipan275 = new JTextField();
        qipan276 = new JTextField();
        qipan277 = new JTextField();
        qipan278 = new JTextField();
        qipan279 = new JTextField();
        qipan280 = new JTextField();
        qipan281 = new JTextField();
        qipan282 = new JTextField();
        qipan283 = new JTextField();
        qipan284 = new JTextField();
        qipan285 = new JTextField();
        qipan286 = new JTextField();
        qipan287 = new JTextField();
        qipan288 = new JTextField();
        qipan289 = new JTextField();
        qipan290 = new JTextField();
        qipan291 = new JTextField();
        qipan292 = new JTextField();
        qipan293 = new JTextField();
        qipan294 = new JTextField();
        qipan295 = new JTextField();
        qipan296 = new JTextField();
        qipan297 = new JTextField();
        qipan298 = new JTextField();
        qipan299 = new JTextField();
        qipan300 = new JTextField();
        qipan301 = new JTextField();
        qipan302 = new JTextField();
        qipan303 = new JTextField();
        qipan304 = new JTextField();
        qipan305 = new JTextField();
        qipan306 = new JTextField();
        qipan307 = new JTextField();
        qipan308 = new JTextField();
        qipan309 = new JTextField();
        qipan310 = new JTextField();
        qipan311 = new JTextField();
        qipan312 = new JTextField();
        qipan313 = new JTextField();
        qipan314 = new JTextField();
        qipan315 = new JTextField();
        qipan316 = new JTextField();
        qipan317 = new JTextField();
        qipan318 = new JTextField();
        qipan319 = new JTextField();
        qipan320 = new JTextField();
        qipan321 = new JTextField();
        qipan322 = new JTextField();
        qipan323 = new JTextField();
        qipan324 = new JTextField();
        qipan0 = new JButton();
        restart = new JButton();
        undo = new JButton();
        player = new JLabel();
        panetext = new JLabel();
        pane = new JButton();

        //======== this ========
        setTitle("\u4e94\u5b50\u68cb");
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- pad ----
        pad.setEnabled(false);
        pad.setOpaque(false);
        pad.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                padMouseClicked(e);
            }
        });
        contentPane.add(pad);
        pad.setBounds(5, 5, 475, 470);

        //======== panel1 ========
        {
            panel1.setLayout(null);

            //---- qipan1 ----
            qipan1.setEditable(false);
            qipan1.setEnabled(false);
            qipan1.setHorizontalAlignment(SwingConstants.CENTER);
            qipan1.setFont(qipan1.getFont().deriveFont(qipan1.getFont().getSize() + 12f));
            panel1.add(qipan1);
            qipan1.setBounds(0, 0, 30, 30);

            //---- qipan2 ----
            qipan2.setEditable(false);
            qipan2.setEnabled(false);
            qipan2.setHorizontalAlignment(SwingConstants.CENTER);
            qipan2.setFont(qipan2.getFont().deriveFont(qipan2.getFont().getSize() + 12f));
            panel1.add(qipan2);
            qipan2.setBounds(25, 0, 30, 30);

            //---- qipan3 ----
            qipan3.setEditable(false);
            qipan3.setEnabled(false);
            qipan3.setHorizontalAlignment(SwingConstants.CENTER);
            qipan3.setFont(qipan3.getFont().deriveFont(qipan3.getFont().getSize() + 12f));
            panel1.add(qipan3);
            qipan3.setBounds(50, 0, 30, 30);

            //---- qipan4 ----
            qipan4.setEditable(false);
            qipan4.setEnabled(false);
            qipan4.setHorizontalAlignment(SwingConstants.CENTER);
            qipan4.setFont(qipan4.getFont().deriveFont(qipan4.getFont().getSize() + 12f));
            panel1.add(qipan4);
            qipan4.setBounds(75, 0, 30, 30);

            //---- qipan5 ----
            qipan5.setEditable(false);
            qipan5.setEnabled(false);
            qipan5.setHorizontalAlignment(SwingConstants.CENTER);
            qipan5.setFont(qipan5.getFont().deriveFont(qipan5.getFont().getSize() + 12f));
            panel1.add(qipan5);
            qipan5.setBounds(100, 0, 30, 30);

            //---- qipan6 ----
            qipan6.setEditable(false);
            qipan6.setEnabled(false);
            qipan6.setHorizontalAlignment(SwingConstants.CENTER);
            qipan6.setFont(qipan6.getFont().deriveFont(qipan6.getFont().getSize() + 12f));
            panel1.add(qipan6);
            qipan6.setBounds(125, 0, 30, 30);

            //---- qipan7 ----
            qipan7.setEditable(false);
            qipan7.setEnabled(false);
            qipan7.setHorizontalAlignment(SwingConstants.CENTER);
            qipan7.setFont(qipan7.getFont().deriveFont(qipan7.getFont().getSize() + 12f));
            panel1.add(qipan7);
            qipan7.setBounds(150, 0, 30, 30);

            //---- qipan8 ----
            qipan8.setEditable(false);
            qipan8.setEnabled(false);
            qipan8.setHorizontalAlignment(SwingConstants.CENTER);
            qipan8.setFont(qipan8.getFont().deriveFont(qipan8.getFont().getSize() + 12f));
            panel1.add(qipan8);
            qipan8.setBounds(175, 0, 30, 30);

            //---- qipan9 ----
            qipan9.setEditable(false);
            qipan9.setEnabled(false);
            qipan9.setHorizontalAlignment(SwingConstants.CENTER);
            qipan9.setFont(qipan9.getFont().deriveFont(qipan9.getFont().getSize() + 12f));
            panel1.add(qipan9);
            qipan9.setBounds(200, 0, 30, 30);

            //---- qipan10 ----
            qipan10.setEditable(false);
            qipan10.setEnabled(false);
            qipan10.setHorizontalAlignment(SwingConstants.CENTER);
            qipan10.setFont(qipan10.getFont().deriveFont(qipan10.getFont().getSize() + 12f));
            panel1.add(qipan10);
            qipan10.setBounds(225, 0, 30, 30);

            //---- qipan11 ----
            qipan11.setEditable(false);
            qipan11.setEnabled(false);
            qipan11.setHorizontalAlignment(SwingConstants.CENTER);
            qipan11.setFont(qipan11.getFont().deriveFont(qipan11.getFont().getSize() + 12f));
            panel1.add(qipan11);
            qipan11.setBounds(250, 0, 30, 30);

            //---- qipan12 ----
            qipan12.setEditable(false);
            qipan12.setEnabled(false);
            qipan12.setHorizontalAlignment(SwingConstants.CENTER);
            qipan12.setFont(qipan12.getFont().deriveFont(qipan12.getFont().getSize() + 12f));
            panel1.add(qipan12);
            qipan12.setBounds(275, 0, 30, 30);

            //---- qipan13 ----
            qipan13.setEditable(false);
            qipan13.setEnabled(false);
            qipan13.setHorizontalAlignment(SwingConstants.CENTER);
            qipan13.setFont(qipan13.getFont().deriveFont(qipan13.getFont().getSize() + 12f));
            panel1.add(qipan13);
            qipan13.setBounds(300, 0, 30, 30);

            //---- qipan14 ----
            qipan14.setEditable(false);
            qipan14.setEnabled(false);
            qipan14.setHorizontalAlignment(SwingConstants.CENTER);
            qipan14.setFont(qipan14.getFont().deriveFont(qipan14.getFont().getSize() + 12f));
            panel1.add(qipan14);
            qipan14.setBounds(325, 0, 30, 30);

            //---- qipan15 ----
            qipan15.setEditable(false);
            qipan15.setEnabled(false);
            qipan15.setHorizontalAlignment(SwingConstants.CENTER);
            qipan15.setFont(qipan15.getFont().deriveFont(qipan15.getFont().getSize() + 12f));
            panel1.add(qipan15);
            qipan15.setBounds(350, 0, 30, 30);

            //---- qipan16 ----
            qipan16.setEditable(false);
            qipan16.setEnabled(false);
            qipan16.setHorizontalAlignment(SwingConstants.CENTER);
            qipan16.setFont(qipan16.getFont().deriveFont(qipan16.getFont().getSize() + 12f));
            panel1.add(qipan16);
            qipan16.setBounds(375, 0, 30, 30);

            //---- qipan17 ----
            qipan17.setEditable(false);
            qipan17.setEnabled(false);
            qipan17.setHorizontalAlignment(SwingConstants.CENTER);
            qipan17.setFont(qipan17.getFont().deriveFont(qipan17.getFont().getSize() + 12f));
            panel1.add(qipan17);
            qipan17.setBounds(400, 0, 30, 30);

            //---- qipan18 ----
            qipan18.setEditable(false);
            qipan18.setEnabled(false);
            qipan18.setHorizontalAlignment(SwingConstants.CENTER);
            qipan18.setFont(qipan18.getFont().deriveFont(qipan18.getFont().getSize() + 12f));
            panel1.add(qipan18);
            qipan18.setBounds(425, 0, 30, 30);

            //---- qipan19 ----
            qipan19.setEditable(false);
            qipan19.setEnabled(false);
            qipan19.setHorizontalAlignment(SwingConstants.CENTER);
            qipan19.setFont(qipan19.getFont().deriveFont(qipan19.getFont().getSize() + 12f));
            panel1.add(qipan19);
            qipan19.setBounds(0, 25, 30, 30);

            //---- qipan20 ----
            qipan20.setEditable(false);
            qipan20.setEnabled(false);
            qipan20.setHorizontalAlignment(SwingConstants.CENTER);
            qipan20.setFont(qipan20.getFont().deriveFont(qipan20.getFont().getSize() + 12f));
            panel1.add(qipan20);
            qipan20.setBounds(25, 25, 30, 30);

            //---- qipan21 ----
            qipan21.setEditable(false);
            qipan21.setEnabled(false);
            qipan21.setHorizontalAlignment(SwingConstants.CENTER);
            qipan21.setFont(qipan21.getFont().deriveFont(qipan21.getFont().getSize() + 12f));
            panel1.add(qipan21);
            qipan21.setBounds(50, 25, 30, 30);

            //---- qipan22 ----
            qipan22.setEditable(false);
            qipan22.setEnabled(false);
            qipan22.setHorizontalAlignment(SwingConstants.CENTER);
            qipan22.setFont(qipan22.getFont().deriveFont(qipan22.getFont().getSize() + 12f));
            panel1.add(qipan22);
            qipan22.setBounds(75, 25, 30, 30);

            //---- qipan23 ----
            qipan23.setEditable(false);
            qipan23.setEnabled(false);
            qipan23.setHorizontalAlignment(SwingConstants.CENTER);
            qipan23.setFont(qipan23.getFont().deriveFont(qipan23.getFont().getSize() + 12f));
            panel1.add(qipan23);
            qipan23.setBounds(100, 25, 30, 30);

            //---- qipan24 ----
            qipan24.setEditable(false);
            qipan24.setEnabled(false);
            qipan24.setHorizontalAlignment(SwingConstants.CENTER);
            qipan24.setFont(qipan24.getFont().deriveFont(qipan24.getFont().getSize() + 12f));
            panel1.add(qipan24);
            qipan24.setBounds(125, 25, 30, 30);

            //---- qipan25 ----
            qipan25.setEditable(false);
            qipan25.setEnabled(false);
            qipan25.setHorizontalAlignment(SwingConstants.CENTER);
            qipan25.setFont(qipan25.getFont().deriveFont(qipan25.getFont().getSize() + 12f));
            panel1.add(qipan25);
            qipan25.setBounds(150, 25, 30, 30);

            //---- qipan26 ----
            qipan26.setEditable(false);
            qipan26.setEnabled(false);
            qipan26.setHorizontalAlignment(SwingConstants.CENTER);
            qipan26.setFont(qipan26.getFont().deriveFont(qipan26.getFont().getSize() + 12f));
            panel1.add(qipan26);
            qipan26.setBounds(175, 25, 30, 30);

            //---- qipan27 ----
            qipan27.setEditable(false);
            qipan27.setEnabled(false);
            qipan27.setHorizontalAlignment(SwingConstants.CENTER);
            qipan27.setFont(qipan27.getFont().deriveFont(qipan27.getFont().getSize() + 12f));
            panel1.add(qipan27);
            qipan27.setBounds(200, 25, 30, 30);

            //---- qipan28 ----
            qipan28.setEditable(false);
            qipan28.setEnabled(false);
            qipan28.setHorizontalAlignment(SwingConstants.CENTER);
            qipan28.setFont(qipan28.getFont().deriveFont(qipan28.getFont().getSize() + 12f));
            panel1.add(qipan28);
            qipan28.setBounds(225, 25, 30, 30);

            //---- qipan29 ----
            qipan29.setEditable(false);
            qipan29.setEnabled(false);
            qipan29.setHorizontalAlignment(SwingConstants.CENTER);
            qipan29.setFont(qipan29.getFont().deriveFont(qipan29.getFont().getSize() + 12f));
            panel1.add(qipan29);
            qipan29.setBounds(250, 25, 30, 30);

            //---- qipan30 ----
            qipan30.setEditable(false);
            qipan30.setEnabled(false);
            qipan30.setHorizontalAlignment(SwingConstants.CENTER);
            qipan30.setFont(qipan30.getFont().deriveFont(qipan30.getFont().getSize() + 12f));
            panel1.add(qipan30);
            qipan30.setBounds(275, 25, 30, 30);

            //---- qipan31 ----
            qipan31.setEditable(false);
            qipan31.setEnabled(false);
            qipan31.setHorizontalAlignment(SwingConstants.CENTER);
            qipan31.setFont(qipan31.getFont().deriveFont(qipan31.getFont().getSize() + 12f));
            panel1.add(qipan31);
            qipan31.setBounds(300, 25, 30, 30);

            //---- qipan32 ----
            qipan32.setEditable(false);
            qipan32.setEnabled(false);
            qipan32.setHorizontalAlignment(SwingConstants.CENTER);
            qipan32.setFont(qipan32.getFont().deriveFont(qipan32.getFont().getSize() + 12f));
            panel1.add(qipan32);
            qipan32.setBounds(325, 25, 30, 30);

            //---- qipan33 ----
            qipan33.setEditable(false);
            qipan33.setEnabled(false);
            qipan33.setHorizontalAlignment(SwingConstants.CENTER);
            qipan33.setFont(qipan33.getFont().deriveFont(qipan33.getFont().getSize() + 12f));
            panel1.add(qipan33);
            qipan33.setBounds(350, 25, 30, 30);

            //---- qipan34 ----
            qipan34.setEditable(false);
            qipan34.setEnabled(false);
            qipan34.setHorizontalAlignment(SwingConstants.CENTER);
            qipan34.setFont(qipan34.getFont().deriveFont(qipan34.getFont().getSize() + 12f));
            panel1.add(qipan34);
            qipan34.setBounds(375, 25, 30, 30);

            //---- qipan35 ----
            qipan35.setEditable(false);
            qipan35.setEnabled(false);
            qipan35.setHorizontalAlignment(SwingConstants.CENTER);
            qipan35.setFont(qipan35.getFont().deriveFont(qipan35.getFont().getSize() + 12f));
            panel1.add(qipan35);
            qipan35.setBounds(400, 25, 30, 30);

            //---- qipan36 ----
            qipan36.setEditable(false);
            qipan36.setEnabled(false);
            qipan36.setHorizontalAlignment(SwingConstants.CENTER);
            qipan36.setFont(qipan36.getFont().deriveFont(qipan36.getFont().getSize() + 12f));
            panel1.add(qipan36);
            qipan36.setBounds(425, 25, 30, 30);

            //---- qipan37 ----
            qipan37.setEditable(false);
            qipan37.setEnabled(false);
            qipan37.setHorizontalAlignment(SwingConstants.CENTER);
            qipan37.setFont(qipan37.getFont().deriveFont(qipan37.getFont().getSize() + 12f));
            panel1.add(qipan37);
            qipan37.setBounds(0, 50, 30, 30);

            //---- qipan38 ----
            qipan38.setEditable(false);
            qipan38.setEnabled(false);
            qipan38.setHorizontalAlignment(SwingConstants.CENTER);
            qipan38.setFont(qipan38.getFont().deriveFont(qipan38.getFont().getSize() + 12f));
            panel1.add(qipan38);
            qipan38.setBounds(25, 50, 30, 30);

            //---- qipan39 ----
            qipan39.setEditable(false);
            qipan39.setEnabled(false);
            qipan39.setHorizontalAlignment(SwingConstants.CENTER);
            qipan39.setFont(qipan39.getFont().deriveFont(qipan39.getFont().getSize() + 12f));
            panel1.add(qipan39);
            qipan39.setBounds(50, 50, 30, 30);

            //---- qipan40 ----
            qipan40.setEditable(false);
            qipan40.setEnabled(false);
            qipan40.setHorizontalAlignment(SwingConstants.CENTER);
            qipan40.setFont(qipan40.getFont().deriveFont(qipan40.getFont().getSize() + 12f));
            panel1.add(qipan40);
            qipan40.setBounds(75, 50, 30, 30);

            //---- qipan41 ----
            qipan41.setEditable(false);
            qipan41.setEnabled(false);
            qipan41.setHorizontalAlignment(SwingConstants.CENTER);
            qipan41.setFont(qipan41.getFont().deriveFont(qipan41.getFont().getSize() + 12f));
            panel1.add(qipan41);
            qipan41.setBounds(100, 50, 30, 30);

            //---- qipan42 ----
            qipan42.setEditable(false);
            qipan42.setEnabled(false);
            qipan42.setHorizontalAlignment(SwingConstants.CENTER);
            qipan42.setFont(qipan42.getFont().deriveFont(qipan42.getFont().getSize() + 12f));
            panel1.add(qipan42);
            qipan42.setBounds(125, 50, 30, 30);

            //---- qipan43 ----
            qipan43.setEditable(false);
            qipan43.setEnabled(false);
            qipan43.setHorizontalAlignment(SwingConstants.CENTER);
            qipan43.setFont(qipan43.getFont().deriveFont(qipan43.getFont().getSize() + 12f));
            panel1.add(qipan43);
            qipan43.setBounds(150, 50, 30, 30);

            //---- qipan44 ----
            qipan44.setEditable(false);
            qipan44.setEnabled(false);
            qipan44.setHorizontalAlignment(SwingConstants.CENTER);
            qipan44.setFont(qipan44.getFont().deriveFont(qipan44.getFont().getSize() + 12f));
            panel1.add(qipan44);
            qipan44.setBounds(175, 50, 30, 30);

            //---- qipan45 ----
            qipan45.setEditable(false);
            qipan45.setEnabled(false);
            qipan45.setHorizontalAlignment(SwingConstants.CENTER);
            qipan45.setFont(qipan45.getFont().deriveFont(qipan45.getFont().getSize() + 12f));
            panel1.add(qipan45);
            qipan45.setBounds(200, 50, 30, 30);

            //---- qipan46 ----
            qipan46.setEditable(false);
            qipan46.setEnabled(false);
            qipan46.setHorizontalAlignment(SwingConstants.CENTER);
            qipan46.setFont(qipan46.getFont().deriveFont(qipan46.getFont().getSize() + 12f));
            panel1.add(qipan46);
            qipan46.setBounds(225, 50, 30, 30);

            //---- qipan47 ----
            qipan47.setEditable(false);
            qipan47.setEnabled(false);
            qipan47.setHorizontalAlignment(SwingConstants.CENTER);
            qipan47.setFont(qipan47.getFont().deriveFont(qipan47.getFont().getSize() + 12f));
            panel1.add(qipan47);
            qipan47.setBounds(250, 50, 30, 30);

            //---- qipan48 ----
            qipan48.setEditable(false);
            qipan48.setEnabled(false);
            qipan48.setHorizontalAlignment(SwingConstants.CENTER);
            qipan48.setFont(qipan48.getFont().deriveFont(qipan48.getFont().getSize() + 12f));
            panel1.add(qipan48);
            qipan48.setBounds(275, 50, 30, 30);

            //---- qipan49 ----
            qipan49.setEditable(false);
            qipan49.setEnabled(false);
            qipan49.setHorizontalAlignment(SwingConstants.CENTER);
            qipan49.setFont(qipan49.getFont().deriveFont(qipan49.getFont().getSize() + 12f));
            panel1.add(qipan49);
            qipan49.setBounds(300, 50, 30, 30);

            //---- qipan50 ----
            qipan50.setEditable(false);
            qipan50.setEnabled(false);
            qipan50.setHorizontalAlignment(SwingConstants.CENTER);
            qipan50.setFont(qipan50.getFont().deriveFont(qipan50.getFont().getSize() + 12f));
            panel1.add(qipan50);
            qipan50.setBounds(325, 50, 30, 30);

            //---- qipan51 ----
            qipan51.setEditable(false);
            qipan51.setEnabled(false);
            qipan51.setHorizontalAlignment(SwingConstants.CENTER);
            qipan51.setFont(qipan51.getFont().deriveFont(qipan51.getFont().getSize() + 12f));
            panel1.add(qipan51);
            qipan51.setBounds(350, 50, 30, 30);

            //---- qipan52 ----
            qipan52.setEditable(false);
            qipan52.setEnabled(false);
            qipan52.setHorizontalAlignment(SwingConstants.CENTER);
            qipan52.setFont(qipan52.getFont().deriveFont(qipan52.getFont().getSize() + 12f));
            panel1.add(qipan52);
            qipan52.setBounds(375, 50, 30, 30);

            //---- qipan53 ----
            qipan53.setEditable(false);
            qipan53.setEnabled(false);
            qipan53.setHorizontalAlignment(SwingConstants.CENTER);
            qipan53.setFont(qipan53.getFont().deriveFont(qipan53.getFont().getSize() + 12f));
            panel1.add(qipan53);
            qipan53.setBounds(400, 50, 30, 30);

            //---- qipan54 ----
            qipan54.setEditable(false);
            qipan54.setEnabled(false);
            qipan54.setHorizontalAlignment(SwingConstants.CENTER);
            qipan54.setFont(qipan54.getFont().deriveFont(qipan54.getFont().getSize() + 12f));
            panel1.add(qipan54);
            qipan54.setBounds(425, 50, 30, 30);

            //---- qipan55 ----
            qipan55.setEditable(false);
            qipan55.setEnabled(false);
            qipan55.setHorizontalAlignment(SwingConstants.CENTER);
            qipan55.setFont(qipan55.getFont().deriveFont(qipan55.getFont().getSize() + 12f));
            panel1.add(qipan55);
            qipan55.setBounds(0, 75, 30, 30);

            //---- qipan56 ----
            qipan56.setEditable(false);
            qipan56.setEnabled(false);
            qipan56.setHorizontalAlignment(SwingConstants.CENTER);
            qipan56.setFont(qipan56.getFont().deriveFont(qipan56.getFont().getSize() + 12f));
            panel1.add(qipan56);
            qipan56.setBounds(25, 75, 30, 30);

            //---- qipan57 ----
            qipan57.setEditable(false);
            qipan57.setEnabled(false);
            qipan57.setHorizontalAlignment(SwingConstants.CENTER);
            qipan57.setFont(qipan57.getFont().deriveFont(qipan57.getFont().getSize() + 12f));
            panel1.add(qipan57);
            qipan57.setBounds(50, 75, 30, 30);

            //---- qipan58 ----
            qipan58.setEditable(false);
            qipan58.setEnabled(false);
            qipan58.setHorizontalAlignment(SwingConstants.CENTER);
            qipan58.setFont(qipan58.getFont().deriveFont(qipan58.getFont().getSize() + 12f));
            panel1.add(qipan58);
            qipan58.setBounds(75, 75, 30, 30);

            //---- qipan59 ----
            qipan59.setEditable(false);
            qipan59.setEnabled(false);
            qipan59.setHorizontalAlignment(SwingConstants.CENTER);
            qipan59.setFont(qipan59.getFont().deriveFont(qipan59.getFont().getSize() + 12f));
            panel1.add(qipan59);
            qipan59.setBounds(100, 75, 30, 30);

            //---- qipan60 ----
            qipan60.setEditable(false);
            qipan60.setEnabled(false);
            qipan60.setHorizontalAlignment(SwingConstants.CENTER);
            qipan60.setFont(qipan60.getFont().deriveFont(qipan60.getFont().getSize() + 12f));
            panel1.add(qipan60);
            qipan60.setBounds(125, 75, 30, 30);

            //---- qipan61 ----
            qipan61.setEditable(false);
            qipan61.setEnabled(false);
            qipan61.setHorizontalAlignment(SwingConstants.CENTER);
            qipan61.setFont(qipan61.getFont().deriveFont(qipan61.getFont().getSize() + 12f));
            panel1.add(qipan61);
            qipan61.setBounds(150, 75, 30, 30);

            //---- qipan62 ----
            qipan62.setEditable(false);
            qipan62.setEnabled(false);
            qipan62.setHorizontalAlignment(SwingConstants.CENTER);
            qipan62.setFont(qipan62.getFont().deriveFont(qipan62.getFont().getSize() + 12f));
            panel1.add(qipan62);
            qipan62.setBounds(175, 75, 30, 30);

            //---- qipan63 ----
            qipan63.setEditable(false);
            qipan63.setEnabled(false);
            qipan63.setHorizontalAlignment(SwingConstants.CENTER);
            qipan63.setFont(qipan63.getFont().deriveFont(qipan63.getFont().getSize() + 12f));
            panel1.add(qipan63);
            qipan63.setBounds(200, 75, 30, 30);

            //---- qipan64 ----
            qipan64.setEditable(false);
            qipan64.setEnabled(false);
            qipan64.setHorizontalAlignment(SwingConstants.CENTER);
            qipan64.setFont(qipan64.getFont().deriveFont(qipan64.getFont().getSize() + 12f));
            panel1.add(qipan64);
            qipan64.setBounds(225, 75, 30, 30);

            //---- qipan65 ----
            qipan65.setEditable(false);
            qipan65.setEnabled(false);
            qipan65.setHorizontalAlignment(SwingConstants.CENTER);
            qipan65.setFont(qipan65.getFont().deriveFont(qipan65.getFont().getSize() + 12f));
            panel1.add(qipan65);
            qipan65.setBounds(250, 75, 30, 30);

            //---- qipan66 ----
            qipan66.setEditable(false);
            qipan66.setEnabled(false);
            qipan66.setHorizontalAlignment(SwingConstants.CENTER);
            qipan66.setFont(qipan66.getFont().deriveFont(qipan66.getFont().getSize() + 12f));
            panel1.add(qipan66);
            qipan66.setBounds(275, 75, 30, 30);

            //---- qipan67 ----
            qipan67.setEditable(false);
            qipan67.setEnabled(false);
            qipan67.setHorizontalAlignment(SwingConstants.CENTER);
            qipan67.setFont(qipan67.getFont().deriveFont(qipan67.getFont().getSize() + 12f));
            panel1.add(qipan67);
            qipan67.setBounds(300, 75, 30, 30);

            //---- qipan68 ----
            qipan68.setEditable(false);
            qipan68.setEnabled(false);
            qipan68.setHorizontalAlignment(SwingConstants.CENTER);
            qipan68.setFont(qipan68.getFont().deriveFont(qipan68.getFont().getSize() + 12f));
            panel1.add(qipan68);
            qipan68.setBounds(325, 75, 30, 30);

            //---- qipan69 ----
            qipan69.setEditable(false);
            qipan69.setEnabled(false);
            qipan69.setHorizontalAlignment(SwingConstants.CENTER);
            qipan69.setFont(qipan69.getFont().deriveFont(qipan69.getFont().getSize() + 12f));
            panel1.add(qipan69);
            qipan69.setBounds(350, 75, 30, 30);

            //---- qipan70 ----
            qipan70.setEditable(false);
            qipan70.setEnabled(false);
            qipan70.setHorizontalAlignment(SwingConstants.CENTER);
            qipan70.setFont(qipan70.getFont().deriveFont(qipan70.getFont().getSize() + 12f));
            panel1.add(qipan70);
            qipan70.setBounds(375, 75, 30, 30);

            //---- qipan71 ----
            qipan71.setEditable(false);
            qipan71.setEnabled(false);
            qipan71.setHorizontalAlignment(SwingConstants.CENTER);
            qipan71.setFont(qipan71.getFont().deriveFont(qipan71.getFont().getSize() + 12f));
            panel1.add(qipan71);
            qipan71.setBounds(400, 75, 30, 30);

            //---- qipan72 ----
            qipan72.setEditable(false);
            qipan72.setEnabled(false);
            qipan72.setHorizontalAlignment(SwingConstants.CENTER);
            qipan72.setFont(qipan72.getFont().deriveFont(qipan72.getFont().getSize() + 12f));
            panel1.add(qipan72);
            qipan72.setBounds(425, 75, 30, 30);

            //---- qipan73 ----
            qipan73.setEditable(false);
            qipan73.setEnabled(false);
            qipan73.setHorizontalAlignment(SwingConstants.CENTER);
            qipan73.setFont(qipan73.getFont().deriveFont(qipan73.getFont().getSize() + 12f));
            panel1.add(qipan73);
            qipan73.setBounds(0, 100, 30, 30);

            //---- qipan74 ----
            qipan74.setEditable(false);
            qipan74.setEnabled(false);
            qipan74.setHorizontalAlignment(SwingConstants.CENTER);
            qipan74.setFont(qipan74.getFont().deriveFont(qipan74.getFont().getSize() + 12f));
            panel1.add(qipan74);
            qipan74.setBounds(25, 100, 30, 30);

            //---- qipan75 ----
            qipan75.setEditable(false);
            qipan75.setEnabled(false);
            qipan75.setHorizontalAlignment(SwingConstants.CENTER);
            qipan75.setFont(qipan75.getFont().deriveFont(qipan75.getFont().getSize() + 12f));
            panel1.add(qipan75);
            qipan75.setBounds(50, 100, 30, 30);

            //---- qipan76 ----
            qipan76.setEditable(false);
            qipan76.setEnabled(false);
            qipan76.setHorizontalAlignment(SwingConstants.CENTER);
            qipan76.setFont(qipan76.getFont().deriveFont(qipan76.getFont().getSize() + 12f));
            panel1.add(qipan76);
            qipan76.setBounds(75, 100, 30, 30);

            //---- qipan77 ----
            qipan77.setEditable(false);
            qipan77.setEnabled(false);
            qipan77.setHorizontalAlignment(SwingConstants.CENTER);
            qipan77.setFont(qipan77.getFont().deriveFont(qipan77.getFont().getSize() + 12f));
            panel1.add(qipan77);
            qipan77.setBounds(100, 100, 30, 30);

            //---- qipan78 ----
            qipan78.setEditable(false);
            qipan78.setEnabled(false);
            qipan78.setHorizontalAlignment(SwingConstants.CENTER);
            qipan78.setFont(qipan78.getFont().deriveFont(qipan78.getFont().getSize() + 12f));
            panel1.add(qipan78);
            qipan78.setBounds(125, 100, 30, 30);

            //---- qipan79 ----
            qipan79.setEditable(false);
            qipan79.setEnabled(false);
            qipan79.setHorizontalAlignment(SwingConstants.CENTER);
            qipan79.setFont(qipan79.getFont().deriveFont(qipan79.getFont().getSize() + 12f));
            panel1.add(qipan79);
            qipan79.setBounds(150, 100, 30, 30);

            //---- qipan80 ----
            qipan80.setEditable(false);
            qipan80.setEnabled(false);
            qipan80.setHorizontalAlignment(SwingConstants.CENTER);
            qipan80.setFont(qipan80.getFont().deriveFont(qipan80.getFont().getSize() + 12f));
            panel1.add(qipan80);
            qipan80.setBounds(175, 100, 30, 30);

            //---- qipan81 ----
            qipan81.setEditable(false);
            qipan81.setEnabled(false);
            qipan81.setHorizontalAlignment(SwingConstants.CENTER);
            qipan81.setFont(qipan81.getFont().deriveFont(qipan81.getFont().getSize() + 12f));
            panel1.add(qipan81);
            qipan81.setBounds(200, 100, 30, 30);

            //---- qipan82 ----
            qipan82.setEditable(false);
            qipan82.setEnabled(false);
            qipan82.setHorizontalAlignment(SwingConstants.CENTER);
            qipan82.setFont(qipan82.getFont().deriveFont(qipan82.getFont().getSize() + 12f));
            panel1.add(qipan82);
            qipan82.setBounds(225, 100, 30, 30);

            //---- qipan83 ----
            qipan83.setEditable(false);
            qipan83.setEnabled(false);
            qipan83.setHorizontalAlignment(SwingConstants.CENTER);
            qipan83.setFont(qipan83.getFont().deriveFont(qipan83.getFont().getSize() + 12f));
            panel1.add(qipan83);
            qipan83.setBounds(250, 100, 30, 30);

            //---- qipan84 ----
            qipan84.setEditable(false);
            qipan84.setEnabled(false);
            qipan84.setHorizontalAlignment(SwingConstants.CENTER);
            qipan84.setFont(qipan84.getFont().deriveFont(qipan84.getFont().getSize() + 12f));
            panel1.add(qipan84);
            qipan84.setBounds(275, 100, 30, 30);

            //---- qipan85 ----
            qipan85.setEditable(false);
            qipan85.setEnabled(false);
            qipan85.setHorizontalAlignment(SwingConstants.CENTER);
            qipan85.setFont(qipan85.getFont().deriveFont(qipan85.getFont().getSize() + 12f));
            panel1.add(qipan85);
            qipan85.setBounds(300, 100, 30, 30);

            //---- qipan86 ----
            qipan86.setEditable(false);
            qipan86.setEnabled(false);
            qipan86.setHorizontalAlignment(SwingConstants.CENTER);
            qipan86.setFont(qipan86.getFont().deriveFont(qipan86.getFont().getSize() + 12f));
            panel1.add(qipan86);
            qipan86.setBounds(325, 100, 30, 30);

            //---- qipan87 ----
            qipan87.setEditable(false);
            qipan87.setEnabled(false);
            qipan87.setHorizontalAlignment(SwingConstants.CENTER);
            qipan87.setFont(qipan87.getFont().deriveFont(qipan87.getFont().getSize() + 12f));
            panel1.add(qipan87);
            qipan87.setBounds(350, 100, 30, 30);

            //---- qipan88 ----
            qipan88.setEditable(false);
            qipan88.setEnabled(false);
            qipan88.setHorizontalAlignment(SwingConstants.CENTER);
            qipan88.setFont(qipan88.getFont().deriveFont(qipan88.getFont().getSize() + 12f));
            panel1.add(qipan88);
            qipan88.setBounds(375, 100, 30, 30);

            //---- qipan89 ----
            qipan89.setEditable(false);
            qipan89.setEnabled(false);
            qipan89.setHorizontalAlignment(SwingConstants.CENTER);
            qipan89.setFont(qipan89.getFont().deriveFont(qipan89.getFont().getSize() + 12f));
            panel1.add(qipan89);
            qipan89.setBounds(400, 100, 30, 30);

            //---- qipan90 ----
            qipan90.setEditable(false);
            qipan90.setEnabled(false);
            qipan90.setHorizontalAlignment(SwingConstants.CENTER);
            qipan90.setFont(qipan90.getFont().deriveFont(qipan90.getFont().getSize() + 12f));
            panel1.add(qipan90);
            qipan90.setBounds(425, 100, 30, 30);

            //---- qipan91 ----
            qipan91.setEditable(false);
            qipan91.setEnabled(false);
            qipan91.setHorizontalAlignment(SwingConstants.CENTER);
            qipan91.setFont(qipan91.getFont().deriveFont(qipan91.getFont().getSize() + 12f));
            panel1.add(qipan91);
            qipan91.setBounds(0, 125, 30, 30);

            //---- qipan92 ----
            qipan92.setEditable(false);
            qipan92.setEnabled(false);
            qipan92.setHorizontalAlignment(SwingConstants.CENTER);
            qipan92.setFont(qipan92.getFont().deriveFont(qipan92.getFont().getSize() + 12f));
            panel1.add(qipan92);
            qipan92.setBounds(25, 125, 30, 30);

            //---- qipan93 ----
            qipan93.setEditable(false);
            qipan93.setEnabled(false);
            qipan93.setHorizontalAlignment(SwingConstants.CENTER);
            qipan93.setFont(qipan93.getFont().deriveFont(qipan93.getFont().getSize() + 12f));
            panel1.add(qipan93);
            qipan93.setBounds(50, 125, 30, 30);

            //---- qipan94 ----
            qipan94.setEditable(false);
            qipan94.setEnabled(false);
            qipan94.setHorizontalAlignment(SwingConstants.CENTER);
            qipan94.setFont(qipan94.getFont().deriveFont(qipan94.getFont().getSize() + 12f));
            panel1.add(qipan94);
            qipan94.setBounds(75, 125, 30, 30);

            //---- qipan95 ----
            qipan95.setEditable(false);
            qipan95.setEnabled(false);
            qipan95.setHorizontalAlignment(SwingConstants.CENTER);
            qipan95.setFont(qipan95.getFont().deriveFont(qipan95.getFont().getSize() + 12f));
            panel1.add(qipan95);
            qipan95.setBounds(100, 125, 30, 30);

            //---- qipan96 ----
            qipan96.setEditable(false);
            qipan96.setEnabled(false);
            qipan96.setHorizontalAlignment(SwingConstants.CENTER);
            qipan96.setFont(qipan96.getFont().deriveFont(qipan96.getFont().getSize() + 12f));
            panel1.add(qipan96);
            qipan96.setBounds(125, 125, 30, 30);

            //---- qipan97 ----
            qipan97.setEditable(false);
            qipan97.setEnabled(false);
            qipan97.setHorizontalAlignment(SwingConstants.CENTER);
            qipan97.setFont(qipan97.getFont().deriveFont(qipan97.getFont().getSize() + 12f));
            panel1.add(qipan97);
            qipan97.setBounds(150, 125, 30, 30);

            //---- qipan98 ----
            qipan98.setEditable(false);
            qipan98.setEnabled(false);
            qipan98.setHorizontalAlignment(SwingConstants.CENTER);
            qipan98.setFont(qipan98.getFont().deriveFont(qipan98.getFont().getSize() + 12f));
            panel1.add(qipan98);
            qipan98.setBounds(175, 125, 30, 30);

            //---- qipan99 ----
            qipan99.setEditable(false);
            qipan99.setEnabled(false);
            qipan99.setHorizontalAlignment(SwingConstants.CENTER);
            qipan99.setFont(qipan99.getFont().deriveFont(qipan99.getFont().getSize() + 12f));
            panel1.add(qipan99);
            qipan99.setBounds(200, 125, 30, 30);

            //---- qipan100 ----
            qipan100.setEditable(false);
            qipan100.setEnabled(false);
            qipan100.setHorizontalAlignment(SwingConstants.CENTER);
            qipan100.setFont(qipan100.getFont().deriveFont(qipan100.getFont().getSize() + 12f));
            panel1.add(qipan100);
            qipan100.setBounds(225, 125, 30, 30);

            //---- qipan101 ----
            qipan101.setEditable(false);
            qipan101.setEnabled(false);
            qipan101.setHorizontalAlignment(SwingConstants.CENTER);
            qipan101.setFont(qipan101.getFont().deriveFont(qipan101.getFont().getSize() + 12f));
            panel1.add(qipan101);
            qipan101.setBounds(250, 125, 30, 30);

            //---- qipan102 ----
            qipan102.setEditable(false);
            qipan102.setEnabled(false);
            qipan102.setHorizontalAlignment(SwingConstants.CENTER);
            qipan102.setFont(qipan102.getFont().deriveFont(qipan102.getFont().getSize() + 12f));
            panel1.add(qipan102);
            qipan102.setBounds(275, 125, 30, 30);

            //---- qipan103 ----
            qipan103.setEditable(false);
            qipan103.setEnabled(false);
            qipan103.setHorizontalAlignment(SwingConstants.CENTER);
            qipan103.setFont(qipan103.getFont().deriveFont(qipan103.getFont().getSize() + 12f));
            panel1.add(qipan103);
            qipan103.setBounds(300, 125, 30, 30);

            //---- qipan104 ----
            qipan104.setEditable(false);
            qipan104.setEnabled(false);
            qipan104.setHorizontalAlignment(SwingConstants.CENTER);
            qipan104.setFont(qipan104.getFont().deriveFont(qipan104.getFont().getSize() + 12f));
            panel1.add(qipan104);
            qipan104.setBounds(325, 125, 30, 30);

            //---- qipan105 ----
            qipan105.setEditable(false);
            qipan105.setEnabled(false);
            qipan105.setHorizontalAlignment(SwingConstants.CENTER);
            qipan105.setFont(qipan105.getFont().deriveFont(qipan105.getFont().getSize() + 12f));
            panel1.add(qipan105);
            qipan105.setBounds(350, 125, 30, 30);

            //---- qipan106 ----
            qipan106.setEditable(false);
            qipan106.setEnabled(false);
            qipan106.setHorizontalAlignment(SwingConstants.CENTER);
            qipan106.setFont(qipan106.getFont().deriveFont(qipan106.getFont().getSize() + 12f));
            panel1.add(qipan106);
            qipan106.setBounds(375, 125, 30, 30);

            //---- qipan107 ----
            qipan107.setEditable(false);
            qipan107.setEnabled(false);
            qipan107.setHorizontalAlignment(SwingConstants.CENTER);
            qipan107.setFont(qipan107.getFont().deriveFont(qipan107.getFont().getSize() + 12f));
            panel1.add(qipan107);
            qipan107.setBounds(400, 125, 30, 30);

            //---- qipan108 ----
            qipan108.setEditable(false);
            qipan108.setEnabled(false);
            qipan108.setHorizontalAlignment(SwingConstants.CENTER);
            qipan108.setFont(qipan108.getFont().deriveFont(qipan108.getFont().getSize() + 12f));
            panel1.add(qipan108);
            qipan108.setBounds(425, 125, 30, 30);

            //---- qipan109 ----
            qipan109.setEditable(false);
            qipan109.setEnabled(false);
            qipan109.setHorizontalAlignment(SwingConstants.CENTER);
            qipan109.setFont(qipan109.getFont().deriveFont(qipan109.getFont().getSize() + 12f));
            panel1.add(qipan109);
            qipan109.setBounds(0, 150, 30, 30);

            //---- qipan110 ----
            qipan110.setEditable(false);
            qipan110.setEnabled(false);
            qipan110.setHorizontalAlignment(SwingConstants.CENTER);
            qipan110.setFont(qipan110.getFont().deriveFont(qipan110.getFont().getSize() + 12f));
            panel1.add(qipan110);
            qipan110.setBounds(25, 150, 30, 30);

            //---- qipan111 ----
            qipan111.setEditable(false);
            qipan111.setEnabled(false);
            qipan111.setHorizontalAlignment(SwingConstants.CENTER);
            qipan111.setFont(qipan111.getFont().deriveFont(qipan111.getFont().getSize() + 12f));
            panel1.add(qipan111);
            qipan111.setBounds(50, 150, 30, 30);

            //---- qipan112 ----
            qipan112.setEditable(false);
            qipan112.setEnabled(false);
            qipan112.setHorizontalAlignment(SwingConstants.CENTER);
            qipan112.setFont(qipan112.getFont().deriveFont(qipan112.getFont().getSize() + 12f));
            panel1.add(qipan112);
            qipan112.setBounds(75, 150, 30, 30);

            //---- qipan113 ----
            qipan113.setEditable(false);
            qipan113.setEnabled(false);
            qipan113.setHorizontalAlignment(SwingConstants.CENTER);
            qipan113.setFont(qipan113.getFont().deriveFont(qipan113.getFont().getSize() + 12f));
            panel1.add(qipan113);
            qipan113.setBounds(100, 150, 30, 30);

            //---- qipan114 ----
            qipan114.setEditable(false);
            qipan114.setEnabled(false);
            qipan114.setHorizontalAlignment(SwingConstants.CENTER);
            qipan114.setFont(qipan114.getFont().deriveFont(qipan114.getFont().getSize() + 12f));
            panel1.add(qipan114);
            qipan114.setBounds(125, 150, 30, 30);

            //---- qipan115 ----
            qipan115.setEditable(false);
            qipan115.setEnabled(false);
            qipan115.setHorizontalAlignment(SwingConstants.CENTER);
            qipan115.setFont(qipan115.getFont().deriveFont(qipan115.getFont().getSize() + 12f));
            panel1.add(qipan115);
            qipan115.setBounds(150, 150, 30, 30);

            //---- qipan116 ----
            qipan116.setEditable(false);
            qipan116.setEnabled(false);
            qipan116.setHorizontalAlignment(SwingConstants.CENTER);
            qipan116.setFont(qipan116.getFont().deriveFont(qipan116.getFont().getSize() + 12f));
            panel1.add(qipan116);
            qipan116.setBounds(175, 150, 30, 30);

            //---- qipan117 ----
            qipan117.setEditable(false);
            qipan117.setEnabled(false);
            qipan117.setHorizontalAlignment(SwingConstants.CENTER);
            qipan117.setFont(qipan117.getFont().deriveFont(qipan117.getFont().getSize() + 12f));
            panel1.add(qipan117);
            qipan117.setBounds(200, 150, 30, 30);

            //---- qipan118 ----
            qipan118.setEditable(false);
            qipan118.setEnabled(false);
            qipan118.setHorizontalAlignment(SwingConstants.CENTER);
            qipan118.setFont(qipan118.getFont().deriveFont(qipan118.getFont().getSize() + 12f));
            panel1.add(qipan118);
            qipan118.setBounds(225, 150, 30, 30);

            //---- qipan119 ----
            qipan119.setEditable(false);
            qipan119.setEnabled(false);
            qipan119.setHorizontalAlignment(SwingConstants.CENTER);
            qipan119.setFont(qipan119.getFont().deriveFont(qipan119.getFont().getSize() + 12f));
            panel1.add(qipan119);
            qipan119.setBounds(250, 150, 30, 30);

            //---- qipan120 ----
            qipan120.setEditable(false);
            qipan120.setEnabled(false);
            qipan120.setHorizontalAlignment(SwingConstants.CENTER);
            qipan120.setFont(qipan120.getFont().deriveFont(qipan120.getFont().getSize() + 12f));
            panel1.add(qipan120);
            qipan120.setBounds(275, 150, 30, 30);

            //---- qipan121 ----
            qipan121.setEditable(false);
            qipan121.setEnabled(false);
            qipan121.setHorizontalAlignment(SwingConstants.CENTER);
            qipan121.setFont(qipan121.getFont().deriveFont(qipan121.getFont().getSize() + 12f));
            panel1.add(qipan121);
            qipan121.setBounds(300, 150, 30, 30);

            //---- qipan122 ----
            qipan122.setEditable(false);
            qipan122.setEnabled(false);
            qipan122.setHorizontalAlignment(SwingConstants.CENTER);
            qipan122.setFont(qipan122.getFont().deriveFont(qipan122.getFont().getSize() + 12f));
            panel1.add(qipan122);
            qipan122.setBounds(325, 150, 30, 30);

            //---- qipan123 ----
            qipan123.setEditable(false);
            qipan123.setEnabled(false);
            qipan123.setHorizontalAlignment(SwingConstants.CENTER);
            qipan123.setFont(qipan123.getFont().deriveFont(qipan123.getFont().getSize() + 12f));
            panel1.add(qipan123);
            qipan123.setBounds(350, 150, 30, 30);

            //---- qipan124 ----
            qipan124.setEditable(false);
            qipan124.setEnabled(false);
            qipan124.setHorizontalAlignment(SwingConstants.CENTER);
            qipan124.setFont(qipan124.getFont().deriveFont(qipan124.getFont().getSize() + 12f));
            panel1.add(qipan124);
            qipan124.setBounds(375, 150, 30, 30);

            //---- qipan125 ----
            qipan125.setEditable(false);
            qipan125.setEnabled(false);
            qipan125.setHorizontalAlignment(SwingConstants.CENTER);
            qipan125.setFont(qipan125.getFont().deriveFont(qipan125.getFont().getSize() + 12f));
            panel1.add(qipan125);
            qipan125.setBounds(400, 150, 30, 30);

            //---- qipan126 ----
            qipan126.setEditable(false);
            qipan126.setEnabled(false);
            qipan126.setHorizontalAlignment(SwingConstants.CENTER);
            qipan126.setFont(qipan126.getFont().deriveFont(qipan126.getFont().getSize() + 12f));
            panel1.add(qipan126);
            qipan126.setBounds(425, 150, 30, 30);

            //---- qipan127 ----
            qipan127.setEditable(false);
            qipan127.setEnabled(false);
            qipan127.setHorizontalAlignment(SwingConstants.CENTER);
            qipan127.setFont(qipan127.getFont().deriveFont(qipan127.getFont().getSize() + 12f));
            panel1.add(qipan127);
            qipan127.setBounds(0, 175, 30, 30);

            //---- qipan128 ----
            qipan128.setEditable(false);
            qipan128.setEnabled(false);
            qipan128.setHorizontalAlignment(SwingConstants.CENTER);
            qipan128.setFont(qipan128.getFont().deriveFont(qipan128.getFont().getSize() + 12f));
            panel1.add(qipan128);
            qipan128.setBounds(25, 175, 30, 30);

            //---- qipan129 ----
            qipan129.setEditable(false);
            qipan129.setEnabled(false);
            qipan129.setHorizontalAlignment(SwingConstants.CENTER);
            qipan129.setFont(qipan129.getFont().deriveFont(qipan129.getFont().getSize() + 12f));
            panel1.add(qipan129);
            qipan129.setBounds(50, 175, 30, 30);

            //---- qipan130 ----
            qipan130.setEditable(false);
            qipan130.setEnabled(false);
            qipan130.setHorizontalAlignment(SwingConstants.CENTER);
            qipan130.setFont(qipan130.getFont().deriveFont(qipan130.getFont().getSize() + 12f));
            panel1.add(qipan130);
            qipan130.setBounds(75, 175, 30, 30);

            //---- qipan131 ----
            qipan131.setEditable(false);
            qipan131.setEnabled(false);
            qipan131.setHorizontalAlignment(SwingConstants.CENTER);
            qipan131.setFont(qipan131.getFont().deriveFont(qipan131.getFont().getSize() + 12f));
            panel1.add(qipan131);
            qipan131.setBounds(100, 175, 30, 30);

            //---- qipan132 ----
            qipan132.setEditable(false);
            qipan132.setEnabled(false);
            qipan132.setHorizontalAlignment(SwingConstants.CENTER);
            qipan132.setFont(qipan132.getFont().deriveFont(qipan132.getFont().getSize() + 12f));
            panel1.add(qipan132);
            qipan132.setBounds(125, 175, 30, 30);

            //---- qipan133 ----
            qipan133.setEditable(false);
            qipan133.setEnabled(false);
            qipan133.setHorizontalAlignment(SwingConstants.CENTER);
            qipan133.setFont(qipan133.getFont().deriveFont(qipan133.getFont().getSize() + 12f));
            panel1.add(qipan133);
            qipan133.setBounds(150, 175, 30, 30);

            //---- qipan134 ----
            qipan134.setEditable(false);
            qipan134.setEnabled(false);
            qipan134.setHorizontalAlignment(SwingConstants.CENTER);
            qipan134.setFont(qipan134.getFont().deriveFont(qipan134.getFont().getSize() + 12f));
            panel1.add(qipan134);
            qipan134.setBounds(175, 175, 30, 30);

            //---- qipan135 ----
            qipan135.setEditable(false);
            qipan135.setEnabled(false);
            qipan135.setHorizontalAlignment(SwingConstants.CENTER);
            qipan135.setFont(qipan135.getFont().deriveFont(qipan135.getFont().getSize() + 12f));
            panel1.add(qipan135);
            qipan135.setBounds(200, 175, 30, 30);

            //---- qipan136 ----
            qipan136.setEditable(false);
            qipan136.setEnabled(false);
            qipan136.setHorizontalAlignment(SwingConstants.CENTER);
            qipan136.setFont(qipan136.getFont().deriveFont(qipan136.getFont().getSize() + 12f));
            panel1.add(qipan136);
            qipan136.setBounds(225, 175, 30, 30);

            //---- qipan137 ----
            qipan137.setEditable(false);
            qipan137.setEnabled(false);
            qipan137.setHorizontalAlignment(SwingConstants.CENTER);
            qipan137.setFont(qipan137.getFont().deriveFont(qipan137.getFont().getSize() + 12f));
            panel1.add(qipan137);
            qipan137.setBounds(250, 175, 30, 30);

            //---- qipan138 ----
            qipan138.setEditable(false);
            qipan138.setEnabled(false);
            qipan138.setHorizontalAlignment(SwingConstants.CENTER);
            qipan138.setFont(qipan138.getFont().deriveFont(qipan138.getFont().getSize() + 12f));
            panel1.add(qipan138);
            qipan138.setBounds(275, 175, 30, 30);

            //---- qipan139 ----
            qipan139.setEditable(false);
            qipan139.setEnabled(false);
            qipan139.setHorizontalAlignment(SwingConstants.CENTER);
            qipan139.setFont(qipan139.getFont().deriveFont(qipan139.getFont().getSize() + 12f));
            panel1.add(qipan139);
            qipan139.setBounds(300, 175, 30, 30);

            //---- qipan140 ----
            qipan140.setEditable(false);
            qipan140.setEnabled(false);
            qipan140.setHorizontalAlignment(SwingConstants.CENTER);
            qipan140.setFont(qipan140.getFont().deriveFont(qipan140.getFont().getSize() + 12f));
            panel1.add(qipan140);
            qipan140.setBounds(325, 175, 30, 30);

            //---- qipan141 ----
            qipan141.setEditable(false);
            qipan141.setEnabled(false);
            qipan141.setHorizontalAlignment(SwingConstants.CENTER);
            qipan141.setFont(qipan141.getFont().deriveFont(qipan141.getFont().getSize() + 12f));
            panel1.add(qipan141);
            qipan141.setBounds(350, 175, 30, 30);

            //---- qipan142 ----
            qipan142.setEditable(false);
            qipan142.setEnabled(false);
            qipan142.setHorizontalAlignment(SwingConstants.CENTER);
            qipan142.setFont(qipan142.getFont().deriveFont(qipan142.getFont().getSize() + 12f));
            panel1.add(qipan142);
            qipan142.setBounds(375, 175, 30, 30);

            //---- qipan143 ----
            qipan143.setEditable(false);
            qipan143.setEnabled(false);
            qipan143.setHorizontalAlignment(SwingConstants.CENTER);
            qipan143.setFont(qipan143.getFont().deriveFont(qipan143.getFont().getSize() + 12f));
            panel1.add(qipan143);
            qipan143.setBounds(400, 175, 30, 30);

            //---- qipan144 ----
            qipan144.setEditable(false);
            qipan144.setEnabled(false);
            qipan144.setHorizontalAlignment(SwingConstants.CENTER);
            qipan144.setFont(qipan144.getFont().deriveFont(qipan144.getFont().getSize() + 12f));
            panel1.add(qipan144);
            qipan144.setBounds(425, 175, 30, 30);

            //---- qipan145 ----
            qipan145.setEditable(false);
            qipan145.setEnabled(false);
            qipan145.setHorizontalAlignment(SwingConstants.CENTER);
            qipan145.setFont(qipan145.getFont().deriveFont(qipan145.getFont().getSize() + 12f));
            panel1.add(qipan145);
            qipan145.setBounds(0, 200, 30, 30);

            //---- qipan146 ----
            qipan146.setEditable(false);
            qipan146.setEnabled(false);
            qipan146.setHorizontalAlignment(SwingConstants.CENTER);
            qipan146.setFont(qipan146.getFont().deriveFont(qipan146.getFont().getSize() + 12f));
            panel1.add(qipan146);
            qipan146.setBounds(25, 200, 30, 30);

            //---- qipan147 ----
            qipan147.setEditable(false);
            qipan147.setEnabled(false);
            qipan147.setHorizontalAlignment(SwingConstants.CENTER);
            qipan147.setFont(qipan147.getFont().deriveFont(qipan147.getFont().getSize() + 12f));
            panel1.add(qipan147);
            qipan147.setBounds(50, 200, 30, 30);

            //---- qipan148 ----
            qipan148.setEditable(false);
            qipan148.setEnabled(false);
            qipan148.setHorizontalAlignment(SwingConstants.CENTER);
            qipan148.setFont(qipan148.getFont().deriveFont(qipan148.getFont().getSize() + 12f));
            panel1.add(qipan148);
            qipan148.setBounds(75, 200, 30, 30);

            //---- qipan149 ----
            qipan149.setEditable(false);
            qipan149.setEnabled(false);
            qipan149.setHorizontalAlignment(SwingConstants.CENTER);
            qipan149.setFont(qipan149.getFont().deriveFont(qipan149.getFont().getSize() + 12f));
            panel1.add(qipan149);
            qipan149.setBounds(100, 200, 30, 30);

            //---- qipan150 ----
            qipan150.setEditable(false);
            qipan150.setEnabled(false);
            qipan150.setHorizontalAlignment(SwingConstants.CENTER);
            qipan150.setFont(qipan150.getFont().deriveFont(qipan150.getFont().getSize() + 12f));
            panel1.add(qipan150);
            qipan150.setBounds(125, 200, 30, 30);

            //---- qipan151 ----
            qipan151.setEditable(false);
            qipan151.setEnabled(false);
            qipan151.setHorizontalAlignment(SwingConstants.CENTER);
            qipan151.setFont(qipan151.getFont().deriveFont(qipan151.getFont().getSize() + 12f));
            panel1.add(qipan151);
            qipan151.setBounds(150, 200, 30, 30);

            //---- qipan152 ----
            qipan152.setEditable(false);
            qipan152.setEnabled(false);
            qipan152.setHorizontalAlignment(SwingConstants.CENTER);
            qipan152.setFont(qipan152.getFont().deriveFont(qipan152.getFont().getSize() + 12f));
            panel1.add(qipan152);
            qipan152.setBounds(175, 200, 30, 30);

            //---- qipan153 ----
            qipan153.setEditable(false);
            qipan153.setEnabled(false);
            qipan153.setHorizontalAlignment(SwingConstants.CENTER);
            qipan153.setFont(qipan153.getFont().deriveFont(qipan153.getFont().getSize() + 12f));
            panel1.add(qipan153);
            qipan153.setBounds(200, 200, 30, 30);

            //---- qipan154 ----
            qipan154.setEditable(false);
            qipan154.setEnabled(false);
            qipan154.setHorizontalAlignment(SwingConstants.CENTER);
            qipan154.setFont(qipan154.getFont().deriveFont(qipan154.getFont().getSize() + 12f));
            panel1.add(qipan154);
            qipan154.setBounds(225, 200, 30, 30);

            //---- qipan155 ----
            qipan155.setEditable(false);
            qipan155.setEnabled(false);
            qipan155.setHorizontalAlignment(SwingConstants.CENTER);
            qipan155.setFont(qipan155.getFont().deriveFont(qipan155.getFont().getSize() + 12f));
            panel1.add(qipan155);
            qipan155.setBounds(250, 200, 30, 30);

            //---- qipan156 ----
            qipan156.setEditable(false);
            qipan156.setEnabled(false);
            qipan156.setHorizontalAlignment(SwingConstants.CENTER);
            qipan156.setFont(qipan156.getFont().deriveFont(qipan156.getFont().getSize() + 12f));
            panel1.add(qipan156);
            qipan156.setBounds(275, 200, 30, 30);

            //---- qipan157 ----
            qipan157.setEditable(false);
            qipan157.setEnabled(false);
            qipan157.setHorizontalAlignment(SwingConstants.CENTER);
            qipan157.setFont(qipan157.getFont().deriveFont(qipan157.getFont().getSize() + 12f));
            panel1.add(qipan157);
            qipan157.setBounds(300, 200, 30, 30);

            //---- qipan158 ----
            qipan158.setEditable(false);
            qipan158.setEnabled(false);
            qipan158.setHorizontalAlignment(SwingConstants.CENTER);
            qipan158.setFont(qipan158.getFont().deriveFont(qipan158.getFont().getSize() + 12f));
            panel1.add(qipan158);
            qipan158.setBounds(325, 200, 30, 30);

            //---- qipan159 ----
            qipan159.setEditable(false);
            qipan159.setEnabled(false);
            qipan159.setHorizontalAlignment(SwingConstants.CENTER);
            qipan159.setFont(qipan159.getFont().deriveFont(qipan159.getFont().getSize() + 12f));
            panel1.add(qipan159);
            qipan159.setBounds(350, 200, 30, 30);

            //---- qipan160 ----
            qipan160.setEditable(false);
            qipan160.setEnabled(false);
            qipan160.setHorizontalAlignment(SwingConstants.CENTER);
            qipan160.setFont(qipan160.getFont().deriveFont(qipan160.getFont().getSize() + 12f));
            panel1.add(qipan160);
            qipan160.setBounds(375, 200, 30, 30);

            //---- qipan161 ----
            qipan161.setEditable(false);
            qipan161.setEnabled(false);
            qipan161.setHorizontalAlignment(SwingConstants.CENTER);
            qipan161.setFont(qipan161.getFont().deriveFont(qipan161.getFont().getSize() + 12f));
            panel1.add(qipan161);
            qipan161.setBounds(400, 200, 30, 30);

            //---- qipan162 ----
            qipan162.setEditable(false);
            qipan162.setEnabled(false);
            qipan162.setHorizontalAlignment(SwingConstants.CENTER);
            qipan162.setFont(qipan162.getFont().deriveFont(qipan162.getFont().getSize() + 12f));
            panel1.add(qipan162);
            qipan162.setBounds(425, 200, 30, 30);

            //---- qipan163 ----
            qipan163.setEditable(false);
            qipan163.setEnabled(false);
            qipan163.setHorizontalAlignment(SwingConstants.CENTER);
            qipan163.setFont(qipan163.getFont().deriveFont(qipan163.getFont().getSize() + 12f));
            panel1.add(qipan163);
            qipan163.setBounds(0, 225, 30, 30);

            //---- qipan164 ----
            qipan164.setEditable(false);
            qipan164.setEnabled(false);
            qipan164.setHorizontalAlignment(SwingConstants.CENTER);
            qipan164.setFont(qipan164.getFont().deriveFont(qipan164.getFont().getSize() + 12f));
            panel1.add(qipan164);
            qipan164.setBounds(25, 225, 30, 30);

            //---- qipan165 ----
            qipan165.setEditable(false);
            qipan165.setEnabled(false);
            qipan165.setHorizontalAlignment(SwingConstants.CENTER);
            qipan165.setFont(qipan165.getFont().deriveFont(qipan165.getFont().getSize() + 12f));
            panel1.add(qipan165);
            qipan165.setBounds(50, 225, 30, 30);

            //---- qipan166 ----
            qipan166.setEditable(false);
            qipan166.setEnabled(false);
            qipan166.setHorizontalAlignment(SwingConstants.CENTER);
            qipan166.setFont(qipan166.getFont().deriveFont(qipan166.getFont().getSize() + 12f));
            panel1.add(qipan166);
            qipan166.setBounds(75, 225, 30, 30);

            //---- qipan167 ----
            qipan167.setEditable(false);
            qipan167.setEnabled(false);
            qipan167.setHorizontalAlignment(SwingConstants.CENTER);
            qipan167.setFont(qipan167.getFont().deriveFont(qipan167.getFont().getSize() + 12f));
            panel1.add(qipan167);
            qipan167.setBounds(100, 225, 30, 30);

            //---- qipan168 ----
            qipan168.setEditable(false);
            qipan168.setEnabled(false);
            qipan168.setHorizontalAlignment(SwingConstants.CENTER);
            qipan168.setFont(qipan168.getFont().deriveFont(qipan168.getFont().getSize() + 12f));
            panel1.add(qipan168);
            qipan168.setBounds(125, 225, 30, 30);

            //---- qipan169 ----
            qipan169.setEditable(false);
            qipan169.setEnabled(false);
            qipan169.setHorizontalAlignment(SwingConstants.CENTER);
            qipan169.setFont(qipan169.getFont().deriveFont(qipan169.getFont().getSize() + 12f));
            panel1.add(qipan169);
            qipan169.setBounds(150, 225, 30, 30);

            //---- qipan170 ----
            qipan170.setEditable(false);
            qipan170.setEnabled(false);
            qipan170.setHorizontalAlignment(SwingConstants.CENTER);
            qipan170.setFont(qipan170.getFont().deriveFont(qipan170.getFont().getSize() + 12f));
            panel1.add(qipan170);
            qipan170.setBounds(175, 225, 30, 30);

            //---- qipan171 ----
            qipan171.setEditable(false);
            qipan171.setEnabled(false);
            qipan171.setHorizontalAlignment(SwingConstants.CENTER);
            qipan171.setFont(qipan171.getFont().deriveFont(qipan171.getFont().getSize() + 12f));
            panel1.add(qipan171);
            qipan171.setBounds(200, 225, 30, 30);

            //---- qipan172 ----
            qipan172.setEditable(false);
            qipan172.setEnabled(false);
            qipan172.setHorizontalAlignment(SwingConstants.CENTER);
            qipan172.setFont(qipan172.getFont().deriveFont(qipan172.getFont().getSize() + 12f));
            panel1.add(qipan172);
            qipan172.setBounds(225, 225, 30, 30);

            //---- qipan173 ----
            qipan173.setEditable(false);
            qipan173.setEnabled(false);
            qipan173.setHorizontalAlignment(SwingConstants.CENTER);
            qipan173.setFont(qipan173.getFont().deriveFont(qipan173.getFont().getSize() + 12f));
            panel1.add(qipan173);
            qipan173.setBounds(250, 225, 30, 30);

            //---- qipan174 ----
            qipan174.setEditable(false);
            qipan174.setEnabled(false);
            qipan174.setHorizontalAlignment(SwingConstants.CENTER);
            qipan174.setFont(qipan174.getFont().deriveFont(qipan174.getFont().getSize() + 12f));
            panel1.add(qipan174);
            qipan174.setBounds(275, 225, 30, 30);

            //---- qipan175 ----
            qipan175.setEditable(false);
            qipan175.setEnabled(false);
            qipan175.setHorizontalAlignment(SwingConstants.CENTER);
            qipan175.setFont(qipan175.getFont().deriveFont(qipan175.getFont().getSize() + 12f));
            panel1.add(qipan175);
            qipan175.setBounds(300, 225, 30, 30);

            //---- qipan176 ----
            qipan176.setEditable(false);
            qipan176.setEnabled(false);
            qipan176.setHorizontalAlignment(SwingConstants.CENTER);
            qipan176.setFont(qipan176.getFont().deriveFont(qipan176.getFont().getSize() + 12f));
            panel1.add(qipan176);
            qipan176.setBounds(325, 225, 30, 30);

            //---- qipan177 ----
            qipan177.setEditable(false);
            qipan177.setEnabled(false);
            qipan177.setHorizontalAlignment(SwingConstants.CENTER);
            qipan177.setFont(qipan177.getFont().deriveFont(qipan177.getFont().getSize() + 12f));
            panel1.add(qipan177);
            qipan177.setBounds(350, 225, 30, 30);

            //---- qipan178 ----
            qipan178.setEditable(false);
            qipan178.setEnabled(false);
            qipan178.setHorizontalAlignment(SwingConstants.CENTER);
            qipan178.setFont(qipan178.getFont().deriveFont(qipan178.getFont().getSize() + 12f));
            panel1.add(qipan178);
            qipan178.setBounds(375, 225, 30, 30);

            //---- qipan179 ----
            qipan179.setEditable(false);
            qipan179.setEnabled(false);
            qipan179.setHorizontalAlignment(SwingConstants.CENTER);
            qipan179.setFont(qipan179.getFont().deriveFont(qipan179.getFont().getSize() + 12f));
            panel1.add(qipan179);
            qipan179.setBounds(400, 225, 30, 30);

            //---- qipan180 ----
            qipan180.setEditable(false);
            qipan180.setEnabled(false);
            qipan180.setHorizontalAlignment(SwingConstants.CENTER);
            qipan180.setFont(qipan180.getFont().deriveFont(qipan180.getFont().getSize() + 12f));
            panel1.add(qipan180);
            qipan180.setBounds(425, 225, 30, 30);

            //---- qipan181 ----
            qipan181.setEditable(false);
            qipan181.setEnabled(false);
            qipan181.setHorizontalAlignment(SwingConstants.CENTER);
            qipan181.setFont(qipan181.getFont().deriveFont(qipan181.getFont().getSize() + 12f));
            panel1.add(qipan181);
            qipan181.setBounds(0, 250, 30, 30);

            //---- qipan182 ----
            qipan182.setEditable(false);
            qipan182.setEnabled(false);
            qipan182.setHorizontalAlignment(SwingConstants.CENTER);
            qipan182.setFont(qipan182.getFont().deriveFont(qipan182.getFont().getSize() + 12f));
            panel1.add(qipan182);
            qipan182.setBounds(25, 250, 30, 30);

            //---- qipan183 ----
            qipan183.setEditable(false);
            qipan183.setEnabled(false);
            qipan183.setHorizontalAlignment(SwingConstants.CENTER);
            qipan183.setFont(qipan183.getFont().deriveFont(qipan183.getFont().getSize() + 12f));
            panel1.add(qipan183);
            qipan183.setBounds(50, 250, 30, 30);

            //---- qipan184 ----
            qipan184.setEditable(false);
            qipan184.setEnabled(false);
            qipan184.setHorizontalAlignment(SwingConstants.CENTER);
            qipan184.setFont(qipan184.getFont().deriveFont(qipan184.getFont().getSize() + 12f));
            panel1.add(qipan184);
            qipan184.setBounds(75, 250, 30, 30);

            //---- qipan185 ----
            qipan185.setEditable(false);
            qipan185.setEnabled(false);
            qipan185.setHorizontalAlignment(SwingConstants.CENTER);
            qipan185.setFont(qipan185.getFont().deriveFont(qipan185.getFont().getSize() + 12f));
            panel1.add(qipan185);
            qipan185.setBounds(100, 250, 30, 30);

            //---- qipan186 ----
            qipan186.setEditable(false);
            qipan186.setEnabled(false);
            qipan186.setHorizontalAlignment(SwingConstants.CENTER);
            qipan186.setFont(qipan186.getFont().deriveFont(qipan186.getFont().getSize() + 12f));
            panel1.add(qipan186);
            qipan186.setBounds(125, 250, 30, 30);

            //---- qipan187 ----
            qipan187.setEditable(false);
            qipan187.setEnabled(false);
            qipan187.setHorizontalAlignment(SwingConstants.CENTER);
            qipan187.setFont(qipan187.getFont().deriveFont(qipan187.getFont().getSize() + 12f));
            panel1.add(qipan187);
            qipan187.setBounds(150, 250, 30, 30);

            //---- qipan188 ----
            qipan188.setEditable(false);
            qipan188.setEnabled(false);
            qipan188.setHorizontalAlignment(SwingConstants.CENTER);
            qipan188.setFont(qipan188.getFont().deriveFont(qipan188.getFont().getSize() + 12f));
            panel1.add(qipan188);
            qipan188.setBounds(175, 250, 30, 30);

            //---- qipan189 ----
            qipan189.setEditable(false);
            qipan189.setEnabled(false);
            qipan189.setHorizontalAlignment(SwingConstants.CENTER);
            qipan189.setFont(qipan189.getFont().deriveFont(qipan189.getFont().getSize() + 12f));
            panel1.add(qipan189);
            qipan189.setBounds(200, 250, 30, 30);

            //---- qipan190 ----
            qipan190.setEditable(false);
            qipan190.setEnabled(false);
            qipan190.setHorizontalAlignment(SwingConstants.CENTER);
            qipan190.setFont(qipan190.getFont().deriveFont(qipan190.getFont().getSize() + 12f));
            panel1.add(qipan190);
            qipan190.setBounds(225, 250, 30, 30);

            //---- qipan191 ----
            qipan191.setEditable(false);
            qipan191.setEnabled(false);
            qipan191.setHorizontalAlignment(SwingConstants.CENTER);
            qipan191.setFont(qipan191.getFont().deriveFont(qipan191.getFont().getSize() + 12f));
            panel1.add(qipan191);
            qipan191.setBounds(250, 250, 30, 30);

            //---- qipan192 ----
            qipan192.setEditable(false);
            qipan192.setEnabled(false);
            qipan192.setHorizontalAlignment(SwingConstants.CENTER);
            qipan192.setFont(qipan192.getFont().deriveFont(qipan192.getFont().getSize() + 12f));
            panel1.add(qipan192);
            qipan192.setBounds(275, 250, 30, 30);

            //---- qipan193 ----
            qipan193.setEditable(false);
            qipan193.setEnabled(false);
            qipan193.setHorizontalAlignment(SwingConstants.CENTER);
            qipan193.setFont(qipan193.getFont().deriveFont(qipan193.getFont().getSize() + 12f));
            panel1.add(qipan193);
            qipan193.setBounds(300, 250, 30, 30);

            //---- qipan194 ----
            qipan194.setEditable(false);
            qipan194.setEnabled(false);
            qipan194.setHorizontalAlignment(SwingConstants.CENTER);
            qipan194.setFont(qipan194.getFont().deriveFont(qipan194.getFont().getSize() + 12f));
            panel1.add(qipan194);
            qipan194.setBounds(325, 250, 30, 30);

            //---- qipan195 ----
            qipan195.setEditable(false);
            qipan195.setEnabled(false);
            qipan195.setHorizontalAlignment(SwingConstants.CENTER);
            qipan195.setFont(qipan195.getFont().deriveFont(qipan195.getFont().getSize() + 12f));
            panel1.add(qipan195);
            qipan195.setBounds(350, 250, 30, 30);

            //---- qipan196 ----
            qipan196.setEditable(false);
            qipan196.setEnabled(false);
            qipan196.setHorizontalAlignment(SwingConstants.CENTER);
            qipan196.setFont(qipan196.getFont().deriveFont(qipan196.getFont().getSize() + 12f));
            panel1.add(qipan196);
            qipan196.setBounds(375, 250, 30, 30);

            //---- qipan197 ----
            qipan197.setEditable(false);
            qipan197.setEnabled(false);
            qipan197.setHorizontalAlignment(SwingConstants.CENTER);
            qipan197.setFont(qipan197.getFont().deriveFont(qipan197.getFont().getSize() + 12f));
            panel1.add(qipan197);
            qipan197.setBounds(400, 250, 30, 30);

            //---- qipan198 ----
            qipan198.setEditable(false);
            qipan198.setEnabled(false);
            qipan198.setHorizontalAlignment(SwingConstants.CENTER);
            qipan198.setFont(qipan198.getFont().deriveFont(qipan198.getFont().getSize() + 12f));
            panel1.add(qipan198);
            qipan198.setBounds(425, 250, 30, 30);

            //---- qipan199 ----
            qipan199.setEditable(false);
            qipan199.setEnabled(false);
            qipan199.setHorizontalAlignment(SwingConstants.CENTER);
            qipan199.setFont(qipan199.getFont().deriveFont(qipan199.getFont().getSize() + 12f));
            panel1.add(qipan199);
            qipan199.setBounds(0, 275, 30, 30);

            //---- qipan200 ----
            qipan200.setEditable(false);
            qipan200.setEnabled(false);
            qipan200.setHorizontalAlignment(SwingConstants.CENTER);
            qipan200.setFont(qipan200.getFont().deriveFont(qipan200.getFont().getSize() + 12f));
            panel1.add(qipan200);
            qipan200.setBounds(25, 275, 30, 30);

            //---- qipan201 ----
            qipan201.setEditable(false);
            qipan201.setEnabled(false);
            qipan201.setHorizontalAlignment(SwingConstants.CENTER);
            qipan201.setFont(qipan201.getFont().deriveFont(qipan201.getFont().getSize() + 12f));
            panel1.add(qipan201);
            qipan201.setBounds(50, 275, 30, 30);

            //---- qipan202 ----
            qipan202.setEditable(false);
            qipan202.setEnabled(false);
            qipan202.setHorizontalAlignment(SwingConstants.CENTER);
            qipan202.setFont(qipan202.getFont().deriveFont(qipan202.getFont().getSize() + 12f));
            panel1.add(qipan202);
            qipan202.setBounds(75, 275, 30, 30);

            //---- qipan203 ----
            qipan203.setEditable(false);
            qipan203.setEnabled(false);
            qipan203.setHorizontalAlignment(SwingConstants.CENTER);
            qipan203.setFont(qipan203.getFont().deriveFont(qipan203.getFont().getSize() + 12f));
            panel1.add(qipan203);
            qipan203.setBounds(100, 275, 30, 30);

            //---- qipan204 ----
            qipan204.setEditable(false);
            qipan204.setEnabled(false);
            qipan204.setHorizontalAlignment(SwingConstants.CENTER);
            qipan204.setFont(qipan204.getFont().deriveFont(qipan204.getFont().getSize() + 12f));
            panel1.add(qipan204);
            qipan204.setBounds(125, 275, 30, 30);

            //---- qipan205 ----
            qipan205.setEditable(false);
            qipan205.setEnabled(false);
            qipan205.setHorizontalAlignment(SwingConstants.CENTER);
            qipan205.setFont(qipan205.getFont().deriveFont(qipan205.getFont().getSize() + 12f));
            panel1.add(qipan205);
            qipan205.setBounds(150, 275, 30, 30);

            //---- qipan206 ----
            qipan206.setEditable(false);
            qipan206.setEnabled(false);
            qipan206.setHorizontalAlignment(SwingConstants.CENTER);
            qipan206.setFont(qipan206.getFont().deriveFont(qipan206.getFont().getSize() + 12f));
            panel1.add(qipan206);
            qipan206.setBounds(175, 275, 30, 30);

            //---- qipan207 ----
            qipan207.setEditable(false);
            qipan207.setEnabled(false);
            qipan207.setHorizontalAlignment(SwingConstants.CENTER);
            qipan207.setFont(qipan207.getFont().deriveFont(qipan207.getFont().getSize() + 12f));
            panel1.add(qipan207);
            qipan207.setBounds(200, 275, 30, 30);

            //---- qipan208 ----
            qipan208.setEditable(false);
            qipan208.setEnabled(false);
            qipan208.setHorizontalAlignment(SwingConstants.CENTER);
            qipan208.setFont(qipan208.getFont().deriveFont(qipan208.getFont().getSize() + 12f));
            panel1.add(qipan208);
            qipan208.setBounds(225, 275, 30, 30);

            //---- qipan209 ----
            qipan209.setEditable(false);
            qipan209.setEnabled(false);
            qipan209.setHorizontalAlignment(SwingConstants.CENTER);
            qipan209.setFont(qipan209.getFont().deriveFont(qipan209.getFont().getSize() + 12f));
            panel1.add(qipan209);
            qipan209.setBounds(250, 275, 30, 30);

            //---- qipan210 ----
            qipan210.setEditable(false);
            qipan210.setEnabled(false);
            qipan210.setHorizontalAlignment(SwingConstants.CENTER);
            qipan210.setFont(qipan210.getFont().deriveFont(qipan210.getFont().getSize() + 12f));
            panel1.add(qipan210);
            qipan210.setBounds(275, 275, 30, 30);

            //---- qipan211 ----
            qipan211.setEditable(false);
            qipan211.setEnabled(false);
            qipan211.setHorizontalAlignment(SwingConstants.CENTER);
            qipan211.setFont(qipan211.getFont().deriveFont(qipan211.getFont().getSize() + 12f));
            panel1.add(qipan211);
            qipan211.setBounds(300, 275, 30, 30);

            //---- qipan212 ----
            qipan212.setEditable(false);
            qipan212.setEnabled(false);
            qipan212.setHorizontalAlignment(SwingConstants.CENTER);
            qipan212.setFont(qipan212.getFont().deriveFont(qipan212.getFont().getSize() + 12f));
            panel1.add(qipan212);
            qipan212.setBounds(325, 275, 30, 30);

            //---- qipan213 ----
            qipan213.setEditable(false);
            qipan213.setEnabled(false);
            qipan213.setHorizontalAlignment(SwingConstants.CENTER);
            qipan213.setFont(qipan213.getFont().deriveFont(qipan213.getFont().getSize() + 12f));
            panel1.add(qipan213);
            qipan213.setBounds(350, 275, 30, 30);

            //---- qipan214 ----
            qipan214.setEditable(false);
            qipan214.setEnabled(false);
            qipan214.setHorizontalAlignment(SwingConstants.CENTER);
            qipan214.setFont(qipan214.getFont().deriveFont(qipan214.getFont().getSize() + 12f));
            panel1.add(qipan214);
            qipan214.setBounds(375, 275, 30, 30);

            //---- qipan215 ----
            qipan215.setEditable(false);
            qipan215.setEnabled(false);
            qipan215.setHorizontalAlignment(SwingConstants.CENTER);
            qipan215.setFont(qipan215.getFont().deriveFont(qipan215.getFont().getSize() + 12f));
            panel1.add(qipan215);
            qipan215.setBounds(400, 275, 30, 30);

            //---- qipan216 ----
            qipan216.setEditable(false);
            qipan216.setEnabled(false);
            qipan216.setHorizontalAlignment(SwingConstants.CENTER);
            qipan216.setFont(qipan216.getFont().deriveFont(qipan216.getFont().getSize() + 12f));
            panel1.add(qipan216);
            qipan216.setBounds(425, 275, 30, 30);

            //---- qipan217 ----
            qipan217.setEditable(false);
            qipan217.setEnabled(false);
            qipan217.setHorizontalAlignment(SwingConstants.CENTER);
            qipan217.setFont(qipan217.getFont().deriveFont(qipan217.getFont().getSize() + 12f));
            panel1.add(qipan217);
            qipan217.setBounds(0, 300, 30, 30);

            //---- qipan218 ----
            qipan218.setEditable(false);
            qipan218.setEnabled(false);
            qipan218.setHorizontalAlignment(SwingConstants.CENTER);
            qipan218.setFont(qipan218.getFont().deriveFont(qipan218.getFont().getSize() + 12f));
            panel1.add(qipan218);
            qipan218.setBounds(25, 300, 30, 30);

            //---- qipan219 ----
            qipan219.setEditable(false);
            qipan219.setEnabled(false);
            qipan219.setHorizontalAlignment(SwingConstants.CENTER);
            qipan219.setFont(qipan219.getFont().deriveFont(qipan219.getFont().getSize() + 12f));
            panel1.add(qipan219);
            qipan219.setBounds(50, 300, 30, 30);

            //---- qipan220 ----
            qipan220.setEditable(false);
            qipan220.setEnabled(false);
            qipan220.setHorizontalAlignment(SwingConstants.CENTER);
            qipan220.setFont(qipan220.getFont().deriveFont(qipan220.getFont().getSize() + 12f));
            panel1.add(qipan220);
            qipan220.setBounds(75, 300, 30, 30);

            //---- qipan221 ----
            qipan221.setEditable(false);
            qipan221.setEnabled(false);
            qipan221.setHorizontalAlignment(SwingConstants.CENTER);
            qipan221.setFont(qipan221.getFont().deriveFont(qipan221.getFont().getSize() + 12f));
            panel1.add(qipan221);
            qipan221.setBounds(100, 300, 30, 30);

            //---- qipan222 ----
            qipan222.setEditable(false);
            qipan222.setEnabled(false);
            qipan222.setHorizontalAlignment(SwingConstants.CENTER);
            qipan222.setFont(qipan222.getFont().deriveFont(qipan222.getFont().getSize() + 12f));
            panel1.add(qipan222);
            qipan222.setBounds(125, 300, 30, 30);

            //---- qipan223 ----
            qipan223.setEditable(false);
            qipan223.setEnabled(false);
            qipan223.setHorizontalAlignment(SwingConstants.CENTER);
            qipan223.setFont(qipan223.getFont().deriveFont(qipan223.getFont().getSize() + 12f));
            panel1.add(qipan223);
            qipan223.setBounds(150, 300, 30, 30);

            //---- qipan224 ----
            qipan224.setEditable(false);
            qipan224.setEnabled(false);
            qipan224.setHorizontalAlignment(SwingConstants.CENTER);
            qipan224.setFont(qipan224.getFont().deriveFont(qipan224.getFont().getSize() + 12f));
            panel1.add(qipan224);
            qipan224.setBounds(175, 300, 30, 30);

            //---- qipan225 ----
            qipan225.setEditable(false);
            qipan225.setEnabled(false);
            qipan225.setHorizontalAlignment(SwingConstants.CENTER);
            qipan225.setFont(qipan225.getFont().deriveFont(qipan225.getFont().getSize() + 12f));
            panel1.add(qipan225);
            qipan225.setBounds(200, 300, 30, 30);

            //---- qipan226 ----
            qipan226.setEditable(false);
            qipan226.setEnabled(false);
            qipan226.setHorizontalAlignment(SwingConstants.CENTER);
            qipan226.setFont(qipan226.getFont().deriveFont(qipan226.getFont().getSize() + 12f));
            panel1.add(qipan226);
            qipan226.setBounds(225, 300, 30, 30);

            //---- qipan227 ----
            qipan227.setEditable(false);
            qipan227.setEnabled(false);
            qipan227.setHorizontalAlignment(SwingConstants.CENTER);
            qipan227.setFont(qipan227.getFont().deriveFont(qipan227.getFont().getSize() + 12f));
            panel1.add(qipan227);
            qipan227.setBounds(250, 300, 30, 30);

            //---- qipan228 ----
            qipan228.setEditable(false);
            qipan228.setEnabled(false);
            qipan228.setHorizontalAlignment(SwingConstants.CENTER);
            qipan228.setFont(qipan228.getFont().deriveFont(qipan228.getFont().getSize() + 12f));
            panel1.add(qipan228);
            qipan228.setBounds(275, 300, 30, 30);

            //---- qipan229 ----
            qipan229.setEditable(false);
            qipan229.setEnabled(false);
            qipan229.setHorizontalAlignment(SwingConstants.CENTER);
            qipan229.setFont(qipan229.getFont().deriveFont(qipan229.getFont().getSize() + 12f));
            panel1.add(qipan229);
            qipan229.setBounds(300, 300, 30, 30);

            //---- qipan230 ----
            qipan230.setEditable(false);
            qipan230.setEnabled(false);
            qipan230.setHorizontalAlignment(SwingConstants.CENTER);
            qipan230.setFont(qipan230.getFont().deriveFont(qipan230.getFont().getSize() + 12f));
            panel1.add(qipan230);
            qipan230.setBounds(325, 300, 30, 30);

            //---- qipan231 ----
            qipan231.setEditable(false);
            qipan231.setEnabled(false);
            qipan231.setHorizontalAlignment(SwingConstants.CENTER);
            qipan231.setFont(qipan231.getFont().deriveFont(qipan231.getFont().getSize() + 12f));
            panel1.add(qipan231);
            qipan231.setBounds(350, 300, 30, 30);

            //---- qipan232 ----
            qipan232.setEditable(false);
            qipan232.setEnabled(false);
            qipan232.setHorizontalAlignment(SwingConstants.CENTER);
            qipan232.setFont(qipan232.getFont().deriveFont(qipan232.getFont().getSize() + 12f));
            panel1.add(qipan232);
            qipan232.setBounds(375, 300, 30, 30);

            //---- qipan233 ----
            qipan233.setEditable(false);
            qipan233.setEnabled(false);
            qipan233.setHorizontalAlignment(SwingConstants.CENTER);
            qipan233.setFont(qipan233.getFont().deriveFont(qipan233.getFont().getSize() + 12f));
            panel1.add(qipan233);
            qipan233.setBounds(400, 300, 30, 30);

            //---- qipan234 ----
            qipan234.setEditable(false);
            qipan234.setEnabled(false);
            qipan234.setHorizontalAlignment(SwingConstants.CENTER);
            qipan234.setFont(qipan234.getFont().deriveFont(qipan234.getFont().getSize() + 12f));
            panel1.add(qipan234);
            qipan234.setBounds(425, 300, 30, 30);

            //---- qipan235 ----
            qipan235.setEditable(false);
            qipan235.setEnabled(false);
            qipan235.setHorizontalAlignment(SwingConstants.CENTER);
            qipan235.setFont(qipan235.getFont().deriveFont(qipan235.getFont().getSize() + 12f));
            panel1.add(qipan235);
            qipan235.setBounds(0, 325, 30, 30);

            //---- qipan236 ----
            qipan236.setEditable(false);
            qipan236.setEnabled(false);
            qipan236.setHorizontalAlignment(SwingConstants.CENTER);
            qipan236.setFont(qipan236.getFont().deriveFont(qipan236.getFont().getSize() + 12f));
            panel1.add(qipan236);
            qipan236.setBounds(25, 325, 30, 30);

            //---- qipan237 ----
            qipan237.setEditable(false);
            qipan237.setEnabled(false);
            qipan237.setHorizontalAlignment(SwingConstants.CENTER);
            qipan237.setFont(qipan237.getFont().deriveFont(qipan237.getFont().getSize() + 12f));
            panel1.add(qipan237);
            qipan237.setBounds(50, 325, 30, 30);

            //---- qipan238 ----
            qipan238.setEditable(false);
            qipan238.setEnabled(false);
            qipan238.setHorizontalAlignment(SwingConstants.CENTER);
            qipan238.setFont(qipan238.getFont().deriveFont(qipan238.getFont().getSize() + 12f));
            panel1.add(qipan238);
            qipan238.setBounds(75, 325, 30, 30);

            //---- qipan239 ----
            qipan239.setEditable(false);
            qipan239.setEnabled(false);
            qipan239.setHorizontalAlignment(SwingConstants.CENTER);
            qipan239.setFont(qipan239.getFont().deriveFont(qipan239.getFont().getSize() + 12f));
            panel1.add(qipan239);
            qipan239.setBounds(100, 325, 30, 30);

            //---- qipan240 ----
            qipan240.setEditable(false);
            qipan240.setEnabled(false);
            qipan240.setHorizontalAlignment(SwingConstants.CENTER);
            qipan240.setFont(qipan240.getFont().deriveFont(qipan240.getFont().getSize() + 12f));
            panel1.add(qipan240);
            qipan240.setBounds(125, 325, 30, 30);

            //---- qipan241 ----
            qipan241.setEditable(false);
            qipan241.setEnabled(false);
            qipan241.setHorizontalAlignment(SwingConstants.CENTER);
            qipan241.setFont(qipan241.getFont().deriveFont(qipan241.getFont().getSize() + 12f));
            panel1.add(qipan241);
            qipan241.setBounds(150, 325, 30, 30);

            //---- qipan242 ----
            qipan242.setEditable(false);
            qipan242.setEnabled(false);
            qipan242.setHorizontalAlignment(SwingConstants.CENTER);
            qipan242.setFont(qipan242.getFont().deriveFont(qipan242.getFont().getSize() + 12f));
            panel1.add(qipan242);
            qipan242.setBounds(175, 325, 30, 30);

            //---- qipan243 ----
            qipan243.setEditable(false);
            qipan243.setEnabled(false);
            qipan243.setHorizontalAlignment(SwingConstants.CENTER);
            qipan243.setFont(qipan243.getFont().deriveFont(qipan243.getFont().getSize() + 12f));
            panel1.add(qipan243);
            qipan243.setBounds(200, 325, 30, 30);

            //---- qipan244 ----
            qipan244.setEditable(false);
            qipan244.setEnabled(false);
            qipan244.setHorizontalAlignment(SwingConstants.CENTER);
            qipan244.setFont(qipan244.getFont().deriveFont(qipan244.getFont().getSize() + 12f));
            panel1.add(qipan244);
            qipan244.setBounds(225, 325, 30, 30);

            //---- qipan245 ----
            qipan245.setEditable(false);
            qipan245.setEnabled(false);
            qipan245.setHorizontalAlignment(SwingConstants.CENTER);
            qipan245.setFont(qipan245.getFont().deriveFont(qipan245.getFont().getSize() + 12f));
            panel1.add(qipan245);
            qipan245.setBounds(250, 325, 30, 30);

            //---- qipan246 ----
            qipan246.setEditable(false);
            qipan246.setEnabled(false);
            qipan246.setHorizontalAlignment(SwingConstants.CENTER);
            qipan246.setFont(qipan246.getFont().deriveFont(qipan246.getFont().getSize() + 12f));
            panel1.add(qipan246);
            qipan246.setBounds(275, 325, 30, 30);

            //---- qipan247 ----
            qipan247.setEditable(false);
            qipan247.setEnabled(false);
            qipan247.setHorizontalAlignment(SwingConstants.CENTER);
            qipan247.setFont(qipan247.getFont().deriveFont(qipan247.getFont().getSize() + 12f));
            panel1.add(qipan247);
            qipan247.setBounds(300, 325, 30, 30);

            //---- qipan248 ----
            qipan248.setEditable(false);
            qipan248.setEnabled(false);
            qipan248.setHorizontalAlignment(SwingConstants.CENTER);
            qipan248.setFont(qipan248.getFont().deriveFont(qipan248.getFont().getSize() + 12f));
            panel1.add(qipan248);
            qipan248.setBounds(325, 325, 30, 30);

            //---- qipan249 ----
            qipan249.setEditable(false);
            qipan249.setEnabled(false);
            qipan249.setHorizontalAlignment(SwingConstants.CENTER);
            qipan249.setFont(qipan249.getFont().deriveFont(qipan249.getFont().getSize() + 12f));
            panel1.add(qipan249);
            qipan249.setBounds(350, 325, 30, 30);

            //---- qipan250 ----
            qipan250.setEditable(false);
            qipan250.setEnabled(false);
            qipan250.setHorizontalAlignment(SwingConstants.CENTER);
            qipan250.setFont(qipan250.getFont().deriveFont(qipan250.getFont().getSize() + 12f));
            panel1.add(qipan250);
            qipan250.setBounds(375, 325, 30, 30);

            //---- qipan251 ----
            qipan251.setEditable(false);
            qipan251.setEnabled(false);
            qipan251.setHorizontalAlignment(SwingConstants.CENTER);
            qipan251.setFont(qipan251.getFont().deriveFont(qipan251.getFont().getSize() + 12f));
            panel1.add(qipan251);
            qipan251.setBounds(400, 325, 30, 30);

            //---- qipan252 ----
            qipan252.setEditable(false);
            qipan252.setEnabled(false);
            qipan252.setHorizontalAlignment(SwingConstants.CENTER);
            qipan252.setFont(qipan252.getFont().deriveFont(qipan252.getFont().getSize() + 12f));
            panel1.add(qipan252);
            qipan252.setBounds(425, 325, 30, 30);

            //---- qipan253 ----
            qipan253.setEditable(false);
            qipan253.setEnabled(false);
            qipan253.setHorizontalAlignment(SwingConstants.CENTER);
            qipan253.setFont(qipan253.getFont().deriveFont(qipan253.getFont().getSize() + 12f));
            panel1.add(qipan253);
            qipan253.setBounds(0, 350, 30, 30);

            //---- qipan254 ----
            qipan254.setEditable(false);
            qipan254.setEnabled(false);
            qipan254.setHorizontalAlignment(SwingConstants.CENTER);
            qipan254.setFont(qipan254.getFont().deriveFont(qipan254.getFont().getSize() + 12f));
            panel1.add(qipan254);
            qipan254.setBounds(25, 350, 30, 30);

            //---- qipan255 ----
            qipan255.setEditable(false);
            qipan255.setEnabled(false);
            qipan255.setHorizontalAlignment(SwingConstants.CENTER);
            qipan255.setFont(qipan255.getFont().deriveFont(qipan255.getFont().getSize() + 12f));
            panel1.add(qipan255);
            qipan255.setBounds(50, 350, 30, 30);

            //---- qipan256 ----
            qipan256.setEditable(false);
            qipan256.setEnabled(false);
            qipan256.setHorizontalAlignment(SwingConstants.CENTER);
            qipan256.setFont(qipan256.getFont().deriveFont(qipan256.getFont().getSize() + 12f));
            panel1.add(qipan256);
            qipan256.setBounds(75, 350, 30, 30);

            //---- qipan257 ----
            qipan257.setEditable(false);
            qipan257.setEnabled(false);
            qipan257.setHorizontalAlignment(SwingConstants.CENTER);
            qipan257.setFont(qipan257.getFont().deriveFont(qipan257.getFont().getSize() + 12f));
            panel1.add(qipan257);
            qipan257.setBounds(100, 350, 30, 30);

            //---- qipan258 ----
            qipan258.setEditable(false);
            qipan258.setEnabled(false);
            qipan258.setHorizontalAlignment(SwingConstants.CENTER);
            qipan258.setFont(qipan258.getFont().deriveFont(qipan258.getFont().getSize() + 12f));
            panel1.add(qipan258);
            qipan258.setBounds(125, 350, 30, 30);

            //---- qipan259 ----
            qipan259.setEditable(false);
            qipan259.setEnabled(false);
            qipan259.setHorizontalAlignment(SwingConstants.CENTER);
            qipan259.setFont(qipan259.getFont().deriveFont(qipan259.getFont().getSize() + 12f));
            panel1.add(qipan259);
            qipan259.setBounds(150, 350, 30, 30);

            //---- qipan260 ----
            qipan260.setEditable(false);
            qipan260.setEnabled(false);
            qipan260.setHorizontalAlignment(SwingConstants.CENTER);
            qipan260.setFont(qipan260.getFont().deriveFont(qipan260.getFont().getSize() + 12f));
            panel1.add(qipan260);
            qipan260.setBounds(175, 350, 30, 30);

            //---- qipan261 ----
            qipan261.setEditable(false);
            qipan261.setEnabled(false);
            qipan261.setHorizontalAlignment(SwingConstants.CENTER);
            qipan261.setFont(qipan261.getFont().deriveFont(qipan261.getFont().getSize() + 12f));
            panel1.add(qipan261);
            qipan261.setBounds(200, 350, 30, 30);

            //---- qipan262 ----
            qipan262.setEditable(false);
            qipan262.setEnabled(false);
            qipan262.setHorizontalAlignment(SwingConstants.CENTER);
            qipan262.setFont(qipan262.getFont().deriveFont(qipan262.getFont().getSize() + 12f));
            panel1.add(qipan262);
            qipan262.setBounds(225, 350, 30, 30);

            //---- qipan263 ----
            qipan263.setEditable(false);
            qipan263.setEnabled(false);
            qipan263.setHorizontalAlignment(SwingConstants.CENTER);
            qipan263.setFont(qipan263.getFont().deriveFont(qipan263.getFont().getSize() + 12f));
            panel1.add(qipan263);
            qipan263.setBounds(250, 350, 30, 30);

            //---- qipan264 ----
            qipan264.setEditable(false);
            qipan264.setEnabled(false);
            qipan264.setHorizontalAlignment(SwingConstants.CENTER);
            qipan264.setFont(qipan264.getFont().deriveFont(qipan264.getFont().getSize() + 12f));
            panel1.add(qipan264);
            qipan264.setBounds(275, 350, 30, 30);

            //---- qipan265 ----
            qipan265.setEditable(false);
            qipan265.setEnabled(false);
            qipan265.setHorizontalAlignment(SwingConstants.CENTER);
            qipan265.setFont(qipan265.getFont().deriveFont(qipan265.getFont().getSize() + 12f));
            panel1.add(qipan265);
            qipan265.setBounds(300, 350, 30, 30);

            //---- qipan266 ----
            qipan266.setEditable(false);
            qipan266.setEnabled(false);
            qipan266.setHorizontalAlignment(SwingConstants.CENTER);
            qipan266.setFont(qipan266.getFont().deriveFont(qipan266.getFont().getSize() + 12f));
            panel1.add(qipan266);
            qipan266.setBounds(325, 350, 30, 30);

            //---- qipan267 ----
            qipan267.setEditable(false);
            qipan267.setEnabled(false);
            qipan267.setHorizontalAlignment(SwingConstants.CENTER);
            qipan267.setFont(qipan267.getFont().deriveFont(qipan267.getFont().getSize() + 12f));
            panel1.add(qipan267);
            qipan267.setBounds(350, 350, 30, 30);

            //---- qipan268 ----
            qipan268.setEditable(false);
            qipan268.setEnabled(false);
            qipan268.setHorizontalAlignment(SwingConstants.CENTER);
            qipan268.setFont(qipan268.getFont().deriveFont(qipan268.getFont().getSize() + 12f));
            panel1.add(qipan268);
            qipan268.setBounds(375, 350, 30, 30);

            //---- qipan269 ----
            qipan269.setEditable(false);
            qipan269.setEnabled(false);
            qipan269.setHorizontalAlignment(SwingConstants.CENTER);
            qipan269.setFont(qipan269.getFont().deriveFont(qipan269.getFont().getSize() + 12f));
            panel1.add(qipan269);
            qipan269.setBounds(400, 350, 30, 30);

            //---- qipan270 ----
            qipan270.setEditable(false);
            qipan270.setEnabled(false);
            qipan270.setHorizontalAlignment(SwingConstants.CENTER);
            qipan270.setFont(qipan270.getFont().deriveFont(qipan270.getFont().getSize() + 12f));
            panel1.add(qipan270);
            qipan270.setBounds(425, 350, 30, 30);

            //---- qipan271 ----
            qipan271.setEditable(false);
            qipan271.setEnabled(false);
            qipan271.setHorizontalAlignment(SwingConstants.CENTER);
            qipan271.setFont(qipan271.getFont().deriveFont(qipan271.getFont().getSize() + 12f));
            panel1.add(qipan271);
            qipan271.setBounds(0, 375, 30, 30);

            //---- qipan272 ----
            qipan272.setEditable(false);
            qipan272.setEnabled(false);
            qipan272.setHorizontalAlignment(SwingConstants.CENTER);
            qipan272.setFont(qipan272.getFont().deriveFont(qipan272.getFont().getSize() + 12f));
            panel1.add(qipan272);
            qipan272.setBounds(25, 375, 30, 30);

            //---- qipan273 ----
            qipan273.setEditable(false);
            qipan273.setEnabled(false);
            qipan273.setHorizontalAlignment(SwingConstants.CENTER);
            qipan273.setFont(qipan273.getFont().deriveFont(qipan273.getFont().getSize() + 12f));
            panel1.add(qipan273);
            qipan273.setBounds(50, 375, 30, 30);

            //---- qipan274 ----
            qipan274.setEditable(false);
            qipan274.setEnabled(false);
            qipan274.setHorizontalAlignment(SwingConstants.CENTER);
            qipan274.setFont(qipan274.getFont().deriveFont(qipan274.getFont().getSize() + 12f));
            panel1.add(qipan274);
            qipan274.setBounds(75, 375, 30, 30);

            //---- qipan275 ----
            qipan275.setEditable(false);
            qipan275.setEnabled(false);
            qipan275.setHorizontalAlignment(SwingConstants.CENTER);
            qipan275.setFont(qipan275.getFont().deriveFont(qipan275.getFont().getSize() + 12f));
            panel1.add(qipan275);
            qipan275.setBounds(100, 375, 30, 30);

            //---- qipan276 ----
            qipan276.setEditable(false);
            qipan276.setEnabled(false);
            qipan276.setHorizontalAlignment(SwingConstants.CENTER);
            qipan276.setFont(qipan276.getFont().deriveFont(qipan276.getFont().getSize() + 12f));
            panel1.add(qipan276);
            qipan276.setBounds(125, 375, 30, 30);

            //---- qipan277 ----
            qipan277.setEditable(false);
            qipan277.setEnabled(false);
            qipan277.setHorizontalAlignment(SwingConstants.CENTER);
            qipan277.setFont(qipan277.getFont().deriveFont(qipan277.getFont().getSize() + 12f));
            panel1.add(qipan277);
            qipan277.setBounds(150, 375, 30, 30);

            //---- qipan278 ----
            qipan278.setEditable(false);
            qipan278.setEnabled(false);
            qipan278.setHorizontalAlignment(SwingConstants.CENTER);
            qipan278.setFont(qipan278.getFont().deriveFont(qipan278.getFont().getSize() + 12f));
            panel1.add(qipan278);
            qipan278.setBounds(175, 375, 30, 30);

            //---- qipan279 ----
            qipan279.setEditable(false);
            qipan279.setEnabled(false);
            qipan279.setHorizontalAlignment(SwingConstants.CENTER);
            qipan279.setFont(qipan279.getFont().deriveFont(qipan279.getFont().getSize() + 12f));
            panel1.add(qipan279);
            qipan279.setBounds(200, 375, 30, 30);

            //---- qipan280 ----
            qipan280.setEditable(false);
            qipan280.setEnabled(false);
            qipan280.setHorizontalAlignment(SwingConstants.CENTER);
            qipan280.setFont(qipan280.getFont().deriveFont(qipan280.getFont().getSize() + 12f));
            panel1.add(qipan280);
            qipan280.setBounds(225, 375, 30, 30);

            //---- qipan281 ----
            qipan281.setEditable(false);
            qipan281.setEnabled(false);
            qipan281.setHorizontalAlignment(SwingConstants.CENTER);
            qipan281.setFont(qipan281.getFont().deriveFont(qipan281.getFont().getSize() + 12f));
            panel1.add(qipan281);
            qipan281.setBounds(250, 375, 30, 30);

            //---- qipan282 ----
            qipan282.setEditable(false);
            qipan282.setEnabled(false);
            qipan282.setHorizontalAlignment(SwingConstants.CENTER);
            qipan282.setFont(qipan282.getFont().deriveFont(qipan282.getFont().getSize() + 12f));
            panel1.add(qipan282);
            qipan282.setBounds(275, 375, 30, 30);

            //---- qipan283 ----
            qipan283.setEditable(false);
            qipan283.setEnabled(false);
            qipan283.setHorizontalAlignment(SwingConstants.CENTER);
            qipan283.setFont(qipan283.getFont().deriveFont(qipan283.getFont().getSize() + 12f));
            panel1.add(qipan283);
            qipan283.setBounds(300, 375, 30, 30);

            //---- qipan284 ----
            qipan284.setEditable(false);
            qipan284.setEnabled(false);
            qipan284.setHorizontalAlignment(SwingConstants.CENTER);
            qipan284.setFont(qipan284.getFont().deriveFont(qipan284.getFont().getSize() + 12f));
            panel1.add(qipan284);
            qipan284.setBounds(325, 375, 30, 30);

            //---- qipan285 ----
            qipan285.setEditable(false);
            qipan285.setEnabled(false);
            qipan285.setHorizontalAlignment(SwingConstants.CENTER);
            qipan285.setFont(qipan285.getFont().deriveFont(qipan285.getFont().getSize() + 12f));
            panel1.add(qipan285);
            qipan285.setBounds(350, 375, 30, 30);

            //---- qipan286 ----
            qipan286.setEditable(false);
            qipan286.setEnabled(false);
            qipan286.setHorizontalAlignment(SwingConstants.CENTER);
            qipan286.setFont(qipan286.getFont().deriveFont(qipan286.getFont().getSize() + 12f));
            panel1.add(qipan286);
            qipan286.setBounds(375, 375, 30, 30);

            //---- qipan287 ----
            qipan287.setEditable(false);
            qipan287.setEnabled(false);
            qipan287.setHorizontalAlignment(SwingConstants.CENTER);
            qipan287.setFont(qipan287.getFont().deriveFont(qipan287.getFont().getSize() + 12f));
            panel1.add(qipan287);
            qipan287.setBounds(400, 375, 30, 30);

            //---- qipan288 ----
            qipan288.setEditable(false);
            qipan288.setEnabled(false);
            qipan288.setHorizontalAlignment(SwingConstants.CENTER);
            qipan288.setFont(qipan288.getFont().deriveFont(qipan288.getFont().getSize() + 12f));
            panel1.add(qipan288);
            qipan288.setBounds(425, 375, 30, 30);

            //---- qipan289 ----
            qipan289.setEditable(false);
            qipan289.setEnabled(false);
            qipan289.setHorizontalAlignment(SwingConstants.CENTER);
            qipan289.setFont(qipan289.getFont().deriveFont(qipan289.getFont().getSize() + 12f));
            panel1.add(qipan289);
            qipan289.setBounds(0, 395, 30, 30);

            //---- qipan290 ----
            qipan290.setEditable(false);
            qipan290.setEnabled(false);
            qipan290.setHorizontalAlignment(SwingConstants.CENTER);
            qipan290.setFont(qipan290.getFont().deriveFont(qipan290.getFont().getSize() + 12f));
            panel1.add(qipan290);
            qipan290.setBounds(25, 395, 30, 30);

            //---- qipan291 ----
            qipan291.setEditable(false);
            qipan291.setEnabled(false);
            qipan291.setHorizontalAlignment(SwingConstants.CENTER);
            qipan291.setFont(qipan291.getFont().deriveFont(qipan291.getFont().getSize() + 12f));
            panel1.add(qipan291);
            qipan291.setBounds(50, 395, 30, 30);

            //---- qipan292 ----
            qipan292.setEditable(false);
            qipan292.setEnabled(false);
            qipan292.setHorizontalAlignment(SwingConstants.CENTER);
            qipan292.setFont(qipan292.getFont().deriveFont(qipan292.getFont().getSize() + 12f));
            panel1.add(qipan292);
            qipan292.setBounds(75, 395, 30, 30);

            //---- qipan293 ----
            qipan293.setEditable(false);
            qipan293.setEnabled(false);
            qipan293.setHorizontalAlignment(SwingConstants.CENTER);
            qipan293.setFont(qipan293.getFont().deriveFont(qipan293.getFont().getSize() + 12f));
            panel1.add(qipan293);
            qipan293.setBounds(100, 395, 30, 30);

            //---- qipan294 ----
            qipan294.setEditable(false);
            qipan294.setEnabled(false);
            qipan294.setHorizontalAlignment(SwingConstants.CENTER);
            qipan294.setFont(qipan294.getFont().deriveFont(qipan294.getFont().getSize() + 12f));
            panel1.add(qipan294);
            qipan294.setBounds(125, 395, 30, 30);

            //---- qipan295 ----
            qipan295.setEditable(false);
            qipan295.setEnabled(false);
            qipan295.setHorizontalAlignment(SwingConstants.CENTER);
            qipan295.setFont(qipan295.getFont().deriveFont(qipan295.getFont().getSize() + 12f));
            panel1.add(qipan295);
            qipan295.setBounds(150, 395, 30, 30);

            //---- qipan296 ----
            qipan296.setEditable(false);
            qipan296.setEnabled(false);
            qipan296.setHorizontalAlignment(SwingConstants.CENTER);
            qipan296.setFont(qipan296.getFont().deriveFont(qipan296.getFont().getSize() + 12f));
            panel1.add(qipan296);
            qipan296.setBounds(175, 395, 30, 30);

            //---- qipan297 ----
            qipan297.setEditable(false);
            qipan297.setEnabled(false);
            qipan297.setHorizontalAlignment(SwingConstants.CENTER);
            qipan297.setFont(qipan297.getFont().deriveFont(qipan297.getFont().getSize() + 12f));
            panel1.add(qipan297);
            qipan297.setBounds(200, 395, 30, 30);

            //---- qipan298 ----
            qipan298.setEditable(false);
            qipan298.setEnabled(false);
            qipan298.setHorizontalAlignment(SwingConstants.CENTER);
            qipan298.setFont(qipan298.getFont().deriveFont(qipan298.getFont().getSize() + 12f));
            panel1.add(qipan298);
            qipan298.setBounds(225, 395, 30, 30);

            //---- qipan299 ----
            qipan299.setEditable(false);
            qipan299.setEnabled(false);
            qipan299.setHorizontalAlignment(SwingConstants.CENTER);
            qipan299.setFont(qipan299.getFont().deriveFont(qipan299.getFont().getSize() + 12f));
            panel1.add(qipan299);
            qipan299.setBounds(250, 395, 30, 30);

            //---- qipan300 ----
            qipan300.setEditable(false);
            qipan300.setEnabled(false);
            qipan300.setHorizontalAlignment(SwingConstants.CENTER);
            qipan300.setFont(qipan300.getFont().deriveFont(qipan300.getFont().getSize() + 12f));
            panel1.add(qipan300);
            qipan300.setBounds(275, 395, 30, 30);

            //---- qipan301 ----
            qipan301.setEditable(false);
            qipan301.setEnabled(false);
            qipan301.setHorizontalAlignment(SwingConstants.CENTER);
            qipan301.setFont(qipan301.getFont().deriveFont(qipan301.getFont().getSize() + 12f));
            panel1.add(qipan301);
            qipan301.setBounds(300, 395, 30, 30);

            //---- qipan302 ----
            qipan302.setEditable(false);
            qipan302.setEnabled(false);
            qipan302.setHorizontalAlignment(SwingConstants.CENTER);
            qipan302.setFont(qipan302.getFont().deriveFont(qipan302.getFont().getSize() + 12f));
            panel1.add(qipan302);
            qipan302.setBounds(325, 395, 30, 30);

            //---- qipan303 ----
            qipan303.setEditable(false);
            qipan303.setEnabled(false);
            qipan303.setHorizontalAlignment(SwingConstants.CENTER);
            qipan303.setFont(qipan303.getFont().deriveFont(qipan303.getFont().getSize() + 12f));
            panel1.add(qipan303);
            qipan303.setBounds(350, 395, 30, 30);

            //---- qipan304 ----
            qipan304.setEditable(false);
            qipan304.setEnabled(false);
            qipan304.setHorizontalAlignment(SwingConstants.CENTER);
            qipan304.setFont(qipan304.getFont().deriveFont(qipan304.getFont().getSize() + 12f));
            panel1.add(qipan304);
            qipan304.setBounds(375, 395, 30, 30);

            //---- qipan305 ----
            qipan305.setEditable(false);
            qipan305.setEnabled(false);
            qipan305.setHorizontalAlignment(SwingConstants.CENTER);
            qipan305.setFont(qipan305.getFont().deriveFont(qipan305.getFont().getSize() + 12f));
            panel1.add(qipan305);
            qipan305.setBounds(400, 395, 30, 30);

            //---- qipan306 ----
            qipan306.setEditable(false);
            qipan306.setEnabled(false);
            qipan306.setHorizontalAlignment(SwingConstants.CENTER);
            qipan306.setFont(qipan306.getFont().deriveFont(qipan306.getFont().getSize() + 12f));
            panel1.add(qipan306);
            qipan306.setBounds(425, 395, 30, 30);

            //---- qipan307 ----
            qipan307.setEditable(false);
            qipan307.setEnabled(false);
            qipan307.setHorizontalAlignment(SwingConstants.CENTER);
            qipan307.setFont(qipan307.getFont().deriveFont(qipan307.getFont().getSize() + 12f));
            panel1.add(qipan307);
            qipan307.setBounds(0, 420, 30, 30);

            //---- qipan308 ----
            qipan308.setEditable(false);
            qipan308.setEnabled(false);
            qipan308.setHorizontalAlignment(SwingConstants.CENTER);
            qipan308.setFont(qipan308.getFont().deriveFont(qipan308.getFont().getSize() + 12f));
            panel1.add(qipan308);
            qipan308.setBounds(25, 420, 30, 30);

            //---- qipan309 ----
            qipan309.setEditable(false);
            qipan309.setEnabled(false);
            qipan309.setHorizontalAlignment(SwingConstants.CENTER);
            qipan309.setFont(qipan309.getFont().deriveFont(qipan309.getFont().getSize() + 12f));
            panel1.add(qipan309);
            qipan309.setBounds(50, 420, 30, 30);

            //---- qipan310 ----
            qipan310.setEditable(false);
            qipan310.setEnabled(false);
            qipan310.setHorizontalAlignment(SwingConstants.CENTER);
            qipan310.setFont(qipan310.getFont().deriveFont(qipan310.getFont().getSize() + 12f));
            panel1.add(qipan310);
            qipan310.setBounds(75, 420, 30, 30);

            //---- qipan311 ----
            qipan311.setEditable(false);
            qipan311.setEnabled(false);
            qipan311.setHorizontalAlignment(SwingConstants.CENTER);
            qipan311.setFont(qipan311.getFont().deriveFont(qipan311.getFont().getSize() + 12f));
            panel1.add(qipan311);
            qipan311.setBounds(100, 420, 30, 30);

            //---- qipan312 ----
            qipan312.setEditable(false);
            qipan312.setEnabled(false);
            qipan312.setHorizontalAlignment(SwingConstants.CENTER);
            qipan312.setFont(qipan312.getFont().deriveFont(qipan312.getFont().getSize() + 12f));
            panel1.add(qipan312);
            qipan312.setBounds(125, 420, 30, 30);

            //---- qipan313 ----
            qipan313.setEditable(false);
            qipan313.setEnabled(false);
            qipan313.setHorizontalAlignment(SwingConstants.CENTER);
            qipan313.setFont(qipan313.getFont().deriveFont(qipan313.getFont().getSize() + 12f));
            panel1.add(qipan313);
            qipan313.setBounds(150, 420, 30, 30);

            //---- qipan314 ----
            qipan314.setEditable(false);
            qipan314.setEnabled(false);
            qipan314.setHorizontalAlignment(SwingConstants.CENTER);
            qipan314.setFont(qipan314.getFont().deriveFont(qipan314.getFont().getSize() + 12f));
            panel1.add(qipan314);
            qipan314.setBounds(175, 420, 30, 30);

            //---- qipan315 ----
            qipan315.setEditable(false);
            qipan315.setEnabled(false);
            qipan315.setHorizontalAlignment(SwingConstants.CENTER);
            qipan315.setFont(qipan315.getFont().deriveFont(qipan315.getFont().getSize() + 12f));
            panel1.add(qipan315);
            qipan315.setBounds(200, 420, 30, 30);

            //---- qipan316 ----
            qipan316.setEditable(false);
            qipan316.setEnabled(false);
            qipan316.setHorizontalAlignment(SwingConstants.CENTER);
            qipan316.setFont(qipan316.getFont().deriveFont(qipan316.getFont().getSize() + 12f));
            panel1.add(qipan316);
            qipan316.setBounds(225, 420, 30, 30);

            //---- qipan317 ----
            qipan317.setEditable(false);
            qipan317.setEnabled(false);
            qipan317.setHorizontalAlignment(SwingConstants.CENTER);
            qipan317.setFont(qipan317.getFont().deriveFont(qipan317.getFont().getSize() + 12f));
            panel1.add(qipan317);
            qipan317.setBounds(250, 420, 30, 30);

            //---- qipan318 ----
            qipan318.setEditable(false);
            qipan318.setEnabled(false);
            qipan318.setHorizontalAlignment(SwingConstants.CENTER);
            qipan318.setFont(qipan318.getFont().deriveFont(qipan318.getFont().getSize() + 12f));
            panel1.add(qipan318);
            qipan318.setBounds(275, 420, 30, 30);

            //---- qipan319 ----
            qipan319.setEditable(false);
            qipan319.setEnabled(false);
            qipan319.setHorizontalAlignment(SwingConstants.CENTER);
            qipan319.setFont(qipan319.getFont().deriveFont(qipan319.getFont().getSize() + 12f));
            panel1.add(qipan319);
            qipan319.setBounds(300, 420, 30, 30);

            //---- qipan320 ----
            qipan320.setEditable(false);
            qipan320.setEnabled(false);
            qipan320.setHorizontalAlignment(SwingConstants.CENTER);
            qipan320.setFont(qipan320.getFont().deriveFont(qipan320.getFont().getSize() + 12f));
            panel1.add(qipan320);
            qipan320.setBounds(325, 420, 30, 30);

            //---- qipan321 ----
            qipan321.setEditable(false);
            qipan321.setEnabled(false);
            qipan321.setHorizontalAlignment(SwingConstants.CENTER);
            qipan321.setFont(qipan321.getFont().deriveFont(qipan321.getFont().getSize() + 12f));
            panel1.add(qipan321);
            qipan321.setBounds(350, 420, 30, 30);

            //---- qipan322 ----
            qipan322.setEditable(false);
            qipan322.setEnabled(false);
            qipan322.setHorizontalAlignment(SwingConstants.CENTER);
            qipan322.setFont(qipan322.getFont().deriveFont(qipan322.getFont().getSize() + 12f));
            panel1.add(qipan322);
            qipan322.setBounds(375, 420, 30, 30);

            //---- qipan323 ----
            qipan323.setEditable(false);
            qipan323.setEnabled(false);
            qipan323.setHorizontalAlignment(SwingConstants.CENTER);
            qipan323.setFont(qipan323.getFont().deriveFont(qipan323.getFont().getSize() + 12f));
            panel1.add(qipan323);
            qipan323.setBounds(400, 420, 30, 30);

            //---- qipan324 ----
            qipan324.setEditable(false);
            qipan324.setEnabled(false);
            qipan324.setHorizontalAlignment(SwingConstants.CENTER);
            qipan324.setFont(qipan324.getFont().deriveFont(qipan324.getFont().getSize() + 12f));
            panel1.add(qipan324);
            qipan324.setBounds(425, 420, 30, 30);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < panel1.getComponentCount(); i++) {
                    Rectangle bounds = panel1.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = panel1.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                panel1.setMinimumSize(preferredSize);
                panel1.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(panel1);
        panel1.setBounds(new Rectangle(new Point(15, 15), panel1.getPreferredSize()));

        //---- qipan0 ----
        qipan0.setEnabled(false);
        contentPane.add(qipan0);
        qipan0.setBounds(5, 5, 475, 470);

        //---- restart ----
        restart.setText("\u91cd\u65b0\u5f00\u59cb");
        restart.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                restartMouseClicked(e);
            }
        });
        contentPane.add(restart);
        restart.setBounds(485, 5, 120, 40);

        //---- undo ----
        undo.setText("\u6094\u68cb");
        contentPane.add(undo);
        undo.setBounds(485, 50, 120, 40);

        //---- player ----
        player.setText("\u25cf");
        player.setFont(player.getFont().deriveFont(player.getFont().getSize() + 50f));
        player.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(player);
        player.setBounds(510, 95, 70, 65);

        //---- panetext ----
        panetext.setText("\u8bf7\u843d\u5b50");
        panetext.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(panetext);
        panetext.setBounds(510, 160, 70, 30);

        //---- pane ----
        pane.setEnabled(false);
        contentPane.add(pane);
        pane.setBounds(485, 95, 120, 100);

        contentPane.setPreferredSize(new Dimension(615, 510));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton pad;
    private JPanel panel1;
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
    private JTextField qipan21;
    private JTextField qipan22;
    private JTextField qipan23;
    private JTextField qipan24;
    private JTextField qipan25;
    private JTextField qipan26;
    private JTextField qipan27;
    private JTextField qipan28;
    private JTextField qipan29;
    private JTextField qipan30;
    private JTextField qipan31;
    private JTextField qipan32;
    private JTextField qipan33;
    private JTextField qipan34;
    private JTextField qipan35;
    private JTextField qipan36;
    private JTextField qipan37;
    private JTextField qipan38;
    private JTextField qipan39;
    private JTextField qipan40;
    private JTextField qipan41;
    private JTextField qipan42;
    private JTextField qipan43;
    private JTextField qipan44;
    private JTextField qipan45;
    private JTextField qipan46;
    private JTextField qipan47;
    private JTextField qipan48;
    private JTextField qipan49;
    private JTextField qipan50;
    private JTextField qipan51;
    private JTextField qipan52;
    private JTextField qipan53;
    private JTextField qipan54;
    private JTextField qipan55;
    private JTextField qipan56;
    private JTextField qipan57;
    private JTextField qipan58;
    private JTextField qipan59;
    private JTextField qipan60;
    private JTextField qipan61;
    private JTextField qipan62;
    private JTextField qipan63;
    private JTextField qipan64;
    private JTextField qipan65;
    private JTextField qipan66;
    private JTextField qipan67;
    private JTextField qipan68;
    private JTextField qipan69;
    private JTextField qipan70;
    private JTextField qipan71;
    private JTextField qipan72;
    private JTextField qipan73;
    private JTextField qipan74;
    private JTextField qipan75;
    private JTextField qipan76;
    private JTextField qipan77;
    private JTextField qipan78;
    private JTextField qipan79;
    private JTextField qipan80;
    private JTextField qipan81;
    private JTextField qipan82;
    private JTextField qipan83;
    private JTextField qipan84;
    private JTextField qipan85;
    private JTextField qipan86;
    private JTextField qipan87;
    private JTextField qipan88;
    private JTextField qipan89;
    private JTextField qipan90;
    private JTextField qipan91;
    private JTextField qipan92;
    private JTextField qipan93;
    private JTextField qipan94;
    private JTextField qipan95;
    private JTextField qipan96;
    private JTextField qipan97;
    private JTextField qipan98;
    private JTextField qipan99;
    private JTextField qipan100;
    private JTextField qipan101;
    private JTextField qipan102;
    private JTextField qipan103;
    private JTextField qipan104;
    private JTextField qipan105;
    private JTextField qipan106;
    private JTextField qipan107;
    private JTextField qipan108;
    private JTextField qipan109;
    private JTextField qipan110;
    private JTextField qipan111;
    private JTextField qipan112;
    private JTextField qipan113;
    private JTextField qipan114;
    private JTextField qipan115;
    private JTextField qipan116;
    private JTextField qipan117;
    private JTextField qipan118;
    private JTextField qipan119;
    private JTextField qipan120;
    private JTextField qipan121;
    private JTextField qipan122;
    private JTextField qipan123;
    private JTextField qipan124;
    private JTextField qipan125;
    private JTextField qipan126;
    private JTextField qipan127;
    private JTextField qipan128;
    private JTextField qipan129;
    private JTextField qipan130;
    private JTextField qipan131;
    private JTextField qipan132;
    private JTextField qipan133;
    private JTextField qipan134;
    private JTextField qipan135;
    private JTextField qipan136;
    private JTextField qipan137;
    private JTextField qipan138;
    private JTextField qipan139;
    private JTextField qipan140;
    private JTextField qipan141;
    private JTextField qipan142;
    private JTextField qipan143;
    private JTextField qipan144;
    private JTextField qipan145;
    private JTextField qipan146;
    private JTextField qipan147;
    private JTextField qipan148;
    private JTextField qipan149;
    private JTextField qipan150;
    private JTextField qipan151;
    private JTextField qipan152;
    private JTextField qipan153;
    private JTextField qipan154;
    private JTextField qipan155;
    private JTextField qipan156;
    private JTextField qipan157;
    private JTextField qipan158;
    private JTextField qipan159;
    private JTextField qipan160;
    private JTextField qipan161;
    private JTextField qipan162;
    private JTextField qipan163;
    private JTextField qipan164;
    private JTextField qipan165;
    private JTextField qipan166;
    private JTextField qipan167;
    private JTextField qipan168;
    private JTextField qipan169;
    private JTextField qipan170;
    private JTextField qipan171;
    private JTextField qipan172;
    private JTextField qipan173;
    private JTextField qipan174;
    private JTextField qipan175;
    private JTextField qipan176;
    private JTextField qipan177;
    private JTextField qipan178;
    private JTextField qipan179;
    private JTextField qipan180;
    private JTextField qipan181;
    private JTextField qipan182;
    private JTextField qipan183;
    private JTextField qipan184;
    private JTextField qipan185;
    private JTextField qipan186;
    private JTextField qipan187;
    private JTextField qipan188;
    private JTextField qipan189;
    private JTextField qipan190;
    private JTextField qipan191;
    private JTextField qipan192;
    private JTextField qipan193;
    private JTextField qipan194;
    private JTextField qipan195;
    private JTextField qipan196;
    private JTextField qipan197;
    private JTextField qipan198;
    private JTextField qipan199;
    private JTextField qipan200;
    private JTextField qipan201;
    private JTextField qipan202;
    private JTextField qipan203;
    private JTextField qipan204;
    private JTextField qipan205;
    private JTextField qipan206;
    private JTextField qipan207;
    private JTextField qipan208;
    private JTextField qipan209;
    private JTextField qipan210;
    private JTextField qipan211;
    private JTextField qipan212;
    private JTextField qipan213;
    private JTextField qipan214;
    private JTextField qipan215;
    private JTextField qipan216;
    private JTextField qipan217;
    private JTextField qipan218;
    private JTextField qipan219;
    private JTextField qipan220;
    private JTextField qipan221;
    private JTextField qipan222;
    private JTextField qipan223;
    private JTextField qipan224;
    private JTextField qipan225;
    private JTextField qipan226;
    private JTextField qipan227;
    private JTextField qipan228;
    private JTextField qipan229;
    private JTextField qipan230;
    private JTextField qipan231;
    private JTextField qipan232;
    private JTextField qipan233;
    private JTextField qipan234;
    private JTextField qipan235;
    private JTextField qipan236;
    private JTextField qipan237;
    private JTextField qipan238;
    private JTextField qipan239;
    private JTextField qipan240;
    private JTextField qipan241;
    private JTextField qipan242;
    private JTextField qipan243;
    private JTextField qipan244;
    private JTextField qipan245;
    private JTextField qipan246;
    private JTextField qipan247;
    private JTextField qipan248;
    private JTextField qipan249;
    private JTextField qipan250;
    private JTextField qipan251;
    private JTextField qipan252;
    private JTextField qipan253;
    private JTextField qipan254;
    private JTextField qipan255;
    private JTextField qipan256;
    private JTextField qipan257;
    private JTextField qipan258;
    private JTextField qipan259;
    private JTextField qipan260;
    private JTextField qipan261;
    private JTextField qipan262;
    private JTextField qipan263;
    private JTextField qipan264;
    private JTextField qipan265;
    private JTextField qipan266;
    private JTextField qipan267;
    private JTextField qipan268;
    private JTextField qipan269;
    private JTextField qipan270;
    private JTextField qipan271;
    private JTextField qipan272;
    private JTextField qipan273;
    private JTextField qipan274;
    private JTextField qipan275;
    private JTextField qipan276;
    private JTextField qipan277;
    private JTextField qipan278;
    private JTextField qipan279;
    private JTextField qipan280;
    private JTextField qipan281;
    private JTextField qipan282;
    private JTextField qipan283;
    private JTextField qipan284;
    private JTextField qipan285;
    private JTextField qipan286;
    private JTextField qipan287;
    private JTextField qipan288;
    private JTextField qipan289;
    private JTextField qipan290;
    private JTextField qipan291;
    private JTextField qipan292;
    private JTextField qipan293;
    private JTextField qipan294;
    private JTextField qipan295;
    private JTextField qipan296;
    private JTextField qipan297;
    private JTextField qipan298;
    private JTextField qipan299;
    private JTextField qipan300;
    private JTextField qipan301;
    private JTextField qipan302;
    private JTextField qipan303;
    private JTextField qipan304;
    private JTextField qipan305;
    private JTextField qipan306;
    private JTextField qipan307;
    private JTextField qipan308;
    private JTextField qipan309;
    private JTextField qipan310;
    private JTextField qipan311;
    private JTextField qipan312;
    private JTextField qipan313;
    private JTextField qipan314;
    private JTextField qipan315;
    private JTextField qipan316;
    private JTextField qipan317;
    private JTextField qipan318;
    private JTextField qipan319;
    private JTextField qipan320;
    private JTextField qipan321;
    private JTextField qipan322;
    private JTextField qipan323;
    private JTextField qipan324;
    private JButton qipan0;
    private JButton restart;
    private JButton undo;
    private JLabel player;
    private JLabel panetext;
    private JButton pane;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
