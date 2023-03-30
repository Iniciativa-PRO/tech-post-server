package br.com.post.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.post.to.PostTO;

public class PostDAO {

	private static List<PostTO> listaDePosts;
	
	public PostDAO() {
		if(listaDePosts == null) {
			listaDePosts = new  ArrayList<PostTO>();
			
			PostTO pto = new PostTO();
			pto.setCodigo(1);
			pto.setTitulo("Titulo");
			pto.setConteudo("Alguma Coisa");
			pto.setImagem(null);
			pto.setDataNoticia(null);
			listaDePosts.add(pto);
			
			pto = new PostTO();
			pto.setCodigo(2);
			pto.setTitulo("Titulo2");
			pto.setConteudo("Alguma outra Coisa");
			pto.setImagem(null);
			pto.setDataNoticia(null);
			listaDePosts.add(pto);

			
		}
			
	}

	public List<PostTO> selectAll(){
		return listaDePosts;
	}
}
