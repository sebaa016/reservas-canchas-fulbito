package pe.edu.cibertec.reservas.bean;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.7E1CA917-55B8-9E94-9459-1130E39F4D60]
// </editor-fold> 
public class PagoTarjetaCredito extends Pago {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CB9B2933-6EF1-B9B0-0778-786B125E12E3]
    // </editor-fold> 
    private int numTarjeta;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B8AF1033-6D6D-651B-F13B-F41F622752B6]
    // </editor-fold> 
    private int numAutoriza;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C9898B24-E602-6018-AD70-30138C93EA38]
    // </editor-fold> 
    private int cuotas;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.65D02FCA-976B-250C-2351-D196B1907A1C]
    // </editor-fold> 
    public PagoTarjetaCredito () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.97754E28-440D-8F09-5BB2-B190746C4AFB]
    // </editor-fold> 
    public int getCuotas () {
        return cuotas;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E2752808-6C47-0BB6-8874-3DADE8861C60]
    // </editor-fold> 
    public void setCuotas (int val) {
        this.cuotas = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A8780E63-CDD2-B19F-EA53-FE056CD35925]
    // </editor-fold> 
    public int getNumAutoriza () {
        return numAutoriza;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5271F084-0F5C-9AF5-FA0B-0AD7F495AB98]
    // </editor-fold> 
    public void setNumAutoriza (int val) {
        this.numAutoriza = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E0F819BF-90EA-97F0-D2D7-45FDF286CDF4]
    // </editor-fold> 
    public int getNumTarjeta () {
        return numTarjeta;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8C1F8E95-A521-C1A9-94EA-6D812C060B63]
    // </editor-fold> 
    public void setNumTarjeta (int val) {
        this.numTarjeta = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E7A1B713-6F31-C59D-6616-F9B409935DA6]
    // </editor-fold> 
    public int getCodigo () {
        return 0;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BB138B44-6730-8AAA-310E-2A897B69EBB6]
    // </editor-fold> 
    public void setCodigo (int val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A871C545-254F-143E-353D-6172079FB75D]
    // </editor-fold> 
    public double getMontoPago () {
        return 0.0;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.159D9254-407D-DC50-0C7A-439F7C73123E]
    // </editor-fold> 
    public void setMontoPago (double val) {
    }

}

