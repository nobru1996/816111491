package br.usjt.arqsw.entity;

/**
 * 
 * @author Bruno Gabriel  RA:816111491  SI3ANMCA
 *
 */
 *
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
@Entity
public class Fila {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_fila")
	private int id;
	
	@NotNull
	@Size(max=45)
	@Column(name="nm_fila")
	private String nome;
	
	@Null
	@Size(max=256)
	@Column(name="caminho_figura")
	private String figura;
	
	public String getFigura() {
		return figura;
	}
	public void setFigura(String figura) {
		this.figura = figura;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Fila [id=" + id + ", nome=" + nome + "]";
	}
}
