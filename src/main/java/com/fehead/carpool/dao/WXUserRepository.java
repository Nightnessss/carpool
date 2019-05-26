package com.fehead.carpool.dao;

import com.fehead.carpool.entity.db.WXUsers;
import org.springframework.data.repository.RepositoryDefinition;

/**
 * @author Nightnessss 2019/5/26 13:39
 */
@RepositoryDefinition(domainClass = WXUsers.class, idClass = Integer.class)
public interface WXUserRepository {
}
