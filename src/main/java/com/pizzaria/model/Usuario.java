package com.pizzaria.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by lucasbarros on 25/07/2017.
 */

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(length = 60)
    private String nome;

    @CPF(message = "CPF inválido")
    @NotBlank(message = "CPF deve ser informado")
    @Column(length = 14)
    private String cpf;

    @NotBlank(message = "Senha obrigatória")
    @Column(length = 100)
    private String senha;

    @NotBlank(message = "Confirme a senha")
    @Column(length = 100)
    private String confirmeSenha;

    @Column(length = 20)
    private String telefone;

    @Email(message = "E-mail inválido")
    @Column(length = 60)
    private String email;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "data_nascimento")
    private LocalDate dataDeNascimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmeSenha() {
        return confirmeSenha;
    }

    public void setConfirmeSenha(String confirmeSenha) {
        this.confirmeSenha = confirmeSenha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", senha='" + senha + '\'' +
                ", confirmeSenha='" + confirmeSenha + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                '}';
    }

}
