// This code finds and prints all twin prime pairs up to 1200.

public class TwinPrimes {
    public static void main(String[] args) {
        int prime1=2;
        int isPrime=0;
        for(int x=2;x<1200;x++)
        {
            isPrime=1;
            for(int y=2;y<x;y++)
            {
                if(x%y==0)
                {
                    isPrime=0;
                    break;
                }
            }
            if(isPrime==1)
            {
                if((x-prime1)==2)
                {
                    System.out.println("("+prime1+","+x+")");
                }
                prime1=x;
            }
        }
        
    }
}
