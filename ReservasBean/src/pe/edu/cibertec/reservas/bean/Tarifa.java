package pe.edu.cibertec.reservas.bean;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.845D7DC5-D20D-EF5F-5F6E-27645651CF76]
// </editor-fold> 
public class Tarifa {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0DE8867E-A02E-1D7B-F9AC-14EC350BED4C]
    // </editor-fold> 
    private int codigo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6F68C041-B361-9465-50B5-E0DE68762C57]
    // </editor-fold> 
    private int diaSemana;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2519B352-17A3-AF4C-A7AA-8B79655A3EB2]
    // </editor-fold> 
    private int Valor;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6089284E-10E1-0B60-471D-5804C6AE7D9F]
    // </editor-fold> 
    private Turno mTurno;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.36AC9DAA-9F0F-871F-5F5B-EF029368A2FA]
    // </editor-fold> 
    public Tarifa () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7990A60C-7102-2657-5DB6-C961456BD3F9]
    // </editor-fold> 
    public int getValor () {
        return Valor;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.24AB79D4-7249-30FE-75BB-BB8141F03502]
    // </editor-fold> 
    public void setValor (int val) {
        this.Valor = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6EF8C3E4-337A-FB7C-14A3-EB8D30B0C364]
    // </editor-fold> 
    public int getCodigo () {
        return codigo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CA3F369E-8995-CC11-E37F-8447AE6C3226]
    // </editor-fold> 
    public void setCodigo (int val) {
        this.codigo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A1E42C0D-0ACC-8748-22AF-A9995E58AB6E]
    // </editor-fold> 
    public int getDiaSemana () {
        return diaSemana;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A67E7BC2-CDE3-2133-283C-77367BB28F25]
    // </editor-fold> 
    public void setDiaSemana (int val) {
        this.diaSemana = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7C78A0B5-F3A4-F654-75BC-1AD92162C9F7]
    // </editor-fold> 
    public Turno getTurno () {
        return mTurno;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.935A003B-B423-C06C-61AC-49721C5707D3]
    // </editor-fold> 
    public void setTurno (Turno val) {
        this.mTurno = val;
    }

}

