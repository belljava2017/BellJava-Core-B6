
public class Operators {

	public static void main(String[] args) {
		
		String day = "Monday";
		
		if(day=="Monday"){
			System.out.println("Today is monday");
		}else if(day=="Tuesday"){
			System.out.println("Today is Tuesday");
		}else{
			System.out.println("Please enter valid day");
		}
		
		//Switch Case
		
      switch(day){
      case "Monday":
    	  System.out.println("Today is monday in SWithcase");
          break;
      case "Tuesday":    
    	  System.out.println("Today is monday in SWithcase");
          break;
      default:
    	  System.out.println("Please enter valid day in SWithcase");
      }
		
		
	}

}
