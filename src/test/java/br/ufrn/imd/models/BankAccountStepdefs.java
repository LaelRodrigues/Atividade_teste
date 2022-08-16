package br.ufrn.imd.models;

import br.ufrn.imd.models.BankAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankAccountStepdefs {

    private BankAccount bankAccount;
    private BankAccount bankAccount2;

    @Given("um BankAccount com saldo de R$ {double}")
    public void um_bank_account_com_saldo_de_r$(Double double1) {
        //TODO
        bankAccount = new BankAccount(123456, 123, double1);

    }

    @When("depositar R$ {double}")
    public void depositar_r$(Double double1) {
        //TODO
        bankAccount.deposit(double1);
    }

    @Then("o saldo do BankAccount deve ser R$ {double}")
    public void o_saldo_deve_ser_r$(Double double1) {
        //TODO
        var saldo = bankAccount.getBalance();
        assertEquals(double1, saldo);
    }

    @Quando("retirar R$ {double}")
    public void retirarR$(Double arg0) {
        //TODO
        bankAccount.withdraw(arg0);
    }

    @E("um BankAccount de destino com saldo de R$ {double}")
    public void umBankAccountDeDestinoComSaldoDeR$(Double arg0) {
        bankAccount2 = new BankAccount(654321, 321, arg0);
    }

    @Quando("tranferir R$ {double} para o BankAccount de destino")
    public void tranferirR$ParaOBankAccountDeDestino(Double arg1) {
        //TODO
        bankAccount.transfer(bankAccount2, arg1);
    }

    @E("o saldo do BankAccount de destino deve ser R$ {double}")
    public void oSaldoDoBankAccountDeDestinoDeveSerR$(Double arg0) {
        bankAccount2.deposit(arg0);
    }
}
