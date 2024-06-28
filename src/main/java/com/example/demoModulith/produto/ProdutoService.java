package com.example.demoModulith.produto;

import com.example.demoModulith.notificacao.NotificacaoDTO;
import com.example.demoModulith.notificacao.NotificacaoService;
import com.example.demoModulith.produto.internal.Produto;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ProdutoService {

    private final NotificacaoService notificacaoService;

    public ProdutoService(NotificacaoService notificacaoService) {
        this.notificacaoService = notificacaoService;
    }

    public void create(Produto produto){
        //tratamento de serviços
        notificacaoService.createNotificacao(new NotificacaoDTO(new Date(),"EMAIL", produto.getNome()));
    }

}
