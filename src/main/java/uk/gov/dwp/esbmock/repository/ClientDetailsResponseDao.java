package uk.gov.dwp.esbmock.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import uk.gov.dwp.esbmock.domain.ClientDetailsResponse;

@Repository
public interface ClientDetailsResponseDao extends MongoRepository<ClientDetailsResponse, Integer> {

}
