package MarktplaatsManager.api;

import com.google.gson.Gson;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ParseException; // Dodaj ten import
import org.apache.hc.core5.http.io.entity.EntityUtils;

import java.io.IOException;

public class ApiClient {
    private final String apiUrl = "https://api.marktplaats.nl";  // Przykladowy adres API
    private final String apiKey = "YOUR_API_KEY";  // Tutaj wstaw swój klucz API
    private final Gson gson = new Gson();

    public String getAuctions() throws IOException, ParseException {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(apiUrl + "/auctions");
            request.setHeader("Authorization", "Bearer " + apiKey);

            try (CloseableHttpResponse response = httpClient.execute(request)) {
                return EntityUtils.toString(response.getEntity());
            }
        }
    }
}
