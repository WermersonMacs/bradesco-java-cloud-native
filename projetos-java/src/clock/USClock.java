package clock; // Define o pacote chamado clock

// Classe USClock que estende Clock e nao eh selada (pode ser estendida por outras classes)
public non-sealed class USClock extends Clock{

    private String periodIndicador; // Armazena o indicador de periodo (AM ou PM)

    public String getPeriodIndicador() {
        return periodIndicador; // Retorna o valor atual do periodo (AM ou PM)
    }

    public void setAfterMidday(){
        this.periodIndicador = "PM"; // Define o periodo como PM (apos meio-dia)
    }

    public void setBeforerMidday(){
        this.periodIndicador = "AM"; // Define o periodo como AM (antes do meio-dia)
    }

    // Sobrescreve o metodo setHour para ajustar o periodo automaticamente
    public void setHour(int hour){
        setBeforerMidday(); // Por padrao, define o periodo como AM

        if ((hour >= 12)&& (hour <= 23)){
            setAfterMidday(); // Se a hora for entre 12 e 23, define como PM
            this.hour = hour -12; // Converte para formato de 12 horas
        } else if (hour >= 24) {
            this.hour = 0; // Se a hora for 24 ou mais, define como meia-noite (0h)
        } else {
            this.hour = hour; // Caso contrario, define a hora normalmente
        }
    }

    @Override
    Clock convert(Clock clock) {
        // Usa pattern matching para identificar o tipo do relogio a ser convertido
        switch (clock){
            // Se for USClock, copia a hora e o periodo
            case USClock usClock -> {
                this.hour = usClock.getHour();
                this.periodIndicador = usClock.getPeriodIndicador();
            }
            // Se for BRLClock, converte para formato de 12 horas com AM/PM
            case BRLClock brlClock -> this.setHour(brlClock.getHour());
        }
        return this; // Retorna o proprio objeto convertido
    }
}