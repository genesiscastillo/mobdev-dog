package cl.mobdev.dto;

import java.util.ArrayList;
import java.util.List;

public class DogDTO {

	private String breed;
	private List<String> subBreeds = new ArrayList<>();
	private List<String> images = new ArrayList<>();
	
	public DogDTO(String breed) {
		super();
		this.breed = breed;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public List<String> getSubBreeds() {
		return subBreeds;
	}
	public void addSubBreed(String subBreed) {
		this.subBreeds.add( subBreed );
	}
	public void addImage(String image) {
		this.images.add( image );
	}
}