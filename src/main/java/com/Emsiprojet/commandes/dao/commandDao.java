package com.Emsiprojet.commandes.dao;

import com.Emsiprojet.commandes.model.command;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface commandDao extends JpaRepository<command, Long> {




}
