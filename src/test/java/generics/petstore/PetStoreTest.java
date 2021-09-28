package generics.petstore;

import generics.PetStore;
import org.junit.jupiter.api.Test;

public class PetStoreTest {
    @Test
    void test() {

        PetStore<Dog> dogPetStore = new PetStore<>();
        // Despite the fact that alligator is an animal
        // we cannot use it with our pet store type
        // because it does not implement Petable
//        PetStore<Alligator> alligatorPetStore = new PetStore<>();

    }
}
