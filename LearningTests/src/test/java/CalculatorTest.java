import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leonardoteixeira.calculatorprogram.model.Calculator;

public class CalculatorTest {
    @Test
    public void shouldReturnZeroWhenNoValueWereGiven(){
        Calculator calculator = new Calculator();

       double sum = calculator.sum();
        Assertions.assertEquals(0, sum);
    }

    @Test
    public void shouldReturnTheSumOfGivenValues(){
        Calculator calculator = new Calculator();

        double sum = calculator.sum(3, 6);
        Assertions.assertEquals(9, sum);
    }
}
