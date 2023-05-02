package Repo;

import Entities.Ticket;
import Entities.User;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class BudgetDataAccess implements BudgetDataAccessInterface {
    @Override
    public double getMonthlyTotal(String month, String year, User user) throws IOException {
        double total = 0.0;
        try {
            File file = new File(user.getBudgetFilePath());
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            String[] tempArr;
            while((line = br.readLine()) != null)
            {
                tempArr = line.split(",");
                if (Objects.equals(tempArr[0], year) && Objects.equals(tempArr[1], month))
                {
                    total += Double.parseDouble(tempArr[3]);
                }
            }
            fr.close();
            br.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return total;
    }

    @Override
    public double getYearlyTotal(String year, User user) throws IOException {
        double total = 0.0;
        try {
            File file = new File(user.getBudgetFilePath());
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            String[] tempArr;
            while((line = br.readLine()) != null)
            {
                tempArr = line.split(",");
                if (Objects.equals(tempArr[0], year))
                {
                    total += Double.parseDouble(tempArr[3]);
                }
            }
            fr.close();
            br.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return total;
    }

    @Override
    public boolean saveTicket(Ticket ticket, User user) {
        boolean saved = false;
        try {
            FileWriter fw = new FileWriter("src/main/java/data/petData.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(ticketConvertedToString(ticket, user));
            bw.close();
            fw.close();
            saved = true;
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return saved;
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
    public String ticketConvertedToString(Ticket ticket, User user)
    {
        String string = "";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy,MM,dd");
        Date date = new Date();
        String dateConverted = formatter.format(date);
        string += dateConverted;
        string += "," + ticket.getTotal();
        string += "," + ticket.getDesc();
        string += "," + ticket.getType();
        string += "," + ticket.getTypedesc();
        return string;
    }
}
