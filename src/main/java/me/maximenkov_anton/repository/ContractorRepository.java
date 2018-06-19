package me.maximenkov_anton.repository;

import me.maximenkov_anton.domain.Contractor;
import org.springframework.data.repository.CrudRepository;

public interface ContractorRepository extends CrudRepository<Contractor, Long> {
}
