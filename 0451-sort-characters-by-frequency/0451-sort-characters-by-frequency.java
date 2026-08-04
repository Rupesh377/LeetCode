class Solution {
    class Pair
    {
        int freq;
        char ch;

        Pair(int freq,char ch)
        {
            this.freq=freq;
            this.ch=ch;
        }
    }
    public String frequencySort(String s) {
        
    Pair[] freq=new Pair[128];
    for(int i=0;i<128;i++)
        freq[i]=new Pair(0,(char)(i));
    
    for( char ch:s.toCharArray())
    {
        freq[ch].freq++;
    }

    Arrays.sort(freq, (p1,p2)->p2.freq-p1.freq);
    
    StringBuilder ans=new StringBuilder();

    for(Pair p:freq)
    {
        if(p.freq >0)
        {
            for(int i=0;i<p.freq;i++)
                ans.append(p.ch);
        }
    }
    return ans.toString();
    }
}


//         StringBuilder sb = new StringBuilder();
//         for (P) {
//             if (p.freq>0) {
//                 for (int i= 0;i< p.freq;i++)
//                     sb.append(p.ch);
//             }
//         }
//         return sb.toString();
//     }
//     class Pair
//     {
//         int freq;
//         char ch;

//         Pair(int freq , char ch)
//         {
//             this.freq=freq;
//             this.ch=ch;
//         }
//     }
// }