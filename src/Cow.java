
import org.lgna.story.resources.quadruped.CowResource;

public class Cow extends Quadruped {
    public void speak(){
        this.say("MOOOO");
    }
    @Override
    public void sleep(){
        this.say("zzzzzzzzzzzz");
    }
    public Cow() {
        super(CowResource.DEFAULT);
    }
}
