package Repo;

import Entities.Ticket;
import Entities.User;

import java.io.IOException;

public class BudgetDataAccess implements BudgetDataAccessInterface {
    @Override
    public float getMonthlyTotal(String month, String year) throws IOException {
        return 0;
    }

    @Override
    public float getYearlyTotal(String year) throws IOException {
        return 0;
    }

    @Override
    public void saveTicket(Ticket ticket, User user) {

    }

    @Override
    public Ticket[] retrieveMonthlyTicket(User user, String month, String year) {
        return new Ticket[0];
    }

    @Override
    public Ticket[] retrieveYearlyTicket(User user, String year) {
        return new Ticket[0];
    }

    @Override
    public Ticket[] retrieveDailyTicket(User user, String day, String month, String year) {
        return new Ticket[0];
    }
}
