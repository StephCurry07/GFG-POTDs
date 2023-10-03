public class Oct4_ExcelNumbers {
    String colName (long n){
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            n--;
            sb.append((char)((int)(n%26) + 'A'));
            n = n/26;
        }
        return sb.reverse().toString();
    }
}
