package pe.edu.cibertec.reservas.bean;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.CA222401-D4E4-4A5E-2C07-B6819BC278ED]
// </editor-fold> 
public abstract class Pago {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2C6450BB-3A2D-BE30-5277-A79F475C3337]
    // </editor-fold> 
    private int codigo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DD0FBAFC-C0A6-3D85-D177-9BF832A28FFA]
    // </editor-fold> 
    private double montoPago;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A7BEF16E-C74F-A34C-8421-7DB5E4956379]
    // </editor-fold> 
    private MedioPago mMedioPago;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.821691B7-7AAF-A964-3975-E6E8F84A5123]
    // </editor-fold> 
    public Pago () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6096734D-5F31-A28C-C7F2-C89675868D8A]
    // </editor-fold> 
    public int getCodigo () {
        return codigo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.17D8BA93-A408-71BD-2D8E-52CED7E7B31A]
    // </editor-fold> 
    public void setCodigo (int val) {
        this.codigo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C29F558D-4CD5-787A-2FEB-8FF0BBFA71D5]
    // </editor-fold> 
    public MedioPago getMedioPago () {
        return mMedioPago;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8B07D36F-F41E-860A-01C4-267D22768A6B]
    // </editor-fold> 
    public void setMedioPago (MedioPago val) {
        this.mMedioPago = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EED6C65A-2306-4984-D5FF-FA4FFF8CE368]
    // </editor-fold> 
    public double getMontoPago () {
        return montoPago;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.578DD1F3-23CF-5881-6994-087B4705C7EE]
    // </editor-fold> 
    public void setMontoPago (double val) {
        this.montoPago = val;
    }

}

