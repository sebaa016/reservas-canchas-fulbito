package pe.edu.cibertec.reservas.bean;

import java.util.Date;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.C13D378B-FC9F-88F6-88E5-05D9D62D84C6]
// </editor-fold> 
public class Reserva {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DB7CBB7E-344C-ADD2-B675-B481DAB540CF]
    // </editor-fold> 
    private int codigo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8BCD2A4D-5C4A-49A8-4417-C76FFB944C65]
    // </editor-fold> 
    private Date fechaReserva;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3DC1F460-9062-1772-FF97-242B208FC448]
    // </editor-fold> 
    private Date fechaReservada;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.13B954DF-5BD9-C3E4-319E-8CC36A4B07DF]
    // </editor-fold> 
    private Cancha mCancha;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EBA1AF88-BF9C-C45A-D966-5B42084C9FBE]
    // </editor-fold> 
    private Cliente mCliente;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.26D7FDEC-589B-EF65-B4EE-B4BA82E4B150]
    // </editor-fold> 
    private Turno mTurno;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9A2DB491-25D7-5782-67A4-BA17C9F330AE]
    // </editor-fold> 
    public Reserva () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.24C408CE-D330-09B9-67DA-C6E2EC237671]
    // </editor-fold> 
    public int getCodigo () {
        return codigo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.30F5317A-1EC9-8D41-D83D-D5AD27BBBA62]
    // </editor-fold> 
    public void setCodigo (int val) {
        this.codigo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A7F53DB3-BA64-892C-0464-D59DE1D8265F]
    // </editor-fold> 
    public Date getFechaReserva () {
        return fechaReserva;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.470233D8-0C66-3516-E963-D28B8C5BD79C]
    // </editor-fold> 
    public void setFechaReserva (Date val) {
        this.fechaReserva = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A21EFFBC-27EA-104E-E5C6-7ABCD5580DF8]
    // </editor-fold> 
    public Date getFechaReservada () {
        return fechaReservada;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6511B35C-8404-C17F-C4F0-428D58CA0FFB]
    // </editor-fold> 
    public void setFechaReservada (Date val) {
        this.fechaReservada = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F8E93630-93A1-89DC-142E-C2E784C581D7]
    // </editor-fold> 
    public Cancha getCancha () {
        return mCancha;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C7FBBAD7-B769-EE52-785C-25492C5BD5E5]
    // </editor-fold> 
    public void setCancha (Cancha val) {
        this.mCancha = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.589CE190-5F72-62D5-D90E-9822C647C853]
    // </editor-fold> 
    public Cliente getCliente () {
        return mCliente;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.004100F7-0DEA-D4E2-6EA3-738E750A9F66]
    // </editor-fold> 
    public void setCliente (Cliente val) {
        this.mCliente = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CE2F281F-1F88-DD1F-FC0D-18015D8C54C7]
    // </editor-fold> 
    public Turno getTurno () {
        return mTurno;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3C04E301-97CB-9EF0-7ECA-E4E1EC89DEB5]
    // </editor-fold> 
    public void setTurno (Turno val) {
        this.mTurno = val;
    }

}

