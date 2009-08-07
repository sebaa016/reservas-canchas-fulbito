package pe.edu.cibertec.reservas.bean;

import java.util.Date;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.4CE4BA33-4C5F-923A-AAA7-FC991550F90B]
// </editor-fold> 
public class Cancha {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B322ED14-B8DF-0D32-880D-E154FC1D0B36]
    // </editor-fold> 
    private int codigo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6EA97E9C-3773-3B13-B156-EB6388FF79D4]
    // </editor-fold> 
    private int capacidad;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.11052F4C-0A31-7ADE-A898-6984713C1A4A]
    // </editor-fold> 
    private Date fechaUltMant;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.23E7FE45-08D7-BE6D-D5CF-6FBCF4312E99]
    // </editor-fold> 
    public Cancha () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2842C279-743E-7B78-392D-66FD665F3B32]
    // </editor-fold> 
    public int getCapacidad () {
        return capacidad;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.55FB2169-0106-968B-023D-9F84A1E31891]
    // </editor-fold> 
    public void setCapacidad (int val) {
        this.capacidad = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F766EB10-C5E8-059D-E7A2-296A03059226]
    // </editor-fold> 
    public int getCodigo () {
        return codigo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FD28BA11-5F6C-4C46-774B-CCB3F389B405]
    // </editor-fold> 
    public void setCodigo (int val) {
        this.codigo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8BCB6864-211D-35B9-9114-0843E76CCEF0]
    // </editor-fold> 
    public Date getFechaUltMant () {
        return fechaUltMant;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.812775D1-831B-7845-7117-406CDC07FEF1]
    // </editor-fold> 
    public void setFechaUltMant (Date val) {
        this.fechaUltMant = val;
    }

}

