package oct.soft;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyInfo {

    private int cui;
    private String data;
    private String denumire;
    private String adresa;
    private String nrRegCom;
    private String telefon;
    private String codPostal;
    private String stare_inregistrare;
    private boolean scpTVA;
    private String data_inceput_ScpTVA;
    private String data_sfarsit_ScpTVA;
    private String data_anul_imp_ScpTVA;
    private String mesaj_ScpTVA;
    private String dataInceputTvaInc;
    private String dataSfarsitTvaInc;
    private String dataActualizareTvaInc;
    private String dataPublicareTvaInc;
    private String tipActTvaInc;
    private boolean statusTvaIncasare;
    private String dataInactivare;
    private String dataReactivare;
    private String dataPublicare;
    private String dataRadiere;
    private boolean statusInactivi;
    private String dataInceputSplitTVA;
    private String dataAnulareSplitTVA;
    private boolean statusSplitTVA;
    private String iban;
    private boolean statusRO_e_Factura;

    // Getter Methods
    public int getCui() {
        return cui;
    }

    public String getData() {
        return data;
    }

    public String getDenumire() {
        return denumire;
    }

    public String getAdresa() {
        return adresa;
    }

    public boolean getScpTVA() {
        return scpTVA;
    }

    public String getData_inceput_ScpTVA() {
        return data_inceput_ScpTVA;
    }

    public String getData_sfarsit_ScpTVA() {
        return data_sfarsit_ScpTVA;
    }

    public String getData_anul_imp_ScpTVA() {
        return data_anul_imp_ScpTVA;
    }

    public String getMesaj_ScpTVA() {
        return mesaj_ScpTVA;
    }

    public String getDataInceputTvaInc() {
        return dataInceputTvaInc;
    }

    public String getDataSfarsitTvaInc() {
        return dataSfarsitTvaInc;
    }

    public String getDataActualizareTvaInc() {
        return dataActualizareTvaInc;
    }

    public String getDataPublicareTvaInc() {
        return dataPublicareTvaInc;
    }

    public String getTipActTvaInc() {
        return tipActTvaInc;
    }

    public boolean getStatusTvaIncasare() {
        return statusTvaIncasare;
    }

    public String getDataInactivare() {
        return dataInactivare;
    }

    public String getDataReactivare() {
        return dataReactivare;
    }

    public String getDataPublicare() {
        return dataPublicare;
    }

    public String getDataRadiere() {
        return dataRadiere;
    }

    public boolean getStatusInactivi() {
        return statusInactivi;
    }

    public String getDataInceputSplitTVA() {
        return dataInceputSplitTVA;
    }

    public String getDataAnulareSplitTVA() {
        return dataAnulareSplitTVA;
    }

    public boolean getStatusSplitTVA() {
        return statusSplitTVA;
    }

    // Setter Methods
    public void setCui(int cui) {
        this.cui = cui;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setScpTVA(boolean scpTVA) {
        this.scpTVA = scpTVA;
    }

    public void setData_inceput_ScpTVA(String data_inceput_ScpTVA) {
        this.data_inceput_ScpTVA = data_inceput_ScpTVA;
    }

    public void setData_sfarsit_ScpTVA(String data_sfarsit_ScpTVA) {
        this.data_sfarsit_ScpTVA = data_sfarsit_ScpTVA;
    }

    public void setData_anul_imp_ScpTVA(String data_anul_imp_ScpTVA) {
        this.data_anul_imp_ScpTVA = data_anul_imp_ScpTVA;
    }

    public void setMesaj_ScpTVA(String mesaj_ScpTVA) {
        this.mesaj_ScpTVA = mesaj_ScpTVA;
    }

    public void setDataInceputTvaInc(String dataInceputTvaInc) {
        this.dataInceputTvaInc = dataInceputTvaInc;
    }

    public void setDataSfarsitTvaInc(String dataSfarsitTvaInc) {
        this.dataSfarsitTvaInc = dataSfarsitTvaInc;
    }

    public void setDataActualizareTvaInc(String dataActualizareTvaInc) {
        this.dataActualizareTvaInc = dataActualizareTvaInc;
    }

    public void setDataPublicareTvaInc(String dataPublicareTvaInc) {
        this.dataPublicareTvaInc = dataPublicareTvaInc;
    }

    public void setTipActTvaInc(String tipActTvaInc) {
        this.tipActTvaInc = tipActTvaInc;
    }

    public void setStatusTvaIncasare(boolean statusTvaIncasare) {
        this.statusTvaIncasare = statusTvaIncasare;
    }

    public void setDataInactivare(String dataInactivare) {
        this.dataInactivare = dataInactivare;
    }

    public void setDataReactivare(String dataReactivare) {
        this.dataReactivare = dataReactivare;
    }

    public void setDataPublicare(String dataPublicare) {
        this.dataPublicare = dataPublicare;
    }

    public void setDataRadiere(String dataRadiere) {
        this.dataRadiere = dataRadiere;
    }

    public void setStatusInactivi(boolean statusInactivi) {
        this.statusInactivi = statusInactivi;
    }

    public void setDataInceputSplitTVA(String dataInceputSplitTVA) {
        this.dataInceputSplitTVA = dataInceputSplitTVA;
    }

    public void setDataAnulareSplitTVA(String dataAnulareSplitTVA) {
        this.dataAnulareSplitTVA = dataAnulareSplitTVA;
    }

    public void setStatusSplitTVA(boolean statusSplitTVA) {
        this.statusSplitTVA = statusSplitTVA;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public boolean getStatusRO_e_Factura() {
        return statusRO_e_Factura;
    }

    public void setStatusRO_e_Factura(boolean statusRO_e_Factura) {
        this.statusRO_e_Factura = statusRO_e_Factura;
    }

    public String getNrRegCom() {
        return nrRegCom;
    }

    public void setNrRegCom(String nrRegCom) {
        this.nrRegCom = nrRegCom;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getStare_inregistrare() {
        return stare_inregistrare;
    }

    public void setStare_inregistrare(String stare_inregistrare) {
        this.stare_inregistrare = stare_inregistrare;
    }

    @Override
    public String toString() {
        return "CompanyInfo{" + "cui=" + cui + ", data=" + data + ", denumire=" + denumire + ", adresa=" + adresa + ", nrRegCom=" + nrRegCom + ", telefon=" + telefon + ", codPostal=" + codPostal + ", stare_inregistrare=" + stare_inregistrare + ", scpTVA=" + scpTVA + ", data_inceput_ScpTVA=" + data_inceput_ScpTVA + ", data_sfarsit_ScpTVA=" + data_sfarsit_ScpTVA + ", data_anul_imp_ScpTVA=" + data_anul_imp_ScpTVA + ", mesaj_ScpTVA=" + mesaj_ScpTVA + ", dataInceputTvaInc=" + dataInceputTvaInc + ", dataSfarsitTvaInc=" + dataSfarsitTvaInc + ", dataActualizareTvaInc=" + dataActualizareTvaInc + ", dataPublicareTvaInc=" + dataPublicareTvaInc + ", tipActTvaInc=" + tipActTvaInc + ", statusTvaIncasare=" + statusTvaIncasare + ", dataInactivare=" + dataInactivare + ", dataReactivare=" + dataReactivare + ", dataPublicare=" + dataPublicare + ", dataRadiere=" + dataRadiere + ", statusInactivi=" + statusInactivi + ", dataInceputSplitTVA=" + dataInceputSplitTVA + ", dataAnulareSplitTVA=" + dataAnulareSplitTVA + ", statusSplitTVA=" + statusSplitTVA + ", iban=" + iban + ", statusRO_e_Factura=" + statusRO_e_Factura + '}';
    }
  
    public List<Object> getValues() {
        return Arrays.asList(getCui(),
                getData(),
                getDenumire(),                
                getAdresa(),
                getNrRegCom(),
                getTelefon(),
                getCodPostal(),
                getStare_inregistrare(),
                getScpTVA()?"DA":"NU",
                getData_inceput_ScpTVA(),
                getData_sfarsit_ScpTVA(),
                getData_anul_imp_ScpTVA(),
                getMesaj_ScpTVA(),
                getDataInceputTvaInc(),
                getDataSfarsitTvaInc(),
                getDataActualizareTvaInc(),
                getDataPublicareTvaInc(),
                getTipActTvaInc(),
                getStatusTvaIncasare()?"DA":"NU",
                getDataInactivare(),
                getDataReactivare(),
                getDataPublicare(),
                getDataRadiere(),
                getStatusInactivi()?"DA":"NU",
                getDataInceputSplitTVA(),
                getDataAnulareSplitTVA(),
                getStatusSplitTVA()?"DA":"NU",
                getIban(),
                getStatusRO_e_Factura()?"DA":"NU"
        );
    }
    
    public String getHtmlInfo() {
        StringBuilder sb = new StringBuilder();
        sb
        /*
        .append("<!doctype html>")
                .append("<html><head><meta charset='utf-8'><title>Verificare Agent economic ").append(getDenumire()).append("</title></head>")
                .append("<body>")*/
                .append("<h2>Rezultat</h2>")
                .append("<table class=\"table table-success table-striped table-hover\">")
                .append("<tr><td>CUI:</td><td>").append(getCui()).append("</td></tr>")
                 .append("<tr><td>Data pt. care se efectueaza cautarea:</td><td><strong>").append(getData()).append("</td></tr>")
                 .append("<tr><td>Denumire:</td><td>").append(getDenumire()).append("</strong></td></tr>")
                .append("<tr><td>Adresa:</td><td>").append(getAdresa()).append("</td></tr>")
                .append("<tr><td>Nr. Reg. Com. :</td><td>").append(getNrRegCom()).append("</td></tr>")
                .append("<tr><td>Telefon:</td><td>").append(getTelefon()).append("</td></tr>")
                .append("<tr><td>Cod Postal:</td><td>").append(getCodPostal()).append("</td></tr>")
                .append("<tr><td>Stare inregistrare:</td><td>").append(getStare_inregistrare()).append("</td></tr>")
                .append("<tr><td>Platitor  in scopuri de TVA la data cautata:</td><td><strong>").append(
                        getScpTVA() ? "DA":"NU").append("</strong></td></tr>")
                .append("<tr><td>Data inregistrarii in scopuri de TVA anterioara:</td><td>").append(
                        getData_inceput_ScpTVA()).append("</td></tr>")                
                .append("<tr><td>Data anularii inregistrarii in scopuri de TVA:</td><td>").append(
                        getData_sfarsit_ScpTVA()).append("</td></tr>")          
                .append("<tr><td>Data operarii anularii inregistrarii in scopuri de TVA:</td><td>").append(
                        getData_anul_imp_ScpTVA()).append("</td></tr>")          
                .append("<tr><td>MESAJ:</td><td><strong>").append(
                        getMesaj_ScpTVA()).append("</strong></td></tr>")  
                 .append("<tr><td>Data de la care aplica sistemul TVA la incasare:</td><td>").append(
                        getDataInceputTvaInc()).append("</td></tr>")      
                .append("<tr><td>Data pana la care aplica sistemul TVA la incasare:</td><td>").append(
                        getDataSfarsitTvaInc()).append("</td></tr>")
                 .append("<tr><td>Data actualizarii TVA la incasare:</td><td>").append(
                        getDataActualizareTvaInc()).append("</td></tr>")
                .append("<tr><td>Data publicarii TVA la incasare:</td><td>").append(
                        getDataPublicareTvaInc()).append("</td></tr>")
                  .append("<tr><td>Tip actualizare TVA la incasare:</td><td>").append(
                        getTipActTvaInc()).append("</td></tr>")
                  .append("<tr><td>Platitor TVA la incasare la data cautata:</td><td><strong>").append(
                        getStatusTvaIncasare()?"DA":"NU").append("</strong></td></tr>")
                  .append("<tr><td>Data inactivare:</td><td>").append(
                        getDataInactivare()).append("</td></tr>")
                .append("<tr><td>Data reactivare:</td><td>").append(
                        getDataReactivare()).append("</td></tr>")
                .append("<tr><td>Data publicare:</td><td>").append(
                        getDataPublicare()).append("</td></tr>")
                .append("<tr><td>Data radiere:</td><td>").append(
                        getDataRadiere()).append("</td></tr>")
                .append("<tr><td>Inactiv la data cautata:</td><td><strong>").append(
                        getStatusInactivi()?"DA":"NU").append("</strong></td></tr>")
                 .append("<tr><td>Data inceput split TVA:</td><td>").append(
                        getDataInceputSplitTVA()).append("</td></tr>")
                .append("<tr><td>Data anulare split TVA:</td><td>").append(
                        getDataAnulareSplitTVA()).append("</td></tr>")
                .append("<tr><td>Aplica plata defalcata a Tva la data cautata:</td><td><strong>").append(
                        getStatusSplitTVA()?"DA":"NU").append("</strong></td></tr>")                
                .append("<tr><td>Contul IBAN:</td><td><strong>").append(
                        getIban()).append("</strong></td></tr>")
                  .append("<tr><td>Figureaza in Registrul RO e-Factura:</td><td><strong>").append(
                        getStatusRO_e_Factura()?"DA":"NU").append("</strong></td></tr>")
                .append("</table>")
               /* .append("</body></html>")*/;
        return sb.toString();
    }
}
