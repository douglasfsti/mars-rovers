package io.github.douglasfsti.marsrovers.entities;

public enum Command {
    L("LEFT"),
    R("RIGHT"),
    M("MOVE");

    private String label;

    private Command(String label) {
        this.label = label;
    }

    private String getLabel() {
        return this.label;
    }

    public static Command getCommand(String command) {
        for (Command cmd : Command.values()) {
            if (cmd.getLabel().startsWith(command.toUpperCase())) {
                return cmd;
            }
        }

        throw new EnumConstantNotPresentException(Command.class, command);
    }
}
