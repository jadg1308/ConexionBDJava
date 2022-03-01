package interfaces;

import java.util.List;

import javax.swing.table.TableModel;

public interface IOperacion {
	
	public int Guardar(Object o);
	
	public int Editar(Object o);
	
	public int Eliminar(Object o);
	
	public List<Object> Mostrar();

	
	

}
