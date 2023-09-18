public class Sep18_Powerof2{
    public static boolean isPowerofTwo(long n){
        if(n == 0)  return false;
        if(n <= 2)  return true;
        long low = 0;
        long high = n/2;
        int count = 0;
        for(int i = 0; i < 63; i++){
            if((n&(1L<<i)) != 0)    count++;
        }
        if(count == 1)  return true;
        return false;
    }
}