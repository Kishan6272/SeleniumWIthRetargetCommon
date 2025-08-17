package AAAAAAA11111111;

import java.util.HashMap;

public class ABHGHGHG {



    public static void main(String[] args) {


        String  s="Kishan";

        char [] ch= s.toCharArray();

        HashMap<Character,Integer> hm=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(ch[i]))
            {
                int val= hm.get(ch[i]);
                hm.put(ch[i],val+1);
            }
            else
                hm.put(ch[i],1);
        }

        System.out.println(hm);



    }
}
