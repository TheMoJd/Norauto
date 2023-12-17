package Facade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Modele.*;
import Factory.*;
import Visiteurs.Visiteur;

public class Garage {
  List<Voiture> voitures;
  VoitureFacrtory voitureFacrtory;

  VoitureFactoryJson voitureFactoryJson;
  public Garage() {
    voitureFacrtory = new VoitureFacrtory();
    voitures = new ArrayList<Voiture>();
  }

  public void addVoiture(String marque, String modele, int numSerie, double largeur, double hauteur, String marquePneu) {
    Voiture voiture = voitureFacrtory.creerVoiture(marque, modele, numSerie, largeur, hauteur, marquePneu);
    voitures.add(voiture);
  }

  public void addVoiture(Voiture voiture) {
    voitures.add(voiture);
  }

  public void removeVoiture(Voiture voiture) {
    voitures.remove(voiture);
  }

  public void removeVoiture(int index) {
    voitures.remove(index);
  }
  public Voiture getVoiture(int index) {
    return voitures.get(index);
  }

  public List<Voiture> getVoitures() {
    return voitures;
  }


  private void updatePneuLargeur(Double largeur, int indexVoiture, int indexPneu){
    this.voitures.get(indexVoiture).getPneus().get(indexPneu).setLargeur(largeur);
  }

  private void updatePneuHauteur(Double hauteur, int indexVoiture, int indexPneu){
    this.voitures.get(indexVoiture).getPneus().get(indexPneu).setHauteur(hauteur);

  }

  private void updatePneuMarque(String marquePneu, int indexVoiture, int indexPneu){
    this.voitures.get(indexVoiture).getPneus().get(indexPneu).setMarque(marquePneu);
  }

  private void updatePneuHiver(Boolean hiver, int indexVoiture, int indexPneu){
    this.voitures.get(indexVoiture).getPneus().get(indexPneu).setHiver(hiver);
  }

  private void updateMoteur(int numSerie, int indexVoiture){
    this.voitures.get(indexVoiture).getMoteur().setNumSerie(numSerie);
  }

  public void chargerVoitureDepuisFichier(String cheminFichier) throws IOException {
    VoitureFactoryJson factory = new VoitureFactoryJson();
    List<Voiture> voituresLus = factory.creerVoiture(cheminFichier);
    for (Voiture voiture : voituresLus) {
      if (!this.voitures.contains(voiture)) {
        this.voitures.add(voiture);
      }
    }
  }

  public void afficherVoitures(Visiteur visiteur) {
    for (Voiture voiture : voitures) {
      voiture.applique(visiteur);
    }
  }



}
