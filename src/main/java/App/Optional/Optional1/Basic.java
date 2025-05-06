package App.Optional.Optional1;

import App.Optional.Person;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Basic {

    public static void main(String[] args) {

        Basic bs =  new Basic();
        Person p =  new Person(1,"Alexis",null);

        String email = Optional.ofNullable(p.getEmail())
                        .orElseThrow(() -> new NoSuchElementException("Email no encontrado"));
        System.out.println(email);

    }
}
