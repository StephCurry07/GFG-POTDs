
public class Jul2_copysetbitsinrange{
    static int setSetBit(int x, int y, int l, int r){
        int mask = ((1 << r - l + 1) - 1) << (l - 1);
        mask = mask & y;
        return x | mask;
    }
}