
import org.lgna.story.resources.QuadrupedResource;
import org.lgna.story.*;

public class Quadruped extends SQuadruped {
    public void eat(){
        this.getMouth().turn(TurnDirection.LEFT, 0.25);
        this.getMouth().turn(TurnDirection.RIGHT, 0.25);
    }
    public void sleep(){
        this.say("zzzzzzzzzzzz");
        this.roll(RollDirection.RIGHT, 0.25);
    }
    public Quadruped(final QuadrupedResource resource) {
        super(resource);
    }           
}