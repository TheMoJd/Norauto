package Modele;

import Modele.Moteur;
import Modele.Pneu;
import Visiteurs.*;

import java.util.ArrayList;
import java.util.List;

public class Voiture implements Visitable {
  String marque;

  String modele;

  Moteur moteur;

  static List<Pneu> pneus;

  public Voiture(String marque, String modele, Moteur moteur) {
    this.moteur = moteur;
    pneus = new ArrayList<Pneu>(4);
  }

  public String getMarque() {
    return marque;
  }

  public void setMarque(String newMarque) {
    marque = newMarque;
  }

  public String getModele() {
    return modele;
  }

  public void setModele(String newModele) {
    modele = newModele;
  }

  public Moteur getMoteur() {
    return moteur;
  }

  public void setMoteur(Moteur newMoteur) {
    moteur = newMoteur;
  }

  public static List<Pneu> getPneus() {
    return pneus;
  }

  public void setPneus(List<Pneu> pneus) {
    this.pneus = pneus;
  }

  public void setPneu(Pneu pneu) {
    this.pneus.add(pneu);
  }

  @Override
  public String toString() {
    StringBuffer result = new StringBuffer("voiture : \n");
    result.append("Marque :");
    result.append(marque);
    result.append("\nModele :");
    result.append(modele);

    result.append("\n" + moteur.toString());

    for (Pneu pneu : pneus) {
      result.append("\n" + pneu.toString());
    }
    return result.toString();
  }


  @Override
  public void applique(Visiteur unVisiteur) {
    unVisiteur.agitSur(this);
  }
}
