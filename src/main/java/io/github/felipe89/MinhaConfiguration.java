package io.github.felipe89;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class MinhaConfiguration {

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("ESTOU CHAMANDO A CLASSE MINHA CONFIGURAÇÃO COM ANOTATION  DEV");
        };
    }
}
