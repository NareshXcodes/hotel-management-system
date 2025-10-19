import java.util.*;
import java.time.*;

public class Room {
    int roomNumber; // was initialized from Hotel.i — now set when booking
    private String type ;
    private double price ;
    private boolean status = true;
    private String checkInName , checkInId ;
    private String checkOutName , checkOutId ;
    LocalDateTime CheckOutTime ,  CheckInTime ;




    void getRoom(){
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("------- Room Details --------");
        System.out.print("Check-In time: ");
        System.out.println(CheckInTime);
        System.out.println("Room Number : "+this.roomNumber);
        System.out.println("Person Name: "+this.checkInName);
        System.out.println("Type of Room: "+this.type);
        System.out.println("Price of the Room: "+ this.price);
        if( RoomAvailability()){
            System.out.println("Status of the Room :  Available");
        }
        else{
            System.out.println("Status of the Room : Not Available/Free");
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
    }

    void setRoom(){
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        // assign the room number here; do NOT increment Hotel.i from inside Room
        this.roomNumber = Hotel.i;
        CheckInTime = LocalDateTime.now();
        System.out.println("\nPlease Enter Following Details to Book a Room");
        System.out.println("Enter name of the person who booking this room : ");
        checkInName = scan.nextLine();
        System.out.println("Enter "+checkInName+"'s valid Document ID :");
        checkInId = scan.nextLine();
        System.out.print("Select Which type Room are they wanted and their Price (for 24hrs)  ?\n1. Couple Type \n2. Single Type \n3. Family Type\nOption : ");
        int roomType = scan.nextInt();
        if( roomType == 1){
            this.type = "Couple Type";
            price = 3020.5 ;
        } else if (roomType == 2) {
            this.type = "Single Type";
            this.price = 1500.0;
        } else if (roomType == 3) {
            this.type = "Family Type";
            this.price = 15500.89;
        }
        status = false ;
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
    }


    public boolean RoomAvailability(){
        return status; // true means available
    }
    void RoomStatusToggle(){
            Scanner sc = new Scanner(System.in);
        System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("------- Room Checkout Selected --------");
            System.out.println("Please Enter Following Details to Checkout");
            System.out.println("Enter name of the person who booked this room : ");
            checkOutName = sc.nextLine();
            System.out.println("Enter "+checkOutName+"'s Document ID :");
            checkOutId = sc.nextLine();
            // null-safe comparison
            if( checkInId != null && checkOutId != null && checkInId.equals(checkOutId)
                && checkInName != null && checkOutName != null && checkInName.equals(checkOutName)){
                CheckOutTime = LocalDateTime.now();

                System.out.println("!! Room CheckOut Completed , They can leave now !!\nCheck-Out Time : ");
                System.out.println("\t " + CheckOutTime);
                this.status = true ;
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
            }
            else{
                System.out.println("!! Error in the details fill correct details !!\nTry Again................");
                RoomStatusToggle();
            }
    }

}
