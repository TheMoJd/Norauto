package Visiteurs;

import Modele.Moteur;
import Modele.Pneu;
import Modele.Voiture;

public class VoitureVisitable implements Visiteur{
  @Override
  public void agitSur(Visitable voiture) {
    System.out.println(voiture.toString());
  }
  @Override
  public void agitSur(Pneu pneu) {
    System.out.println("Pneu: " + pneu.toString());
  }

  @Override
  public void agitSur(Moteur moteur) {
    System.out.println("Moteur: " + moteur.getNumSerie());
  }
}
