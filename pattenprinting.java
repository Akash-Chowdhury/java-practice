import java.util.*;
public class pattenprinting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //String s="";
        int n=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            System.out.print("1");
            System.out.print('\n');
        }
    }
}
