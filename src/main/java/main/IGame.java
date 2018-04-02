package main;

/**
 *
 * @author Plamen
 */
public interface IGame {
    void init();
    void takeTurn(IPlayer player);
    void addPiece(IPiece piece);
    IPiece getPiece(IPlayer player);
    void endGame();
}
