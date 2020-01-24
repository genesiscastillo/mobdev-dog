package cl.mobdev.client;

import org.springframework.web.client.RestClientException;

import com.fasterxml.jackson.core.JsonProcessingException;

import cl.mobdev.client.vo.ResponseDogCeoVO;

public interface DogClientService {

	ResponseDogCeoVO obtenerImagenesPorRaza(String raza) throws JsonProcessingException, RestClientException;
	
	ResponseDogCeoVO obtenerPorSubRaza(String raza) throws JsonProcessingException, RestClientException; 
}
