import java.util.Scanner;
public class Missingno{
    public static void main(String[] args)
    {Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=i)
            {
                print(i);
                
                break;
            }
            print(n);

            }
        }
    }

