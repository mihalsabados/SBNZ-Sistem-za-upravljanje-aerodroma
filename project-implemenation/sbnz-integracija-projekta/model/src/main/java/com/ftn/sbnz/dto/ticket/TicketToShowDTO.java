package com.ftn.sbnz.dto.ticket;
import com.ftn.sbnz.model.Discount;
import com.ftn.sbnz.model.Ticket;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TicketToShowDTO {
    private List<Discount> discounts;
    private double basePrice;
    private double finalPrice;
    private long alternativeFlightId;

    public TicketToShowDTO(Ticket ticket, long flightId){
        this.discounts = ticket.getDiscounts();
        this.finalPrice = ticket.getFinalPrice();
        this.alternativeFlightId = flightId;
        this.basePrice = ticket.getBasePrice();
    }

    public TicketToShowDTO(long alternativeFlightId){
        this.alternativeFlightId = alternativeFlightId;
    }
}
