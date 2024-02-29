package com.teachmeskills.hw15.task4.list;

import com.teachmeskills.hw15.task4.c_27_onl.Group;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Class with static method to creating a list of names of students + instructor.
 */
public class GroupList {
    private GroupList() {

    }

    public static void creatingList() {
        Set<Group> members = new LinkedHashSet<Group>();

        members.add(new Group("Artem"));
        members.add(new Group("Alina"));
        members.add(new Group("Anastasiya"));
        members.add(new Group("Artem"));
        members.add(new Group("Nikita"));
        members.add(new Group("Oleg"));
        members.add(new Group("Ivan"));
        members.add(new Group("Kirill"));
        members.add(new Group("Ruslan"));
        members.add(new Group("Eugene"));
        members.add(new Group("Pavel"));
        members.add(new Group("Ruslan"));
        members.add(new Group("Ruslan"));
        members.add(new Group("Aleksandr"));
        members.add(new Group("Daniil"));
        members.add(new Group("Aleksey"));
        members.add(new Group("Vladislav"));
        members.add(new Group("TMS-instructor-Andrew"));

        System.out.println(members);
    }
}
