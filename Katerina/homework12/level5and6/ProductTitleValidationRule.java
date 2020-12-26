package level5and6;

public class ProductTitleValidationRule implements FieldValidationRule {

    private Object ValidationException;

    public void validate(Product product) throws ValidationException {
        // реализуйте все требования для валидации названия продукта:
        // К названию продукта выдвигаются следующие требования:
        //- RULE-1: не должно быть пустым
        //- RULE-2: не должно быть короче 3 символов
        //- RULE-3: не должно быть длиннее 100 символов
        if (product.getTitle() == null
                || product.getTitle().length() < 3
                || product.getTitle().length() > 100)
            throw new ValidationException(" title is incorrect");
        ;
    }
}
