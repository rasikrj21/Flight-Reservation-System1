package FRS;

public class Main {
    public static void main(String[] args) {
        Ticket regularTicket = new RegularTicket("L89F2C", "Leh",
                "Mumbai", "12:00", "18:30",
                "9A", 12855, false, null, null, "lunch");

        Ticket touristTicket = new TouristTicket("CBKFTW", "Delhi", "Mumbai",
                "15:50", "18:05",
                "10A", 7000, false, null, null,
                "ITC Hotel", new String[]{""});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }
}
