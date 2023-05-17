import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        Player player = new Player(10, 2, 15, 5);
        Enemy enemy = new Enemy(10, 2, 15, 5);

        int turno = 0;
        boolean isDead = false;

        while (isDead == false) {
            // ALGORITMO PLAYER

            if (player.getVida() > 0 && isDead == false) {
                System.out.println("\nTurno do player, digite 'atacar, 'defender' ou 'descansar'"
                        + "\nStamina do player: " + player.getStamina());
                String comandoPlayer = teclado.nextLine();

                if (comandoPlayer.equals("atacar") && turno == 0 && player.getStamina() > 0 && isDead == false) {
                    enemy.setVida(enemy.getVida() - player.getForca());
                    player.setStamina(player.getStamina() - 5);
                    turno = 1;
                }
                if (comandoPlayer.equals("descansar") && turno == 0) {
                    player.setStamina(player.getStamina() + 5);
                    turno = 1;
                }
                if (comandoPlayer.equals("defender") && turno == 0 && player.getStamina() > 0) {
                    player.setVida(player.getVida() + player.getArmadura());
                    player.setStamina(player.getStamina() - 5);
                    turno = 1;
                }
                if (enemy.getVida() > 0) {
                    System.out.println("Vida do inimigo: " + enemy.getVida());
                }
                if (enemy.getVida() <= 0) {
                    System.out.println("Inimigo morreu!");
                }
                if (enemy.getStamina() <= 0) {
                    System.out.println("Inimigo sem stamina, digite 'descansar' para recuperar-se");
                }
            }

            // ALGORITMO INIMIGO

            if (enemy.getVida() > 0 && isDead == false) {
                System.out.println("\nTurno do inimigo, digite 'atacar', 'defender' ou 'descansar': "
                        + "\nStamina do inimigo: " + enemy.getStamina());
                String comandoEnemy = teclado.nextLine();

                if (comandoEnemy.equals("atacar") && turno == 1 && enemy.getStamina() > 0 && isDead == false) {
                    player.setVida(player.getVida() - enemy.getForca());
                    enemy.setStamina(enemy.getStamina() - 5);
                    turno = 0;
                }
                if (comandoEnemy.equals("descansar") && turno == 1) {
                    enemy.setStamina(enemy.getStamina() + 5);
                    turno = 0;
                }
                if (comandoEnemy.equals("defender") && turno == 1 && enemy.getStamina() > 0) {
                    enemy.setVida(enemy.getVida() + enemy.getArmadura());
                    enemy.setStamina(enemy.getStamina() - 5);
                    turno = 0;
                }
                if (player.getVida() > 0) {
                    System.out.println("Vida do player: " + player.getVida());
                }
                if (player.getVida() <= 0) {
                    System.out.println("Player morreu!");
                }
                if (player.getStamina() <= 0) {
                    System.out.println("Player sem stamina, digite 'descansar' para recuperar-se");
                }
            }

            if (player.getVida() <= 0 || enemy.getVida() <= 0) {
                isDead = true;
            }
        }

        teclado.close();
    }
}