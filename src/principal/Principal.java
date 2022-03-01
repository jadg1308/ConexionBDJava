package principal;

import java.util.List;

import dao.DClasificacion;
import modelos.Clasificacion;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DClasificacion d  = new DClasificacion();
		
		List<Clasificacion> lista = d.lista;
		
		for(Clasificacion c : lista) {
			System.out.println(c.toString());
		}
		
	}

}
