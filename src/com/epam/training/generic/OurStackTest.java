package com.epam.training.generic;

public class OurStackTest {

    public static void main(String... args) {

        OurCustomStack<Command> stack = new OurCustomStack<Command>(new Command[]{});

        stack.add(new Command("First command"));
        stack.add(new SubCommand("subCommand"));
        stack.add(new Command("Second command"));
        stack.add(new SubCommand("subCommand2"));
        stack.add(new SubCommand("subCommand3"));
        stack.add(new SubCommand("subCommand4"));

        SubCommand sc4 = new SubCommand("subCommand4");
        SubCommand sc5 = new SubCommand("subCommand4");

        stack.addMany(new Command[]{sc4, sc5});
        stack.addMany(sc4, sc5, new Command("Something more"));
        stack.addMany(sc4);

        SubCommand subCommand = stack.tryToGet(SubCommand.class);

        Command currentComand = subCommand;
        do {
            currentComand = stack.get();
            if (currentComand != null) {
                System.out.println(currentComand.getValue());
            }
        } while (currentComand != null);
    }

}
