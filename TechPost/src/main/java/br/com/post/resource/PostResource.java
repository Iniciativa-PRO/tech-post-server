package br.com.post.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.post.bo.PostBO;
import br.com.post.to.PostTO;

@Path("/post")
public class PostResource {
		
	PostBO pb = new PostBO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<PostTO> buscar(){
		return pb.listar();
	}
}
