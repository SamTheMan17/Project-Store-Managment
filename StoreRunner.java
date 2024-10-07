import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Binders myBinders = new Binders("3 Ring", 8.00, "yellow");
    Markers myMarkers = new Markers("Sharpie", 5.00, "thick");
    int choice = 0;

   System.out.print("** School Supply Store **\n"); //this is just a line to let the user know what store they are in

   while(choice >= 0) {
     System.out.print("\nEnter 1 for Binder info or 2 for Marker info and -1 to quit: "); //Allows for the user to input information 
     choice = input.nextInt(); //assign the entered number to choice
     input.nextLine(); //input.nextLine(); clears out scanner when int is used
  

    if(choice == 1) {
     System.out.print("\nWhat color would you want your binder to be?: ");
     String colorInput =  input.nextLine(); 
     myBinders.setColor(colorInput);
     System.out.print("\nDetail - " + myBinders.toString());
    }else if (choice == 2) {
     System.out.print("\nWhat thickness do you want your marker to be? (skinny,thick, or normal): "); //Allows for the user to input information 
     String sizeInput =  input.nextLine();
     myMarkers.setSize(sizeInput);
     System.out.print("\nDetail - " + myMarkers.toString()); 
}  
}
  }
}
    