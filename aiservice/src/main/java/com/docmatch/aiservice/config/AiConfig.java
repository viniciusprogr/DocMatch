package com.docmatch.aiservice.config;

import com.docmatch.aiservice.service.AiService;
import dev.langchain4j.service.AiServices;
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiConfig {

    @Value("${gemini.api.key}")
    private String geminiApiKey;

    @Value("${gemini.model}")
    private String geminiModel;

    @Bean
    public GoogleAiGeminiChatModel googleAiGeminiChatModel() {
        return GoogleAiGeminiChatModel.builder()
                .apiKey(geminiApiKey)
                .modelName(geminiModel)
                .build();
    }

    @Bean
    public AiService aiService(GoogleAiGeminiChatModel googleAiGeminiChatModel ) {
        return AiServices.builder(AiService.class)
                .chatModel(googleAiGeminiChatModel)
                .build();
    }
}
