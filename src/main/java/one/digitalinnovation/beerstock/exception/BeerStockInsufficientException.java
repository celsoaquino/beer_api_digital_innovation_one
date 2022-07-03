package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockInsufficientException extends Exception {

    public BeerStockInsufficientException(Long id, int quantityToDecrement, int stockCurrent) {
        super(String.format("Beers with %s ID to decrement informed Insufficient the stock capacity: %s, stock current: %s", id, quantityToDecrement, stockCurrent));
    }
}
