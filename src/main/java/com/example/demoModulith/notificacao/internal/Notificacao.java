package com.example.demoModulith.notificacao.internal;

import java.util.Date;

public class Notificacao {

    private Date date;
    private NotificacaoType formato;
    private String produtoNome;

    public Notificacao(){}

    public Notificacao(Date date, NotificacaoType formato, String produtoNome) {
        this.date = date;
        this.formato = formato;
        this.produtoNome = produtoNome;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public NotificacaoType getFormato() {
        return formato;
    }

    public void setFormato(NotificacaoType formato) {
        this.formato = formato;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }
}
