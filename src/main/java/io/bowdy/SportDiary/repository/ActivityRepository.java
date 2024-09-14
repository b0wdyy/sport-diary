package io.bowdy.SportDiary.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import io.bowdy.SportDiary.entity.Activity;

public interface ActivityRepository extends JpaRepository<Activity, UUID> {

}
