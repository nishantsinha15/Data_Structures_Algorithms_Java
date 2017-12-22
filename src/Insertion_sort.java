import java.util.Scanner;

public class Insertion_sort
{
    private static final int N = 5;
    int a[] = new int[N];
    Scanner scan = new Scanner(System.in);

    public void take_input()
    {
        for( int i = 0; i<N; i++)
            a[i] = scan.nextInt();
    }

    //Question tip - why not go in the forward direction?
    public void sort()
    {
        int i,k;
        for( i = 1; i < N; i++ )
        {
            int value = a[i];
            for( k = i-1; k >= 0 ; k-- )
            {
                if( value < a[k] )
                    a[k+1] = a[k];
                else
                {
                    a[k+1] = value;
                    break;
                }
            }
            if( k == -1 )
                a[0] = value;
        }
    }

    public void print()
    {
        for( int w : a )
            System.out.print(w + " ");
        System.out.println();
    }
}
