package com.example.demo.data;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
        Voiture v = new Voiture("Renault", 5000);
        String m = v.getMarque();
        int p = v.getPrix();
        int prix = 5000;
        String marque = "Renault";
        Assert.isTrue(p == prix, "Les prix sont differents");
        Assert.isTrue(m == marque, "Les prix sont differents");

    }

}
