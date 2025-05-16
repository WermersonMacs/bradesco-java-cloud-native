package clock; // Define o pacote chamado clock

public class MainClock {

    public static void main(String[] args) {
        Clock brlclock = new BRLClock(); // Cria um novo relogio no formato brasileiro
        brlclock.setSecond(0);           // Define os segundos como 0
        brlclock.setMinute(0);           // Define os minutos como 0
        brlclock.setHour(13);            // Define a hora como 13 (1 da tarde)

        System.out.println(brlclock.getTime()); // Imprime o horario atual do relogio brasileiro
        System.out.println(new USClock().convert(brlclock).getTime()); // Converte para formato americano e imprime o horario
    }
}