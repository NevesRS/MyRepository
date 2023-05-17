public class Player {
    private int vida;
    private int forca;
    private int stamina;

    public Player(int vida, int forca, int stamina){
        this.vida = vida;
        this.forca = forca;
        this.stamina = stamina;
    }

    public int getForca() {
        return forca;
    }
    public int getVida() {
        return vida;
    }
    public int getStamina() {
        return stamina;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}
