package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class BaseDeDonneesTests {

    // simuler les comportements de CRUD
    @MockBean
    private VoitureRepository voitureRepository;

    @Test
    public void uneVoiture(){
        // tester les méthodes de l'interface CrudRepository qui permette d'accéder à la base de données: https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html
        // save, find, delete...
        voitureRepository = mock(VoitureRepository.class);
        Voiture o = new Voiture("Peugeot", 2500);
        when(voitureRepository.save(o)).thenReturn(o);
        // j`ai cree une instance de voiture o et je le mets sur les deux

    }

}
