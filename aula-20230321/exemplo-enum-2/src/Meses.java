public enum Meses {
    jan,
    fev,
    mar,
    abr,
    mai,
    jun,
    jul,
    ago,
    set,
    out,
    nov,
    dez;

    public Meses getNext() {
        int p = this.ordinal();

        if (p == Meses.values().length - 1) {
            return Meses.values()[0];
        } else {
            return Meses.values()[p + 1];
        }
    }
}
