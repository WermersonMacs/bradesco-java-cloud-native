package clock; // Define o pacote chamado clock

// Classe BRLClock que estende Clock e nao eh selada (pode ser estendida por outras classes)
public non-sealed class BRLClock extends Clock{

    @Override
    public Clock convert (final Clock clock){
        // Copia os segundos e minutos do relogio recebido
        this.second = clock.getSecond();
        this.minute = clock.getMinute();

        // Verifica o tipo do relogio usando pattern matching
        switch (clock){
            // Se for um USClock, converte o horario baseado no periodo (AM/PM)
            case USClock usClock -> this.hour = (usClock.getPeriodIndicador().equals("PM")) ?
                    usClock.getHour()+12 : // Se for PM, adiciona 12 horas
                    usClock.getHour();     // Se for AM, mantem a hora
            // Se for um BRLClock, apenas copia a hora
            case BRLClock brlClock -> this.hour = brlClock.getHour();
        }

        return this; // Retorna o proprio objeto com os dados convertidos
    }
}