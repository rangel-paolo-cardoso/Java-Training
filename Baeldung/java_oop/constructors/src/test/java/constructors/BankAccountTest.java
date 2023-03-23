package constructors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.time.Month;

import org.hamcrest.core.IsEqual;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

    private BankAccount account;
    private BankAccount newAccount;

    @Before
    public void setUp() throws Exception {
        LocalDateTime opened = LocalDateTime.of(2023, Month.JUNE, 23, 02, 7, 00);
        account = new BankAccount("Tim", opened, 1000.0d);
        newAccount = new BankAccount(account);
    }
    
    @Test
    public void test_If_Both_Accounts_Have_The_Same_Name() {
        assertTrue(account.getName().equals(newAccount.getName()));
    }

    @Test
    public void test_If_The_Accounts_Have_Different_Opened_Dates() {
        assertNotEquals(account.getOpened(), newAccount.getOpened());
    }

    @Test
    public void test_If_The_Accounts_Have_The_Same_Balance() {
        assertNotEquals(true, account.getBalance() == newAccount.getBalance());
    }
}
