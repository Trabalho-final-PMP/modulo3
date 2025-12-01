package br.com.fatec.modulo3.function;

import br.com.fatec.modulo3.function.dto.NewsDto;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class NewsFunction {
    @Bean
    public Consumer<NewsDto> newsConsumer() {
        return news -> {
            System.out.println("Notícia: " + news);
        };
    }
}
