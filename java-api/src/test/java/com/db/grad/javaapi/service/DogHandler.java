package com.db.grad.javaapi.service;
import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;

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

        if(itsDogRepo.findByName.count()>=1){
            return itsDogRepo.findByName(expectedDog);
        }

        return null;
    }

    public Dog getDogById( long id ){
        return itsDogRepo.findById(id);
    }

    public long updateDogDetails( Dog dog ) {
        Dog updateDog = itsDogRepo.findById(dog.getId());
        updateDog.setName(dog.getName());
    }

    public bool removeDog( long id ) {
        Dog expectedDog = new Dog();
        expectedDog.setId(id);
        return itsDogRepo.delete(expectedDog);
    }
}
