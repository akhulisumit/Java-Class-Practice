import java.net.*;
import java.io.*;

public class GoogleGeminiAPI {

    public static void main(String[] args) {
        try {
            // Your actual API key
            String apiKey = "AIzaSyCPlObYrqLzHXLjZzYKqFNTDjKWk3S6jZE";  // Replace with your API key
            // URL for the Gemini API endpoint
            String apiEndpoint = "https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash-latest:generateContent?key=" + apiKey;

            // Create the JSON payload
            String jsonPayload = "{"
                    + "\"contents\": ["
                    + " {"
                    + "\"parts\": ["
                    + " {\"text\": \"A code to sum two numbers in java\"}"
                    + " ]"
                    + " }"
                    + "]}";

            // Create a URL object
            URL url = new URL(apiEndpoint);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST"); // Use POST method
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            // Send the JSON payload as the request body
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonPayload.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Get the response code
            int responseCode = connection.getResponseCode();
            System.out.println("HTTP Response Code: " + responseCode);

            // Read the response from the input stream
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                System.out.println("Response: " + response.toString());
            } else {
                // Handle error response
                BufferedReader errorReader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                StringBuilder errorResponse = new StringBuilder();
                String errorLine;
                while ((errorLine = errorReader.readLine()) != null) {
                    errorResponse.append(errorLine);
                }
                errorReader.close();
                System.out.println("Error Response: " + errorResponse.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
