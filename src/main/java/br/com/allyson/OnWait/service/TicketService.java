package br.com.allyson.OnWait.service;

import br.com.allyson.OnWait.model.TicketModel;

public class TicketService {

    private Integer globalWait = 0;

    public void generateCode(Integer type, Integer preferential){
        String typeS= "";
        String preferentialS = "";

        typeS = switch (type) {
            case 1 -> "B";
            case 2 -> "T";
            default -> typeS;
        };

        preferentialS = switch (preferential) {
            case 1 -> "N";
            case 2 -> "A";
            case 3 -> "E";
            default -> preferentialS;
        };

        globalWait++;
        TicketModel ticket = new TicketModel(globalWait, preferentialS, typeS);

        System.out.println(ticket.getPreferential()+ticket.getSupport()+ticket.getWaitingNum());
    }
}
