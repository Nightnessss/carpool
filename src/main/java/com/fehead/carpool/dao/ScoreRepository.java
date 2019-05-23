package com.fehead.carpool.dao;

import com.fehead.carpool.entity.db.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nightnessss 2019/5/23 22:36
 */
@Repository
public interface ScoreRepository extends JpaRepository<Score, Integer> {
}
