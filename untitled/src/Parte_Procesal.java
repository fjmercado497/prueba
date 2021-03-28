public class Parte_Procesal {
    private String tipop;
    private String personadema;

    public Parte_Procesal(String tipop, String personadema, String personademandada) {
        this.tipop = tipop;
        this.personadema = personadema;
        this.personademandada = personademandada;
    }

    public String getTipop() {
        return tipop;
    }

    public void setTipop(String tipop) {
        this.tipop = tipop;
    }

    public String getPersonadema() {
        return personadema;
    }

    public void setPersonadema(String personadema) {
        this.personadema = personadema;
    }

    public String getPersonademandada() {
        return personademandada;
    }

    public void setPersonademandada(String personademandada) {
        this.personademandada = personademandada;
    }

    private String personademandada;
}
