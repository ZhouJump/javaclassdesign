import com.formdev.flatlaf.*;
import form.*;
public class Main {
    public static void main(String[] args)
    {
        FlatDarculaLaf.install();

        int[][] qipan = new int[19][19];//棋盘数组，0未落子 1落白字 2落黑子

        new wuziqi().setVisible(true);
    }
}