package com.company;

public class Player {
    //defining the variables
    private int playerXp;
    private int mana;
    private int attack;
    private String name;
    private int life;
    private String weapon;

    //player class constructor
    public Player() {
        this.playerXp = playerXp;
        this.mana = mana;
        this.attack = attack;
        this.name = name;
        this.life = life;
    }

    //returning specific values
    public int getPlayerXp() {
        return playerXp;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setPlayerXp(int playerXp) {
        this.playerXp = playerXp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void playerStats() {

    }


    public void attack(int dmg) {

    }


}
