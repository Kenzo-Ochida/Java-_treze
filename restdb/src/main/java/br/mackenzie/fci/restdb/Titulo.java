package br.mackenzie.fci.restdb;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Titulo {
    @Id
    private Long id;
    private String name;
    private String esporte; 
    private double premio; 
    public TitulosCampeonatos(String n, String e, double p){

    }
}
