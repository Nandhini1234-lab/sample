public class Guess{
    public static void main(string[]args)
    {
        Scannerin-new Scanner(System.in);
        int n=in.nextInt();
        int count =0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}