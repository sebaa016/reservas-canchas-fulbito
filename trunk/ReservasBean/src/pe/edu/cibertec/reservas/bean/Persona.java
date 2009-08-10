package pe.edu.cibertec.reservas.bean;

import java.util.Date;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.6C59ED99-C858-6D2C-7AE5-876FCB26949D]
// </editor-fold> 
public class Persona extends Cliente {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.73B935E4-0C25-FD2C-0A69-DAC0FF9A8D84]
    // </editor-fold> 
    private int dni;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.030BD4CA-2613-C158-E2DC-F52E07BC9BB3]
    // </editor-fold> 
    private String apellidoPat;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9878E668-3D04-8C93-E127-6E300B1586D1]
    // </editor-fold> 
    private String apellidoMat;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2E146642-255E-744F-60A8-1B8EBB0D0C01]
    // </editor-fold> 
    private String nombre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D1D0862C-A646-9F3D-D44B-04E9966235E4]
    // </editor-fold> 
    private Date fechaNac;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F8E1A37D-19B4-3926-A3A9-BCE5A9FE0885]
    // </editor-fold> 
    private char sexo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B19B1FD4-92C0-8292-E8A8-E9FFD7EAF48F]
    // </editor-fold> 
    public Persona () {
    }


    public Persona(int codigo ,int dni, String apellidoPat, String apellidoMat, String nombre, Date fechaNac, char sexo, String direccion, String email, int telefono) {
        super(codigo, direccion, telefono, email);
        this.dni = dni;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.sexo = sexo;

    }


    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C2D19EF2-9114-CC32-BB7D-0F5123662771]
    // </editor-fold> 
    public String getApellidoMat () {
        return apellidoMat;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B492B787-DD99-CC33-FA2D-F804ABA9EC38]
    // </editor-fold> 
    public void setApellidoMat (String val) {
        this.apellidoMat = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5FD64AA3-1754-EE42-DEBD-87DDF0C2528E]
    // </editor-fold> 
    public String getApellidoPat () {
        return apellidoPat;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.009CA0EA-744E-42F1-10F6-7CACA2F1348C]
    // </editor-fold> 
    public void setApellidoPat (String val) {
        this.apellidoPat = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.08073E8A-7421-8630-97BD-8B2D21ED125F]
    // </editor-fold> 
    public int getDni () {
        return dni;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E9C35D06-6DBF-4B6E-3E72-F68D1519200C]
    // </editor-fold> 
    public void setDni (int val) {
        this.dni = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.57A36710-C41F-5DB5-0316-465B1E3439FD]
    // </editor-fold> 
    public String getNombre () {
        return nombre;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8C23E3DD-D718-E073-F56D-E4088E07AB6D]
    // </editor-fold> 
    public void setNombre (String val) {
        this.nombre = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8F1D3F81-6265-4535-8906-0D3D4CE1EA1C]
    // </editor-fold> 
    public Date getFechaNac () {
        return fechaNac;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1050790E-80D7-E8DC-AD65-C3C522D406F8]
    // </editor-fold> 
    public void setFechaNac (Date val) {
        this.fechaNac = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B36D54DA-1A4A-040A-F367-D6E67EF20797]
    // </editor-fold> 
    public char getSexo () {
        return sexo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.57AEE964-10BD-9E86-47E1-86BB35A1E862]
    // </editor-fold> 
    public void setSexo (char val) {
        this.sexo = val;
    }

}

