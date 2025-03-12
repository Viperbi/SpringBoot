package com.adrar.hello.controller;

import com.adrar.hello.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class LivreController {

    private LivreService livreService;

    public LivreController() {
        this.livreService = new LivreService();
    }


    public void router(){
        while(true) {
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Supprimer un livre");
            System.out.println("3. Afficher la liste des livres");
            System.out.println("4. Quitter");
            Scanner scanner = new Scanner(System.in);
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
