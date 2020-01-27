package br.com.rqueiroz.material;

import java.math.BigDecimal;

public class Material {

    Long id;
    BigDecimal codigo;
    String codigoAntigo;
    String codigoDeReferencia;
    String descricao;
    BigDecimal vidaUtilEmKm;
    BigDecimal vidaUtilEmMeses;
    String posicaoNoVeiculo;
    Boolean ativo;
    Boolean controlado;
    Boolean garantia;
    Boolean produtoDeMontagem;
    Boolean possuiSerializacao;
    Boolean requisicaoEspecial;
    Double peso;
    BigDecimal ultimoValorComprado;
    BigDecimal valorMedio;
    Long idManutencao;
    Long idEstoque;
}
