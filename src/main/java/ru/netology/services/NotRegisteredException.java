
package ru.netology.services;

public class NotRegisteredException extends RuntimeException {

    public NotRegisteredException(String playerName) {

        super(" Игрок под именем " + playerName + "не обнаружен");
    }


}
