package Factory;

import Modele.Voiture;

import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
public class VoitureFactoryJson {
  public List<Voiture> creerVoiture(String json) throws IOException {
    ObjectMapper mapper = new ObjectMapper();

    //Lire le fichier JSON
    List<Voiture> voitures = mapper.readValue(new File(json), new TypeReference<List<Voiture>>(){});

    //Vérifier les numéros de série uniques
    HashSet<Integer> numerosSeries = new HashSet<>();
    for (Voiture voiture : voitures) {
      if (!numerosSeries.add(voiture.getMoteur().getNumSerie())) {
        System.out.println("Numéro de série dupliqué détecté : " + voiture.getMoteur().getNumSerie());
      }
    }
    return voitures;
  }
}
