import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankaccount;

    @BeforeEach
    public void setUp() {
        bankaccount = new BankAccount("Maymunah", "Butt", "22/08/02", "12/07/23", 5.00, 17171717);
    }

    @Test
    public void hasFirstName() {
        String actual = bankaccount.getFirstName();
        String expected = "Maymunah";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void hasLastName() {
        String actual = bankaccount.getLastName();
        String expected = "Butt";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void hasDateOfBirth() {
        String actual = bankaccount.getDateOfBirth();
        String expected = "22/08/02";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void hasCurrentDate() {
        String actual = bankaccount.getCurrentDate();
        String expected = "12/07/23";
        assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void setAccountNumber() {
        int actual = bankaccount.getAccountNumber();
        int expected = 17171717;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void setBalance() {
        double actual = bankaccount.getBalance();
        double expected = 5.00;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void deposit() {
        bankaccount.deposit(5.00);
        double actual = bankaccount.getBalance();
        double expected = 10.00;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void withdrawal() {
        bankaccount.withdrawal(2.50);
        double actual = bankaccount.getBalance();
        double expected = 2.50;
        assertThat(actual).isEqualTo(expected);
//    }
    }
}
