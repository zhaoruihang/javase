public class Customer {

    private FoodMenu foodMenu;

    public void dianCan(){
        foodMenu.shiZiChaoJiDan();
        foodMenu.yuXiangRouSi();
    }

    public Customer(){

    }

    public Customer(FoodMenu foodMenu){
        this.foodMenu = foodMenu;
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }
}
