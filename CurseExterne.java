public class CurseExterne extends Curse {
    private String taraLinieAeriana;

    public CurseExterne(final double pret, final int nrPasageri, final boolean escala, final String destinatie, final String taraLinieAeriana) {
        super(pret, nrPasageri, escala, destinatie);
        this.taraLinieAeriana = taraLinieAeriana;
    }

    public String getTaraLinieAeriana() {
        return taraLinieAeriana;
    }

    public void setTaraLinieAeriana(final String taraLinieAeriana) {
        this.taraLinieAeriana = taraLinieAeriana;
    }

    @Override
    public String toString() {
        return "pret=" + super.getPret() +
            ", nrPasageri=" + super.getNrPasageri() +
            ", escala=" + super.isEscala() +
            ", destinatie='" + super.getDestinatie() +"' "
            + "taraLinieAeriana='" + this.taraLinieAeriana +"'";
    }
}