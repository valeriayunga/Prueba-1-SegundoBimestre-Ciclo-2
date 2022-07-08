package ec.edu.utpl.poo.semana10.model;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Client> clients;

    public Bank() {
        clients = new ArrayList<>();
    }

    public Bank(String name) {
        this();
        this.name = name;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public void addClient(Client client) {
        clients.add( client );
    }

    public String getName() {
        return name;
    }
}
