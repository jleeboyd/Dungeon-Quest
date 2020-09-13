package com.example.dungeonquest.entities;

public interface HealthBarListener {
    void onPlayerAttacked();
    void onPlayerKilled();
    void onScore(String entity);
}
