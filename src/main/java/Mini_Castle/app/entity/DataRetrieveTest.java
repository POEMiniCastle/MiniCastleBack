package miniCastle.entity;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class DataRetrieveTest {
	public static void main(String[] args) {
		String apiUrl = "http://10.125.52.59:8080/api/card";

		try {
			// Create URL object
			URL url = new URL(apiUrl);

			// Open connection
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			// Set request method
			conn.setRequestMethod("GET");

			// Get response code
			int responseCode = conn.getResponseCode();

			if (responseCode == HttpURLConnection.HTTP_OK) {
				// Read response
				BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				String line;
				StringBuilder response = new StringBuilder();

				while ((line = reader.readLine()) != null) {
					response.append(line);
				}
				reader.close();

				// Parse JSON response
				ObjectMapper mapper = new ObjectMapper();
				JsonNode rootNode = mapper.readTree(response.toString());

				// Process card data
				List<Card> cards = new ArrayList<>();
				for (JsonNode cardNode : rootNode) {
					int cardId = cardNode.get("id").asInt();
					String cardName = cardNode.get("card_name").asText();
					String cardType = cardNode.get("card_type").asText();
					String description = cardNode.get("description").asText();
					int scoreValue = cardNode.get("score_value").asInt();
					String cardImagePath = cardNode.get("card_image_path").asText();

					Card card = new Card(cardId, cardName, cardType, description, scoreValue, cardImagePath);
					cards.add(card);
				}

				// Print card data
				for (Card card : cards) {
					System.out.println(card);
				}
			} else {
				System.out.println("Error: " + responseCode);
			}

			// Disconnect the connection
			conn.disconnect();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}