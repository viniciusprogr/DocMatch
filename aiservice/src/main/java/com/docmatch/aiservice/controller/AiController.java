package com.docmatch.aiservice.controller;


import com.docmatch.aiservice.service.AiService;
import dev.langchain4j.service.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai")
public class AiController {

    private final AiService aiService;

    public AiController(AiService aiService) {
        this.aiService = aiService;
    }

    @PostMapping("/triagem")
    public String askAssistente(@RequestBody String mensagem) {
        Result<String> result = aiService.handleMessage(mensagem);
        return result.content();
    }
}
