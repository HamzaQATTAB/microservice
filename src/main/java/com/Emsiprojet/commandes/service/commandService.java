package com.Emsiprojet.commandes.service;

import com.Emsiprojet.commandes.model.command;

import java.util.List;

public interface commandService {

    List<command> getAllCommands();

    command getCommandById(Long id);

    command createCommand(command command);

    command updateCommand(Long id, command updatedCommand);

    void deleteCommand(Long id);
}
