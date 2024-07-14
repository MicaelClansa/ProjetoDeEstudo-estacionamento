package adapter.dto;

public class ClientDTO {
    private String name;
    private String cpf;
    private Boolean mensalista;

    public ClientDTO() {
    }

    public ClientDTO(String name, String cpf, Boolean mensalista) {
        this.name = name;
        this.cpf = cpf;
        this.mensalista = mensalista;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getMensalista() {
        return mensalista;
    }

    public void setMensalista(Boolean mensalista) {
        this.mensalista = mensalista;
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", mensalista=" + mensalista +
                '}';
    }
}