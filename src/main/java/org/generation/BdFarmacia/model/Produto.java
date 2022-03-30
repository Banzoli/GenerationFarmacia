package org.generation.BdFarmacia.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.generation.BdFarmacia.model.Categoria;

@Entity
@Table(name = "tb_postagem")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	@Size(min = 5, max = 100, message = "O atributo tÃ­tulo deve conter no mÃ­nimo 05 e no mÃ¡ximo 100 caracteres")
	private String titulo;

	@NotNull(message = "O atributo texto Ã© ObrigatÃ³rio!")
	@Size(min = 10, max = 500, message = "O atributo texto deve conter no mÃ­nimo 10 e no mÃ¡ximo 500 caracteres")
	private String texto;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new java.sql.Date(System.currentTimeMillis());

	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Categoria categoria;

	public Categoria getCategoria() {
		return categoria;
	}

	public void setTema(Categoria categoria) {
		this.categoria = categoria;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date data) {
		this.date = date;
	}

}
