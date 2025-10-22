import java.time.*;
import java.util.Scanner;

public class Booking {
    private String BookingID ;
    private String BookingStatus ;
    private int BookingRoom ;
    LocalDateTime BookingTime ;

    Booking(){
        BookingTime = LocalDate.now().atStartOfDay();
        this.BookingStatus = "Pending" ;
    }

    void BookingStsToggle(){
        if(this.BookingStatus.equals("Pending")){
            Scanner sc = new Scanner(System.in);
            System.out.println("Did you want to book the Room Now ? (Y/N) :");
            String ans = sc.nextLine();
            if( ans.trim().equals(("Y").toLowerCase())){
                this.BookingStatus = "Checked-In";
                this.BookingTime = LocalDateTime.now();
                System.out.println("Booking CheckedIn at : "+this.BookingTime);
                System.out.println("Do you want to pay now ? (Y/N) : ");
                String payAns = sc.nextLine();
                if( payAns.trim().equals(("Y").toLowerCase())){

                }
            }
            else{
                System.out.println("Booking Still Pending");
            }
        }
    }

    //CheckIn
    int TotalDaysStays( LocalDateTime timeIn , LocalDateTime timeOut){
        int timeInHrs =    Integer.parseInt (timeIn.toString().substring(11,13));
        int timeOutHrs =  Integer.parseInt(timeOut.toString().substring(11,13));
        int tineInDate = Integer.parseInt (timeIn.toString().substring(8,10));
        int timeOutDate = Integer.parseInt (timeOut.toString().substring(8,10));
        int totalDays = timeOutDate - tineInDate ;
        int totalHrs = timeOutHrs - timeInHrs ;
        if( totalHrs > 0 ){
            return (totalDays*24) + totalHrs ;
        }
        else{
            return (totalDays*24) - totalHrs ;
        }
    }


    double BookingAmount(int BookingTimeLimits, String RoomsType  ){

        // 2025-10-19T14:30:45.123
        if( RoomsType.equals("Couple Type")){
            return (((double) BookingTimeLimits /24)*3020.5);
        }
        else if( RoomsType.equals("Single Type")){
            return (((double) BookingTimeLimits / 24)*1500.0);
        }
        else if( RoomsType.equals("Family Type")){
            return (((double) BookingTimeLimits / 24)*15500.89);
        }
        return 0.0;
    }
}
