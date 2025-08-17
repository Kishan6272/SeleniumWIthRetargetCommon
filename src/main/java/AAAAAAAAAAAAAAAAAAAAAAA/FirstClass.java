package AAAAAAAAAAAAAAAAAAAAAAA;

import java.util.HashMap;

public class FirstClass {


    public static void main(String[] args) {
        String a="Test Automation";

       String s= a.toLowerCase();
       s=a.replace(" ","").toLowerCase();

        System.out.println(a);

       StringBuilder stringBuilder=new StringBuilder();

       //stringBuilder.



        System.out.println(s);

        char []ch = s.toCharArray();


        HashMap<Character,Integer>  hm=new HashMap<>();


        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(ch[i]) && (!hm.containsKey(ch[i]==' ')) )
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
