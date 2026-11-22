class Solution {
    public boolean checkString(String s) {
        int n=s.length();
        boolean flag=true;
        

        for(int i=0;i<n-1;i++){
            char ch=s.charAt(i);
            if(ch=='b' && s.charAt(i+1)=='a'){
                flag=false;
                break;
            }
        }
        return flag;
    }
}