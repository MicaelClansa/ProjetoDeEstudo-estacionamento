package out.entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
public class Client  implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String cpf;
    private Boolean mensalista;
}

//    public Client() {
//    }
//
//    public Client(String name, String cpf, Boolean mensalista) {
//        this.name = name;
//        this.cpf = cpf;
//        this.mensalista = mensalista;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getCpf() {
//        return cpf;
//    }
//
//    public Boolean getMensalista() {
//        return mensalista;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setCpf(String cpf) {
//        this.cpf = cpf;
//    }
//
//    public void setMensalista(Boolean mensalista) {
//        this.mensalista = mensalista;
//    }
//
//    @Override
//    public String toString() {
//        return "Client{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", cpf='" + cpf + '\'' +
//                ", mensalista=" + mensalista +
//                '}';
//    }
//}
