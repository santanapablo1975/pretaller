import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Llenar();

	}
	
	private static void Llenar(){
		Scanner leer=new Scanner(System.in);
		
		List<UsuarioModel>lista=new ArrayList<>();
		
		//menu para responder si o no
		char opcion = ' ';
		
		do {
			UsuarioModel modelo=new UsuarioModel();
			System.out.println("Digite el nombre");
			modelo.setNombre(leer.next());
			System.out.println("Digite el apellido");
			modelo.setApellido(leer.next());
			System.out.println("Digite el edad");
			modelo.setEdad(leer.nextInt());
			
			lista.add(modelo);
			
			System.out.println("desea agregar mas : tecle s o n");
			opcion=leer.next().charAt(0);
			
			
			
						
		} while (opcion== 's' || opcion == 'S');
		
		//metodo 1
		new UsuarioAdmin().Mostrar(lista);
		
		// usuario model 
		//nombre del objeto . mostrar
		
	}

}
