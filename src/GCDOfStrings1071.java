class GCDOfStrings1071 {
    int gcd(int x, int y){
        while (y!=0){
            int c = x%y;
            x = y;
            y = c;
        }
        return x;
    }
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1+str2).equals(str2+str1)){
            return "";
        }
        int gcd1 = gcd(str1.length(),str2.length());
        return str1.substring(0,gcd1);
    }
}