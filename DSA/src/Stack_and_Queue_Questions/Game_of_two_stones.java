package Stack_and_Queue_Questions;



import java.util.*;
class Game_of_two_stones{
 public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    for (int i=0;i<n;i++){
        int arr1= sc.nextInt();
        int arr2=sc.nextInt();
        int armax= sc.nextInt();
        int []a1= new int[arr1];
        int []a2= new int[arr2];
        for(int m=0;m<arr1;m++){
            a1[i]=sc.nextInt();
        }
        for(int j=0;j<arr1;j++){
            a2[j]=sc.nextInt();
        }
        System.out.println(twostacks(armax,a1,a2));
    }
    
}
static int twostacks(int x,int[] a1,int[] a2){
    return helper(x,a1,a2,0,0);
}
static int helper(int x,int[] a1,int[] a2,int sum,int count){
    if(sum>x){
        return count;
    }
    if(a1.length==0 || a2.length==0){
        return count;
    }
    int ans1= helper(x,Arrays.copyOfRange(a1, 1, a1.length),a2,sum+a1[0],count+1);
    int ans2= helper(x,a1,Arrays.copyOfRange(a2, 1, a2.length),sum+a2[0],count+1);
    return Math.max(ans1,ans2);
}

}

