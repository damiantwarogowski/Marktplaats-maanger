package MarktplaatsManager.service;

import MarktplaatsManager.api.ApiClient;
import MarktplaatsManager.model.Auction;

import java.io.IOException;

public class AuctionService {
    private final ApiClient apiClient = new ApiClient();

    public List<Auction> getAllAuctions() throws IOException {
        String responseJson = apiClient.getAuctions();
        // Konwertuj JSON na listę aukcji
        // Użyj Gson lub Jackson
    }


    public void editAuction(Auction auction) {
        // Logika edytowania aukcji
    }

    public void repostAuction(Auction auction) {
        // Logika usuwania i wystawiania aukcji ponownie
    }
}