package com.altn72.tpfilrouge.controleur;

import com.altn72.tpfilrouge.modele.Programmeur;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProgrammeurControleur {
//    @GetMapping("/hello")
//    public List<String>  afficherHello() {
//        List <String> liste = new ArrayList<>();// ou juste =List<String> liste = new ArrayList<>(Arrays.asList("Hello", "LSI", "I2/2025_26"));
//        liste.add("Hello");
//        liste.add("LSI");
//        liste.add("I2/2025_26");
//        System.out.println(liste);
//
//        System.out.println(programmeur);
//        return liste;
//   }
@GetMapping("/programmeurs")
public List<Programmeur> afficherInfosProgrammeurs() {
    List<Programmeur> programmeurs = new ArrayList<>();

    //objet programmeur
    Programmeur programmeur1 = new Programmeur(20221426, "Camara", "Oumou","Paris","Java","The Princess Diaries",4307.34);
    Programmeur programmeur2 = new Programmeur(1, "Doe", "John", "123 Main St", "Java", "Clean Code", 60000.0);
    programmeurs.add(programmeur1);
    programmeurs.add(programmeur2);
    System.out.println(programmeurs); // affichage dans la console
        return programmeurs;// affichage sur la page web
   }
}
