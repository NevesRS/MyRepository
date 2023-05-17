import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        Player player = new Player(10, 2, 100);
        Enemy enemy = new Enemy(10, 2, 100);

        int turno = 0;
        boolean isDead = false;

        while (isDead == false) {
            // ALGORITMO PLAYER

            if (player.getVida() > 0 && isDead == false) {
                System.out.println("Turno do player, digite 'atacar':" + "\nStamina do player: " + player.getStamina());
                String comandoPlayer = teclado.nextLine();

                if (comandoPlayer.equals("atacar") && turno == 0 && player.getStamina() > 0 && isDead == false) {
                    enemy.setVida(enemy.getVida() - player.getForca());
                    player.setStamina(player.getStamina() - 5);
                    turno = 1;
                }
                if (comandoPlayer.equals("descansar") && turno == 0) {
                    player.setStamina(player.getStamina() + 5);
                }
                if (enemy.getVida() > 0) {
                    System.out.println("Vida do inimigo: " + enemy.getVida());
                }
                if (enemy.getVida() <= 0) {
                    System.out.println("Inimigo morreu!");
                }
            }
            
            // ALGORITMO INIMIGO

            if (enemy.getVida() > 0 && isDead == false){
                System.out
                        .println("Turno do inimigo, digite 'atacar':" + "\nStamina do inimigo: " + enemy.getStamina());
                String comandoEnemy = teclado.nextLine();

                if (comandoEnemy.equals("atacar") && turno == 1 && enemy.getStamina() > 0 && isDead == false) {
                    player.setVida(player.getVida() - enemy.getForca());
                    enemy.setStamina(enemy.getStamina() - 5);
                    turno = 0;
                }
                if (comandoEnemy.equals("descansar") && turno == 0) {
                    enemy.setStamina(enemy.getStamina() + 5);
                }
                if (player.getVida() > 0) {
                    System.out.println("Vida do player: " + player.getVida());
                }
                if (player.getVida() <= 0) {
                    System.out.println("Player morreu!");
                }
            }
            
            if (player.getVida() <= 0 || enemy.getVida() <= 0) {
                isDead = true;
            }
        }

        teclado.close();
    }
}