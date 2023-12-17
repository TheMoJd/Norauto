package Visiteurs;

import Modele.Moteur;
import Modele.Pneu;

public interface Visiteur {
  void agitSur(Visitable voiture);
  void agitSur(Pneu pneu);
  void agitSur(Moteur moteur);
}
