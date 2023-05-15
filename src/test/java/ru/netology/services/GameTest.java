package ru.netology.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void firstPlayerWin() {
        Player jorik = new Player(1, "Жорик", 80);
        Player diego = new Player(2, "Диего", 150);
        Game game = new Game();

        game.register(jorik);
        game.register(diego);
        int actual = game.round("Диего", "Жорик");
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void firstPlayerLose() {
        Player jorik = new Player(1, "Жорик", 200);
        Player diego = new Player(2, "Диего", 50);
        Game game = new Game();

        game.register(jorik);
        game.register(diego);
        int actual = game.round("Диего", "Жорик");
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nobodyWins() {
        Player jorik = new Player(1, "Жорик", 200);
        Player diego = new Player(2, "Диего", 200);
        Game game = new Game();

        game.register(jorik);
        game.register(diego);
        int actual = game.round("Диего", "Жорик");
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void notRegExceptionsTestIfFirst() {
        Player jorik = new Player(1, "Жорик", 200);
        Player diego = new Player(2, "Диего", 200);
        Game game = new Game();

        game.register(jorik);
        game.register(diego);
        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Санчес", "Жорик"));

    }

    @Test
    public void notRegExceptionsTestIfSecond() {
        Player jorik = new Player(1, "Жорик", 200);
        Player diego = new Player(2, "Диего", 200);
        Game game = new Game();

        game.register(jorik);
        game.register(diego);
        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Диего", "Хуанито"));

    }
    @Test
    public void notRegExceptionsTestIfBoth() {
        Player jorik = new Player(1, "Жорик", 200);
        Player diego = new Player(2, "Диего", 200);
        Game game = new Game();

        game.register(jorik);
        game.register(diego);
        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("Санчес", "Хуанито"));

    }
}
