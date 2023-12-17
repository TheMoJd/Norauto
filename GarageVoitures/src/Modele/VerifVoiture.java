package Modele;
import Factory.VoitureFacrtory;
public class VerifVoiture {
  public boolean verifVide(Voiture voiture) {
    if (voiture.getMarque() == null) {
      return false;
    }
    if (voiture.getModele() == null) {
      return false;
    }
    if (voiture.getMoteur() == null) {
      return false;
    }
    for (Pneu pneu : voiture.getPneus()) {
      if (pneu == null) {
        return false;
      }
    }
    return true;
  }

  public boolean verifPneus(Pneu G, Pneu D) {
      if (G.getHauteur() <=0.0 || G.getHauteur() > 100.0) {
        return false;
      }
      if (D.getLargeur() <= 0.0 || D.getLargeur() > 100.0) {
        return false;
      }
      if(!G.getLargeur().equals(D.getLargeur()) ) {
        return false;
      }
      if (!G.getHauteur().equals(D.getHauteur())) {
        return false;
      }
      return true;
  }
  public boolean VerifTous(Voiture voiture){
    if (verifVide(voiture) == false) {
      return false;
    }
    if (verifPneus(voiture.getPneus().get(0), voiture.getPneus().get(1)) == false) {
      return false;
    }
    if (verifPneus(voiture.getPneus().get(2), voiture.getPneus().get(3)) == false) {
      return false;
    }

    if (verifPneus(voiture.getPneus().get(1), voiture.getPneus().get(3)) == false) {
      return false;
    }
    if (verifPneus(voiture.getPneus().get(0), voiture.getPneus().get(2)) == false) {
      return false;
    }

    if(voiture.getMoteur().getNumSerie() <= 0) {
      return false;
    }

    return true;
  }
}
