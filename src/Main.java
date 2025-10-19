import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel h = new Hotel();
        Scanner scHotel = new Scanner(System.in);
        while(true){
            System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Select the Following Services :");
            System.out.println("1. Find Available Rooms. ");
            System.out.println("2. Search Room Details By entering Room Number. ");
            System.out.println("3. Add Room. ");
            System.out.println("4. Check-out Room. ");
            System.out.print("5. Exit\nOption: ");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
            int service = scHotel.nextInt();
            if(service == 1){
                h.AvailableRoom();
            } else if (service == 2) {
                System.out.println("Enter a Room Number to find details :");
                int roomSearch = scHotel.nextInt();
                scHotel.nextLine();
                h.searchRoomNumber(roomSearch);
            } else if (service == 3) {
                h.addNewRoom();
            } else if (service == 4) {
                System.out.println("Enter Room Number for CheckOut :");
                int roomCheckOut = scHotel.nextInt();
                scHotel.nextLine();
                h.checkOutRoom(roomCheckOut);
            }
            else if(service == 5){
                System.out.println("  🙏 Thank You 🙏  ");
                scHotel.close();
                break;
            }
        }
    }
}