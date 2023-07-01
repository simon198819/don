package moviebookapp;
class BookTheaterSeat
{
    int total_seats=10;
    synchronized void bookseat(int seats)
    {
        if(total_seats>=seats)
        {
            System.out.println(seats+"seats booked succesfully");
            total_seats=total_seats-seats;
            System.out.println("seats Left:"+total_seats);
        }
        else
        {
            System.out.println("sorry seats cannot be booked....");
            System.out.println("seats Left"+total_seats);
        }
    }
}
public class MovieBookApp extends Thread
{
    static BookTheaterSeat b;
    int seats;
    public void run()
    {
        b.bookseats(seats);
    }
        public static void main(String[]args)
        {
            b=BookTheaterSeat();
            MovieBookApp simon=new MovieBookApp();
            simon.seats=7;
            simon.start();
            MovieBookApp jhon=new MovieBookApp();
            jhon.seats=6;
            jhon.start();
        }
    }