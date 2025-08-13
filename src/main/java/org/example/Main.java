package org.example;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class Main {
    public static void main(String[] args) {

        try (var client = Client.builder().apiKey("AIzaSyAjEmUY0DsUshV1BA3xD8lFK-aPFEkjTzo").build()) {
            GenerateContentResponse response =
                    client.models.generateContent(
                            "gemini-2.5-flash",
                            "Add postgres support to program at /home/sergeyk/IdeaProjects.tutorial/Test2/GeminiTest2/src/main/java/org/example/Main.java",
                            null);
            System.out.println(response.text());
        }
    }
}
