public class CurseInterne extends Curse {

    public CurseInterne(final double pret, final int nrPasageri, final boolean escala, final String destinatie) {
        super(pret, nrPasageri, escala, destinatie);
    }

    @Override
    public String toString() {
        return "pret=" + super.getPret() +
            ", nrPasageri=" + super.getNrPasageri() +
            ", escala=" + super.isEscala() +
            ", destinatie='" + super.getDestinatie() +"'";
    }
}