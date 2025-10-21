import java.time.*;

public class Booking {
    private String BookingID ;
    private String BookingStatus ;
    private int BookingRoom ;
    LocalDateTime BookingTime ;

    Booking(){
        BookingTime = LocalDate.now().atStartOfDay();

    }

    int TotalDaysStays( LocalDateTime timeIn , LocalDateTime timeOut){
        String timeInS = timeIn.toString().substring(11,13);
        String timeOutS = timeOut.toString().substring(11,13);
    }


    double BookingAmount(int BookingTimeLimits, String RoomsType ){
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
