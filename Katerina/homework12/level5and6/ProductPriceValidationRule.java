package level5and6;

public class ProductPriceValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        // реализуйте все требования для валидации цены продукта:
        //К цене продукта выдвигаются следующие требования:
        // - RULE-5: не должна быть пустой
        // - RULE-6: должна быть больше 0

        if (product.getPrice() == null || product.getPrice() <= 0)
            throw new ValidationException(" price is incorrect");
    }
}
