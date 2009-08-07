package pe.edu.cibertec.reservas.bean;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.3A1BC562-F563-E68B-59DD-9B3CB99BB3C8]
// </editor-fold> 
public class Empresa extends Cliente {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.414F50B9-AA0E-8881-31DA-8D790E0E9081]
    // </editor-fold> 
    private int ruc;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.043CFEF6-20EE-F612-611D-3E51B617668D]
    // </editor-fold> 
    private String razonSocial;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D45C3840-D7A8-F835-7BB9-F24732EC8A5F]
    // </editor-fold> 
    private String paginaWeb;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.603D813A-48E2-994B-E344-71452AB288BE]
    // </editor-fold> 
    public Empresa () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D35988C2-5931-FCB8-9455-C0ADD86D1166]
    // </editor-fold> 
    public String getRazonSocial () {
        return razonSocial;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5636DCED-3699-A5B5-2B1C-F6AFC93AEEA5]
    // </editor-fold> 
    public void setRazonSocial (String val) {
        this.razonSocial = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7A6E9B04-E758-BA91-EA55-BD65DB283211]
    // </editor-fold> 
    public int getRuc () {
        return ruc;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EBE1F5F0-EC4D-2472-9526-FA7CCF30FA07]
    // </editor-fold> 
    public void setRuc (int val) {
        this.ruc = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.65D42F3F-FD3F-B79B-E0E0-D2E59D0FE76B]
    // </editor-fold> 
    @Override
    public int getCodigo () {
        return 0;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A31B0702-FE53-BD61-F03A-03A7EB2C2E18]
    // </editor-fold> 
    @Override
    public void setCodigo (int val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.805F46BC-F216-E848-1F0E-DCAC20692E5C]
    // </editor-fold> 
    @Override
    public String getDireccion () {
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A167DCF0-6DA4-C24C-FECE-CDA22308D633]
    // </editor-fold> 
    public void setDireccion (String val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.79792027-D14D-2F64-8989-0B203FA28502]
    // </editor-fold> 
    public String getPaginaWeb () {
        return paginaWeb;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C684C3B7-E6C4-85EB-D918-C36790F55C2F]
    // </editor-fold> 
    public void setPaginaWeb (String val) {
        this.paginaWeb = val;
    }

}

