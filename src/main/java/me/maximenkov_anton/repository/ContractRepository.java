package me.maximenkov_anton.repository;

import me.maximenkov_anton.domain.Contract;
import org.springframework.data.repository.CrudRepository;

public interface ContractRepository extends CrudRepository<Contract, Long> {
}
