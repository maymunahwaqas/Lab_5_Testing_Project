import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankaccount;
    @BeforeEach
    public void setUp() {
        bankaccount = new BankAccount("Maymunah", "Butt", "22/08/02", "12/07/23", 171717, 0 );
    }
    @Test
    public void hasFirstName(){
        String actual = bankaccount.getFirstName();
        String expected = "Maymunah";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void hasLastName(){
        String actual = bankaccount.getLastName();
        String expected = "Butt";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void hasDateOfBirth(){
        String actual = bankaccount.getDateOfBirth();
        String expected = "22/08/02";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void hasCurrentDate(){
        String actual = bankaccount.getCurrentDate();
        String expected = "12/07/23";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void setAccountNumber(){
        int actual = bankaccount.getAccountNumber();
        int expected = 171717;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void setBalance(){
        int actual = bankaccount.getBalance();
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void deposit(){
        int actual = bankaccount.deposit();
        int expected = 1000;
        assertThat(actual).isEqualTo(expected);
    }
}
