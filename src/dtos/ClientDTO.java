package dtos;

public class ClientDTO {
    public ClientDTO(String name, String email, String cpf, String cellphone) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.cellphone = cellphone;
    }

    private String name;
    private String email;
    private String cpf;
    private String cellphone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
}
