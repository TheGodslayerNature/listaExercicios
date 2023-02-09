package lista6_exercicios;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    @Test
    public void testAccountCreate(){
        Account account = new Account(23,"",0.0);
        assertEquals(account, new Account(25,"",0.0));

        Account secondAccount = new Account(99, "Gamã");
        assertEquals(account, secondAccount);
    }
    @Test
    public void testNumberAccount(){
        Account account = new Account(556,"",0.0);
        assertEquals(556, account.getNumberAccount());
        assertNotEquals(4567,account.getNumberAccount());

        Account secondAccount = new Account(663,"",0.0);
        assertEquals(663, secondAccount.getNumberAccount());

        assertNotEquals(account.getNumberAccount(), secondAccount.getNumberAccount());
    }
    @Test
    public void testAccountPersonName(){
        Account account = new Account(12, "Ramirez",0.0);
        assertEquals("Ramirez", account.getNameAccount());

        Account secondAccount = new Account(33,"Elise",12.00);
        assertEquals("Elise", secondAccount.getNameAccount());

        assertNotEquals(account.getNameAccount(), secondAccount.getNameAccount());
    }
    @Test
    public void testChangeNameAccount(){
        Account account = new Account(12, "Manuel");
        assertEquals("Manuel",account.getNameAccount());
        account.changeNameAccount("Manuel Ferrera");
        assertEquals("Manuel Ferrera", account.getNameAccount());
        assertNotEquals("Manuel", account.getNameAccount());
    }
    @Test
    public void testInitialDeposit(){
        Account account = new Account(5, "Larissa",125.50);
        assertEquals(125.50, account.getDeposit(),0.05);
        assertNotEquals(35, account.getDeposit());

        Account secondAccount = new Account(66, "Luna");
        assertEquals(0,secondAccount.getDeposit(),0.05);
    }
    @Test
    public void testDeposit(){
        Account account = new Account(5, "Larissa",125.00);
        account.deposit(5.00);
        assertEquals(130.00, account.getDeposit(),0.05);
        account.withDraw(5.00);
        assertEquals(120.00, account.getDeposit(),0.05);
        account.withDraw(120.00);
        assertEquals(-5.0, account.getDeposit(),0.05);
    }
}
