/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable01;

import java.util.ArrayList;

/**
 *
 * @author Jaskaran, Jasmine, Manreen, Punar
 */
public abstract class game {

    private final String name;
    private ArrayList<Player> players;

    public game(String name) {
        this.name = name;
        players = new ArrayList();
    }
    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public abstract void play();

    public abstract void declareWinner();

}
