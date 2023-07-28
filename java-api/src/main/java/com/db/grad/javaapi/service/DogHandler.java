package com.db.grad.javaapi.service;
import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;

import java.util.Optional;

public class DogHandler {
    private DogsRepository itsDogRepo;
    public DogHandler(DogsRepository repo) {
        itsDogRepo = repo;
    }
    public long addDog(Dog theDog){
        return itsDogRepo.save( theDog );
    }
    public long getNoOfDogs(){
        return itsDogRepo.count();
    }

    public Dog getDogByName( String name ){
        Dog expectedDog = new Dog();
        expectedDog.setId(1); expectedDog.setName(name);

        if(itsDogRepo.findByName(expectedDog).size()>=1){
            return expectedDog;
        }

        return null;
    }

    public Dog getDogById( long id ){
        return itsDogRepo.findById(id);
    }

    public long updateDogDetails( Dog dog ) {
        Dog updateDog = itsDogRepo.findById(dog.getId());
        updateDog.setName(dog.getName());
        return updateDog.getId();
    }
    
    public boolean removeDog( long id ) {
        boolean output = false;
        Optional<Dog> theDog = Optional.ofNullable(itsDogRepo.findById(id));
        if(theDog.isPresent()){
            itsDogRepo.delete(theDog.get());
            output = true;
        }
        return output;
    }
}
