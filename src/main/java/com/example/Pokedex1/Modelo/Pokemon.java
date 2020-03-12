/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Pokedex1.Modelo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author l11m14
 */
public class Pokemon {

    private String nombrePokemon;
    private String tipoPokemon;
    private int ataque;
    private int defensa;

    public Pokemon(
            @JsonProperty("nombrePokemon")
            String nombrePokemon,
            
            @JsonProperty("tipoPokemon")
            String tipoPokemon,
            
            @JsonProperty("ataque")
            int ataque,
            
            @JsonProperty("defensa")
            int defensa) {
        this.nombrePokemon = nombrePokemon;
        this.tipoPokemon = tipoPokemon;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public String getTipoPokemon() {
        return tipoPokemon;
    }

    public void setTipoPokemon(String tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    
    
}
