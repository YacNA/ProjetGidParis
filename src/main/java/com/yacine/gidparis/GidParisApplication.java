package com.yacine.gidparis;

import com.yacine.gidparis.dao.SitesRepository;
import com.yacine.gidparis.entities.Sites;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

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
			DateFormat Tf=new SimpleDateFormat("HH:mm");
			Sites s1 = sitesRepository.save(new Sites(1L,"Tour Eiffel",4,4,4,"Champ de Mars, 5av.Anatole France, 75007 Paris","9:30","22:30"));
			Sites s2 = sitesRepository.save(new Sites(2L,"Cathédrale Notre-Dame de Paris",4,4,4,"6 Parvis Notre-Dame-Pl.Jean-Paul ||, 75004 Paris","0","0"));
			Sites s3 = sitesRepository.save(new Sites(3L,"Sacré-Coeur",4,4,4,"35 Rue du Chevalier de la Barre, 75018 Paris","6:00","22:00"));
			Sites s4 = sitesRepository.save(new Sites(4L,"Saint-michel",4,4,4,"Rue de Rivoli, 75001 Paris","9:00","18:00"));

		};
	}
}


