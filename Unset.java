package sample;

import java.util.Scanner;

public class Unset {
	public static int unset(int N,int i)
    {
        if(checkbit(N,i))
        {
            return N^(1<<i);
        }
        return N;
    }
    public static Boolean checkbit(int N,int i)
    {
        if((N & (1<<i))!=0)
            return (true);
            return (false);
    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int A = n.nextInt();
        int B = n.nextInt();
        System.out.println(unset(A,B));
    }

}
