import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Base64;

public class BaseLine {

    public static void main(String[] args) {
        String str  = "The End of the journey";
        String encoded = Base64.getEncoder().encodeToString(str.getBytes());

        System.out.println(encoded);

        String water = "Mr v";
        byte[] waterByte = water.getBytes(); // converting strings to byte

        for (byte b : waterByte){
            System.out.println(b);
        }

        String password = "theMan@23rd";
        String enPassword= Base64.getEncoder().withoutPadding().encodeToString(password.getBytes());

        System.out.println(enPassword);

    // DECODING BASE64
        byte[] decodepasword = Base64.getDecoder().decode(enPassword);
        System.out.println(decodepasword);// will give you the byte
        // convert to String
        String myPassword = new String(decodepasword);

        System.out.println(myPassword);
    
    // URL ENCODING
        String url = "https://my.clevelandclinic.org/health/body/23242-pumonary-veins";
        String encodeUrl = Base64.getUrlEncoder().encodeToString(url.getBytes());
        System.out.println(encodeUrl);
        byte[] decodeUrl = Base64.getUrlDecoder().decode(encodeUrl);
        System.out.println(decodeUrl);

        String deUrl = new String(decodeUrl);
        System.out.println(deUrl);

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println(tomorrow);

    }
}