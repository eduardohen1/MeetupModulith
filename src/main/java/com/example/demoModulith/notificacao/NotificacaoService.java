package com.example.demoModulith.notificacao;

import com.example.demoModulith.notificacao.internal.Notificacao;
import com.example.demoModulith.notificacao.internal.NotificacaoType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class NotificacaoService {

    private static final Logger LOG = (Logger) LoggerFactory.getLogger(NotificacaoService.class);

    public void createNotificacao(NotificacaoDTO notificacaoDTO){

        Notificacao notificacao = toEntity(notificacaoDTO);

        LOG.info("Recebendo notificação da Dependencia do módulo para o produto {} na data {} por {}.",
                notificacao.getProdutoNome(),
                notificacao.getDate(),
                notificacao.getFormato());
    }

    private Notificacao toEntity(NotificacaoDTO notificacaoDTO) {
        Notificacao notificacao = new Notificacao();
        notificacao.setDate(notificacaoDTO.getDate());
        notificacao.setProdutoNome(notificacaoDTO.getProdutoNome());
        switch (notificacaoDTO.getFormato().toUpperCase().trim()){
            case "SMS":
                notificacao.setFormato(NotificacaoType.SMS);
                break;
            case "EMAIL":
                notificacao.setFormato(NotificacaoType.EMAIL);
                break;
            case "WHATSAPP":
                notificacao.setFormato(NotificacaoType.WHATSAPP);
                break;
        }
        return notificacao;
    }

}
