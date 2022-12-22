package livraria.produtos;

import java.util.*;

public class GerenciadorDeCupons {

    private Map<String, Double> cupons;

    public GerenciadorDeCupons(){

        this.cupons = new HashMap<>();

        cupons.put("CAB11", 5.0);
        cupons.put("CAB22", 10.0);
        cupons.put("CAB33", 15.0);
        cupons.put("CAB44", 18.0);
        cupons.put("CAB55", 20.0);

    }

    public Double validaCupom(String cupom) {
        return this.cupons.get(cupom);
    }
}
