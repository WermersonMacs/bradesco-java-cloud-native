package pet;

// Classe que representa uma maquina de dar banho em pets
public class PetMachine {

    // Indica se a maquina esta limpa (inicia limpa)
    private boolean clean = true;

    // Quantidade de agua disponivel na maquina
    private int water = 30;

    // Quantidade de shampoo disponivel na maquina
    private int shampoo = 10;

    // Pet que esta atualmente na maquina
    private Pet pet;

    // Dar banho no pet se tiver um pet na maquina
    public void takeShower(){
        if (this.pet == null){
            System.out.println("Coloque o pet na maquina para iniciar o banho!");
            return;
        }
        this.water -= 10;         // Usa agua
        this.shampoo -= 2;        // Usa shampoo
        pet.setClean(true);       // Marca pet como limpo
        System.out.println("O pet " + pet.getName() + " esta limpo");
    }

    // Adiciona agua na maquina ate o limite de 30
    public void addWater(){
        if (water == 30){
            System.out.println("A capacidade de agua da maquina esta no maximo");
            return;
        }
        water += 2;
    }

    // Adiciona shampoo na maquina ate o limite de 10
    public void addShampoo(){
        if (shampoo == 10){
            System.out.println("A capacidade de shampoo da maquina esta no maximo");
            return;
        }
        shampoo += 2;
    }

    // Retorna a quantidade atual de shampoo
    public int getShampoo() {
        return shampoo;
    }

    // Retorna a quantidade atual de agua
    public int getWater() {
        return water;
    }

    // Verifica se ha pet na maquina
    public boolean hasPet(){
        return pet != null;
    }

    // Retorna o pet que esta na maquina (pode ser null)
    public Pet getPet(){
        return this.pet;
    }

    // Coloca um pet na maquina, se estiver limpa e vazia
    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("A maquina esta suja, limpe a maquina antes de colocar o pet.");
            return;
        }
        if (this.pet != null){
            System.out.println("O pet " + this.pet.getName() + " esta na maquina nesse momento.");
            return;
        }
        this.pet = pet;
    }

    // Remove o pet da maquina e informa se ele esta limpo ou sujo
    public void removePet(){
        if (this.pet != null){
            if (this.pet.isClean()){
                System.out.println("O pet " + this.pet.getName() + " esta limpo.");
            } else {
                System.out.println("O pet " + this.pet.getName() + " foi removido e ainda esta sujo.");
            }
            this.clean = this.pet.isClean(); // maquina fica limpa se pet estiver limpo
            this.pet = null;                 // remove pet da maquina
        } else {
            System.out.println("Nenhum pet para remover.");
        }
    }

    // Lava a maquina, gastando agua e shampoo
    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A maquina esta limpa");
    }

    // Verifica se a maquina esta limpa
    public boolean isClean() {
        return this.clean;
    }
}