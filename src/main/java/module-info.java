module cse213.metlifeagency {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.metlifeagency to javafx.fxml;
    exports cse213.metlifeagency;
}