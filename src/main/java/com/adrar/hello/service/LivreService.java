package com.adrar.hello.service;

import com.adrar.hello.model.Livre;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class LivreService {

    private List<Livre> liste;

    public LivreService() {
        liste = new ArrayList<Livre>();
    }

    public List<Livre> getListe() {
        return liste;
    }

    public void setListe(List<Livre> liste) {
        this.liste = liste;
    }

    public void add(){
        Livre livre = new Livre();
        System.out.println("Quel est le titre du livre que voulez vous ajouter ?");
        Scanner scanner = new Scanner(System.in);
        livre.setTitre(scanner.nextLine());
        System.out.println("Quelle est la description du livre que voulez vous ajouter ?");
        livre.setDescription(scanner.nextLine());
        System.out.println("Quelle est la date de publication du livre que voulez vous ajouter ?");
        livre.setDatePublication(scanner.nextLine());
        System.out.println("Quel est le genre du livre que voulez vous ajouter ?");
        livre.setGenre(scanner.nextLine());
        liste.add(livre);

    }

    public void remove(){
        System.out.println("Quel est le titre du livre que voulez vous supprimer ?");
        Scanner scanner = new Scanner(System.in);
        String titre = scanner.nextLine();
        for (Livre livre : liste) {
            if (livre.getTitre().equals(titre)) {
                liste.remove(livre);
                break;
            }
        }
    }

    public void findAll(){
        for (Livre livre : liste) {
            System.out.println(livre);
        }
    }

    public Livre getLivre(){
               return new Livre();
    }
}
