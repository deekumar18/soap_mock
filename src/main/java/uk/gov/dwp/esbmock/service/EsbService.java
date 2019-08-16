package uk.gov.dwp.esbmock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.gov.dwp.esbmock.repository.EmployeeDao;

@Service
public class EsbService {

	@Autowired
	static EmployeeDao dao;

}
