package byui.cit260.mountKabru.model;

import java.io.Serializable;

/**
 * Created by Badgero1234 on 1/28/16.
 */
public class Player implements Serializable{

    private String name;
    
    private Hero[] hero;
    private Game game;


    public Player(){

    }

    public Hero[] getHero() {
        return hero;
    }

    public void setHero(Hero[] hero) {
        this.hero = hero;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        return name != null ? name.equals(player.name) : player.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
}
