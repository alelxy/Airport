public abstract class Curse {
    private double pret;
    private int nrPasageri;
    private boolean escala;
    private String destinatie;

    public Curse(final double pret, final int nrPasageri, final boolean escala, final String destinatie) {
        this.pret = pret;
        this.nrPasageri = nrPasageri;
        this.escala = escala;
        this.destinatie = destinatie;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(final double pret) {
        this.pret = pret;
    }

    public int getNrPasageri() {
        return nrPasageri;
    }

    public void setNrPasageri(final int nrPasageri) {
        this.nrPasageri = nrPasageri;
    }

    public boolean isEscala() {
        return escala;
    }

    public void setEscala(final boolean escala) {
        this.escala = escala;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(final String destinatie) {
        this.destinatie = destinatie;
    }

}