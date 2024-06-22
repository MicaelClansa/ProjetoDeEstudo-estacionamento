package out.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
class Client {
    private @Id
    @GeneratedValue Long id;
    private String name;
    private String cpf;
    private Boolean mensalista;

    public Client() {
    }

    public Client(String name, String cpf, Boolean mensalista) {
        this.name = name;
        this.mensalista = mensalista;
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getMensalista() {
        return mensalista;
    }

    public void setMensalista(Boolean mensalista) {
        this.mensalista = mensalista;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", mensalista=" + mensalista +
                '}';
    }
}
