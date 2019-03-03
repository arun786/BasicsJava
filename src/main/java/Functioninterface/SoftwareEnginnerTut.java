package Functioninterface;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SoftwareEnginnerTut {

    public static void main(String[] args) {
        SoftwareEnginner s1 = new SoftwareEnginner("Arun", 25, true);
        SoftwareEnginner s2 = new SoftwareEnginner("Brun", 25, false);
        SoftwareEnginner s3 = new SoftwareEnginner("Crun", 2, true);
        SoftwareEnginner s4 = new SoftwareEnginner("Drun", 50, true);
        SoftwareEnginner s5 = new SoftwareEnginner("Erun", 10, true);

        List<SoftwareEnginner> softwareEnginners = Arrays.asList(s1, s2, s3, s4, s5);

        Predicate<SoftwareEnginner> allowed = sf -> sf.getAge() > 18 && sf.isHavingPartner();

        List<SoftwareEnginner> allowedEnginners = softwareEnginners.stream().filter(allowed).collect(Collectors.toList());
        System.out.println(allowedEnginners);

        List<SoftwareEnginner> notAllowed = softwareEnginners.stream().filter(allowed.negate()).collect(Collectors.toList());
        System.out.println("Not Allowed " + notAllowed);
    }

}

@Getter
@Setter
@AllArgsConstructor
@ToString
class SoftwareEnginner {
    private String name;
    private int age;
    private boolean isHavingPartner;
}
