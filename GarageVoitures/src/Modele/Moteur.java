package Modele;

import Visiteurs.Visitable;
import Visiteurs.Visiteur;

public class Moteur implements Visitable {
  Integer numSerie;

  public Moteur(Integer numSerie) {
    this.numSerie = numSerie;
  }

  public Integer getNumSerie() {
    return numSerie;
  }

  public void setNumSerie(Integer numSerie) {
    this.numSerie = numSerie;
  }

  @Override
  public void applique(Visiteur unVisiteur) {
    unVisiteur.agitSur(this);
  }
}
