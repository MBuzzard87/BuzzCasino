package io.zipcoder.casino;

import io.zipcoder.casino.utilities.console.Console;

public class Player {

    private String username;
    private String password;
    private int money;
    private Console console;


    public Player() {
    }

    public Player(String username, String password, int money) {
        this.username = username;
        this.password = password;
        this.money = money;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    public void changeUsername() {
        String newPlayerUsername = console.getStringInput("Please provide your new username: ");
        this.setUsername(newPlayerUsername);
    }

    public void changePassword() {
        String newAccountPassword = console.getStringInput("Please provide your new password: ");
        this.setPassword(newAccountPassword);
    }

    public void depositFunds() {
        Integer fundsToBeDeposited = console.getIntegerInput("Please indicate the amount you would like to deposit:");

    }

    public void cashoutFunds() {
        Integer fundsToBeCashedOut = console.getIntegerInput("Please indicate the amount you would like to deposit:");

    }


}
