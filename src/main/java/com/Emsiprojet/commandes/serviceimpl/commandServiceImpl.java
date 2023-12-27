package com.Emsiprojet.commandes.serviceimpl;

import com.Emsiprojet.commandes.dao.commandDao;
import com.Emsiprojet.commandes.model.command;
import com.Emsiprojet.commandes.service.commandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class commandServiceImpl implements commandService {

    @Autowired
    private commandDao commandDao;

    @Override
    public List<command> getAllCommands() {
        return commandDao.findAll();
    }

    @Override
    public command getCommandById(Long id) {
        Optional<command> optionalCommand = commandDao.findById(id);
        return optionalCommand.orElse(null);
    }

    @Override
    public command createCommand(command command) {
        return commandDao.save(command);
    }

    @Override
    public command updateCommand(Long id, command updatedCommand) {
        Optional<command> optionalCommand = commandDao.findById(id);
        if (optionalCommand.isPresent()) {
            updatedCommand.setId(id);
            return commandDao.save(updatedCommand);
        }
        return null;
    }

    @Override
    public void deleteCommand(Long id) {
        commandDao.deleteById(id);
    }
}
