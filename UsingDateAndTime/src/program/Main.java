package program;

//Import the required libraries
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		// for more info, access java documentation at:
		// https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/format/DateTimeFormatter.html

		// Get the current date
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current Date: " + currentDate);

		// Get the current time
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time: " + currentTime);

		// Get the current date and time
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current Date and Time: " + currentDateTime);

		// Get the current date and time in UTC
		Instant currentInstant = Instant.now();
		System.out.println("Current Date and Time in UTC: " + currentInstant);

		// Convert string to date
		String dateString = "30/10/2023";
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date parsedDate = format.parse(dateString);
			System.out.println("Parsed Date: " + parsedDate);
		} catch (ParseException e) {
			System.out.println("Invalid date string");
		}
	}
}
