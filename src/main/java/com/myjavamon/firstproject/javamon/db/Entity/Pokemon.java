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
    private int attack;

    @Column
    private int defense;

    @Column
    private int speed;

    public Pokemon(Long id, String nome, String tipo, int hp, int attack, int defense, int speed) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
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

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Id = " + id
                + ", \nNome = " + nome
                + ", \nTipo = " + tipo
                + ", \nHp = " + hp
                + ", \nAttack = " + attack
                + ", \ndefense = " + defense
                + ", \nspeed = " + speed + "\n";
    }

}
