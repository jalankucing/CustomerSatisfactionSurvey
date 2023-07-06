package id.co.mii.serverapp.repository;

import id.co.mii.serverapp.models.Survey;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {
   public Survey getByCode(UUID code);
}

