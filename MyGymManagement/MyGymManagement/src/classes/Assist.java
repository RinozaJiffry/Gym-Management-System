package classes;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.List;

public class Assist {
    public static <T extends Comparable<T>> void bubble(DefaultMember[] members) {
        for (int i = 0; i < members.length - 1; i++) {
            for (int j = 0; j < members.length - (i + 1); j++) {
                if (members[j].compareTo(members[j + 1]) > 0) {
                    DefaultMember temp = members[j];
                    members[j] = members[j + 1];
                    members[j + 1] = temp;
                }
            }
        }
    }

    public static void tableView(Stage stage,List<DefaultMember> tableList){
        WestMinsterGym westMinsterGym = new WestMinsterGym();
        VBox tableView = new VBox(20);
        for(DefaultMember mem : tableList){
            {
                String labelString = "";
                labelString += "Membership Number:" + mem.getId() +"";

                if(mem instanceof Over60)
                {
                    labelString+=(" Type:Over 60 Member");
                }else if(mem instanceof StudentMember){
                    labelString+=(" Type:Student Member");
                }else{
                    labelString+=(" Type:Default Member");
                }
                labelString+=(" Member name: " + mem.getName() + "");
                labelString+=(" Start membership Date: " + mem.getStartMembershipDate() + "");
                Label rows = new Label(labelString);
                tableView.getChildren().add(rows);
                rows.setStyle("-fx-font-size: 20");
            }
        }
        stage.setTitle("Westminster Gym");
        Scene westminsterScene = new Scene(tableView);
        stage.setScene(westminsterScene);
        stage.show();
    }
}
