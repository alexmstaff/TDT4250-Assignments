package tdt4250.converter.rest;

import java.util.Collection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsResource;

import com.fasterxml.jackson.core.JsonProcessingException;

import tdt4250.converter.api.Unit;
import tdt4250.converter.api.UnitConversion;
import tdt4250.converter.api.UnitConversionResult;


@Component(service=UnitResource.class)
@JaxrsResource
@Path("unit")
public class UnitResource {
	
	@Reference(
			
			policy = ReferencePolicy.DYNAMIC
			)
	private volatile Collection<Unit> units;
	
	public UnitConversion getUnitConversion() {
		return new UnitConversion(units.toArray(new Unit[units.size()]));
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public UnitConversionResult convert(@QueryParam("q") String q) throws JsonProcessingException {
		return getUnitConversion().convert(q);
	}
	
	@GET
	@Path("/{unit}")
	@Produces(MediaType.APPLICATION_JSON)
	public UnitConversionResult convert(@PathParam("unit") String unit, @QueryParam("q") String q) throws JsonProcessingException {
		return getUnitConversion().convert(unit, q);
	}

}
