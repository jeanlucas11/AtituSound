package br.edu.atitus.poo.atitusound.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.poo.atitusound.dtos.ArtistDTO;
import br.edu.atitus.poo.atitusound.entities.ArtistEntity;
import br.edu.atitus.poo.atitusound.services.ArtistService;
import br.edu.atitus.poo.atitusound.services.GenericService;

@RestController
@RequestMapping("/artists")
public class ArtistController extends GenericController<ArtistEntity, ArtistDTO>{
	
	private final ArtistService ArtistService;
	public ArtistController(ArtistService service) {
		super();
		this.ArtistService = service;
	}

	protected ArtistEntity converteDTO2Entity(ArtistDTO dto) {
		ArtistEntity entity = new ArtistEntity();
		entity.setName(dto.getName());
		entity.setImage(dto.getImage());
		return entity;
	}

	@Override
	protected GenericService<ArtistEntity> getService() {
		return ArtistService;
	}

	
}



// quando é só service, tenho que mudar para ArtistService