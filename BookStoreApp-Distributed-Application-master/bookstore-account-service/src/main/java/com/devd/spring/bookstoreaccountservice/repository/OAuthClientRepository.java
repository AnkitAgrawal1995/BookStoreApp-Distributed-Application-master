package com.devd.spring.bookstoreaccountservice.repository;

import com.devd.spring.bookstoreaccountservice.repository.dao.OAuthClient;
import org.springframework.data.repository.CrudRepository;

/**
 * @author: Ankit Agrawal, Date : 2019-05-18
 */
public interface OAuthClientRepository extends CrudRepository<OAuthClient, Long> {

}
