
import org.lgna.story.resources.quadruped.AbyssinianCatResource;

public class AbyssinianCat extends Quadruped {
    public void speak(){
        this.say("Meow");
    }
    public AbyssinianCat() {
        super(AbyssinianCatResource.DEFAULT);
    }
}
