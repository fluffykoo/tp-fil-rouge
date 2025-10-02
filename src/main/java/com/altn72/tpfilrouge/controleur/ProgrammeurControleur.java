package com.altn72.tpfilrouge.controleur;

import com.altn72.tpfilrouge.modele.Programmeur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tpfilrouge")
public class ProgrammeurControleur {
    @Autowired
    private final ProgrammeurService programmeurService;

    public ProgrammeurControleur(ProgrammeurService programmeurService) {
        this.programmeurService = programmeurService;
    }

    @GetMapping("/programmeurs")
    public List<Programmeur> afficherInfosProgrammers() {
        return programmeurService.afficherInfosProgrammeurs();
    }


    @GetMapping("/programmeur/{idProgrammeur}")
    public Optional<Programmeur> afficherUnProgrammeur(@PathVariable Integer idProgrammeur) {

        return programmeurService.getUnProgrammeur(idProgrammeur);
    }

    @DeleteMapping("/programmeur/supprimer/{idProgrammeur}")
    public Optional<Programmeur> deleteUnProgrammeur(@PathVariable Integer idProgrammeur) {
        return programmeurService.deleteUnProgrammeur(idProgrammeur);
    }
//    @PutMapping("/programmeur/modifier/{udProgrammeur}")
//    public Programmeur putProgrammeur(@PathVariable Integer idProgrammeur, @RequestBody Programmeur programmeurModifie) {
//        return programmeurService.putProgrammeur(idProgrammeur, programmeurModifie);
//
    @PutMapping("/programmeur/modifierPut/{idProgrammeur}")
    public Optional<Programmeur> putUnProgrammeur(@PathVariable Integer idProgrammeur, @RequestBody Programmeur programmeurModifie) {
        return programmeurService.putUnProgrammeur(idProgrammeur, programmeurModifie);
    }

    @PatchMapping("/programmeur/modifierPatch/{idProgrammeur}")
    public Optional<Programmeur> patchUnProgrammeur(@PathVariable Integer idProgrammeur, @RequestBody Programmeur programmeurModifie) {
        return programmeurService.patchUnProgrammeur(idProgrammeur, programmeurModifie);
    }

    @PostMapping("/programmeurs")
    public Programmeur postUnProgrammeur(@RequestBody Programmeur nouveauProgrammeur) {
        return programmeurService.postUnProgrammeur(nouveauProgrammeur);
    }
}

//version tp partie 1-2
 /*
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
*/