package br.com.post.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Post")
public class PostResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String buscar() {
		return "Teste";
	}

}
