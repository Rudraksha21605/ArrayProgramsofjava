public class Movingzeroestoend {
    public static void hello(int[] arr){
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0){
                if(i!=j)
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            j++;
            }
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args){
        int[] arr={9,0,7,3,0,5,4};
        int n=arr.length;
        hello(arr);
    }
    
}
