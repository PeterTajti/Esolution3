package com.example.demo.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String userName;
    private String userPassword;
    private String userAvatar;

    @CreationTimestamp
    private LocalDateTime createDateTime;


    @OneToMany (cascade = CascadeType.ALL, mappedBy = "owner")
    private List<Note> notes;

    private int level = 1;

    private String townhall = "townhall1";
    private String farm = "farm0";
    private String lumbermill = "lumbermill0";
    private String mine = "mine0";
    private String barracks = "barracks0";
    private String blacksmith = "blacksmith0";

    private int food = 100;
    private int gold = 10;
    private int wood = 50;
    private int stone = 0;
    private int iron = 0;
    private int gem = 0;

    public User (){}

    public User(String userName, String userPassword, String userAvatar) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userAvatar = userAvatar;
        this.notes = new ArrayList<>();

    }

    public User(String userName, String userPassword, String userAvatar, List<Note> notes) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userAvatar = userAvatar;
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }

    public String getTownhall() {
        return townhall;
    }

    public void setTownhall(String townhall) {
        this.townhall = townhall;
    }

    public String getFarm() {
        return farm;
    }

    public void setFarm(String farm) {
        this.farm = farm;
    }

    public String getLumbermill() {
        return lumbermill;
    }

    public void setLumbermill(String lumbermill) {
        this.lumbermill = lumbermill;
    }

    public String getMine() {
        return mine;
    }

    public void setMine(String mine) {
        this.mine = mine;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public int getStone() {
        return stone;
    }

    public void setStone(int stone) {
        this.stone = stone;
    }

    public int getIron() {
        return iron;
    }

    public void setIron(int iron) {
        this.iron = iron;
    }

    public int getGem() {
        return gem;
    }

    public void setGem(int gem) {
        this.gem = gem;
    }

    public String getBarracks() {
        return barracks;
    }

    public void setBarracks(String barracks) {
        this.barracks = barracks;
    }

    public String getBlacksmith() {
        return blacksmith;
    }

    public void setBlacksmith(String blacksmith) {
        this.blacksmith = blacksmith;
    }

    public void addNote (Note note) {
        this.notes.add(note);
        note.setOwner(this);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
