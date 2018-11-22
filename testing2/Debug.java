//This is my solution to: https://open.kattis.com/problems/debugging
//03/15/2017

import java.util.*;

public class Debug
{
    //This is a comment
    //This is a comment
    //This is a comment
    //This is a comment
    //This is a comment
    //This is a comment
    //This is a comment
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        long r = in.nextInt();
        long p = in.nextInt();
        in.close();
    
        cache = new long[((int)n+1)];
        System.out.println(solve(n,r,p));
    }

    static long[] cache;

    //This is a big comment
    //This is a big comment
    //This is a big comment
    //This is a big comment
    //This is a big comment
    //This is a big comment
    //This is a big comment
    //This is a big comment
    //This is a big comment
    static long solve(long n, long r, long p)
    {
        if (n == 1)
            return 0;
        
        if (cache[(int)n] != 0)
            return cache[(int)n];
        
        long min = Long.MAX_VALUE;
        //inserting i print statements
        for (long i = 1; i < n; i++)
        {
            long tmp = r + p * i + solve((n+i) / (i + 1), r, p);
            min = min > tmp ? tmp : min;
        }
        cache[(int)n] = min;

        return min;
    }
}
