package com.example.Pokedex1.dao;

import com.example.Pokedex1.Modelo.Pokemon;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository("daopokedex1")
public class DAO implements IDao {

    private static List<Pokemon> BASE_DATOS = new ArrayList<>();

    @Override
    public int insertarPokemon(Pokemon pok) {
        BASE_DATOS.add(pok);
        return 1;
    }

    @Override
    public Optional<Pokemon> getPokemon(String nombrePokemon) {
        return BASE_DATOS.stream().filter(poke -> poke.getNombrePokemon().equalsIgnoreCase(nombrePokemon)).findFirst();
    }

    @Override
    public List<Pokemon> getAllPokemon() {
        return BASE_DATOS;
    }

    @Override
    public int actualizarPokemon(String nombre, Pokemon pokNew) {
        return getPokemon(nombre).map(pok -> {
            int indice = BASE_DATOS.indexOf(pok);
            if (indice > 0) {
                BASE_DATOS.set(indice, pokNew);
                return 1;
            }
            return 0;
        }).orElse(0);
    }

    @Override
    public int borrarPokemon(String nombre) {
        Optional<Pokemon> oPok = getPokemon(nombre);
        if (oPok == null) {
            return 0;
        }
        BASE_DATOS.remove(oPok.get());
        return 1;
    }

}
