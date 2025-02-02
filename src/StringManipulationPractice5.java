
public class StringManipulationPractice5 {
    public static void main(String[] args) {
        //Task 1
        String student = "Student: John Doe";
        String fullName = (student.substring(student.indexOf("John"), (student.indexOf("John")+4)) + " " + student.substring(student.indexOf("Doe"), student.indexOf("Doe")+3)).toUpperCase();
        System.out.println(fullName);

        //Task 2
        String website = "www.codewise.academy.com";
        String schoolName = website.substring(website.indexOf("codewise"), website.indexOf(".com")).replace("co", "Co").replace("aca", "Aca");
        System.out.println(schoolName);

        //Task 3
        String filename = "document.pdf";
        String nameWithoutExtension = filename.substring(0, filename.indexOf(".pdf"));
        System.out.println(nameWithoutExtension);

        //Task 4
        String date = "2024-03-29";
        String year = date.substring(0, 4);
        System.out.println(year);

        //Task 5
        String creditCardNumber = "1234567890123456";
        String lastFourDigits = creditCardNumber.substring( (creditCardNumber.length()-4), creditCardNumber.length() );
        System.out.println(lastFourDigits);

        //Task 6
        String url = "https://example.com/search?q=java";
        String query = url.substring( (url.indexOf("=")+1), url.length());
        System.out.println(query);

        //Task 7
        String address = "123 Main St\nApt 4B\nSpringfield";
        String line2 = address.substring(address.indexOf("\n")+1, address.indexOf("\nS"));
        System.out.println(line2);

        //Task 8
        String quoted = "\"Hello, World!\"";
        String unquoted = quoted.replace("\"", "");
        System.out.println(unquoted);

        //Task 9
        String path = "/home/user/documents/report.txt";
        String folderPath = path.substring(0, path.indexOf("/report.txt"));
        System.out.println(folderPath);

        //Task 10
        String fullName1 = "John William Doe";
        String middleName = fullName1.substring(fullName1.indexOf("William"), fullName1.indexOf(" Doe"));
        System.out.println(middleName);

        //Task 11
        String text = "  Name: Donald Obama; Age 99; City: Washington    ";
        String name = text.substring(text.indexOf("Name: ") + 6, text.indexOf("; Age"));
        String age = text.substring(text.indexOf("Age ") + 4, text.indexOf("; City"));
        String city = text.substring(text.indexOf("City: ") + 6, text.length()).trim();
        System.out.println(name);
        System.out.println(age);
        System.out.println(city);
    }
}
