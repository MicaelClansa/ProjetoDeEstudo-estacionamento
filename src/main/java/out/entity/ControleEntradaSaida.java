package out.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.Duration;
import java.time.LocalDateTime;

@Entity
public class ControleEntradaSaida {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDateTime entrada;
    private LocalDateTime saida;
    private Duration permanencia;

    public ControleEntradaSaida() {
    }

    public ControleEntradaSaida(LocalDateTime saida, Duration permanencia, LocalDateTime entrada) {
        this.saida = saida;
        this.permanencia = permanencia;
        this.entrada = entrada;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public Duration getPermanencia() {
        return Duration.between(getEntrada(), getSaida());
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public void setSaida(LocalDateTime saida) {
        this.saida = saida;
    }

    @Override
    public String toString() {
        return "ControleEntradaSaida{" +
                "id=" + id +
                ", entrada=" + entrada +
                ", saida=" + saida +
                ", permanencia=" + permanencia +
                '}';
    }
}
