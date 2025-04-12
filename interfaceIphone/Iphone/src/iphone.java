import org.programas.browser;
import org.programas.call;
import org.programas.musicPlayer;

public class iphone implements call,  musicPlayer, browser{

    @Override
    public void navigation() {
        // TODO Auto-generated method stub
        System.out.println("Navegando na internet");
    }

    @Override
    public void playMusic() {
        // TODO Auto-generated method stub
        System.out.println("Play/Pause na musica");
    }

    @Override
    public void stopMusic() {
        // TODO Auto-generated method stub
        System.out.println("Stop musica");
    }

    @Override
    public void to_call() {
        // TODO Auto-generated method stub
        System.out.println("Ligar");
    }

    @Override
    public void calling() {
        // TODO Auto-generated method stub
        System.out.println("Chamando");
    }
    
}