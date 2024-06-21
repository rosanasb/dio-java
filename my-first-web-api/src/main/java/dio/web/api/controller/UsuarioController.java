package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UsuarioController {
	@Autowired
	private UsuarioRepository repository;
	@GetMapping()
	public List<Usuario>getUsers(){
		return repository.findAll();
	}
	@GetMapping("/{username}")
	public Usuario getOne(@PathVariable("username") String username) {
		return repository.findByUsername(username);
	}
	//delete e post feito atraves do aplicativo postman
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		repository.deleteById(id);
	}
	@PostMapping()
	public void postUsuario(@RequestBody Usuario usuario) {
		repository.save(usuario);
	}
	@PutMapping()
    public void putUsuario(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }

}
