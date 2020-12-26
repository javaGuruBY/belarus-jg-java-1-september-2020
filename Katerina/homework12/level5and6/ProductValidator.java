package level5and6;

import java.util.List;

public interface ProductValidator {

    List<ValidationException> validate(Product product);

}
