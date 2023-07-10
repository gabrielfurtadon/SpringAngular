package domain;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Data
@Entity(name = "tb_servico")
public class Servico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false, length = 150)
	private String descricao;
	@ManyToOne//(MUITOS SERVIÇOS PARA UM CLIENTE)UM CLIENTE VAI TER MUITOS SERVIÇOS E UM SERVIÇO SÓ VAI TER UM CLIENTE
	@JoinColumn(name = "id_cliente")  //TABELA SERVIÇO TEM UMA CHAVE ESTRANGEIRA para a tabela de clientes
	private Cliente cliente;
	@Column
	private BigDecimal valor;
	
}
