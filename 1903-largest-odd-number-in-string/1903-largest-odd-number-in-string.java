class Solution {
    public String largestOddNumber(String num) {
        int n=num.length()-1;
        int index=-1;
        String ans="";
        for(int i=n;i>=0;i--)
        {
            
            if((num.charAt(i)-'0')%2==1){
                index=i;
                break;
            }
        }
        if(index==-1)
            return "";

        int i=0;
        while(num.charAt(i)=='0')
            i++;
        
        return num.substring(i,index+1);
    }
}