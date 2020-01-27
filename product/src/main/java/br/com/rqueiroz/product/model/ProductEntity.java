package br.com.rqueiroz.product.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "a_produto")
@Data
@RequiredArgsConstructor
@EqualsAndHashCode
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Long id;

    @Column(name = "codigo")
    private BigDecimal codigo;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "vida_util_em_km")
    private BigDecimal vidaUtilEmKm;

    @Column(name = "vida_util_em_meses")
    private BigDecimal vidaUtilEmMeses;

    @Column(name = "posicao_no_veiculo")
    private String posicaoNoVeiculo;

    @Column(name = "codigo_de_referencia")
    private String codigoDeReferencia;

    @Column(name = "produto_controlado")
    private Boolean produtoControlado;

    @Column(name = "fg_garantia")
    private Boolean garantia;

    @Column(name = "fg_montagem")
    private Boolean produtoDeMontagem;

    @Column(name = "fg_serializacao")
    private Boolean possuiSerializacao;

    @Column(name = "fg_requisicao_especial")
    private Boolean requisicaoEspecial;

    @Column(name = "peso_em_kg")
    private Double peso;

    @Column(name = "ultimo_valor_comprado", precision = 19, scale = 4)
    private BigDecimal ultimoValorComprado;

    @Column(name = "valor_medio")
    private BigDecimal valorMedio;

}
