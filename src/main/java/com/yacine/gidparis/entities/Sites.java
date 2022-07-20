package com.yacine.gidparis.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Sites implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    //déclaration de variables
    private Long id;
    private String designation;
    private double longitude,latitude,altitude;
    private String adresse;
    @DateTimeFormat
    private String heureOuverture;
    private String heureFeremeture;


}
