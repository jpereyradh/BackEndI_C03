package com.example.demo.jwt;

import com.example.demo.Repository.UsuarioRepository;
import com.example.demo.model.Usuario;
import com.example.demo.model.UsuarioRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DatosIniciales implements ApplicationRunner {
   @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        String passSinCifrar= "admin";
        BCryptPasswordEncoder passwordEncoder= new BCryptPasswordEncoder();
        String cifrado= passwordEncoder.encode(passSinCifrar);
        usuarioRepository.save(new Usuario(UsuarioRole.ADMIN,"admin",cifrado,"admin@admin.com","jorgito"));
    }
}
