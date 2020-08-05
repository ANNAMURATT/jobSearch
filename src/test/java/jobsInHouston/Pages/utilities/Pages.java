package jobsInHouston.Pages.utilities;

import jobsInHouston.Pages.Pages.MainPage;

public class Pages {

    private static MainPage mainPage;
//    private ViewAllOrdersPage viewAllOrdersPage;
//    private ViewAllProductsPage viewAllProductsPage;
//    private OrderPage orderPage;

    public static MainPage search() {
        if (mainPage == null) {
            mainPage = new MainPage();
        }
        return mainPage;
    }

//    public ViewAllOrdersPage viewAllOrders() {
//        if (viewAllOrdersPage == null) {
//            viewAllOrdersPage = new ViewAllOrdersPage();
//        }
//        return viewAllOrdersPage;
//    }
//
//    public ViewAllProductsPage viewAllProducts() {
//        if (viewAllProductsPage == null) {
//            viewAllProductsPage = new ViewAllProductsPage();
//        }
//        return viewAllProductsPage;
//    }
//
//    public OrderPage order() {
//        if (orderPage == null) {
//            orderPage = new OrderPage();
//        }
//        return orderPage;
//    }
}
