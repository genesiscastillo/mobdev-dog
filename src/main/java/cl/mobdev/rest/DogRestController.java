package cl.mobdev.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.fasterxml.jackson.core.JsonProcessingException;

import cl.mobdev.bussines.ServiceInformationDogComp;
import cl.mobdev.dto.DogDTO;

@RestController
@RequestMapping("/dog")
public class DogRestController {

	@Autowired
	ServiceInformationDogComp serviceInformationDogComp;

	@RequestMapping(value = "/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DogDTO> getInformationByBreed(@PathVariable("name") String name) {

		try {
			DogDTO dogDTO = serviceInformationDogComp.getInformationDog(name);
			
			return ResponseEntity.status(HttpStatus.OK).body(dogDTO);

		} catch (RestClientException | JsonProcessingException exception) {
			return new ResponseEntity(exception.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
}
