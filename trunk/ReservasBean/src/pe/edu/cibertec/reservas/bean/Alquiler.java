package pe.edu.cibertec.reservas.bean;

import java.util.Date;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.646F62B5-65B7-70B4-073A-59CB3AD41CA8]
// </editor-fold> 
public class Alquiler {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4D839810-017F-08CF-C143-6142671E51DA]
    // </editor-fold> 
    private int codigo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.99D36103-F697-0008-6F0A-EF5579F0348B]
    // </editor-fold> 
    private Date fechaAlquiler;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B92AC74F-B013-DE1F-41FC-FFDB9663CA3B]
    // </editor-fold> 
    private Date fechaAlquilada;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5DD22CBC-409D-FBA5-BF6B-B7FB22B0A971]
    // </editor-fold> 
    private float costo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9D7B1037-D32A-300D-B9A4-B92F82A53B4F]
    // </editor-fold> 
    private float montoPago;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.508A4DEC-6E12-1A90-55B7-E4B8A6BC73F7]
    // </editor-fold> 
    private Turno mTurno;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C72F533B-C39B-2988-6FC3-88586C150BDC]
    // </editor-fold> 
    private Cancha mCancha;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B6AEDCA6-2AB1-F29B-9868-29E80DF43EE4]
    // </editor-fold> 
    private Cliente mCliente;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0B7AD835-82EC-42D4-FB5A-A75C449CFCD6]
    // </editor-fold> 
    private Reserva mReserva;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FD722955-0D2B-96BD-6C73-EE7F4338A7CB]
    // </editor-fold> 
    public Alquiler () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.060B6761-7D6B-79C4-62B3-0E34E26A5501]
    // </editor-fold> 
    public int getCodigo () {
        return codigo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3D6AFB19-65D3-395C-E54A-0F51DEDAF659]
    // </editor-fold> 
    public void setCodigo (int val) {
        this.codigo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.92D2F6D0-3B19-A364-17E4-972A931D7EB4]
    // </editor-fold> 
    public float getCosto () {
        return costo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.334DA595-179D-69B1-8363-D6F3D7283EDC]
    // </editor-fold> 
    public void setCosto (float val) {
        this.costo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.40362D6C-1934-85DD-5D40-A830FAD3CA9F]
    // </editor-fold> 
    public Date getFechaAlquilada () {
        return fechaAlquilada;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.653788AE-D1F1-6CE0-647F-547D2DCF6E1C]
    // </editor-fold> 
    public void setFechaAlquilada (Date val) {
        this.fechaAlquilada = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.58C7E9CB-8E7A-0AE1-AC16-ECEDD64B162A]
    // </editor-fold> 
    public Date getFechaAlquiler () {
        return fechaAlquiler;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.352B7123-9926-994C-5371-B487B58A0C4D]
    // </editor-fold> 
    public void setFechaAlquiler (Date val) {
        this.fechaAlquiler = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E62EFED3-C19C-8AA3-533F-143A8B7047E9]
    // </editor-fold> 
    public Cancha getCancha () {
        return mCancha;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.27F82C1E-EF07-194B-407A-980C078A5675]
    // </editor-fold> 
    public void setCancha (Cancha val) {
        this.mCancha = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.86A55EA2-4536-AABA-243D-5A67FE63926A]
    // </editor-fold> 
    public Cliente getCliente () {
        return mCliente;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FE87ABE0-F214-1ED1-D444-9FB5D4035D44]
    // </editor-fold> 
    public void setCliente (Cliente val) {
        this.mCliente = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4B217E18-0211-380E-BEAB-88628A2F9955]
    // </editor-fold> 
    public Reserva getReserva () {
        return mReserva;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E8C70F6C-A632-E8A4-6F65-C042D962728C]
    // </editor-fold> 
    public void setReserva (Reserva val) {
        this.mReserva = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BB4B7098-DE7D-89F2-69EB-51C079B51C4C]
    // </editor-fold> 
    public Turno getTurno () {
        return mTurno;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6CB2BE82-F9DA-D9AC-333D-A83BE7AF7236]
    // </editor-fold> 
    public void setTurno (Turno val) {
        this.mTurno = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.601C55D6-B924-BD58-EFB8-0DD2A52F0A6F]
    // </editor-fold> 
    public float getMontoPago () {
        return montoPago;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DDC0D37D-E039-2056-2764-25247BE6D7BF]
    // </editor-fold> 
    public void setMontoPago (float val) {
        this.montoPago = val;
    }

}

