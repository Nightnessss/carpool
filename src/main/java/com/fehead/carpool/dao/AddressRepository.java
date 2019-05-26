package com.fehead.carpool.dao;

import com.fehead.carpool.entity.db.Address;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Nightnessss 2019/5/22 22:23
 */
@Repository
@RepositoryDefinition(domainClass = Address.class, idClass = Integer.class)
public interface AddressRepository {

    List<Address> findAll();

    <S extends Address> S save(S var1);

    Optional<Address> findById(Integer var1);

}
