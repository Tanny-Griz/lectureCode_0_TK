package w11_ai_topic_2_integrating_ai_tools;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class Main {
    public static void main(String[] args) {
        System.out.println("Make sure you have created a Gemini API key at https://aistudio.google.com/app/apikey");
        System.out.println("And, you've created an environment variable called GEMINI_API_KEY to store it.");

        Client client = new Client();

        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-2.5-flash",
                        "Explain what an environment variable is for",
                        null
                );

        System.out.println(response.text());

    }
}
