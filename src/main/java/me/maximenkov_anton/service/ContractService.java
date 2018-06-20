package me.maximenkov_anton.service;

import me.maximenkov_anton.domain.Contract;

import java.util.Set;

public interface ContractService {
    Set<Contract> findAll();
}
