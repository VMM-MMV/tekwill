import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();
        System.out.println(s1.get());
        System.out.println(s2.get());

//        Supplier<CustomObject> objectSuplier = () -> {
//            ..
//            ...
//            ..
//            return customObject;
//        };
    }

//    private CustomObject makeCustomObject() {
//        ..
//        ...
//        ..
//        return customObject;
//    }
}
