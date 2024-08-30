package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {
    //anotacao

    ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQC+GSn+FTkUXONKoG5K9y81L5j9jXZ9OvMPAXMSoy6nMNX8jwe4dUENYCicpQywBZZh2L68t00rI7b0luY8xcL3vknW0Xw0BnZapLkLeumMEIEMEvsoSZ5l52knEWQ6D01+AcmoBZfPSIDZrBy7S1zD2C6FK8sRL28Zlz5/dTw9OS06kVzoh9asCvGbh4Y5ajB2H9XvHgr5WnYvSwiD0J4gb1GmVOzKL7KxFVGUdSeXE+Gabhn3XTrn20AL6SS3wXuBtedNrFXRD6Q+fQW6rvYR2qA0DOh/A++jgwzEHKTPIjiOilLW6NSWlz6R+Bun12y0b+uXv2fUAIHvzm6KE9OqUaXt4IAvE/2qqhe6A2+J1ok26IYgZ+1vPwF2QLS5JJdg0nGlIfuIs61jXDvsIAvVNh01wrnfA2DVGwSUxeGYmdG2eI/n7XXVVNSz5OCkJ/1FJrZ2IxdQ2hal1FBnEnA416Go20Gq/heafm2R9wuBp13NeUPdQeWjniv5Ioliz0yqwr8AAcgxYW0WMaC+MHRYE+0M3DVMZ3cBoXINc+OsDbtOYSMPvk/pA5eqaXo8LsjQQS7l+YFI+CJU1v6yFRpiU/AcoB71PVSSekYQk1/gaUIN4cxwdg4awGL5zs0cdOYpFxNhqk+MJt2YBdzPktb82dJVi4HFkd17L21F3ZfXOw== seu_email@example.com

}
