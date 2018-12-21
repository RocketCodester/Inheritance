
import org.lgna.story.event.SceneActivationListener;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.*;

public class Scene extends SScene {

    public Scene() {
        super();
    }

    private void performCustomSetup() {
    }

    private void performGeneratedSetUp() {
        this.setAtmosphereColor(new Color(0.588, 0.886, 0.988));
        this.setFromAboveLightColor(Color.WHITE);
        this.setFromBelowLightColor(Color.BLACK);
        this.setFogDensity(0.0);
        this.setName("myScene");
        this.ground.setPaint(SGround.SurfaceAppearance.GRASS);
        this.ground.setOpacity(1.0);
        this.ground.setName("ground");
        this.ground.setVehicle(this);
        this.camera.setName("camera");
        this.camera.setVehicle(this);
        this.camera.setOrientationRelativeToVehicle(new Orientation(0.0, 0.995185, 0.0980144, 6.12323E-17));
        this.camera.setPositionRelativeToVehicle(new Position(9.61E-16, 1.56, -7.85));
        this.betsy.setPaint(Color.WHITE);
        this.betsy.setOpacity(1.0);
        this.betsy.setName("betsy");
        this.betsy.setVehicle(this);
        this.betsy.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.betsy.setPositionRelativeToVehicle(new Position(1.77, 0.0, -0.183));
        this.betsy.setSize(new Size(0.735, 1.5, 2.4));
        this.cuddles.setPaint(Color.WHITE);
        this.cuddles.setOpacity(1.0);
        this.cuddles.setName("cuddles");
        this.cuddles.setVehicle(this);
        this.cuddles.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.cuddles.setPositionRelativeToVehicle(new Position(-1.98, 0.0, 1.68));
        this.cuddles.setSize(new Size(0.324, 0.616, 0.826));
        this.spike.setPaint(Color.WHITE);
        this.spike.setOpacity(1.0);
        this.spike.setName("spike");
        this.spike.setVehicle(this);
        this.spike.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.spike.setPositionRelativeToVehicle(new Position(0.433, 0.0, -2.99));
        this.spike.setSize(new Size(0.233, 0.636, 0.96));
        this.rover.setPaint(Color.WHITE);
        this.rover.setOpacity(1.0);
        this.rover.setName("rover");
        this.rover.setVehicle(this);
        this.rover.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.rover.setPositionRelativeToVehicle(new Position(0, 0.0, 0));
        this.rover.setSize(new Size(0.324, 0.616, 0.826));
    }

    private void initializeEventListeners() {
        this.addSceneActivationListener(new SceneActivationListener() {
            @Override
            public void sceneActivated(final SceneActivationEvent e) {
                Scene.this.myFirstMethod();
            }
        });
    }

    @Override
    protected void handleActiveChanged(final Boolean isActive, final Integer activationCount) {
        if (isActive) {
            if (activationCount == 1) {
                this.performGeneratedSetUp();
                this.performCustomSetup();
                this.initializeEventListeners();
            } else {
                this.restoreStateAndEventListeners();
            }
        } else {
            this.preserveStateAndEventListeners();
        }
    }

    public void myFirstMethod() {
        betsy.eat();
        betsy.speak();
        betsy.sleep();
        cuddles.eat();
        cuddles.speak();
        cuddles.sleep();
        spike.eat();
        spike.speak();
        spike.sleep();
        rover.eat();
        rover.speak();
        rover.sleep();
    }

    public SGround getGround() {
        return this.ground;
    }

    public SCamera getCamera() {
        return this.camera;
    }

    public Cow getBetsy() {
        return this.betsy;
    }

    public ScottyDog getCuddles() {
        return this.cuddles;
    }

    public AbyssinianCat getSpike() {
        return this.spike;
    }
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final Cow betsy = new Cow();
    private final ScottyDog cuddles = new ScottyDog("female");
    private final AbyssinianCat spike = new AbyssinianCat();
    private final ScottyDog rover = new ScottyDog("male");
}
