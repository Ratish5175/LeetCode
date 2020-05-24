package RCV;


public class DivideBS {

    public int divide(int dividend, int divisor) {
        
        int q =0;
        boolean flagNeg = false;
        boolean add = false;
        long checkLimit = dividend;
        if(dividend<0 && divisor<0 )
        {
            divisor = divisor - divisor -divisor;
            checkLimit = -dividend;
            if(dividend == -2147483648)
            {
            	dividend = 2147483647;
            }
        }
         else if(dividend<0 && divisor >0)
            {
        	 
        	 dividend = dividend- dividend-dividend;
             if(dividend == -2147483648)
             {
             	dividend = 2147483647;
             }
        	 flagNeg = true;
        	 add= true;
            }
          else if(divisor<0)
          {
              divisor = divisor - divisor -divisor;
              flagNeg = true;
          }
        while(dividend >=divisor)
        {
           
                dividend= dividend - divisor;
                q++;
        
        }
        if(flagNeg) {
        	if(add)
        	{
        		return -(q+divisor-1);
        	}
        	else
        		return (-q);
            
        }
        else
            return q;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivideBS divideBS = new DivideBS();
		
		int a = -2147483648;
		int b = 2;
		System.out.println( divideBS.divide(a,b));
	}

}
