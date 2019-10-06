package tdt4250.converter.rest;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsExtension;

import com.fasterxml.jackson.databind.ObjectMapper;

import tdt4250.converter.api.UnitConversionResult;

@Component
@JaxrsExtension
@Produces(MediaType.APPLICATION_JSON)
public class UnitConversionResultWriter implements MessageBodyWriter<UnitConversionResult> {

	@Override
	public boolean isWriteable(Class<?> clazz, Type type, Annotation[] annotations, MediaType mediaType) {
		return clazz == UnitConversionResult.class;
	}
	
	private ObjectMapper objectMapper = new ObjectMapper();
	{
		objectMapper.registerModule(new UnitModule());
	}

	@Override
	public void writeTo(UnitConversionResult unitConversionResult, Class<?> clazz, Type type, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> values, OutputStream output) throws IOException, WebApplicationException {
		objectMapper.writeValue(output, unitConversionResult);
		output.flush();
	}

}