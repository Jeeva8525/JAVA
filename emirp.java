//prints first 120 emirp numbers
//An emirp number is a prime number that results in a different prime number when its digits are reversed.
//For example, 13 is an emirp because it is prime and its reverse, 31, is also prime.
public class emirp {
    public static int isPrime(int a)
    {
        for(int x=2;x<a;x++)
        {
            if(a%x==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static int reverseValue(int a)
    {
        int result=0;
        int temp=a;
        
        while(a>0)
        {
            result=result*10+a%10;
            a/=10;
        }
        if(result==temp){
            return 4; // to make the isPrime(reverseValue(a)) as False
        }
        return result;
    }
    public static void main(String[] args) {

        int spaceMaker=0;
        for(int x=10,count=0;count<120;x++)
        {
            if( (isPrime(x)==1 && isPrime(reverseValue(x))==1))
            {
                System.out.print(x+" ");
                count++;
                spaceMaker=1;
            }
            if(count%10==0 && spaceMaker==1)
            {
                System.out.println();
                spaceMaker=0;
            }
        }
    }
}
