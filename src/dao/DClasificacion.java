package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.TableModel;

import interfaces.IOperacion;
import modelos.Clasificacion;

public class DClasificacion implements IOperacion{
	public List<Clasificacion> lista;
    private Conexion conexion = new Conexion();
    private Connection conn; // Gestiona la conexion.
    private PreparedStatement mostrarClasificacion;
    private PreparedStatement insertarClasificacion;
    private PreparedStatement modificarClasificacion;
    private PreparedStatement eliminarClasificacion;
    
    public DClasificacion() {
    	try {
            conn = conexion.obtenerConexion();
            mostrarClasificacion = conn.prepareStatement("Select * from Clasificacion");
            insertarClasificacion = conn.prepareStatement("Insert Into Clasificacion(nombre, abreviacion, activo ) Values(?, ?, ?)");
            modificarClasificacion = conn.prepareStatement("Update Clasificacion Set nombre = ?, abreviacion = ?, activo = ? Where idClasificacion= ?");
            eliminarClasificacion = conn.prepareStatement("Delete from Clasificacion Where idClasificacion = ?");
            
            lista = new ArrayList<>();
            lista = MostrarDatos();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.exit(1);
        }
    }
    
	@Override
	public int Guardar(Object o) {
		// TODO Auto-generated method stub
		Clasificacion c = new Clasificacion();
		c = (Clasificacion) o;
		int b = 0;
		try {
			insertarClasificacion.setString(1, c.getNombre());
			insertarClasificacion.setString(2, c.getAbreviacion());
			insertarClasificacion.setBoolean(3, true);
			b = insertarClasificacion.executeUpdate();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return b;
	}
	@Override
	public int Editar(Object o) {
		// TODO Auto-generated method stub
		int b = 0;
		Clasificacion c = new Clasificacion();
		c = (Clasificacion) o;
		try {
			modificarClasificacion.setString(1, c.getNombre());
			modificarClasificacion.setString(2, c.getAbreviacion());
			modificarClasificacion.setBoolean(3, true);
			b =modificarClasificacion.executeUpdate();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return  b;
	}
	@Override
	public int Eliminar(Object o) {
		int id = (int) o;
		// TODO Auto-generated method stub
		int b = 0;
		try {
			eliminarClasificacion.setInt(1, id);
			b = eliminarClasificacion.executeUpdate();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return b;
	}

	
	
	public List<Clasificacion> MostrarDatos(){
		ArrayList<Clasificacion> result = null;
        ResultSet rs = null;
        try {
            rs = mostrarClasificacion.executeQuery();
            result = new ArrayList<>();
            while (rs.next()) {
                result.add(new Clasificacion(
                		rs.getInt("idClasificacion"),
                        rs.getString("abreviacion"),
                        rs.getString("nombre"),
                        true
                ));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                conexion.close(conn);
            }
        }
        return result;
	}

	@Override
	public List<Object> Mostrar() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
