package clock; // Define o pacote chamado clock

// Classe abstrata Clock, selada para permitir apenas BRLClock e USClock como subclasses
public sealed abstract class Clock  permits BRLClock,USClock{

    protected int hour;   // Armazena a hora
    protected int minute; // Armazena os minutos
    protected int second; // Armazena os segundos

    public int getHour() {
        return hour; // Retorna a hora atual
    }

    public void setHour(int hour) {
        if (hour >= 24){
            this.hour = 24; // Limita a hora a 24 se o valor passado for maior ou igual a 24
            return;
        }
        this.hour = hour; // Define a hora com o valor informado
    }

    public int getMinute() {
        return minute; // Retorna os minutos atuais
    }

    public void setMinute(int minute) {
        if (minute >= 60 ){
            this.minute = 60; // Limita os minutos a 60 se o valor passado for maior ou igual a 60
            return;
        }
        this.minute = minute; // Define os minutos com o valor informado
    }

    public int getSecond() {
        return second; // Retorna os segundos atuais
    }

    public void setSecond(int second) {
        if (second >= 60){
            this.second = 60; // Limita os segundos a 60 se o valor passado for maior ou igual a 60
            return;
        }
        this.second = second; // Define os segundos com o valor informado
    }

    // Metodo privado para formatar valores com dois digitos (ex: 01, 09, etc.)
    private String format(int value){
        return value < 9 ? "0" + value : String.valueOf(value);
    }

    // Retorna o horario formatado como string no padrao HH:MM:SS
    public String getTime(){
        return format(hour)+":"+format(minute)+":"+format(second);
    }

    // Metodo abstrato que deve ser implementado para converter um Clock
    abstract Clock convert (Clock clock);

}