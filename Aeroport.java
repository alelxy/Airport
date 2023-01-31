import java.util.*;

public class Aeroport {

  private List<Curse> list = new ArrayList<Curse>();

  private static Aeroport instance = null;

  private Aeroport() {
  }

  public static final Aeroport getInstance() {
    if (instance == null) {
      instance = new Aeroport();
    }

    return instance;
  }

  public void adaugaCursa(Curse c) throws PreaMulteCurseException {
    if (list.size() < 30) {
      list.add(c);
      System.out.println("Ruta adaugata cu success!");
    } else {
      throw new PreaMulteCurseException();
    }
  }

  public void afisareCurse() {
    list.forEach(e -> System.out.println(e));
  }

  public void afisareCurseExterne() {
    for (Curse c : list) {
      if (c instanceof CurseExterne) {
        System.out.println(c);
      }
    }
  }
}