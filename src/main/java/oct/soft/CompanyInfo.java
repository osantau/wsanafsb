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
    private String sdenumire_Strada;
	private String snumar_Strada;
	private String sdenumire_Localitate;
	private String scod_Localitate;
	private String sdenumire_Judet;
	private String scod_Judet;
	private String stara;
	private String sdetalii_Adresa;
	private String scod_Postal;
	private String ddenumire_Strada;
	private String dnumar_Strada;
	private String ddenumire_Localitate;
	private String dcod_Localitate;
	private String ddenumire_Judet;
	private String dcod_Judet;
	private String dtara;
	private String ddetalii_Adresa;
	private String dcod_Postal;
	private String data_inregistrare;
	private String cod_CAEN;

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
   
    public String getSdenumire_Strada() {
		return sdenumire_Strada;
	}

	public void setSdenumire_Strada(String sdenumire_Strada) {
		this.sdenumire_Strada = sdenumire_Strada;
	}

	public String getSnumar_Strada() {
		return snumar_Strada;
	}

	public void setSnumar_Strada(String snumar_Strada) {
		this.snumar_Strada = snumar_Strada;
	}

	public String getSdenumire_Localitate() {
		return sdenumire_Localitate;
	}

	public void setSdenumire_Localitate(String sdenumire_Localitate) {
		this.sdenumire_Localitate = sdenumire_Localitate;
	}

	public String getScod_Localitate() {
		return scod_Localitate;
	}

	public void setScod_Localitate(String scod_Localitate) {
		this.scod_Localitate = scod_Localitate;
	}

	public String getSdenumire_Judet() {
		return sdenumire_Judet;
	}

	public void setSdenumire_Judet(String sdenumire_Judet) {
		this.sdenumire_Judet = sdenumire_Judet;
	}

	public String getScod_Judet() {
		return scod_Judet;
	}

	public void setScod_Judet(String scod_Judet) {
		this.scod_Judet = scod_Judet;
	}

	public String getStara() {
		return stara;
	}

	public void setStara(String stara) {
		this.stara = stara;
	}

	public String getSdetalii_Adresa() {
		return sdetalii_Adresa;
	}

	public void setSdetalii_Adresa(String sdetalii_Adresa) {
		this.sdetalii_Adresa = sdetalii_Adresa;
	}

	public String getScod_Postal() {
		return scod_Postal;
	}

	public void setScod_Postal(String scod_Postal) {
		this.scod_Postal = scod_Postal;
	}

	public String getDdenumire_Strada() {
		return ddenumire_Strada;
	}

	public void setDdenumire_Strada(String ddenumire_Strada) {
		this.ddenumire_Strada = ddenumire_Strada;
	}

	public String getDnumar_Strada() {
		return dnumar_Strada;
	}

	public void setDnumar_Strada(String dnumar_Strada) {
		this.dnumar_Strada = dnumar_Strada;
	}

	public String getDdenumire_Localitate() {
		return ddenumire_Localitate;
	}

	public void setDdenumire_Localitate(String ddenumire_Localitate) {
		this.ddenumire_Localitate = ddenumire_Localitate;
	}

	public String getDcod_Localitate() {
		return dcod_Localitate;
	}

	public void setDcod_Localitate(String dcod_Localitate) {
		this.dcod_Localitate = dcod_Localitate;
	}

	public String getDdenumire_Judet() {
		return ddenumire_Judet;
	}

	public void setDdenumire_Judet(String ddenumire_Judet) {
		this.ddenumire_Judet = ddenumire_Judet;
	}

	public String getDcod_Judet() {
		return dcod_Judet;
	}

	public void setDcod_Judet(String dcod_Judet) {
		this.dcod_Judet = dcod_Judet;
	}

	public String getDtara() {
		return dtara;
	}

	public void setDtara(String dtara) {
		this.dtara = dtara;
	}

	public String getDdetalii_Adresa() {
		return ddetalii_Adresa;
	}

	public void setDdetalii_Adresa(String ddetalii_Adresa) {
		this.ddetalii_Adresa = ddetalii_Adresa;
	}

	public String getDcod_Postal() {
		return dcod_Postal;
	}

	public void setDcod_Postal(String dcod_Postal) {
		this.dcod_Postal = dcod_Postal;
	}

	public String getData_inregistrare() {
		return data_inregistrare;
	}

	public void setData_inregistrare(String data_inregistrare) {
		this.data_inregistrare = data_inregistrare;
	}

	public String getCod_CAEN() {
		return cod_CAEN;
	}

	public void setCod_CAEN(String cod_CAEN) {
		this.cod_CAEN = cod_CAEN;
	}

    @Override
	public String toString() {
		return "CompanyInfo [cui=" + cui + ", data=" + data + ", denumire=" + denumire + ", adresa=" + adresa
				+ ", nrRegCom=" + nrRegCom + ", telefon=" + telefon + ", codPostal=" + codPostal
				+ ", stare_inregistrare=" + stare_inregistrare + ", scpTVA=" + scpTVA + ", data_inceput_ScpTVA="
				+ data_inceput_ScpTVA + ", data_sfarsit_ScpTVA=" + data_sfarsit_ScpTVA + ", data_anul_imp_ScpTVA="
				+ data_anul_imp_ScpTVA + ", mesaj_ScpTVA=" + mesaj_ScpTVA + ", dataInceputTvaInc=" + dataInceputTvaInc
				+ ", dataSfarsitTvaInc=" + dataSfarsitTvaInc + ", dataActualizareTvaInc=" + dataActualizareTvaInc
				+ ", dataPublicareTvaInc=" + dataPublicareTvaInc + ", tipActTvaInc=" + tipActTvaInc
				+ ", statusTvaIncasare=" + statusTvaIncasare + ", dataInactivare=" + dataInactivare
				+ ", dataReactivare=" + dataReactivare + ", dataPublicare=" + dataPublicare + ", dataRadiere="
				+ dataRadiere + ", statusInactivi=" + statusInactivi + ", dataInceputSplitTVA=" + dataInceputSplitTVA
				+ ", dataAnulareSplitTVA=" + dataAnulareSplitTVA + ", statusSplitTVA=" + statusSplitTVA + ", iban="
				+ iban + ", statusRO_e_Factura=" + statusRO_e_Factura + ", sdenumire_Strada=" + sdenumire_Strada
				+ ", snumar_Strada=" + snumar_Strada + ", sdenumire_Localitate=" + sdenumire_Localitate
				+ ", scod_Localitate=" + scod_Localitate + ", sdenumire_Judet=" + sdenumire_Judet + ", scod_Judet="
				+ scod_Judet + ", stara=" + stara + ", sdetalii_Adresa=" + sdetalii_Adresa + ", scod_Postal="
				+ scod_Postal + ", ddenumire_Strada=" + ddenumire_Strada + ", dnumar_Strada=" + dnumar_Strada
				+ ", ddenumire_Localitate=" + ddenumire_Localitate + ", dcod_Localitate=" + dcod_Localitate
				+ ", ddenumire_Judet=" + ddenumire_Judet + ", dcod_Judet=" + dcod_Judet + ", dtara=" + dtara
				+ ", ddetalii_Adresa=" + ddetalii_Adresa + ", dcod_Postal=" + dcod_Postal + ", data_inregistrare="
				+ data_inregistrare + ", cod_CAEN=" + cod_CAEN + "]";
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
                getStatusRO_e_Factura()?"DA":"NU",
                getSdenumire_Strada(),
                getSnumar_Strada(),
                getSdenumire_Localitate(),
                getScod_Localitate(),
                getSdenumire_Judet(),
                getScod_Judet(),
                getStara(),
                getSdetalii_Adresa(),
                getScod_Postal(),
                getDdenumire_Strada(),
                getDnumar_Strada(),
                getDdenumire_Localitate(),
                getDcod_Localitate(),
                getDdenumire_Judet(),
                getDcod_Judet(),
                getDtara(),
                getDdetalii_Adresa(),
                getDcod_Postal(),
                getData_inregistrare(),
                getCod_CAEN()
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
                .append("<table class=\"table table-success table-striped table-hover\" id=\"tblData\">")
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
                  .append("<tr><td>Denumire strada sediu:</td><td><strong>").append(
                		  getSdenumire_Strada()).append("</strong></td></tr>")
                  .append("<tr><td>Numar strada sediu:</td><td><strong>").append(
                		  getSnumar_Strada()).append("</strong></td></tr>")
                  .append("<tr><td>Denumire localitate sediu:</td><td><strong>").append(
                		  getSdenumire_Localitate()).append("</strong></td></tr>")
                  .append("<tr><td>Cod localitate sediu:</td><td><strong>").append(
                		  getScod_Localitate()).append("</strong></td></tr>")
                  .append("<tr><td>Denumire judet sediu:</td><td><strong>").append(
                		  getSdenumire_Judet()).append("</strong></td></tr>")
                  .append("<tr><td>Cod judet sediu:</td><td><strong>").append(
                		  getScod_Judet()).append("</strong></td></tr>")
                  .append("<tr><td>Denumire tara sediu:</td><td><strong>").append(
                		  getStara()).append("</strong></td></tr>")
                  .append("<tr><td>Detalii adresa sediu:</td><td><strong>").append(
                		  getSdetalii_Adresa()).append("</strong></td></tr>")
                  .append("<tr><td>Cod postal sediu:</td><td><strong>").append(
                		  getScod_Postal()).append("</strong></td></tr>")
                  .append("<tr><td>Denumire strada domiciliu fiscal:</td><td><strong>").append(
                		  getDdenumire_Strada()).append("</strong></td></tr>")
                  .append("<tr><td>Numar strada domiciliu fiscal:</td><td><strong>").append(
                		  getDnumar_Strada()).append("</strong></td></tr>")
                  .append("<tr><td>Denumire localitate domiciliu fiscal:</td><td><strong>").append(
                		  getDdenumire_Localitate()).append("</strong></td></tr>")
                  .append("<tr><td>Cod localitate domiciliu fiscal:</td><td><strong>").append(
                		  getDcod_Localitate()).append("</strong></td></tr>")
                  .append("<tr><td>Denumire judet domiciliu fiscal:</td><td><strong>").append(
                		  getDdenumire_Judet()).append("</strong></td></tr>")
                  .append("<tr><td>Cod judet domiciliu fiscal:</td><td><strong>").append(
                		  getDcod_Judet()).append("</strong></td></tr>")
                  .append("<tr><td>Denumire tara domiciliu fiscal:</td><td><strong>").append(
                		  getDtara()).append("</strong></td></tr>")
                  .append("<tr><td>Detalii adresa domiciliu fiscal:</td><td><strong>").append(
                		  getDdetalii_Adresa()).append("</strong></td></tr>")
                  .append("<tr><td>Cod postal domiciliu fiscal:</td><td><strong>").append(
                		  getDcod_Postal()).append("</strong></td></tr>")
                  .append("<tr><td>Data inregistrare:</td><td><strong>").append(
                		  getData_inregistrare()).append("</strong></td></tr>")
                  .append("<tr><td>Cod CAEN:</td><td><strong>").append(
                		  getCod_CAEN()).append("</strong></td></tr>")
                .append("</table>")
               /* .append("</body></html>")*/;
        return sb.toString();
    }
}
