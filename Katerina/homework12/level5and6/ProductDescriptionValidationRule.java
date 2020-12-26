package level5and6;

public class ProductDescriptionValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        // - RULE-7: не должно быть длиннее 2000 символов

        if (product.getDescription().length() > 2000)
            throw new ValidationException(" description is incorrect");

    }
}
