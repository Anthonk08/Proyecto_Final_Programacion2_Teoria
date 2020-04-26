
package proyecto_final_programacion2.Logica;


public class Clientes {
    
    private String codcli;
    private String cedcli;
    private String nomcli;
    private String telcli;
    private String celcli;
    private String dircli;
    private String emacli;
    private String notcli;
    private String tipocf;
    private String codcon;
    private String codmon;
    private String codempven;
    private boolean estado;

    public Clientes(String codcli, String cedcli, String nomcli, String telcli, String celcli, String dircli, String emacli, String notcli, String tipocf, String codcon, String codmon, String codempven, boolean estado) {
        this.codcli = codcli;
        this.cedcli = cedcli;
        this.nomcli = nomcli;
        this.telcli = telcli;
        this.celcli = celcli;
        this.dircli = dircli;
        this.emacli = emacli;
        this.notcli = notcli;
        this.tipocf = tipocf;
        this.codcon = codcon;
        this.codmon = codmon;
        this.codempven = codempven;
        this.estado = estado;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public String getCedcli() {
        return cedcli;
    }

    public void setCedcli(String cedcli) {
        this.cedcli = cedcli;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public String getTelcli() {
        return telcli;
    }

    public void setTelcli(String telcli) {
        this.telcli = telcli;
    }

    public String getCelcli() {
        return celcli;
    }

    public void setCelcli(String celcli) {
        this.celcli = celcli;
    }

    public String getDircli() {
        return dircli;
    }

    public void setDircli(String dircli) {
        this.dircli = dircli;
    }

    public String getEmacli() {
        return emacli;
    }

    public void setEmacli(String emacli) {
        this.emacli = emacli;
    }

    public String getNotcli() {
        return notcli;
    }

    public void setNotcli(String notcli) {
        this.notcli = notcli;
    }

    public String getTipocf() {
        return tipocf;
    }

    public void setTipocf(String tipocf) {
        this.tipocf = tipocf;
    }

    public String getCodcon() {
        return codcon;
    }

    public void setCodcon(String codcon) {
        this.codcon = codcon;
    }

    public String getCodmon() {
        return codmon;
    }

    public void setCodmon(String codmon) {
        this.codmon = codmon;
    }

    public String getCodempven() {
        return codempven;
    }

    public void setCodempven(String codempven) {
        this.codempven = codempven;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
