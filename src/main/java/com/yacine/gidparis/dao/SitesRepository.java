package com.yacine.gidparis.dao;

import com.yacine.gidparis.entities.Sites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SitesRepository extends JpaRepository<Sites, Long> {

}
