class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder s=new StringBuilder();

        while(columnNumber >0){
            columnNumber -=1;
            s.append((char)('A'+ columnNumber % 26));
            columnNumber/=26;
        }
        return s.reverse().toString();
    }
}