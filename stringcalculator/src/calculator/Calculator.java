package calculator;

class StringCalculator {
    public int add(String input) throws Exception {
    	int sum=0;
    	if (input.length()==0) {
        return 0;
        }
    	else if (input.length()==1) {
    		 int x =Integer.parseInt(input);
    		 if(x<0) {
    			 throw new Exception("Negative number not allowed");
    		 }
            return x ;
            } 
    	else if (input.length()>=10) {
   		 
           return 0 ;
           }
    	else {
    		for(int i=0;i<input.length();i=i+2) {
    			int x =Integer.parseInt(input, input.charAt(i));
    			if(x<0) {
       			 throw new Exception("Negative number not allowed");
       		 }
    			sum=sum+x;
    		}
    		return sum;
    	}
    }
}