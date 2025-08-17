package AAAAAAAAAAAAAAAAAAAAAAA;

import java.util.ArrayList;

public class ShortArray {

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,3,4,5};


        String s="kisjhhahj";
        s.length();

        int max= Integer.MIN_VALUE;
        ArrayList<Integer>  ans=new ArrayList<>();

        ArrayList<Integer>  ans1=new ArrayList<>();

        for(int i=0;i<arr.length;i++) {
            ans.add(arr[i]);

        }
        System.out.println(ans);


      // boolean isSwapped =true;

        for(int i=0;i<ans.size();i++)
        {                               //  1,2,3,4,5,3,4,5

            for(int j=1;j<ans.size()-1;j++) {
                if (ans.get(i) < ans.get(j))
                {
                 max=ans.get(j);
                }
                ans1.add(max);
               // ans.remove(max);
            }

           System.out.println(max);


//            ans1.add(max);
           ans.remove(max);

        }

        System.out.println(ans1);


    }
}
