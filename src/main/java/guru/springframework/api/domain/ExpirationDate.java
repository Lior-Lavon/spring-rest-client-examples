package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExpirationDate {

    private String date;
    private int timezone_type;
    private String timezone;
}
