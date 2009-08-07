/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.cibertec.reservas.dao.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Date;
import java.util.ArrayList;
import pe.edu.cibertec.reservas.bean.Cliente;
import pe.edu.cibertec.reservas.bean.Empresa;
import pe.edu.cibertec.reservas.bean.Persona;
import pe.edu.cibertec.reservas.dao.factory.DAOFactory;
import pe.edu.cibertec.reservas.dao.interfaces.ClienteDAO;
import pe.edu.cibertec.reservas.dao.util.UtilDAO;

/**
 *
 * @author Instructor
 */
public class MySQLClienteDAO implements ClienteDAO{

    public ArrayList queryAll() {
        ArrayList lista = new ArrayList();
        //Recetario para el acceso a la BD
        Connection conn = null;
        //PreparedStatement pstmt = null;
        CallableStatement cstmt = null;
        ResultSet rs = null;
        try {
            //1 y 2. Se registra el driver y se obtiene la conexion a la BD
            conn = UtilDAO.getConnection(DAOFactory.MYSQL);
            //3. Se prepara la sentencia SQL
            String sql = "{call usp_queryAllClientes()}";
            cstmt = conn.prepareCall(sql);

            //4. Se ejecuta la sentencia SQL
            rs = cstmt.executeQuery();
            char tipo;
            //5. Se interpretan los resultados
            while (rs.next()){
                  tipo = rs.getString("tipo").charAt(0);
                  if (tipo == 'E'){
                      Empresa e = new Empresa();
                      e.setCodigo(rs.getInt("codigo"));
                      e.setRazonSocial(rs.getString("nombre"));
                      e.setDireccion(rs.getString("direccion"));
                      e.setEmail(rs.getString("email"));
                      e.setPaginaWeb(rs.getString("paginaWeb"));
                      e.setRuc(rs.getInt("nroDoc"));
                      e.setTelefono(rs.getInt("telefono"));

                     lista.add(e);
                  } else {
                      Persona p = new Persona();
                      p.setCodigo(rs.getInt("codigo"));
                      p.setNombre(rs.getString("nombres"));
                      p.setDireccion(rs.getString("direccion"));
                      p.setEmail(rs.getString("email"));
                      p.setSexo(rs.getString("sexo").charAt(0));
                      p.setFechaNac(rs.getDate("fechaNac"));
                      p.setDni(rs.getInt("nroDoc"));
                      p.setTelefono(rs.getInt("telefono"));
                     lista.add(p);
                  }

            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
           //6. Se cierran los objetos de conexion
            if (rs != null ) try {rs.close(); } catch(Exception e) {e.printStackTrace();}
            if (cstmt != null ) try {cstmt.close(); } catch(Exception e) {e.printStackTrace();}
            if (conn != null ) try {conn.close(); } catch(Exception e) {e.printStackTrace();}
        }
        return lista;

    }

    public Cliente queryById(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void add(Cliente c) {
        //Recetario para el acceso a la BD
        Connection conn = null;
        //PreparedStatement pstmt = null;
        CallableStatement cstmt = null;
        try {
            //1 y 2. Se registra el driver y se obtiene la conexion a la BD
            conn = UtilDAO.getConnection(DAOFactory.MYSQL);
            //3. Se prepara la sentencia SQL
            String sql = "{call usp_addCliente(?,?,?,?,?,?,?,?,?)}";
            cstmt = conn.prepareCall(sql);
            if (c instanceof Persona){
                cstmt.setString(1, "P");
                Persona p = (Persona)c;
                cstmt.setString(2, p.getNombre());
                cstmt.setDate(6, (Date)p.getFechaNac());
                cstmt.setString(7, String.valueOf(p.getSexo()));
                cstmt.setInt(8, (p.getDni()));
                cstmt.setString(9, null);
            }else {
                cstmt.setString(1, "E");
                Empresa e = (Empresa)c;
                cstmt.setString(2, e.getRazonSocial());
                cstmt.setDate(6, null);
                cstmt.setString(7, null);
                cstmt.setInt(8, (e.getRuc()));

                cstmt.setString(9, (e.getPaginaWeb()));
            }
            cstmt.setString(3, c.getDireccion());
            cstmt.setInt(4, c.getTelefono());
            cstmt.setString(5, c.getEmail());

            //4. Se ejecuta la sentencia SQL
             cstmt.execute();

            //5. Se interpretan los resultados
        } catch (Exception e){
            e.printStackTrace();
        } finally {
           //6. Se cierran los objetos de conexion
            if (cstmt != null ) try {cstmt.close(); } catch(Exception e) {e.printStackTrace();}
            if (conn != null ) try {conn.close(); } catch(Exception e) {e.printStackTrace();}
        }

    }

    public void update(Cliente c) {
        //Recetario para el acceso a la BD
        Connection conn = null;
        //PreparedStatement pstmt = null;
        CallableStatement cstmt = null;
        try {
            //1 y 2. Se registra el driver y se obtiene la conexion a la BD
            conn = UtilDAO.getConnection(DAOFactory.MYSQL);
            //3. Se prepara la sentencia SQL
            String sql = "{call usp_updCliente(?,?,?,?,?,?,?,?,?,?)}";
            cstmt = conn.prepareCall(sql);
            cstmt.setInt(1, c.getCodigo());
            if (c instanceof Persona){
                cstmt.setString(2, "P");
                Persona p = (Persona)c;
                cstmt.setString(3, p.getNombre());
                cstmt.setDate(7, (Date)p.getFechaNac());
                cstmt.setString(8, String.valueOf(p.getSexo()));
                cstmt.setInt(9, (p.getDni()));
                 cstmt.setString(10, null);
            }else {
                cstmt.setString(2, "E");
                Empresa e = (Empresa)c;
                cstmt.setString(3, e.getRazonSocial());
                cstmt.setDate(7, null);
                cstmt.setString(8,null);
                cstmt.setInt(9, e.getRuc());

                cstmt.setString(10, (e.getPaginaWeb()));
            }
            cstmt.setString(4, c.getDireccion());
            cstmt.setInt(5, c.getTelefono());
            cstmt.setString(6, c.getEmail());
            //4. Se ejecuta la sentencia SQL
             cstmt.execute();

            //5. Se interpretan los resultados
        } catch (Exception e){
            e.printStackTrace();
        } finally {
           //6. Se cierran los objetos de conexion
            if (cstmt != null ) try {cstmt.close(); } catch(Exception e) {e.printStackTrace();}
            if (conn != null ) try {conn.close(); } catch(Exception e) {e.printStackTrace();}
        }

    }

    public void delete(int id) {
        //Recetario para el acceso a la BD
        Connection conn = null;
        //PreparedStatement pstmt = null;
        CallableStatement cstmt = null;
        try {
            //1 y 2. Se registra el driver y se obtiene la conexion a la BD
            conn = UtilDAO.getConnection(DAOFactory.MYSQL);
            //3. Se prepara la sentencia SQL
            String sql = "{call usp_delCliente(?)}";
            cstmt = conn.prepareCall(sql);
            cstmt.setInt(1, id);
            //4. Se ejecuta la sentencia SQL
            cstmt.execute();

            //5. Se interpretan los resultados
        } catch (Exception e){
            e.printStackTrace();
        } finally {
           //6. Se cierran los objetos de conexion
            if (cstmt != null ) try {cstmt.close(); } catch(Exception e) {e.printStackTrace();}
            if (conn != null ) try {conn.close(); } catch(Exception e) {e.printStackTrace();}
        }
    }

}
