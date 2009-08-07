package pe.edu.cibertec.reservas.bean;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.96F00F90-5EAA-6ABC-EB8E-01C11B16DD7F]
// </editor-fold> 
public class Turno {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7D11528A-ABF9-182C-E570-C3CBED7D4AAB]
    // </editor-fold> 
    private int codigo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D506BE79-3FF7-C140-C715-E277693E4E3A]
    // </editor-fold> 
    private int horaInicio;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.33F1536C-E341-8D1C-A0A6-A7A0B2864987]
    // </editor-fold> 
    private int horaFin;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6A2EA1FA-64F9-7048-D968-AA972FE9A557]
    // </editor-fold> 
    public Turno () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6EA89F12-3DC7-213D-D940-1E754423014F]
    // </editor-fold> 
    public int getCodigo () {
        return codigo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3D31A954-BB0D-97D6-872B-5DEB1FA394F3]
    // </editor-fold> 
    public void setCodigo (int val) {
        this.codigo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D59932EB-9F1B-D8F1-AE1A-4B43287FA42A]
    // </editor-fold> 
    public int getHoraFin () {
        return horaFin;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AA26C912-AF4E-5A66-9AE9-C8A942C0829F]
    // </editor-fold> 
    public void setHoraFin (int val) {
        this.horaFin = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.11F9E9A7-763C-8057-488F-2FC194CFDF75]
    // </editor-fold> 
    public int getHoraInicio () {
        return horaInicio;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.17269B2E-B7D8-5DD3-CA9F-04C6A60CD333]
    // </editor-fold> 
    public void setHoraInicio (int val) {
        this.horaInicio = val;
    }

}

