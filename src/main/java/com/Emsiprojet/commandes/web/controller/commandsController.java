package com.Emsiprojet.commandes.web.controller;

import com.Emsiprojet.commandes.model.command;
import com.Emsiprojet.commandes.service.commandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/commands")
public class commandsController {

    @Autowired
    private commandService commandService;

    @GetMapping
    public List<command> getAllCommands() {
        return commandService.getAllCommands();
    }

    @GetMapping("/{id}")
    public command getCommandsById(@PathVariable Long id) {
        return commandService.getCommandById(id);
    }

    @PostMapping
    public command createCommand(@RequestBody command command) {
        return commandService.createCommand(command);
    }

    @PutMapping("/{id}")
    public command updateCommand(@PathVariable Long id, @RequestBody command updatedCommand) {
        return commandService.updateCommand(id, updatedCommand);
    }

    @DeleteMapping("/{id}")
    public void deleteCommander(@PathVariable Long id) {
        commandService.deleteCommand(id);
    }

}
