package com.example.Pokedex1.api;

import com.example.Pokedex1.Modelo.Pokemon;
import com.example.Pokedex1.Servicio.Servicio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/pokedex1")
public class Controlador {

    private final Servicio servicio;

    @Autowired
    public Controlador(Servicio servicio) {
        this.servicio = servicio;
    }

    @RequestMapping(value = "/getPokemon/{nombrePokemon}", method = RequestMethod.GET)
    public Optional<Pokemon> getPokemon(@PathVariable("nombrePokemon") String nombrePokemon) {
        return servicio.getPokemon(nombrePokemon);
    }

    @RequestMapping("/insertarPokemon/{nombrePokemon}")
    @PostMapping
    public int insertarPokemon(@RequestBody Pokemon pokemon) {
        return servicio.insertarPokemon(pokemon);

    }

    @RequestMapping(value = "/getAllPokemon", method = RequestMethod.GET)
    public List<Pokemon> getAllPokemon() {
        return servicio.getAllPokemon();
    }
    
    @RequestMapping(value = "/actualizarPokemon/{nombrePokemon}")
    public int actualizarPokemon(@RequestBody Pokemon pokNew) {
        return servicio.actualizarPokemon(pokNew.getNombrePokemon(),pokNew);
    }
    
}
