package pe.edu.cibertec.reservas.bean;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.C29D5A4F-2CB1-13CB-3FAF-F7E367C129C3]
// </editor-fold> 
public abstract class Cliente {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5000D408-04A3-AA05-27B2-9FB554CE0B7F]
    // </editor-fold> 
    private int codigo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A71C8BB0-35EA-CEEC-1A7A-DAB39E5F5D11]
    // </editor-fold> 
    private String direccion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.107FA7E0-0F4C-9069-74C9-94EB15717F5D]
    // </editor-fold> 
    private int telefono;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.78A7A9C2-C25A-DE2E-0A6C-8C007CA03DF8]
    // </editor-fold> 
    private String email;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.ABD541E2-7847-7FB0-666A-2D25BA47297C]
    // </editor-fold> 
    public Cliente () {
    }

    public Cliente(int codigo, String direccion, int telefono, String email) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.35DD14FA-3743-12CB-31D7-9AED11DF6FD9]
    // </editor-fold> 
    public int getCodigo () {
        return codigo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DD6FB406-1DE2-7FAB-7848-E95E58D58968]
    // </editor-fold> 
    public void setCodigo (int val) {
        this.codigo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CE29AB96-6AD0-66E8-DF0B-3BB4A20D5BB3]
    // </editor-fold> 
    public String getDireccion () {
        return direccion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9149F16D-5D1B-4C79-FF5F-009A9314AFEE]
    // </editor-fold> 
    public void setDireccion (String val) {
        this.direccion = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.ED0C706F-7F4D-E712-DE89-E315FB63CAE8]
    // </editor-fold> 
    public String getEmail () {
        return email;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FC9F5684-5766-E0B1-ED68-5DBC5DF5BDF0]
    // </editor-fold> 
    public void setEmail (String val) {
        this.email = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.80D20B47-AB8B-EBC8-AE70-BAAB64B8965F]
    // </editor-fold> 
    public int getTelefono () {
        return telefono;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4DA5AEE6-EC22-A39B-BDAD-CABF27161FCC]
    // </editor-fold> 
    public void setTelefono (int val) {
        this.telefono = val;
    }

}

