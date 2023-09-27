//  Let's say we have a hemispherical bowl of water with a diameter of r cm.
//  We want to find out how many marbles of diameter m cm we can fit in the bowl side by side.
//  Assume that gravity is not a factor and that the marbles are perfectly spherical.
//  The chain of marbles has to be touching each other and the bowl for it to be considered as "fitting".
//  If there is no solution, return -1.

public class FreeCode2 {
    int r; // diameter of bowl
    int m; // diameter of marble

    public FreeCode2(int r, int m) {
        this.r = r;
        this.m = m;
    }

    public int getNumMarbles() {
        // TODO: implement this method
        if (r < m) {
            return -1;
        }
        return r / m;
    }

    public static void main(String[] args) {
        FreeCode2 fc = new FreeCode2(10, 3);
        System.out.println(fc.getNumMarbles()); // should print 3
    }
}
