package com.example.demo.Service;

import com.example.demo.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<Usuario> getAll();

    Usuario getById(Long id);
    void remove(Long id);
    void  save(Usuario usuario);
}
