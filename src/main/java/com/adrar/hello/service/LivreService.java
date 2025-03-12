package com.adrar.hello.service;

import com.adrar.hello.model.Livre;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class LivreService {

    public void add(){
        Livre livre = new Livre();
        System.out.println("Quel est le titre du livre que voulez vous ajouter ?");
        Scanner scanner = new Scanner(System.in);
        livre.setTitre(scanner.next());
        System.out.println("Quelle est la description du livre que voulez vous ajouter ?");
        livre.setDescription(scanner.next());
        System.out.println("Quelle est la date de publication du livre que voulez vous ajouter ?");
        livre.setDatePublication(scanner.next());
        System.out.println(livre.toString());
    }

    public Livre getLivre(){
               return new Livre();
    }
}
