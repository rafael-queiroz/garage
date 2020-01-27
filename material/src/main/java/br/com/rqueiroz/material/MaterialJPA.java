package br.com.rqueiroz.material;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "material")
@Data
@RequiredArgsConstructor
public class MaterialJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "codigo")
    BigDecimal codigo;

    @Column(name = "codigo_antigo")
    String codigoAntigo;

    @Column(name = "codigo_de_referencia")
    String codigoDeReferencia;

    @Column(name = "descricao")
    String descricao;

    @Column(name = "vida_util_em_km")
    BigDecimal vidaUtilEmKm;

    @Column(name = "vida_util_em_meses")
    BigDecimal vidaUtilEmMeses;

    @Column(name = "posicao_no_veiculo")
    String posicaoNoVeiculo;

    @Column(name = "fg_ativo")
    Boolean ativo;

    @Column(name = "fg_controlado")
    Boolean controlado;

    @Column(name = "fg_garantia")
    Boolean garantia;

    @Column(name = "fg_montagem")
    Boolean produtoDeMontagem;

    @Column(name = "fg_serializacao")
    Boolean possuiSerializacao;

    @Column(name = "fg_requisicao_especial")
    Boolean requisicaoEspecial;

    @Column(name = "peso_em_kg")
    Double peso;

    @Column(name = "ultimo_valor_comprado")
    BigDecimal ultimoValorComprado;

    @Column(name = "valor_medio")
    BigDecimal valorMedio;

    @Column(name = "id_grupo")
    Long idManutencao;

    @Column(name = "id_estoque")
    Long idEstoque;

}