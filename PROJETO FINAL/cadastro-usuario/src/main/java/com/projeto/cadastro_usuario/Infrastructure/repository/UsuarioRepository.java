package com.projeto.cadastro_usuario.Infrastructure.repository;


import com.projeto.cadastro_usuario.Infrastructure.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


public interface UsuarioRepository  extends JpaRepository<Usuario,Long> {
        Optional<Usuario> findByEmail(String email);

        @Transactional
        void  deleteByEmail(String email);
}
