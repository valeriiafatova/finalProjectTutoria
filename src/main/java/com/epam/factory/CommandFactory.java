package com.epam.factory;

import com.epam.command.Command;
import com.epam.command.GenerateStudentsReport;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

    private static final Map<String, Command> commandMap;

    static {
        commandMap = new HashMap<>();
        commandMap.put("studentReport", new GenerateStudentsReport());
    }

    public static Command getCommand(String action) {
        return commandMap.getOrDefault(action, new GenerateStudentsReport());
    }

}
