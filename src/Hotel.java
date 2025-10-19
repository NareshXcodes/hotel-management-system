public class Hotel {
    static int i = 0;
    Room[] r = new Room[100];

    Hotel(){
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Welcome To Our Hotel Taj (🌟5-Star Hotel )");
        System.out.println("We have 100 Room of Different type of Services as Following :");
        System.out.println("1. 👨‍🦰 Single Type Rooms ( For Single people , only One Adult is allowed ) ");
        System.out.println("2. 👪 Couple Type Rooms ( For Couple's , Almost Two Adult and Two Children[<18 age] )");
        System.out.println("3. 👨‍👩‍👧‍ Family Type Rooms (For Family Groups , Almost 8 people ( Adult and child are taken as 1 person )");
        System.out.println(" Pricing For Rooms :\n1. Couple Type - ₹3020.5 /-\n2. Single Type - ₹1500.0 /-\n3. Family Type - ₹15500.89 /-");
        System.out.println("Penalty for Staying out of Check-Out Timing is : ₹200 per person + Bill generate for Next 24 hours ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
    }

    void AvailableRoom(){
        System.out.println("\nRoom Number are Available : ");
        for(int j = 0 ; j < i ; j++){
            if(r[j] != null && r[j].RoomAvailability()){
                System.out.print(r[j].roomNumber+",\t");
            }
        }
        System.out.println("Total Room Booked till now : "+i);

    }

    void checkOutRoom(int room){
        // ensure requested index is within created rooms and not null
        if(room < 0 || room >= i || r[room] == null){
            System.out.println("!! No Checkout for this Room !!");
        }
        else{
            r[room].RoomStatusToggle();
        }

    }
    void addNewRoom(){
        r[i] = new Room();
        r[i].setRoom();
        i++;
    }
    void searchRoomNumber(int search){
        if (search >= 0 && search < i && r[search] != null){
           r[search].getRoom();
        }
        else {
            System.out.println("No details found for this room or it hasn't been booked yet.");
        }
    }
}
