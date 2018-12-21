
import org.lgna.story.resources.quadruped.ScottyDogResource;

public class ScottyDog extends Quadruped {
    String gender;
    public void speak(){
        this.say("Woof. My gender is " + gender);
    }
    public ScottyDog(String g) {
        super(ScottyDogResource.DEFAULT);
        gender=g;
    }
    public ScottyDog() {
        super(ScottyDogResource.DEFAULT);
        gender="unknown";
    }
}