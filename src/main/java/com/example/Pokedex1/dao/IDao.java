package com.example.Pokedex1.dao;
import com.example.Pokedex1.Modelo.Pokemon;
import java.util.List;
import java.util.Optional;

public interface IDao {
    
    int insertarPokemon(Pokemon pok);
    Optional<Pokemon> getPokemon(String nombrePokemon);
    List<Pokemon> getAllPokemon();
    int actualizarPokemon (String nombre, Pokemon pokNew);
    int borrarPokemon(String nombre);
}
