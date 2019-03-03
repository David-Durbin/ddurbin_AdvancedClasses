package com.company;

public enum PositionTitle {

    // List of company positions
    ADMINISTRATION("Administration"),
    PRODUCTION("Production"),
    SALES("Sales"),
    MAINTENANCE("Maintenance"),
    TECHNICAL("Technical"),
    SECRETARIAL("Secretarial");

    String name = "";

    // constructor
    PositionTitle(String title) { this.name = title; }

    // override to ensure this returns the string
    @Override
    public String toString() { return name; }

}
