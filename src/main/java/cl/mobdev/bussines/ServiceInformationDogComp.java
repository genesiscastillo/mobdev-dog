package cl.mobdev.bussines;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;

import com.fasterxml.jackson.core.JsonProcessingException;

import cl.mobdev.client.DogClientService;
import cl.mobdev.client.vo.ResponseDogCeoVO;
import cl.mobdev.dto.DogDTO;

@Component
public class ServiceInformationDogComp {

	@Autowired
	DogClientService dogClientService;

	public DogDTO getInformationDog(String breed) throws JsonProcessingException, RestClientException {

		ResponseDogCeoVO imagenes = dogClientService.obtenerImagenesPorRaza(breed);

		ResponseDogCeoVO subRazas = dogClientService.obtenerPorSubRaza(breed);

		DogDTO dogDTO = new DogDTO( breed );
		
		subRazas.getMessage().stream().forEach(subraza -> dogDTO.addSubBreed(subraza));
		
		imagenes.getMessage().stream().forEach(image -> dogDTO.addImage(image));
		
		return dogDTO;
	}

}
