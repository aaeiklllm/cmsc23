package calculator.calculator;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Ratings {
    private final SimpleStringProperty name;
    private final SimpleIntegerProperty arithmeticRating;
    private final SimpleIntegerProperty trigonometricRating;

    public Ratings(String name, Integer arithmeticRating, Integer trigonometricRating) {
        this.name = new SimpleStringProperty(name);
        this.arithmeticRating = new SimpleIntegerProperty(arithmeticRating);
        this.trigonometricRating = new SimpleIntegerProperty(trigonometricRating);
    }

    public void setName (String name){
        this.name.set(name);
    }

    public void setArithmeticRating (int arithmeticRating){
        this.arithmeticRating.set(arithmeticRating);
    }

    public void setTrigonometricRating (int trigonometricRating){
        this.trigonometricRating.set(trigonometricRating);
    }

    public String getName (){
        return name.get();
    }

    public int getArithmeticRating (){
        return arithmeticRating.get();
    }

    public int getTrigonometricRating (){
        return trigonometricRating.get();
    }


}
