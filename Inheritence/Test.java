import java.util.* ;
Class Test {
	public static void main(String args []) {
	Scanner scan= new Scanner(System.in);
	int N;
	System.out.println("Please enter the number of tyres in the vehicle");
    N= scan.nextInt();

    switch(N)
   {
   case 2 : 
   Bike newbike = new bike();
   newbike.display();
   break;

   case 4 :
    Car newcar = new car();
    newcar.display();
    break;

    default :
    Vehicle newvehicle  = new vehicle();
    newvehicle.display();
    break;
   }
	}
}




