package ProjetoEscolar.cadastro_usuario.business;

import ProjetoEscolar.cadastro_usuario.infrastructure.entitys.Usuario;
import ProjetoEscolar.cadastro_usuario.infrastructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service

public class UsuarioService {

    private final UsuarioRepository repository;
    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void salvarUsuario(Usuario usuario) {
        repository.save(usuario);
    }

    public Usuario buscarUsuarioPorEmail(String email) {
         return repository.findByEmail(email).orElseThrow(
                 () -> new RuntimeException("Email não encontrado")
         );
    }

    public void deletarUsuarioPorEmail(String email) {
        repository.deleteByEmail(email);
    }

    public void atualizarUsuarioPorEmail(String email, Usuario usuario) {
        Usuario usuarioEntity = buscarUsuarioPorEmail(email);
        Usuario usuarioAtualizado = Usuario.builder()
                .email(usuario.getEmail() != null ?
                        usuario.getEmail() : usuarioEntity.getEmail())
                .nome(usuario.getNome()!= null ?
                        usuario.getNome() : usuarioEntity.getNome())
                .build()

    }
}
