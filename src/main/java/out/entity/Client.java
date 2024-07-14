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