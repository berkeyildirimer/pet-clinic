package org.pet.service;

import lombok.RequiredArgsConstructor;
import org.pet.repository.PetRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PetService {
    private final PetRepository petRepository;
}
