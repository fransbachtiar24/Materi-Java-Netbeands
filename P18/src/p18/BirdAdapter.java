/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p18;

/**
 *
 * @author mhdha
 */
public class BirdAdapter implements ToyDuck {

    Bird bird;
    
    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }
    @Override
    public void squeak() {
        bird.makesound();
    }
    
}
