import java.util.Arrays;

public class qipan {
    int[][] qipan = new int[20][20];//棋盘数组，0未落子 1落白字 2落黑子
    int player = 2;
    int x_last,y_last;
    public int luozi(int x,int y)
    {
        x_last = x;
        y_last = y;
        qipan[x][y] = player;
        if (player == 2)
            player = 1;
        else
            player = 2;
        System.out.println(x+" "+y+" "+player);
        return 0;
    }
    public void huiqi()
    {
        qipan[x_last][y_last] = 0;
        if (player == 2)
            player = 1;
        else
            player = 2;
    }
    public int getPlayer()
    {
        return player;
    }
    public int panduan()
    {
        int x = 1,y = 1;
        int bl = 0,wh = 0;
        while (y<=19) {
            while (x <= 19) {
                if (qipan[x][y] == 1 && qipan[x + 1][y] == 1)
                {wh = wh + 1;
                    if (wh == 4)
                        return 1;}

                else {
                    if (qipan[x][y] == 2 && qipan[x + 1][y] == 2)
                    {bl = bl + 1;
                        if (bl == 4)
                            return 2;}
                    else
                    {wh = 0;
                    bl = 0;}
                }
                x = x + 1;
            }
            x = 1; y = y+1;
        }
        return 0;

    }
}