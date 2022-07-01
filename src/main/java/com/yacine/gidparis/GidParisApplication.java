package com.yacine.gidparis;

import com.yacine.gidparis.dao.SitesRepository;
import com.yacine.gidparis.entities.Sites;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class GidParisApplication {
	public static void main(String[] args){
		SpringApplication.run(GidParisApplication.class, args);

	}
	@Bean
	CommandLineRunner start(SitesRepository sitesRepository, RepositoryRestConfiguration restConfiguration){
		return args -> {
			restConfiguration.exposeIdsFor(Sites.class);

			/*Sites sites = new Sites();
			sites.setId(12l);
			Sites s1= sitesRepository.save(sites);*/
			Sites s1 = sitesRepository.save(new Sites(1L,"Tour Eiffel",4,4,4,"Champ de Mars, 5av.Anatole France, 75007 Paris",930,2230));
			Sites s2 = sitesRepository.save(new Sites(2L,"Cathédrale Notre-Dame de Paris",4,4,4,"6 Parvis Notre-Dame-Pl.Jean-Paul ||, 75004 Paris",0,0));
			Sites s3 = sitesRepository.save(new Sites(3L,"Sacré-Coeur",4,4,4,"35 Rue du Chevalier de la Barre, 75018 Paris",6,22));
			Sites s4 = sitesRepository.save(new Sites(4L,"Musée du louvre",4,4,4,"Rue de Rivoli, 75001 Paris",9,18));

		};
	}
}


