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
    private PreparedStatement mostrarCargos;
    private PreparedStatement insertarCargo;
    private PreparedStatement modificarCargo;
    private PreparedStatement eliminarCargo;
    
    public DClasificacion() {
    	try {
            conn = conexion.obtenerConexion();
            mostrarCargos = conn.prepareStatement("Select * from Clasificacion");
            insertarCargo = conn.prepareStatement("Insert Into Clasificacion(nombre, abrevacion, activo ) Values(?, ?, ?)");
            modificarCargo = conn.prepareStatement("Update Clasificacion Set nombre = ?, abreviacion = ?, activo = ? Where idClasificacion= ?");
            eliminarCargo = conn.prepareStatement("Delete from Clasificacion Where idClasificacion = ?");
            
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
		return 0;
	}
	@Override
	public int Editar(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int Eliminar(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	public List<Clasificacion> MostrarDatos(){
		ArrayList<Clasificacion> result = null;
        ResultSet rs = null;
        try {
            rs = mostrarCargos.executeQuery();
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
