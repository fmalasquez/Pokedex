package com.example.Pokedex1.Servicio;

import com.example.Pokedex1.Modelo.Pokemon;
import com.example.Pokedex1.dao.DAO;
import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Servicio {

    private final DAO dao;

    @Autowired
    public Servicio(@Qualifier("daopokedex1") DAO dao) {
        this.dao = dao;
    }

    public Optional<Pokemon> getPokemon(String nombre) {
        return dao.getPokemon(nombre);
    }

    public int insertarPokemon(Pokemon pok) {
        return dao.insertarPokemon(pok);
    }
    public List<Pokemon> getAllPokemon() {
        return dao.getAllPokemon();
    }    
    public int actualizarPokemon(String nombre,Pokemon pokNew) {
        return dao.actualizarPokemon(nombre,pokNew);
    }
}
