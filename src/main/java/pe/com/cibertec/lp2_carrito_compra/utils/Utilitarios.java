package pe.com.cibertec.lp2_carrito_compra.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.web.multipart.MultipartFile;

public class Utilitarios {
	
	public static String guardarImagen(MultipartFile foto) {
		try {
			
			byte[] fotoBytes = foto.getBytes();
			Path pathImagen = Paths.get("src/main/resources/static/usuario_foto/" + 
						foto.getOriginalFilename());
			
			Files.write(pathImagen, fotoBytes);
			return foto.getOriginalFilename();
			
		} catch (IOException e) {
			System.out.print("Ocurrió un error:: " + e.getMessage());
			return null;
		}
	}
	
	public static String extraerHash (String passwordFormulario) {
		return BCrypt.hashpw(passwordFormulario, BCrypt.gensalt());
	}
}
