/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable01;

/**
 *
 * @author Jaskaran, Jasmine, Manreen, Punar
 */
import java.util.ArrayList;
import java.util.Collections;

public class GroupOfCards {

   
    private ArrayList<card> cards;
    private int size;

    public GroupOfCards(int size) {
        this.size = size;
    }

    public ArrayList<card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
