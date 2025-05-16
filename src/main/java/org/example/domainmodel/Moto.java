package org.example.domainmodel;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "motos")
public class Moto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String placa;

    @Column(nullable = false)
    private String modelo;

    @Column(nullable = false)
    private int ano;

    @Column(nullable = false)
    private String cor;

    // Construtor padrão exigido pelo JPA
    public Moto() {
    }

    // Construtor completo
    public Moto(String placa, String modelo, int ano, String cor) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // equals e hashCode com base na placa
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Moto)) return false;
        Moto moto = (Moto) o;
        return Objects.equals(placa, moto.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa);
    }

    // toString
    @Override
    public String toString() {
        return "Moto{" +
                "id=" + id +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cor='" + cor + '\'' +
                '}';
    }
}
