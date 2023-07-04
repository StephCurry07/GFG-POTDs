package Geek-O-Lympics;

public class Jul1_countsetbits {
    static int setBits(int N) {
        int count = 0;
        while(N > 0){
            if((N&1) == 1){
                count++;
            }
            N >>= 1;
        }
        return count;
    }
}
