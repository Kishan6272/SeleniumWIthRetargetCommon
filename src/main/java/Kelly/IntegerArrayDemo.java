package Kelly;

public class IntegerArrayDemo {

    public static void main(String[] args) {
        int []arr= {5, 1, 10, 111, 2, 6,3};

        int j=1;
        for (int i=0;i<arr.length;i++)
        {
            while(arr[i]>arr[j] )
            {
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;

            }
        }

        for(int k=0;k<arr.length;k++) {

            System.out.print(arr[k]+" ");
        }



    }
}
