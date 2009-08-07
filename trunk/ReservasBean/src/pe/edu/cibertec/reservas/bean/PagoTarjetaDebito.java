package pe.edu.cibertec.reservas.bean;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.C8062084-3DBD-EA4C-6662-A2D5341618F4]
// </editor-fold> 
public class PagoTarjetaDebito extends Pago {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E00EB7D1-3F00-29A3-5832-2BF797DF7FAE]
    // </editor-fold> 
    private int numTarjeta;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BF172F71-0F7D-8436-0D1D-3E096856634C]
    // </editor-fold> 
    private int numAutoriza;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0EE62B1C-0F6D-D313-116F-58B8788059BF]
    // </editor-fold> 
    public PagoTarjetaDebito () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1E2C7D1B-0CCA-FB29-DB1E-4F3608A26F63]
    // </editor-fold> 
    public int getNumAutoriza () {
        return numAutoriza;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.212064E6-6729-C5BF-4097-4F3EF448474F]
    // </editor-fold> 
    public void setNumAutoriza (int val) {
        this.numAutoriza = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.85EA0847-2F00-5038-A1CC-38EE50AA0900]
    // </editor-fold> 
    public int getNumTarjeta () {
        return numTarjeta;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.079B8C87-FE33-ABD7-6BE4-FFCB7B5D7217]
    // </editor-fold> 
    public void setNumTarjeta (int val) {
        this.numTarjeta = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C2765FC2-83B0-CFB4-8B5A-EE26A73B4DF1]
    // </editor-fold> 
    public int getCodigo () {
        return 0;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.33844657-CA83-9798-8635-E9C76B44D09E]
    // </editor-fold> 
    public void setCodigo (int val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E183C8D5-5B8A-E916-BD1D-F818F4AB6B56]
    // </editor-fold> 
    public double getMontoPago () {
        return 0.0;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D457D2D8-F8B9-121A-C7E3-C952F78913A8]
    // </editor-fold> 
    public void setMontoPago (double val) {
    }

}

