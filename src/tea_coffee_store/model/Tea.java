package tea_coffee_store.model;

import tea_coffee_store.model.enumertion.Aroma;
import tea_coffee_store.model.enumertion.TeaType;

public class Tea extends Drink{
    private TeaType teaType;
    private Aroma aroma;

    public Aroma getAroma() {
        return aroma;
    }

    public void setAroma(Aroma aroma) {
        this.aroma = aroma;
    }

    public TeaType getTeaType() {
        return teaType;
    }

    public void setTeaType(TeaType teaType) {
        this.teaType = teaType;
    }
}
