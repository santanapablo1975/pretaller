import java.util.List;

// metodo para mostrar 
public class UsuarioAdmin {

	public void Mostrar(List<UsuarioModel>lista){
		
		for (UsuarioModel item : lista) {
			
			System.out.println("Nombre: " + item.getNombre());
			System.out.println("Apellido: " + item.getApellido());
			System.out.println("Edad: " + item.getEdad());
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			
			
			
		}
	}
}
