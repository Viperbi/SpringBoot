package com.adrar.hello;

import com.adrar.hello.model.Livre;
import com.adrar.hello.service.HelloWorldService;
import com.adrar.hello.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class HelloApplication implements CommandLineRunner {
    @Autowired
    private HelloWorldService helloWorldService;

    @Autowired
    private LivreService livreService;

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(helloWorldService.getHelloWorld());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Supprimer un livre");
            System.out.println("3. Afficher la liste des livres");
            System.out.println("4. Quitter");
            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    livreService.add();
                    break;
                case 2:
                    livreService.remove();
                    break;
                case 3:
                    livreService.findAll();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choix invalide");
            }
        }
    }
}
