package Repo;

import Entities.Ticket;
import Entities.User;

import java.io.IOException;

public interface BudgetDataAccessInterface {
    /**
     *
     * @param month Chosen month to analyze.
     * @param year Year relative to chosen month.
     * @return Floating point number resembling the monthly balance.
     */
    float getMonthlyTotal(String month, String year) throws IOException;

    /**
     *
     * @param year Chosen year to analyze.
     * @return Floating point number resembling the yearly balance.
     */
    float getYearlyTotal(String year) throws IOException;

    /**
     *
     * @param ticket Ticket being saved to database.
     * @param user Needed to find proper address to save ticket to.
     */
    void saveTicket(Ticket ticket, User user);

    /**
     *
     * @param user User responsible for making function call.
     * @param month Chosen month to retrieve tickets from.
     * @param year Year relative to chosen month.
     * @return Array of Tickets resembling all transactions made in said month.
     */
    Ticket[] retrieveMonthlyTicket(User user, String month, String year);

    /**
     *
     * @param user User responsible for making function call.
     * @param year Chosen year to retrieve tickets from.
     * @return  Array of Tickets resembling all transactions made in said year.
     */
    Ticket[] retrieveYearlyTicket(User user, String year);

    /**
     *
     * @param day Chosen day to retrieve tickets from.
     * @param month Month relative to chosen day.
     * @param year Year relative to chosen day.
     * @return Array of Tickets resembling all transactions made in said day.
     */
    Ticket[] retrieveDailyTicket(User user, String day, String month, String year);
}
