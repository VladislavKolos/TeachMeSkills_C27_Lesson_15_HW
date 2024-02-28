package com.teachmeskills.hw15.task4.c_27_onl;

import java.util.Objects;

/**
 * Class for the names of people in the group
 * contains field "name"
 * contains one constructor
 * Methods overridden: equals, hashCode, toString.
 */
public class Group {
    public String name;

    public Group(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group group)) return false;
        return Objects.equals(name, group.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                '}';
    }
}

