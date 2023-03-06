package br.com.post.to;

import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PostTO {

	private int codigo;
	private String titulo;
	private String coteudo;
	private String imagem;
	private Date dataNoticia;
	

	public PostTO(int codigo, String titulo, String coteudo, String imagem, Date dataNoticia) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.coteudo = coteudo;
		this.imagem = imagem;
		this.dataNoticia = dataNoticia;
	}


	public PostTO() {
		// TODO Auto-generated constructor stub
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getCoteudo() {
		return coteudo;
	}


	public void setCoteudo(String coteudo) {
		this.coteudo = coteudo;
	}


	public String getImagem() {
		return imagem;
	}


	public void setImagem(String imagem) {
		this.imagem = imagem;
	}


	public Date getDataNoticia() {
		return dataNoticia;
	}


	public void setDataNoticia(Date dataNoticia) {
		this.dataNoticia = dataNoticia;
	}

	
	

}
