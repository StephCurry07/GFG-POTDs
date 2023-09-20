public class Sep20_rotateBits {
    ArrayList<Integer> rotate(int N, int D){
        ArrayList<Integer> ans = new ArrayList();
        D = D % 16;
        int left = (N << D | (N >> (16 - D))) & 0xFFFF;
        int right = (N >> D | (N << (16 - D))) & 0xFFFF;
        ans.add(left);
        ans.add(right);
        return ans;
    }
}
