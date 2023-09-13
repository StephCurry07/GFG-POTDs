public class Sep13_LargestNum {
    static String findLargest(int N, int S){
        int num_nine = 0;
        if(N == 1 && S < 10)  return (S + "");
        if(N == 1)  return "-1";
        if(S > 9*N || S == 0) return "-1";
        if(S < 10){
            return (S + "0".repeat(N-1));
        }
        num_nine = S/9;
        String ans = "9".repeat(num_nine);
        if(S%9 != 0)
            ans += S - (9 * num_nine);
        int len = ans.length();
        if(N > len)
            ans += "0".repeat(N - len);
        return ans;
    }
}
