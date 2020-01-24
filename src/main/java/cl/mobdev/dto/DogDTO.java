package cl.mobdev.dto;

import java.util.ArrayList;
import java.util.List;

public class DogDTO {

	private String breed;
	private List<String> subBreeds = new ArrayList<>();
	private List<String> images = new ArrayList<>();
	
	public DogDTO(String raza) {
		this.breed = raza;
	}
	public void addSubBreed(String subBreed) {
		this.subBreeds.add( subBreed );
	}
	public void addImage(String image) {
		this.images.add( image );
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
	public void setSubBreeds(List<String> subBreeds) {
		this.subBreeds = subBreeds;
	}
	public List<String> getImages() {
		return images;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}
}