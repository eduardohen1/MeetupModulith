package com.example.demoModulith.notificacao;

import java.util.Date;

public class NotificacaoDTO {

    private Date date;
    private String formato;
    private String produtoNome;

    public NotificacaoDTO(Date date, String formato, String produtoNome) {
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

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }
}
