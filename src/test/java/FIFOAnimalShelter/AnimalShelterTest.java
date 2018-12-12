package FIFOAnimalShelter;

import StacksAndQueues.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void enqueue() {
        AnimalShelter testAnimalShelter = new AnimalShelter();
        testAnimalShelter.enqueue(new Animal("cat"));
        testAnimalShelter.enqueue(new Animal("dog"));
        testAnimalShelter.enqueue(new Animal("turtle"));

        assertEquals("Should be cat", "cat", testAnimalShelter.front.value.toString());
        assertEquals("Should be dog", "dog", testAnimalShelter.front.next.value.toString());
        assertEquals("Should be turtle", "turtle", testAnimalShelter.rear.value.toString());
    }

    @Test
    public void dequeue() {
        AnimalShelter testAnimalShelter = new AnimalShelter();
        testAnimalShelter.enqueue(new Animal("cat"));
        testAnimalShelter.enqueue(new Animal("dog"));
        testAnimalShelter.enqueue(new Animal("turtle"));
        testAnimalShelter.enqueue(new Animal("hamster"));
        testAnimalShelter.enqueue(new Animal("dog"));
        testAnimalShelter.enqueue(new Animal("bird"));

        assertEquals("Should be cat", "cat", testAnimalShelter.dequeue("cat").toString());
        assertEquals("Should be bird", "bird", testAnimalShelter.dequeue("bird").toString());
        assertEquals("Should be hamster", "hamster", testAnimalShelter.dequeue("hamster").toString());

        Node current = testAnimalShelter.front;
        while (current != null) {
            assertTrue("Should not be cat", current.value.toString() != "cat");
            assertTrue("Should not be bird", current.value.toString() != "bird");
            assertTrue("Should not be hamster", current.value.toString() != "hamster");
            current = current.next;
        }
    }

    @Test
    public void peek() {
        AnimalShelter testAnimalShelter = new AnimalShelter();
        testAnimalShelter.enqueue(new Animal("cat"));
        assertTrue("Should be cat", testAnimalShelter.front.value.toString() == "cat");

        testAnimalShelter.enqueue(new Animal("dog"));
        assertTrue("Should be cat", testAnimalShelter.front.value.toString() == "cat");

        testAnimalShelter.dequeue("cat");
        assertTrue("Should be dog", testAnimalShelter.front.value.toString() == "dog");
    }
}