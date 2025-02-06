package com.myjavamon.firstproject.javamon.db.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pokemon {

    @Id
    private Long id;

    @Column(length = 64)
    private String nome;

    @Column(length = 64)
    private String tipo;

    @Column
    private int hp;

    @Column
    private int attacco;

    @Column
    private int difesa;

    @Column
    private int velocità;

    public Pokemon() {
    }

    public Pokemon(Long id, String nome, String tipo, int hp, int attacco, int difesa, int velocità) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.hp = hp;
        this.attacco = attacco;
        this.difesa = difesa;
        this.velocità = velocità;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttacco() {
        return attacco;
    }

    public void setAttacco(int attacco) {
        this.attacco = attacco;
    }

    public int getDifesa() {
        return difesa;
    }

    public void setDifesa(int difesa) {
        this.difesa = difesa;
    }

    public int getVelocità() {
        return velocità;
    }

    public void setVelocità(int velocità) {
        this.velocità = velocità;
    }

    @Override
    public String toString() {
        return "Id = " + id
                + ", \nNome = " + nome
                + ", \nTipo = " + tipo
                + ", \nHp = " + hp
                + ", \nAttacco = " + attacco
                + ", \nDifesa = " + difesa
                + ", \nVelocità = " + velocità + "\n";
    }

}
