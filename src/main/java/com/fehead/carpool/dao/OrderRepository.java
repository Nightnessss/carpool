package com.fehead.carpool.dao;

import com.fehead.carpool.entity.db.Orders;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * @author Nightnessss 2019/5/17 20:29
 */
@Repository
@RepositoryDefinition(domainClass = Orders.class, idClass = Integer.class)
public interface OrderRepository {

    List<Orders> findAll();

    Optional<Orders> findById(Integer var1);

    <S extends Orders> S save(S var1);

    List<Orders> findByUserId(Integer userId);

    Orders findByOrderNum(String OrderNum);

    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "update orders o set o.status = ?2 where o.order_id = ?1")
    void setStatus(Integer orderId, Integer status);


}
