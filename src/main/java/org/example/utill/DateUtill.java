package org.example.utill;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class DateUtill {
    private DateUtill() { } //  6A Constructor yaradiriq ve private edirik ki DateUtill obyekti yarana bilmesin

    public static LocalDate toLocalDate(String date) {     // 5A StudentController clasdaki getBirtdate cevirmek ucun asagidaki kodlar yazilir Stringi Local date ceviririk.

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return LocalDate.parse(date, formatter);

    }


        public static String toString(LocalDate date){ // 19A     20A mapper
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
               return date.format(formatter);

    }

}
