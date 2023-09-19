public class Sep19_rightmostSetBit {
    public static int getFirstSetBit(int n){
        for(int i = 0; i < 32; i++){
            if(((1<<i)&n) != 0)
                return i + 1;
        }
        return 0;
    }
}
