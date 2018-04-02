package main;

/**
 *
 * @author Plamen
 */
public interface IPiece {
    int getLocation();
    void setLocation(int newLocation);
    IPlayer getPlayer();
    void addPlayer(IPlayer player);
}
