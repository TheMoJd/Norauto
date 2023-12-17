package Factory;
import Modele.*;

public class VoitureFacrtory {
  private int nbVoiture = 0;
  private final int nbPneu = 4;

  /**
   *
   * @param marque
   * @param modele
   * @param numSerie
   * @param largeur
   * @param hauteur
   * @param marquePneu
   * @return Voiture
   * */

  public Voiture creerVoiture(String marque, String modele, int numSerie, double largeur, double hauteur, String marquePneu) {
    Moteur moteur = new Moteur(numSerie);
    Voiture voiture = new Voiture(marque, modele, moteur);
    for (int i = 0; i < nbPneu; i++) {
      Pneu pneu = new Pneu(hauteur, largeur, false, marquePneu);
      voiture.setPneu(pneu);
    }
    nbVoiture++;
    return voiture;
  }

  public int getNbVoiture() {
    return nbVoiture;
  }

  public int getNbPneu() {
    return nbPneu;
  }
}
