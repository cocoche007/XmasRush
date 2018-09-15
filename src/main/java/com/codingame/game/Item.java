package com.codingame.game;

public class Item {
    private String identifier;
    private int playerId;

    public Item(String identifier, int playerId) {
        this.identifier = identifier;
        this.playerId = playerId;
    }

    public String getLowerCaseIdentifier() {
        return this.identifier.toLowerCase();
    }

    public String getUpperCaseIdentifier() {
        return this.identifier.toUpperCase();
    }

    public int getPlayerId() {
        return this.playerId;
    }
}
