package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "financial_advisor_id")
    private FinancialAdvisor financialAdvisor;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private ClientPortfolio clientPortfolio;
    
    public Client() {}
    
    public Client(String name, String email, String phoneNumber, FinancialAdvisor financialAdvisor, ClientPortfolio clientPortfolio) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.financialAdvisor = financialAdvisor;
        this.clientPortfolio = clientPortfolio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public FinancialAdvisor getFinancialAdvisor() {
        return financialAdvisor;
    }

    public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) {
        this.financialAdvisor = financialAdvisor;
    }

    public ClientPortfolio getClientPortfolio() {
        return clientPortfolio;
    }

    public void setClientPortfolio(ClientPortfolio clientPortfolio) {
        this.clientPortfolio = clientPortfolio;
    }


}

