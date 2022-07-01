package com.yacine.gidparis.web;

import com.yacine.gidparis.dao.SitesRepository;
import com.yacine.gidparis.entities.Sites;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SitesRestService {
    @Autowired
    private SitesRepository sitesRepository;
    public List<Sites> getSites(){return sitesRepository.findAll();}
}
