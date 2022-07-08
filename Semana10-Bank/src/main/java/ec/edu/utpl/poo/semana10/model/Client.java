package ec.edu.utpl.poo.semana10.model;

import java.util.List;

public class Client {
    private String documentId;
    private String surname;
    private String name;
    private List<Account> accounts;

    public Client(String documentId, String surname, String name) {
        this.documentId = documentId;
        this.surname = surname;
        this.name = name;
    }

    public Client(String documentId, String surname, String name, List<Account> accounts) {
        this.documentId = documentId;
        this.surname = surname;
        this.name = name;
        this.accounts = accounts;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
