package com.example.demo.controllers;


import com.example.demo.Service.IUsuarioService;
import com.example.demo.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private IUsuarioService service;


    @GetMapping(value = "/api/usuarios")
    public List<Usuario>getAll(){
        return service.getAll();


    }
    @GetMapping(value = "/api/usuarios/{id}")
    public Usuario getById(@PathVariable String id) {
        return service.getById(Long.parseLong(id));
    }

    @DeleteMapping("/api/usuarios/{id} ")
    public void remove(@PathVariable String id){
        repository.deleteById(Long.parseLong(id));
    }

    @PostMapping("/api/usuarios")
    public void save(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
}
