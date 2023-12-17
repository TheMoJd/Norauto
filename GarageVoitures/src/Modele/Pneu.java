package Modele;
import Visiteurs.*;
public class Pneu implements Visitable{
  Double hauteur = 0.0;
  Double largeur = 0.0;
  Boolean hiver = false;
  String marque;

  public Pneu(Double hauteur, Double largeur, Boolean hiver, String marque) {
    this.hauteur = hauteur;
    this.largeur = largeur;
    this.hiver = hiver;
    this.marque = marque;
  }

  public Double getHauteur() {
    return hauteur;
  }

  public void setHauteur(Double hauteur) {
    this.hauteur = hauteur;
  }

  public Double getLargeur() {
    return largeur;
  }

  public void setLargeur(Double largeur) {
    this.largeur = largeur;
  }

  public Boolean getHiver() {
    return hiver;
  }

  public void setHiver(Boolean hiver) {
    this.hiver = hiver;
  }

  public String getMarque() {
    return marque;
  }

  public void setMarque(String marque) {
    this.marque = marque;
  }

  @Override
  public void applique(Visiteur unVisiteur) {
    unVisiteur.agitSur(this);
  }
}
