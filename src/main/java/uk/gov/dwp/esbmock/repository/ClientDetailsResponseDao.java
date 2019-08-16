package uk.gov.dwp.esbmock.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import uk.gov.dwp.esbmock.domain.ClientDetailsResponse;

@Repository
public interface ClientDetailsResponseDao extends MongoRepository<ClientDetailsResponse, Integer> {

	@Query("{'clientDetails.scin': ?0}")
	public ClientDetailsResponse findByScin(final String scin);
	
}
