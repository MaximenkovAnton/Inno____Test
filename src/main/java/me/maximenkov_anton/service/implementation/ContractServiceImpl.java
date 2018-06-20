package me.maximenkov_anton.service.implementation;

import lombok.RequiredArgsConstructor;
import me.maximenkov_anton.domain.Contract;
import me.maximenkov_anton.repository.ContractRepository;
import me.maximenkov_anton.service.ContractService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


@Service
@RequiredArgsConstructor
public class ContractServiceImpl implements ContractService  {
    private final ContractRepository contractRepository;
    @Override
    public Set<Contract> findAll() {
        Set<Contract> contracts = new HashSet<>();
        contractRepository.findAll().iterator().forEachRemaining(contracts::add);
        return contracts;
    }
}
