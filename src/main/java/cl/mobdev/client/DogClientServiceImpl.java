package cl.mobdev.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import cl.mobdev.client.vo.ResponseDogCeoVO;

@Service
@ConfigurationProperties(prefix = "dog.breed")
public class DogClientServiceImpl implements DogClientService {
	
	private String url;
	private String listImagens;
	private String listSubBreeds;
	
	@Override
	public ResponseDogCeoVO obtenerImagenesPorRaza(String raza) throws JsonProcessingException, RestClientException {

		String endpointImagenes = String.format("%s" + listImagens, url, raza);
		
		RestTemplate restTemplate = new RestTemplate();
		String resultImages = restTemplate.getForObject(endpointImagenes, String.class);

		ObjectMapper mapper = new ObjectMapper();
		ResponseDogCeoVO responseDogCeoVO = mapper.readValue(resultImages, ResponseDogCeoVO.class);

		return responseDogCeoVO;
	}

	@Override
	public ResponseDogCeoVO obtenerPorSubRaza(String raza) throws JsonProcessingException, RestClientException {
		
		String endpointSubBreed = String.format("%s"+listSubBreeds, url ,raza);

		RestTemplate restTemplate = new RestTemplate();
	    String resultSubBreed = restTemplate.getForObject(endpointSubBreed, String.class);
	    
	    ObjectMapper mapper = new ObjectMapper();
		ResponseDogCeoVO subRaza = mapper.readValue(resultSubBreed,	ResponseDogCeoVO.class);

		return subRaza;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}

	public void setListImagens(String listImagens) {
		this.listImagens = listImagens;
	}

	public void setListSubBreeds(String listSubBreeds) {
		this.listSubBreeds = listSubBreeds;
	}
	
}
