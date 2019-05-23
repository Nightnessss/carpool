package com.fehead.carpool.dao;

import com.fehead.carpool.entity.db.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Nightnessss 2019/5/22 22:23
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
