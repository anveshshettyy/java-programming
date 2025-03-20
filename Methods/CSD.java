package Methods;

public class CSD {
    int x = 10;
    static int y = 20;
    void abc(int n) {
        x = n;
        y = n;
    }

    public static void main(String[] args) {
        CSD a = new CSD();
        CSD b = new CSD();
        CSD c = new CSD();

        a.abc(50);
        b.abc(60);
        c.abc(70);

        
    }
}
