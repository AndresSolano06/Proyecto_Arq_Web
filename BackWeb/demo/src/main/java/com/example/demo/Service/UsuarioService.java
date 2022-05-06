package com.example.demo.Service;

import com.example.demo.entities.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    private UsuarioRepository repository;

    @Override
    public List<Usuario> getAll() {
        return (List<Usuario>) repository.findAll();
    }
    @Override
    public Usuario getById(Long id) {
        return (Usuario) repository.findById(id).get();
    }

    @Override
    public void remove(Long id){
        repository.deleteById(id);
    }

    @Override
    public void save(Usuario usuario){
        repository.save(usuario);
    }
}