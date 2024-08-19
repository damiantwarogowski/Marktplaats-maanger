package MarktplaatsManager;

import MarktplaatsManager.service.AuctionService;

public class Main {
    public static void main(String[] args) {
        AuctionService auctionService = new AuctionService();

        // Przykładowe uruchomienie pobierania aukcji
        try {
            auctionService.getAllAuctions().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
