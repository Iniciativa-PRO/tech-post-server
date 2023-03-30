package br.com.post.bo;

import java.util.List;

import br.com.post.dao.PostDAO;
import br.com.post.to.PostTO;

public class PostBO {
	
	private PostDAO pd;
	
	public List<PostTO> listar(){
		pd = new PostDAO();
		return pd.selectAll();
		
	}
	
}
